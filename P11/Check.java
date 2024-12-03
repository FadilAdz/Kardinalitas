public class Check extends Payment {
    private String bankID;

    public Check(double amount, String bankID) {
        super(amount);
        this.bankID = bankID;
    }

    @Override
    public String toString() {
        return "BankID : " + bankID;
    }
}