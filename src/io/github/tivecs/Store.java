package io.github.tivecs;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private final String name;
    private final Warehouse warehouse;
    private int money = 0;

    private List<ActionLog> actionLogs;

    public Store(String name, Warehouse warehouse){
        this.name = name;
        this.warehouse = warehouse;
        this.actionLogs = new ArrayList<>();
    }

    public void info(){
        System.out.println("\nCurrent Store Money: " + money);
        System.out.println("Current Product Info: ");
        warehouse.info();

        System.out.println(" ");
        System.out.println("Action Logs: ");
        if (actionLogs.isEmpty()){
            System.out.println("Empty");
        }
        for (ActionLog log : actionLogs) {
            log.info();
        }
    }

    public void addLog(ActionLog log){
        actionLogs.add(log);
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public List<ActionLog> getActionLogs() {
        return actionLogs;
    }

    public int getMoney() {
        return money;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }
}
