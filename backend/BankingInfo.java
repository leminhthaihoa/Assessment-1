package backend;

public class BankingInfo {
    private String bank;
    private String name;
    private int number;

    public BankingInfo(String bank, String name, int number) {
        this.bank = bank;
        this.name = name;
        this.number = number;
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

    public int getNumber() {
        return number;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
