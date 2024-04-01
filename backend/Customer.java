package backend;

import java.util.List;

public class Customer {
    private String ID;
    private String fullName;
    private Boolean isPolicyHolder;
    private InsuranceCard insuranceCard;
    private List<Claim> claims;

    private List<Customer> dependents;

}
