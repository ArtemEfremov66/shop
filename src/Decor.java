import java.util.HashMap;
import java.util.Map;

public class Decor implements Products {

    @Override
    public int costOfProducts(String name) {
        Map<String, Integer> decor = new HashMap<>();
        decor.put("Colorant", 500);
        decor.put("Flowers", 300);
        decor.put("Glitter", 400);
        decor.put("Figurine", 700);
        decor.put("Substrate", 100);
        return decor.get(name);
    }
}
