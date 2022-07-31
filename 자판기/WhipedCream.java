public class WhipedCream extends BeverageDecorator {
    public WhipedCream(Beverage beverage) {
        this.beverage = beverage;
    }

    public String orderDetail() {
        return beverage.orderDetail() + " (+휘핑크림 추가)";
    }

    public int cost() {
        return beverage.cost() + 500;
    }
}
