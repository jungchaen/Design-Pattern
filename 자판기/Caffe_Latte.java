public class Caffe_Latte extends Beverage {
    public Caffe_Latte(String beverageName, Hot_Or_Iced hot_ice) {
        super(beverageName, hot_ice);
    }

    public int cost() {
        if (getHot_Iced() == Hot_Or_Iced.ICED)
            return this.cost = 1700;
        return this.cost = 1700;
    }
}
