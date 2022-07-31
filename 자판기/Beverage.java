public abstract class Beverage {
    private String beverageName;
    private Hot_Or_Iced hot_ice;
    protected int cost;

    public Beverage() {

    }

    public Beverage(String beverageName, Hot_Or_Iced hot_ice) {
        this.beverageName = beverageName;
        this.hot_ice = hot_ice;
        this.cost = this.cost();
    }

    public Hot_Or_Iced getHot_Iced() {
        return this.hot_ice;
    }

    public abstract int cost();

    public String orderDetail() {
        return this.beverageName;
    }
}
