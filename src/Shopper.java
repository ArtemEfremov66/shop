import java.util.ArrayList;
import java.util.List;

public class Shopper {//Single Responsibility Principle. Наш "покупатель" делает только то, что свойственно покупателю. Например покупает товар (buy())
    protected String name;
    protected int cash;
    protected String address;
    Products food;
    Products decor;
    Delivery delivery;
    protected List<String> basket = new ArrayList<>();

    public Shopper(String name, int cash, String address, Products food, Products decor) {
        this.name = name;
        this.cash = cash;
        this.address = address;
        this.food = food;
        this.decor = decor;
    }

    public String getName() {
        return name;
    }

    public int getCash() {
        return cash;
    }

    public void buy(Products product, String name, int count) { // DRY. вместо того, чтобы написать два метода
        // buyFood и buyDecor, мы добавили параметр product и избежали дублирования кода
        try {
            int cost = product.costOfProducts(name) * count;
            if (cash >= cost) {
                cash -= cost;
                System.out.println("Покупка совершена! На счету осталось " + cash + " рублей.");
                basket.add(name);
            } else {
                System.out.println("Недостаточно средств на счету!");
            }
        } catch (NullPointerException e) {
            System.out.println("Нет такого продукта");
        }
    }

    public void deliveryStart(List<String> basket) {
        //Dependency inversion principle. Вместо того, чтобы опираться на реализацию конкретного класса
        //для доставки, мы зависим от его абстракции (интерфейс Delivery)
        delivery = new Decor();
        for (String name : basket) {
            if (delivery.delivery(name)) {
                System.out.println("Доставим товар: " + name + " по адресу " + address);
            }
        }
    }
}