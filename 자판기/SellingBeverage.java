import java.util.Scanner;

public class SellingBeverage {
    public static void sellBeverage(Beverage beverage) {
        if (beverage.getHot_Iced() == Hot_Or_Iced.HOT) {
            if (beverage instanceof Teabag) {
                SellTeabagBeverage();
            } else {
                sellHotBeverage();
            }
        } else {
            sellIcedBeverage();
        }
        System.out.println("음료 추출이 완료되었습니다.");
    }

    public static void sellHotBeverage() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n종이컵이 나옵니다.");
        System.out.print("음료 추출 (y를 입력하세요): ");
        String buttonBeverage = sc.next();

        if (buttonBeverage.equals("y")) {
            timerBeverage();
        }

    }

    public static void sellIcedBeverage() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n플라스틱 컵이 나옵니다.");
        System.out.print("얼음을 받으세요 (y를 입력하세요): ");
        String buttonIce = sc.next();
        if (buttonIce.equals("y")) {
            timerBeverage();
        }

        System.out.print("음료 추출 (y를 입력하세요): ");
        String buttonBeverage = sc.next();
        if (buttonBeverage.equals("y")) {
            timerBeverage();
        }
    }

    public static void SellTeabagBeverage() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n종이컵이 나옵니다.");
        System.out.println("티백이 나옵니다.");
        System.out.print("뜨거운 물 추출 (y를 입력하세요): ");
        String buttonBeverage = sc.next();
        if (buttonBeverage.equals("y")) {
            timerBeverage();
        }
    }

    public static void timerBeverage() {
        for (int i = 0; i < 3; i++) {
            System.out.println(".");
        }
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
    }
}
