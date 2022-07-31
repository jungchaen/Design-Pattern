import java.util.*;

public class Test {
    public static void main(String[] args) {
        PrintMenu.printMenu();
        Beverage beverage = Order.orderMenu();
        beverage = Order.orderCustom(beverage);
        System.out.println("\n주문메뉴: " + beverage.orderDetail());
        System.out.println("총 금액: " + beverage.cost());

        boolean payCheck = Payment.isPay();

        if (payCheck) {
            if (Payment.howToPay(beverage)) {
                System.out.println("결제가 완료되었습니다.");
            } else {
                System.out.println("결제가 취소되었습니다.");
                return;
            }
        } else {
            System.out.println("결제가 취소되었습니다.");
            return;
        }

        SellingBeverage.sellBeverage(beverage);
    }
}
