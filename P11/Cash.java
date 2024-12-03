public class Cash extends Payment {
    public Cash(double amount) {
        super(amount);
    }

    @Override
    public String toString() {
        return "Cash : " + getAmount();
    }
}