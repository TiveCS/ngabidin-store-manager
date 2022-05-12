package io.github.tivecs;

public class ActionLog {

    public enum ActionType{
        CUSTOMER_BUY,
        STORAGE_ADD_STOCK
    }

    private final ActionType action;
    private final Object[] args;

    public ActionLog(ActionType action, Object[] args){
        this.action = action;
        this.args = args;
    }

    public void info(){
        switch (action){
            case CUSTOMER_BUY:
                Product product = (Product) args[0];
                int buyAmount = (int) args[1];
                int currentStock = (int) args[2];
                int currentMoney = (int) args[3];

                System.out.println("[BUY] Product '" + product.getName() + "' (x" + buyAmount + "), Stock Left: " + currentStock + ", Store Money: " + currentMoney);
                break;
            case STORAGE_ADD_STOCK:
                product = (Product) args[0];
                int addStockAmount = (int) args[1];
                currentStock = (int) args[2];

                System.out.println("[ADD STOCK] Product '" + product.getName() + "' stock add +" + addStockAmount + ", Current Stock: " + currentStock);
                break;
        }
    }

    public ActionType getAction() {
        return action;
    }

    public Object[] getArgs() {
        return args;
    }
}
