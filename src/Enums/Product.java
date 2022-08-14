package Enums;

public class Product {
    int price;
    String name;
    String barcode;
    Measures size;

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", barcode='" + barcode + '\'' +
                ", size=" + size +
                '}';
    }

    public Product(int price, String name, String barcode, Measures size) {
        this.price = price;
        this.name = name;
        this.barcode = barcode;
        this.size = size;
    }
}
