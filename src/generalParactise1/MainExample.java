package generalParactise1;


public class MainExample {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book(1, "Java", 12);
        books[1] = new Book(2, "Csharp", 10);
        books[2] = new Book(3, "CplusPlus", 14);
        books[3] = new Book(4, "Angular", 15);

        System.out.println(PriceCalculator.totalPrices(books));
    }
}
