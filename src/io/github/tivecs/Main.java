package io.github.tivecs;

public class Main {

    public static void main(String[] args) {

        Warehouse gudang = new Warehouse();

        Product apel = new Product("apel", 6000),
                ikan = new Product("ikan", 10000);

        gudang.addProduct(apel);
        gudang.addProduct(ikan);

        Store store = new Store("Indomaret", gudang);

        ActionHandler.addStock(store, "ikan", 23);
        ActionHandler.addStock(store, "apel", 12);

        ActionHandler.buyProduct(store, "apel", 5);
        ActionHandler.buyProduct(store, "ikan", 15);

        store.info();
    }
}
