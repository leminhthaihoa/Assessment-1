package backend;

import java.util.List;

public class Customer {
    private String ID;
    private String fullName;
    private Boolean isPolicyHolder;
    private InsuranceCard insuranceCard;
    private List<Claim> claims;

    private List<Customer> dependents;

    public Customer() {
        this.ID = "";
        this.fullName = "";
        this.insuranceCard = null;
        this.claims = null;
        this.isPolicyHolder = null;
        this.dependents = null;
    }

    public Customer(String ID, String fullName, Boolean isPolicyHolder, InsuranceCard insuranceCard, List<Claim> claims) {
        this.ID = ID;
        this.fullName = fullName;
        this.isPolicyHolder = isPolicyHolder;
        this.insuranceCard = insuranceCard;
        this.claims = claims;
    }


}
