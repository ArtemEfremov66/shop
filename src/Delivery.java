public interface Delivery { // Interface segregation principle. У некоторых товаров может не быть доставки,
    // поэтому мы вынесли этот метод в отдельный интерфейс
    boolean delivery(String name);
}