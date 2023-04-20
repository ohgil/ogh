package org.example.product.controller;

import org.example.Container;
import org.example.product.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductController {
    private long count;
    private final List<Product> products;


    public ProductController() {
        long count = 0;
        products = new ArrayList<>();
    }

    public void write() {
        long id = count + 1;
        System.out.printf("상품명 : ");
        String product_name = Container.getScanner().nextLine().trim();
        System.out.printf("제조사 : ");
        String product_brand = Container.getScanner().nextLine().trim();
        System.out.printf("용량 : ");
        String product_capacity = Container.getScanner().nextLine().trim();
        System.out.printf("가격 : ");
        String product_price = Container.getScanner().nextLine().trim();
        System.out.printf("제품설명 : ");
        String product_expanation = Container.getScanner().nextLine().trim();

        Product product = new Product(id, product_name, product_brand, product_capacity, product_price, product_expanation);

        products.add(product);


        System.out.printf("%d번 상품이 등록되었습니다.\n", id);
        count = id;
    }

    public void list() {
        System.out.println("번호 / 상품명 / 제조사 / 용량 / 가격 / 제품설명\n" + "-".repeat(50));
        for (int i = products.size() - 1; i >= 0; i--) {
            Product product = products.get(i);
            System.out.printf("%d / %s / %s / %s / %s / %s\n", product.getId(), product.getProduct_name(), product.getProduct_brand(),
                    product.getProduct_capacity(), product.getProduct_price(), product.getProduct_expanation());
        }
    }

    public void remove() {
    }
}
