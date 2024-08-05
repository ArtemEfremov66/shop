import java.util.HashMap;
import java.util.Map;

public class Decor implements Products, Delivery {
    private Map<String, Integer> decor = new HashMap<>();

    public Decor() {
        decor.put("Glitter", 400);
        decor.put("Flower", 300);
        decor.put("Colorant", 500);
        decor.put("Figurine", 700);
    }

    @Override
    public int costOfProducts(String name) {
        return decor.get(name);
    }

    @Override
    public void list() {
        System.out.println("Список товаров: " + decor.keySet());
    }

    @Override
    public boolean delivery(String name) {
        return decor.containsKey(name);
    }
}