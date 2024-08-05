
public class Main {
    public static void main(String[] args) {
        Products food = new Food();
        Products decor = new Decor();
        Shopper shopper = new Shopper("Artem", 10000, "Kirov", food, decor);
        System.out.println(shopper.getName() + ", приветствуем вас в нашем магазине");
        food.list();
        decor.list();
        shopper.buy(food, "Apple", 2);
        shopper.buy(decor, "Glitter", 1);
        shopper.buy(decor, "Flower", 2);
        shopper.buy(food, "Orange", 1);
        System.out.println("Ваша корзина: " + shopper.basket);
        shopper.deliveryStart(shopper.basket);
    }
}