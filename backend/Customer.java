package backend;

import java.util.List;

public class Customer implements ClaimProcessManager{
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


    @Override
    public void addClaim(Claim claim) {
        claims.add(claim);
    }

    @Override
    public void updateClaim(Claim claim, int ind) {
        for (int i = 0; i < claims.size(); i++) {
            if (ind == 1) {
                claims.set(0, claim);
            }
            if (ind == i) {
                claims.set(ind, claim);
            }
        }
    }

    @Override
    public void deleteClaim(int ind) {
            for (int i = 0; i < claims.size(); i++){
                if (ind == 1){
                    claims.removeFirst();
                } else {
                    if (ind == i){
                        claims.remove(ind);
                    }
                }

            }
    }

    @Override
    public void getOne(int ind) {
        for (int i = 0; i < claims.size(); i++){
            if (ind == 1){
                System.out.println(claims.getFirst());
            } else {
                System.out.println(claims.get(ind));
            }
        }
    }

    @Override
    public void getAll() {
        for (Claim claim : claims) {
            System.out.println(claim);
        }
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

    public void addDependent(Customer dependent){
        dependents.add(dependent);
    }
    public void removeDependent(Customer dependent){
        dependents.remove(dependent);
    }

}

