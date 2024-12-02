public class Item {
    private String shippingWeight;
    private String description;
    private double priceForQuantity;
    private int inStock;

    // Getter dan Setter
    public String getShippingWeight() {
        return shippingWeight;
    }

    public void setShippingWeight(String shippingWeight) {
        this.shippingWeight = shippingWeight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPriceForQuantity() {
        return priceForQuantity;
    }

    public void setPriceForQuantity(double priceForQuantity) {
        this.priceForQuantity = priceForQuantity;
    }

    public int getInStock() {
        return inStock;
    }

    public void setInStock(int inStock) {
        this.inStock = inStock;
    }
}