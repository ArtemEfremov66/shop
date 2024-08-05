import java.util.HashMap;
import java.util.Map;

public class Food implements Products {//Liskov substitution principle. От интерфейса Product, которой
    // олицетворяет товары, которые можно купить в магазине,
    // наследуются классы Food и Decor. Они соответствуют логике покупки товаров в магазине.
    private Map<String, Integer> food = new HashMap<>();

    public Food() {
        food.put("Apple", 100);
        food.put("Banana", 50);
        food.put("Orange", 80);
        food.put("Peach", 120);
        food.put("Mango", 150);
    }

    @Override
    public int costOfProducts(String name) {
        return food.get(name); // Чтобы избежать магического появления цен на товары,
        // единожды задаем их при создании объекта и затем используем метод costOfProducts() для их получения
    }

    @Override
    public void list() {
        System.out.println("Список товаров: " + food.keySet());
    }
}