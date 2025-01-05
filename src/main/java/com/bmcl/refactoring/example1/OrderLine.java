package com.bmcl.refactoring.example1;

public class OrderLine {
    private Product product;
    private int quantity;

    public OrderLine(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return this.product;
    }

    public void setProduct(Product product) {
        if (product != null) {
            this.product = product;
        }
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        }
    }

    public double getTotal() {
        return product != null ? product.getPrice() * quantity : 0.0;
    }

    @Override
    public String toString() {
        String productName = product != null ? product.getName() : "Unknown Product";
        return String.format("%s (x%d): %.2f", productName, quantity, getTotal());
    }
}
