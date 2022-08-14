package Enums;

public class EnumUsing {
    public static void main(String[] args) {

        Product p1 = new Product(12, "Pizza", "12244545643426", Measures.MINI);
        Product p2 = new Product(13, "Burger", "45244281625623", Measures.BIG);
        Product p3 = new Product(15, "Sandwich", "34535424555626", Measures.NORMAL);

        System.out.println(p1.size.getNumericSize());
        System.out.println(p2);
        System.out.println(p3);

    }
}
