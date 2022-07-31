import java.util.Scanner;

public class Payment {
    public static boolean payCheck;

    public static boolean isPay() { // 결제 유무 체크
        System.out.print("\n결제하시겠습니까? (y 또는 n을 입력하세요): ");
        Scanner sc = new Scanner(System.in);
        String payCheck = sc.next();

        if (payCheck.equals("y")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean howToPay(Beverage beverage) {
        System.out.println("0. 현금");
        System.out.println("1. 신용카드");
        System.out.println("2. 온라인 페이");
        System.out.print("결제 방식을 선택하세요. (예: 0): ");

        Scanner sc = new Scanner(System.in);
        int kindPayment = Integer.parseInt(sc.next());
        if (kindPayment == 0) {
            Pay payment = new Cash();
            return payCheck = payment.pay(beverage);
        } else if (kindPayment == 1) {
            Pay payment = new Card();
            return payCheck = payment.pay(beverage);
        } else {
            Pay payment = new OnlinePay();
            return payCheck = payment.pay(beverage);
        }
    }
}
