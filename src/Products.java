public interface Products { //Open-closed principle. Мы можем добавлять новые товары в магазин без изменения
    // кода программы благодаря интерфейсу Product
    int costOfProducts(String name);

    void list();
}