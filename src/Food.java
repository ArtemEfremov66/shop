import java.util.HashMap;
import java.util.Map;

public class Food implements Products {
    @Override
    public int costOfProducts(String name) {
        Map<String, Integer> food = new HashMap<>();
        food.put("Apple", 100);
        food.put("Banana", 120);
        food.put("Orange", 80);
        food.put("Kivy", 180);
        food.put("Potato", 40);
        System.out.println(food.keySet());
        return food.get(name);
    }
}
