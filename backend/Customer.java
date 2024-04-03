package backend;

import java.util.ArrayList;
import java.util.List;

public class Customer{
    private String ID;
    private String fullName;
    private Boolean isPolicyHolder;
    private InsuranceCard insuranceCardNumber;
    private List<Claim> claims;

    private List<Customer> dependents;

    public Customer(String ID, String fullName, boolean isPolicyHolder, InsuranceCard insuranceCardNumber, List<Claim> claims, List<Customer> dependents) {
        this.ID = ID;
        this.fullName = fullName;
        this.insuranceCardNumber = insuranceCardNumber;
        this.claims = claims;
        this.isPolicyHolder = isPolicyHolder;
        this.dependents = dependents;
    }

    public Customer() {

    }

//    public Customer(String ID, String fullName, Boolean isPolicyHolder, InsuranceCard) {
//        this.ID = ID;
//        this.fullName = fullName;
//        this.isPolicyHolder = isPolicyHolder;
//        this.insuranceCardNumber = insuranceCard;
//        this.claims = new ArrayList<>();
//        this.dependents = new ArrayList<>();
//    }

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
    public List<Claim> getClaims() {
        return claims;
    }

    public void getInsuranceCardNumber(InsuranceCard insuranceCard) {
    }
}

