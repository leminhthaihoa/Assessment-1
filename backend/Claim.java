package backend;

import java.util.Date;

public class Claim {
    private String id;
    private Date claimDate;
    private Customer insuredPerson;
    private InsuranceCard cardNumber;
    private Date examDate;
    private String[] documents;
    private int claimAmount;
    private String status;
    private BankingInfo receiverBankInfo;

    public Claim() {
        this.id = "";
        this.claimDate = null;

    }

    public Claim(String id, Date claimDate, Customer insuredPerson, InsuranceCard cardNumber, Date examDate, String[] documents, int claimAmount, String status, BankingInfo receiverBankInfo) {
        this.id = id;
        this.claimDate = claimDate;
        this.insuredPerson = insuredPerson;
        this.cardNumber = cardNumber;
        this.examDate = examDate;
        this.documents = documents;
        this.claimAmount = claimAmount;
        this.status = status;
        this.receiverBankInfo = receiverBankInfo;
    }

    public String getId() {
        return id;
    }

    public Date getClaimDate() {
        return claimDate;
    }

    public Customer getInsuredPerson() {
        return insuredPerson;
    }

    public InsuranceCard getCardNumber() {
        return cardNumber;
    }

    public Date getExamDate() {
        return examDate;
    }

    public String[] getDocuments() {
        return documents;
    }

    public int getClaimAmount() {
        return claimAmount;
    }

    public String getStatus() {
        return status;
    }

    public String getReceiverBankInfo() {
        return receiverBankInfo.toString();
    }

}
