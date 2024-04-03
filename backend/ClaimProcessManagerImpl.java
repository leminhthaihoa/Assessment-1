package backend;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ClaimProcessManagerImpl implements ClaimProcessManager{
    private List<Claim> claims;

    public ClaimProcessManagerImpl() {
        this.claims = new ArrayList<>();
    }

    @Override
    public void add(Claim claim) {
        claims.add(claim);
    }

    @Override
    public void update(Claim claim) {
        for (int i = 0; i < claims.size(); i++){
            if (claims.get(i).getId().equals(claim.getId())){
                claims.set(i,claim);
            }
        }
    }

    @Override
    public void delete(Claim claim) {
        claims.remove(claim);
    }

    @Override
    public Claim getOne(String id) {
        for (Claim claim : claims){
            if (claim.getId().equals(id)){
                return claim;
            }
        }
        return null;
    }

    @Override
    public List<Claim> getAll() {
        return claims;
    }

    @Override
    public void saveReport(String fileName) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(fileName);
        for (Claim claim : claims){
            writer.write(claim.getId() + ","
                    + claim.getClaimDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) +
                    "," + claim.getInsuredPerson().getID() +
                    "," + claim.getCardNumber() +
                    "," + claim.getExamDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) +
                    "," + claim.getDocuments() +
                    "," + claim.getClaimAmount() +
                    "," + claim.getStatus() +
                    "," + claim.getReceiverBankInfo().getBank() +
                    "-" + claim.getReceiverBankInfo().getName() +
                    "-" + claim.getReceiverBankInfo().getNumber() + "\n");
        }
            } catch (IOException e) {
                System.err.println("Error writing to file: " + e.getMessage());
        }
    }
    private void saveClaims() {
        try (FileWriter writer = new FileWriter("claims.txt")) {
            for (Claim claim : claims) {
                String insuredPersonName = claim.getInsuredPerson().getFullName();
                String cardNumber = claim.getCardNumber();
                String examDate = claim.getExamDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                String documents = String.join(";", claim.getDocuments());
                String receiverBankingInfo = claim.getReceiverBankInfo().getBank() + ","
                + claim.getReceiverBankInfo().getName() + ","
                + claim.getReceiverBankInfo().getNumber();
                writer.write(claim.getId() + "," + claim.getClaimDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) + "," + insuredPersonName + "," + cardNumber + "," + examDate + "," + documents + "," + claim.getClaimAmount() + "," + claim.getStatus() + "," + receiverBankingInfo + "\n");
            }
        } catch (IOException e) {
            System.err.println("Error saving claims: " + e.getMessage());
        }
    }

    private void loadClaims() {
        try (BufferedReader reader = new BufferedReader(new FileReader("claims.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                Claim claim = new Claim();
                claim.setId(values[0]);
                claim.setClaimDate(LocalDate.parse(values[1], DateTimeFormatter.ofPattern("yyyy-MM-dd")));
                Customer customer = new Customer();
                customer.setFullName(values[2]);
                InsuranceCard insuranceCard = new InsuranceCard();
                insuranceCard.setCardNumber(values[3]);
                customer.getInsuranceCardNumber(insuranceCard);
                claim.setInsuredPerson(customer);
                claim.setCardNumber(values[3]);
                claim.setExamDate(LocalDate.parse(values[4], DateTimeFormatter.ofPattern("yyyy-MM-dd")));
                claim.setDocuments(List.of(values[5].split(";")));
                claim.setClaimAmount((int) Double.parseDouble(values[6]));
                claim.setStatus(values[7]);
                BankingInfo bankingInfo = new BankingInfo();
                String[] bankingInfoValues = values[8].split(",");
                bankingInfo.setBank(bankingInfoValues[0]);
                bankingInfo.setName(bankingInfoValues[1]);
                bankingInfo.setNumber(bankingInfoValues[2]);
                claim.setReceiverBankInfo(bankingInfo);
                claims.add(claim);
            }
        } catch (IOException e) {
            System.err.println("Error loading claims: " + e.getMessage());
        }
    }
}
