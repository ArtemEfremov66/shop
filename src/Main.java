import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Shopper shopper = new Shopper("Artem", 10000);
        System.out.println(shopper.getName() + ", приветствуем вас в нашем магазине");
        shopper.buyFood("Apple", 2);
        shopper.buyDecor("Glitter", 1);

    }
}