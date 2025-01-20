/**
 * This class is the main class of the Tim Hortons .
 * It creates and initialises all the other classes.
 *
 * @author: Hamza Saleh,000887384
 */
public class Main {
    public static void main(String[] args) {
        TimsOrder t = TimsOrder.create(); //creates a new TimsOrder object
        System.out.println(t); //prints the order
        System.out.printf("Total Price: $%.2f\n", t.getAmountDue()); //prints the total price
    }
}