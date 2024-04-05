package backend;

import java.time.LocalDate;
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        ClaimProcessManagerImpl claimProcessManager = new ClaimProcessManagerImpl();


//
//        // Add some sample claims
//        Claim claim1 = new Claim();
//        claim1.setId("1");
//        claim1.setClaimDate(LocalDate.of(2022, 1, 1));
//        Customer customer1 = new Customer();
//        customer1.setID("C000001");
//        customer1.setFullName("John Doe");
//        customer1.setPolicyHolder(true);
//        InsuranceCard insuranceCard1 = new InsuranceCard();
//        insuranceCard1.setCardNumber("1234567890");
//        customer1.setInsuranceCardNumber(insuranceCard1);
//        claim1.setInsuredPerson(customer1);
//        claim1.setCardNumber("1234567890");
//        claim1.setExamDate(LocalDate.of(2022, 2, 1));
//        claim1.setDocuments(Arrays.asList("document1", "document2"));
//        claim1.setClaimAmount(100.0);
//        claim1.setStatus("pending");
//        BankingInfo bankingInfo1 = new BankingInfo();
//        bankingInfo1.setBank("Bank1");
//        bankingInfo1.setName("John Doe");
//        bankingInfo1.setNumber("123456789");
//        claim1.setReceiverBankInfo(bankingInfo1);
//        claimProcessManager.add(claim1);
//
//        Claim claim2 = new Claim();
//        claim2.setId("2");
//        claim2.setClaimDate(LocalDate.of(2022, 2, 1));
//        Customer customer2 = new Customer();
//        customer2.setID("C000002");
//        customer2.setFullName("Jane Doe");
//        customer2.setPolicyHolder(false);
//        InsuranceCard insuranceCard2 = new InsuranceCard();
//        insuranceCard2.setCardNumber("2345678901");
//        customer2.setInsuranceCardNumber(insuranceCard2);
//        claim2.setInsuredPerson(customer2);
//        claim2.setCardNumber("2345678901");
//        claim2.setExamDate(LocalDate.of(2022, 3, 1));
//        claim2.setDocuments(Arrays.asList("document3", "document4"));
//        claim2.setClaimAmount(200.0);
//        claim2.setStatus("approved");
//        BankingInfo bankingInfo2 = new BankingInfo();
//        bankingInfo2.setBank("Bank2");
//        bankingInfo2.setName("Jane Doe");
//        bankingInfo2.setNumber("987654321");
//        claim2.setReceiverBankInfo(bankingInfo2);
//        claimProcessManager.add(claim2);
//
//        // Save the claims to a file
//        claimProcessManager.saveClaims("backend/test");
//
//        // Load the claims from the file
//        claimProcessManager.loadClaims("backend/test", "backend/Customer.txt", "backend/InsuranceCard.txt");
//
//        // Print the loaded claims
//        for (Claim claim : claimProcessManager.getAll()) {
//            System.out.println(claim);
//        }
    }
}
