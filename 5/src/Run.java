/**
 * The run class for make Items with Item class
 *
 * @author Erfan
 * @version 1
 */
public class Run {

    // The main method
    public static void main(String[] args) {

        // Make two product from Item class
        Item itemOne = new Item("Chocolate" , "farmand" ) ;
        Item itemTwo = new Item( "Puff" , "Chackelz") ;

        // Increase the product amount
        itemOne.increment(5);
        itemTwo.increment(3);

        // Print Items
        itemOne.print();
        itemTwo.print();
    }
}
