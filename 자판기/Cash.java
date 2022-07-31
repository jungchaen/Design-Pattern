import java.util.Scanner;

public class Cash implements Pay {
    @Override
    public boolean pay(Beverage beverage) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n현금을 투입하세요: ");
        int amount = Integer.parseInt(sc.next());

        if (beverage.cost() > amount) {
            System.out.println("투입한 금액이 결제금액보다 적습니다.");
            return false;
        } else {
            greedyCharge(beverage, amount);
            return true;

        }
    }

    public void greedyCharge(Beverage beverage, int amount) {
        int coin[] = { 10, 50, 100, 500 };
        int charge = amount - beverage.cost();
        int cnt = 0;

        for (int i = coin.length - 1; i >= 0; i--) {
            if (coin[i] <= charge) {
                cnt += charge / coin[i];
                charge %= coin[i];
            }
        }
        System.out.println("동전 " + cnt + "개가 나옵니다.");
    }
}
