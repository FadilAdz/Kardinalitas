public class OrderDetail {
    private int quantity;
    private String taxStatus;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getTaxStatus() {
        return taxStatus;
    }

    public void setTaxStatus(String taxStatus) {
        this.taxStatus = taxStatus;
    }

    public double calcSubTotal() {
        // Implementation
        return 0;
    }

    public double calcWeight() {
        // Implementation
        return 0;
    }

    public double calcTax() {
        // Implementation
        return 0;
    }
}