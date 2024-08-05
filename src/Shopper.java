public class Shopper {
    protected String name;
    protected int cash;

    public Shopper(String name, int cash) {
        this.name = name;
        this.cash = cash;
    }

    public String getName() {

        return name;
    }

    public int getCash() {
        return cash;
    }

    public void buyFood(String name, int kg) {
        try {
            Products food = new Food();
            int cost = food.costOfProducts(name) * kg;
            if (cash >= cost) {
                cash -= cost;
                System.out.println("Покупка совершена! На счету осталось " + cash + " рублей.");
            } else {
                System.out.println("Недостаточно средств на счету!");
            }
        } catch (NullPointerException e) {
            System.out.println("Нет такого продукта");
        }
    }
    public void buyDecor(String name, int count) {
        try {
            Products food = new Decor();
            int cost = food.costOfProducts(name) * count;
            if (cash >= cost) {
                cash -= cost;
                System.out.println("Покупка совершена! На счету осталось " + cash + " рублей.");
            } else {
                System.out.println("Недостаточно средств на счету!");
            }
        } catch (NullPointerException e) {
            System.out.println("Нет такого продукта");
        }
    }
    public String basket() {
        return null;
    }
}