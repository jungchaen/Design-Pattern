public class ExtraShot extends BeverageDecorator {
    public ExtraShot(Beverage beverage) {
        this.beverage = beverage;
    }

    public String orderDetail() {
        return beverage.orderDetail() + " (+샷 추가)";
    }

    public int cost() {
        return beverage.cost() + 500;
    }
}
