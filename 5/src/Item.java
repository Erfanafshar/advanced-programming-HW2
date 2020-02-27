/**
 * The Item class represent a product
 * With the details of the product
 * *
 * @author Erfan
 * @version 1
 */
public class Item {

    // fields //

    // The product name
    private String name ;

    // The producer name
    private String producer ;

    // The amount of the product
    private int amount ;

    // constuctor //

    /**
     * Create a new Item with given name of product and producer and default amount
     * @param nme the name of product
     * @param prducer the name of producer
     */
    public Item ( String nme , String prducer ){
        name = nme ;
        producer = prducer ;
        amount = 0 ;
    }

    // method //

    /**
     * Increase the amount of product
     * @param number the number of increase
     */
    public void increment ( int number ){
        amount +=number ;
    }

    /**
     * Decrease the amount of product
     * @param number the number of decrease
     */
    public void decrement ( int number ){
        amount -=number ;
    }

    /**
     * Print the product information
     */
    public void print (){
        System.out.println("name : " + name);
        System.out.println("producer : " + producer);
        System.out.println("amount : " + amount);
    }
}
