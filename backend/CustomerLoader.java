package backend;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class CustomerLoader {
    private List<Customer> customers;

    public CustomerLoader() {
        customers = new ArrayList<>();
    }
    public List<Customer> loadCustomers(String fileName, String insuranceCardFileName) throws IOException {
        List<Customer> customers = new ArrayList<>();

        // Load insurance cards from the insuranceCardFileName file
        List<InsuranceCard> insuranceCards = InsuranceCardLoader.loadInsuranceCards(insuranceCardFileName);

        if (insuranceCards.isEmpty()) {
            System.err.println("Error loading customers: no insurance cards found in file: " + insuranceCardFileName);
            return customers;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                if (values.length < 5) {
                    System.err.println("Error loading customer: invalid line format: " + line);
                    continue;
                }
                String id = values[0];
                String fullName = values[1];
                String cardNumber = values[2];
                String expirationDate = values[3];
                boolean isPolicyHolder = Boolean.parseBoolean(values[4]);
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                LocalDate expiration = LocalDate.parse(expirationDate, formatter);

                // Find the insurance card with the matching cardNumber
                InsuranceCard insuranceCard = null;
                for (InsuranceCard ic : insuranceCards) {
                    if (ic.getCardNumber().equals(cardNumber)) {
                        insuranceCard = ic;
                        break;
                    }
                }

                if (insuranceCard == null) {
                    System.err.println("Error loading customer: invalid insurance card number: " + cardNumber);
                    continue;
                }

                Customer customer = new Customer(id, fullName, isPolicyHolder, insuranceCard, new ArrayList<>(), new ArrayList<>());
                customers.add(customer);
            }
        }

        return customers;
    }
    }