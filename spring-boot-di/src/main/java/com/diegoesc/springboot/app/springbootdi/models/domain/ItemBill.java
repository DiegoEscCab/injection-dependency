package com.diegoesc.springboot.app.springbootdi.models.domain;

public class ItemBill {

    private Product product;
    private Integer amount;

    public ItemBill(Product product, Integer amount) {
        this.product = product;
        this.amount = amount;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer calculateAmount(){
        return amount * product.getPrice();
    }
}
