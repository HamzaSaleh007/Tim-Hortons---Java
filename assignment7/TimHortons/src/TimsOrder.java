import java.util.Scanner;

/**
 * author: Hamza Saleh,000887384
 * the TimOrder class is used to create an order for the customer
 */
public class TimsOrder {
    private int size; //the size of the order
    private String name; //the name of the customer
    TimsProduct [] products; //an array of TimsProduct objects

    /**
     * @param name the name of the customer
     * @param size the size of the order
     */
    private TimsOrder(String name, int size){
        this.size=size; //sets the size
        this.name=name; //sets the name
    }

    /**
     * returns a new TimsOrder object
     */
    public static TimsOrder create(){
        int size = 0; //creates an int to store the size of the order
        String name=""; //creates a string to store the name of the customer
        System.out.println(" what is your name? "); //asks the user for their name
        Scanner input = new Scanner(System.in); //creates a scanner object
        name=input.nextLine();
        System.out.println("how many items do you want ?"); //asks the user for the size of the order
        size= input.nextInt();

        TimsProduct [] products = new TimsProduct[size]; //creates an array of TimsProduct objects

        /**
         * this for loop creates a new TimsProduct object and adds it to the array
         */
        for (int i =0 ; i<products.length ;i++ ){
            System.out.println("what do you want 1-Donut or 2-Mug or 3-Coffee or 4-Shirt "); //asks the user to pick an item
            int chosen= input.nextInt(); //gets the user input
            switch (chosen){
                case 1:
                    Donut donut = Donut.create(); //creates a new donut object
                    products[i]=donut; //adds the donut to the array
                    break;
                case 2:
                    Mug mug = Mug.create(); //creates a new mug object
                    products[i]=mug; //adds the mug to the array
                    break;
                case 3:
                   Coffee coffee = Coffee.create(); //creates a new coffee object
                    products[i]=coffee; //adds the coffee to the array
                    break;
                case 4:
                  Shirts shirt = Shirts.create(); //creates a new shirt object
                  products[i] = shirt; //adds the shirt to the array
                  break;

            }

        }
        TimsOrder shoppingCart = new TimsOrder(name, size); //creates a new TimsOrder object
        shoppingCart.products = products; //sets the array of TimsProduct objects
        return shoppingCart;

    }

    /**
     * returns the total cost of the order
     */
    public double getAmountDue(){
        double total=0.0; //creates a double to store the total cost of the order
        for (int i=0; i<products.length ; i++) // this for loop adds the cost of each item to the total

           total += products[i].getRetailPrice(); //adds the cost of each item to the total

        return total;

    }

    /**
     * returns the total price of the order
     */
    public String toString(){
        String x = ""; //creates a string to store the items in the order
        for (int i = 0; i < products.length; i++) { //this for loop adds the items in the order to the string
           x += products[i].toString() + "\n"; //adds the items in the order to the string
        }
        return "Order for :" + name + "," + "  The order has: " + size + " items " + " You ordered:\n" + x; //returns the string
    }
}

