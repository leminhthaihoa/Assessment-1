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

}
