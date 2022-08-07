package generalParactise1;

public class PriceCalculator {
    static int totalPrices(Book[] books){
        int result = 0;
        for (Book book:books) {
            result+=book.price;
        }
        return result;
    }
}
