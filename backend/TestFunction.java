package backend;

public class TestFunction {
    public static void main(String[] args) {
        ClaimProcessManagerImpl claimProcessManager = new ClaimProcessManagerImpl();
        CustomerLoader customerLoader = new CustomerLoader();
        claimProcessManager.loadCustomers("backend/Customer.txt");
        claimProcessManager.loadInsuranceCards("backend/InsuranceCard.txt");
        claimProcessManager.loadClaims("backend/test", "backend/Customer.txt", "backend/InsuranceCard.txt");

    }
}