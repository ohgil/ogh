package org.example;

import org.example.product.controller.ProductController;
import org.example.system.controller.SystemController;

public class App {

    public void run() {
        System.out.println("== 상품 앱 ==");

        SystemController systemController = new SystemController();
        ProductController productController = new ProductController();


        while (true) {
            System.out.printf("명령) ");
            String cmd = Container.getScanner().nextLine().trim();

            if (cmd.equals("종료")) {
                System.out.println("상품 앱을 종료합니다.");
                break;
            } else if (cmd.equals("등록")) {
                productController.write();
            } else if (cmd.equals("목록")) {
                productController.list();
            } else if(cmd.equals("삭제")) {
                productController.remove();
                System.out.println("1번 명언이 삭제되었습니다.");
            }
        }
    }
}