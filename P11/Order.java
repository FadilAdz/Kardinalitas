import java.util.Date;

public class Order {
    private Date date;
    private String status;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double calcSubTotal() {
        // Implementation
        return 0;
    }

    public double calcTax() {
        // Implementation
        return 0;
    }

    public double calcTotal() {
        // Implementation
        return 0;
    }

    public double calcTotalWeight() {
        // Implementation
        return 0;
    }
}