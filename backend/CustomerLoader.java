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

    public List<Customer> loadCustomers(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                String id = values[0];
                String fullName = values[1];
                String cardNumber = values[2];
                String expirationDate = values[3];

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                LocalDate expiration = LocalDate.parse(expirationDate, formatter);

                InsuranceCard insuranceCard = new InsuranceCard(cardNumber, "", "", expiration);
                Customer customer = new Customer(id, fullName, false, insuranceCard, new ArrayList<>(),new ArrayList<>());

                customers.add(customer);
            }
        }

        return customers;
    }
}