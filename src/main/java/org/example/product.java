package org.example;

public class product {
    private long id;
    private String product_name;
    private String product_brand;
    private String product_capacity;
    private String product_price;
    private String product_expanation;

    public product(long id, String product_name, String product_brand, String product_capacity, String product_price, String product_expanation) {
        this.id = id;
        this.product_name = product_name;
        this.product_brand = product_brand;
        this.product_capacity = product_capacity;
        this.product_price = product_price;
        this.product_expanation = product_expanation;
    }

    public long getId() {
        return id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public String getProduct_brand() {
        return product_brand;
    }

    public String getProduct_capacity() {
        return product_capacity;
    }

    public String getProduct_price() {
        return product_price;
    }

    public String getProduct_expanation() {
        return product_expanation;
    }
}


