package com.kitchenstory.kitchenstorybackend.entity;

public class OrderQuantity {

    private long productId;

    private int quantity;

    private double pricePerQuantity;

    public OrderQuantity(long productId, int quantity, double pricePerQuantity) {
        this.productId = productId;
        this.quantity = quantity;
        this.pricePerQuantity = pricePerQuantity;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerQuantity() {
        return pricePerQuantity;
    }

    public void setPricePerQuantity(double pricePerQuantity) {
        this.pricePerQuantity = pricePerQuantity;
    }
}
