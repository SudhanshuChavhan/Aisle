public class SalesTaxClient {

    public static void main(String[] args) {

        
        Item book = new Item("book", Category.BOOK, false, 12.49f);
        Item cd = new Item("Music CD", Category.OTHER, false, 14.99f);
        Item bar = new Item("Chocolate Bar", Category.FOOD, false, 0.85f);

/*        Item impChoc = new Item("IMPORTED BOX OF CHOCOLATES", Category.FOOD, true, 10.0f);
        Item impPerf = new Item("Imported bottle of Perfume", Category.OTHER, true, 47.5f);
*/        
        Receipt receipt = new Receipt();
        receipt.addItem(book).addItem(cd).addItem(bar);

//to check second input    receipt.addItem(impChoc).addItem(impPerf);
        
        //printing final rates to console
        receipt.print();
    }
}