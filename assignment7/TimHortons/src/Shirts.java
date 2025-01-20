import java.awt.*;
import java.util.Scanner;

/**
 * @author: Hamza Saleh,000887384
 * this class is a subclass of TimsProduct
 */
public class Shirts extends TimsProduct{
    private Color color; //color of the shirt

    /**
     * @param name name of the shirt
     * @param color color of the shirt
     * @param cost cost of the shirt
     * @param price price of the shirt
     */
    private Shirts (String name,Color color,double cost, double price){
        super(name, cost, price); //calls the constructor of the superclass
        this.color = color; //sets the color

    }

    /**
     * returns a new shirt object
     */
    public static Shirts create() {
        System.out.println("pick your shirt"); //asks the user to pick a mug
        System.out.println("1-happy shirt,Yellow, 15,99$"); //prints the options
        System.out.println("2-excited shirt, White, 15,99$"); //prints the options
        System.out.println("3-Canada, Red, 15,99$"); //prints the options

        Scanner input = new Scanner(System.in); //creates a scanner object
        int chosen= input.nextInt(); //gets the user input

        String name=""; //creates a string to store the name of the mug
        double price= 0; // creates a double to store the price of the mug
        double cost=0; //creates a double to store the cost of the mug
        Color color = null; //creates a color object to store the color of the mug

        /**
         * this switch statement sets the name, color, price and cost of the mug
         */
        switch(chosen){
            case 1:
                name="happy shirt"; //sets the name
                color= Color.YELLOW; //sets the color
                cost=8.00; //sets the cost
                price=15.99; //sets the price

                break;

            case 2:
                name="excited shirt"; //sets the name
                color= Color.WHITE; //sets the color
                cost=8.00; // sets the cost
                price=15.99; //sets the price

                break;

            case 3:
                name="Canada shirt"; //sets the name
                color= Color.RED; //sets the color
                cost=8.00; //sets the cost
                price=15.99; //sets the price
        }
        return new Shirts(name,color,cost,price); //returns a new mug object
    }

    /**
     * returns the color of the shirt
     */
    public Color getColor(){
        return color;
    }

    /**
     * @param color sets the color of the shirt to be displayed in toString
     */
    private String colorName(Color color) {
        if (color.equals(Color.RED)) { //checks if the color is red
            return "Red";
        } else if (color.equals(Color.WHITE)) { //checks if the color is white
            return "White";
        } else if (color.equals(Color.YELLOW)) { //checks if the color is yellow
            return "Yellow";
        } else {
            return "invalid"; //returns invalid if the color is not red, white or yellow
        }
    }

    /**
     * returns the name, color, cost and price of the shirt
     */
    public String toString() {
        return super.toString() + " the color of your shirt is " +colorName(color);}
}
