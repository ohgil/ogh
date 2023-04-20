package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    private Scanner sc;

    public App(Scanner sc) {
        this.sc = sc;

    }

    public void run() {
        System.out.println("== 상품 앱 ==");
        long count = 0;
        List<product> products = new ArrayList<>();

        while (true) {
            System.out.printf("명령) ");
            String cmd = sc.nextLine().trim();

            if (cmd.equals("종료")) {
                System.out.println("상품 앱을 종료합니다.");
                break;
            } else if (cmd.equals("등록")) {
                long id = count + 1;
                System.out.printf("상품명 : ");
                String product_name = sc.nextLine().trim();
                System.out.printf("제조사 : ");
                String product_brand = sc.nextLine().trim();
                System.out.printf("용량 : ");
                String product_capacity = sc.nextLine().trim();
                System.out.printf("가격 : ");
                String product_price = sc.nextLine().trim();
                System.out.printf("제품설명 : ");
                String product_expanation = sc.nextLine().trim();

                product product = new product(id, product_name, product_brand, product_capacity, product_price, product_expanation);

                products.add(product);


                System.out.printf("%d번 상품이 등록되었습니다.\n", id);
                count = id;

            } else if (cmd.equals("목록")) {
                System.out.println("번호 / 상품명 / 제조사 / 용량 / 가격 / 제품설명\n" + "-".repeat(50));
                for (int i = products.size() - 1; i >= 0; i--) {
                    product product = products.get(i);
                    System.out.printf("%d / %s / %s / %s / %s / %s\n", product.getId(), product.getProduct_name(), product.getProduct_brand(),
                            product.getProduct_capacity(), product.getProduct_price(), product.getProduct_expanation());
                }
            }
        }
    }
}

//== 명언 앱 ==
//        명령) 등록
//        명언 : 현재를 사랑하라.
//        작가 : 작자미상
//        1번 명언이 등록되었습니다.
//        명령) 등록
//        명언 : 현재를 사랑하라.
//        작가 : 작자미상
//        2번 명언이 등록되었습니다.
//        명령) 목록
//        번호 / 작가 / 명언
//        ----------------------
//        2 / 작자미상 / 과거에 집착하지 마라.
//        1 / 작자미상 / 현재를 사랑하라.
//        명령) 종료