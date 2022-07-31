public class Card implements Pay {
    @Override
    public boolean pay(Beverage beverage) {
        boolean cardState = true;

        if (cardState) {
            System.out.println("결제가 완료되었습니다.");
            return true;
        } else {
            System.out.println("해당 카드로 결제할 수 없습니다.");
            return false;
        }
    }
}
