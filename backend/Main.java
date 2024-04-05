package backend;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        ClaimProcessManagerImpl claimProcessManager = new ClaimProcessManagerImpl();
        Scanner scanner = new Scanner(System.in);

//        claimProcessManager.loadCustomers("backend/Customer.txt");
//        claimProcessManager.loadInsuranceCards("backend/InsuranceCard.txt");
        claimProcessManager.loadClaims("backend/test", "backend/Customer.txt", "backend/InsuranceCard.txt");
        //CustomerLoader customerLoader = new CustomerLoader();

        List<Claim> claims = claimProcessManager.getAll();

        System.out.println("--INSURANCE CLAIM MANAGEMENT SYSTEM--");
        System.out.println("-------------------------------------");
        System.out.println("Hello Admin");
        System.out.println("What do you want to do today: ");
        System.out.println("--------------------------------------");
        System.out.println("1: Show the claims");
        System.out.println("2: Manage the claims");
        System.out.print("What's your choice: ");

        String input = scanner.nextLine();

        switch (input){
            case "1":
                System.out.println("1:Show one ");
                System.out.println("2: Show all ");
                System.out.print("Your choice: ");
                String in2 = scanner.nextLine();
                if (in2.equals("1")) {
                    System.out.println("Choose the claim ID you want to see: ");
                    for (int i  = 0; i < claims.size(); i++){
                        System.out.println((i+1) + ")" + claims.get(i).getId());
                    }
                    System.out.print("Your choice: ");
                    int in3 = scanner.nextInt();
                    System.out.println("ID: " + claims.get(in3-1).getId());
                    System.out.println("Insured person: " + claims.get(in3-1).getInsuredPerson());
                    System.out.println("Card ID: " + claims.get(in3-1).getCardNumber());
                    System.out.println("Claim date: " + claims.get(in3-1).getClaimDate());
                    System.out.println("Exam date: " + claims.get(in3-1).getExamDate());
                    System.out.println("Documents: " + claims.get(in3-1).getDocuments());
                    System.out.println("Claim amount: " + claims.get(in3-1).getClaimAmount());
                    System.out.println("Status: " + claims.get(in3-1).getStatus());
                    System.out.println("Banking info: ");
                    System.out.println("Bank: " + claims.get(in3-1).getReceiverBankInfo().getBank());
                    System.out.println("Name: " + claims.get(in3-1).getReceiverBankInfo().getName());
                    System.out.println("Number: " + claims.get(in3-1).getReceiverBankInfo().getNumber());
                }
                if (in2.equals("2")){
                    for (Claim claim : claims){
                        System.out.println(claim);
                    }
                }
                break;

            case "2":
                System.out.println("1: Make new claims");
                System.out.println("2: Update claims");
                System.out.println("3: Delete claims");
                System.out.println("Your choice: ");

                int in4 = scanner.nextInt();

                if (in4 == 1){
                    Claim newClaim = new Claim();
                    Random random = new Random();
                    int ID;
                    ID = 1000000000 + random.nextInt(900000000);
                    newClaim.setId("f-" + ID);

                }
        }
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
