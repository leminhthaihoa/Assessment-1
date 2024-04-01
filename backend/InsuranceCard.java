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


    public String getCardNumber() {
        return cardNumber;
    }

    public Customer getCardHolder() {
        return cardHolder;
    }

    public Customer getPolicyOwner() {
        return policyOwner;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCardHolder(Customer cardHolder) {
        this.cardHolder = cardHolder;
    }

    public void setPolicyOwner(Customer policyOwner) {
        this.policyOwner = policyOwner;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }


}
