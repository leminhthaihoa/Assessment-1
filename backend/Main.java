package backend;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ClaimProcessManagerImpl claimProcessManager = new ClaimProcessManagerImpl();
        claimProcessManager.loadCustomers("backend/Customer.txt");
        claimProcessManager.loadInsuranceCards("backend/InsuranceCard.txt");
        claimProcessManager.loadClaims("backend/test", "backend/Customer.txt", "backend/InsuranceCard.txt");

    }
}