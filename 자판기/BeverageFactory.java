public class BeverageFactory {
    public static Beverage createBeverage(int menuNum) {
        switch (menuNum) {
            case 1:
                return new Americano("아메리카노", Hot_Or_Iced.HOT);
            case 2:
                return new Caffe_Latte("카페라떼", Hot_Or_Iced.HOT);
            case 3:
                return new Mochaccino("모카치노", Hot_Or_Iced.HOT);
            case 4:
                return new Choco("핫초코", Hot_Or_Iced.HOT);
            case 5:
                return new Teabag("티백차", Hot_Or_Iced.HOT);
            case 6:
                return new Americano("아이스 아메리카노", Hot_Or_Iced.ICED);
            case 7:
                return new Choco("아이스 초코", Hot_Or_Iced.ICED);
            case 8:
                return new Caffe_Latte("아이스 카페라떼", Hot_Or_Iced.ICED);
            case 9:
                return new Iced_Tea("복숭아 아이스티", Hot_Or_Iced.ICED);
            default:
                return null;
        }
    }
}
