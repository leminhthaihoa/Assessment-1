package backend;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
                    + claim.getClaimDate().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) +
                    "," + claim.getInsuredPerson().getID() +
                    "," + claim.getCardNumber() +
                    "," + claim.getExamDate().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) +
                    "," + claim.getDocuments() +
                    "," + claim.getClaimAmount() +
                    "," + claim.getStatus() +
                    "," + claim.getReceiverBankInfo().getBank() +
                    "," + claim.getReceiverBankInfo().getName() +
                    "," + claim.getReceiverBankInfo().getNumber() + "\n");
        }
            } catch (IOException e) {
                System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
