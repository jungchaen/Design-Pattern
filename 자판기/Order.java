import java.util.Scanner;

public class Order {
    public static Beverage orderMenu() {
        System.out.print("\n메뉴 번호를 선택해주세요. (예: 3) : ");
        Scanner sc = new Scanner(System.in);
        int menuNum = Integer.parseInt(sc.next());

        Beverage beverage = BeverageFactory.createBeverage(menuNum);
        return beverage;
    }

    public static Beverage orderCustom(Beverage beverage) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n휘핑크림을 추가하시겠습니까? (y 또는 n을 입력하세요): ");
        String cumtomWippedCream = sc.next();

        if (cumtomWippedCream.equals("y")) {
            beverage = new WhipedCream(beverage);
        }

        System.out.print("샷을 추가하시겠습니까? (y 또는 n을 입력하세요): ");
        String cumtomExtraShot = sc.next();

        if (cumtomExtraShot.equals("y")) {
            beverage = new ExtraShot(beverage);
            return beverage;
        } else {
            return beverage;
        }
    }
}
