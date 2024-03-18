package excercises;

import java.util.Scanner;

public class ProductOrderMainScan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("주문 수량을 입력하세요 : ");
        int n = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] orders = new ProductOrder[n];
        for (int i = 0; i < orders.length; i++) {
            System.out.print("메뉴명 : ");
            String productName = scanner.nextLine();

            System.out.print("가격 : ");
            int price = scanner.nextInt();

            System.out.print("수량 : ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            orders[i] = createOrder(productName, price, quantity);
        }
        printOrders(orders);
        int totalAmount = getTotalAmount(orders);
        System.out.println("총 금액 : " + totalAmount);
    }


    static ProductOrder createOrder(String productname, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productname;
        order.price = price;
        order.quantity = quantity;
        return  order;
    }
    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("메뉴명 : " +order.productName + "수량 : " + order.quantity + "가격 : " + order.price );
        }

    }
    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }

}
