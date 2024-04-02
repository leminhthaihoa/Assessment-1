package backend;

import java.util.List;

public class Customer{
    private String ID;
    private String fullName;
    private Boolean isPolicyHolder;
    private InsuranceCard insuranceCardNumber;
    private List<Claim> claims;

    private List<Customer> dependents;

    public Customer() {
        this.ID = "";
        this.fullName = "";
        this.insuranceCardNumber = null;
        this.claims = null;
        this.isPolicyHolder = null;
        this.dependents = null;
    }

    public Customer(String ID, String fullName, Boolean isPolicyHolder, InsuranceCard insuranceCard, List<Claim> claims) {
        this.ID = ID;
        this.fullName = fullName;
        this.isPolicyHolder = isPolicyHolder;
        this.insuranceCardNumber = insuranceCard;
        this.claims = claims;
    }

    public String getID() {
        return ID;
    }

    public String getFullName() {
        return fullName;
    }

    public Boolean getPolicyHolder() {
        return isPolicyHolder;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPolicyHolder(Boolean policyHolder) {
        isPolicyHolder = policyHolder;
    }

    public List<Customer> getDependents() {
        return dependents;
    }

    public void setDependents(List<Customer> dependents) {
        this.dependents = dependents;
    }

    public InsuranceCard getInsuranceCardNumber() {
        return insuranceCardNumber;
    }
}

