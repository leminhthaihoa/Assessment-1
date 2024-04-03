package backend;

public class BankingInfo {
    private String bank;
    private String name;
    private String number;

    public BankingInfo(String bank, String name, String number) {
        this.bank = bank;
        this.name = name;
        this.number = number;
    }

    public BankingInfo() {

    }

    @Override
    public String toString() {
        return "BankingInfo{" +
                "bank='" + bank + '\'' +
                ", name='" + name + '\'' +
                ", number=" + number +
                '}';
    }

    public String getBank() {
        return bank;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
