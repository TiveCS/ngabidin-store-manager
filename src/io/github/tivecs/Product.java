package io.github.tivecs;

public class Product {

    private final String name;
    private int stock = 0;
    private int price;

    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    public void info(){
        System.out.println("- Nama: " + name + ", Harga: " + price + ", Stok: " + stock);
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }
}
