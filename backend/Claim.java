package backend;

import java.awt.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
public class Claim {
    private String id;
    private LocalDate claimDate;
    private Customer insuredPerson;
    private InsuranceCard cardNumber;
    private LocalDate examDate;
    private List<String> documents;
    private int claimAmount;
    private String status;
    private BankingInfo receiverBankInfo;

    public Claim() {
        this.id = "";
        this.claimDate = null;
        this.insuredPerson = null;
        this.cardNumber = null;
        this.examDate = null;
        this.documents = null;
        this.claimAmount = 0;
        this.status = "";
        this.receiverBankInfo = null;
    }

    public Claim(Customer insuredPerson, InsuranceCard cardNumber){
        this.id = "";
        this.claimDate = null;
        this.insuredPerson = insuredPerson;
        this.cardNumber = cardNumber;
        this.examDate = null;
        this.documents = null;
        this.claimAmount = 0;
        this.status = "";
        this.receiverBankInfo = null;
    }

    public Claim(String id, LocalDate claimDate, Customer insuredPerson, InsuranceCard cardNumber, LocalDate examDate, List<String> documents, int claimAmount, String status, BankingInfo receiverBankInfo) {
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

    public LocalDate getClaimDate() {
        return claimDate;
    }

    public Customer getInsuredPerson() {
        return insuredPerson;
    }

    public InsuranceCard getCardNumber() {
        return cardNumber;
    }

    public LocalDate getExamDate() {
        return examDate;
    }

    public List<String> getDocuments() {
        return documents;
    }

    public int getClaimAmount() {
        return claimAmount;
    }

    public String getStatus() {
        return status;
    }

    public BankingInfo getReceiverBankInfo() {
        return receiverBankInfo;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setClaimDate(LocalDate claimDate) {
        this.claimDate = claimDate;
    }

    public void setInsuredPerson(Customer insuredPerson) {
        this.insuredPerson = insuredPerson;
    }

    public void setCardNumber(InsuranceCard cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setExamDate(LocalDate examDate) {
        this.examDate = examDate;
    }

    public void setDocuments(List<String> documents) {
        this.documents = documents;
    }

    public void setClaimAmount(int claimAmount) {
        this.claimAmount = claimAmount;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
