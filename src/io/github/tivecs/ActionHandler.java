package io.github.tivecs;

public class ActionHandler {

    public static void buyProduct(Store store, String name, int amount) {
        Product product = store.getWarehouse().getProduct(name);

        int currentStock = product.getStock();
        if (currentStock >= amount) {
            currentStock -= amount;
            product.setStock(currentStock);

            int money = store.getMoney();
            money += product.getPrice()*amount;
            store.setMoney(money);

            Object[] args = new Object[]{product, amount, currentStock, money};
            ActionLog log = new ActionLog(ActionLog.ActionType.CUSTOMER_BUY, args);
            store.addLog(log);
        }
    }

    public static void addStock(Store store, String name, int addAmount) {
        Product product = store.getWarehouse().getProduct(name);

        int currentStock = product.getStock();
        currentStock += addAmount;
        product.setStock(currentStock);

        Object[] args = new Object[]{ product, addAmount, currentStock };
        ActionLog log = new ActionLog(ActionLog.ActionType.STORAGE_ADD_STOCK, args);
        store.addLog(log);
    }
}
