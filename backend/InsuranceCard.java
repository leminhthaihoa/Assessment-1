package backend;

import java.util.Date;

public class InsuranceCard {
    private String cardNumber;
    private Customer cardHolder;
    private Customer policyOwner;
    private Date expirationDate;

    public InsuranceCard() {
        this.cardHolder = null;
        this.cardNumber = "";
        this.policyOwner = null;
        this.expirationDate = null;
    }

    public InsuranceCard(Customer cardHolder, Customer policyOwner){
        this.cardHolder = cardHolder;
        this.cardNumber = "";
        this.policyOwner = policyOwner;
        this.expirationDate = null;
    }


}
