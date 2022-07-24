public class SalesTaxClient {

    public static void main(String[] args) {

        //Defining Items 
        //First Input
        Item book = new Item("book", Category.BOOK, false, 12.49f);
        Item cd = new Item("Music CD", Category.OTHER, false, 14.99f);
        Item bar = new Item("Chocolate Bar", Category.FOOD, false, 0.85f);

        //adding items in receipt
        Receipt receipt = new Receipt();
        
        receipt.addItem(book).addItem(cd).addItem(bar); //remmber to comment out this line while using other inputs

        
        /*      //Second Input
        Item impChoc = new Item("IMPORTED BOX OF CHOCOLATES", Category.FOOD, true, 10.0f);
        Item impPerf = new Item("Imported bottle of Perfume", Category.OTHER, true, 47.5f);
        
        receipt.addItem(impChoc).addItem(impPerf);
        */        
        
        /*      //Third Input
        Item impPerf = new Item("IMPORTED BOTTLE OF Perfume", Category.OTHER, true, 27.99f);
        Item perfume = new Item("Bottle of Perfume", Category.OTHER, false, 18.99f);
        Item pills = new Item("Packet of Headache Pills", Category.MEDICAL, false, 9.75f);
        Item impChoc = new Item("IMPORTED BOX OF CHOCOLATES", Category.FOOD, true, 11.25f);
        
        receipt.addItem(impPerf).addItem(perfume).addItem(pills).addItem(impChoc);
        */
        
        //printing final rates to console
        receipt.print();
    }
}
