import java.awt.*;
import java.util.Scanner;

/**
 * @author: Hamza Saleh,000887384
 * this class is a subclass of TimsProduct
 */
public class Mug extends TimsProduct{
    private Color color; //color of the mug

    /**
     * @param name name of the mug
     * @param color color of the mug
     * @param cost cost of the mug
     * @param price price of the mug
     */
    private Mug (String name,Color color,double cost, double price){
        super(name, cost, price); //calls the constructor of the superclass
        this.color = color; //sets the color

    }

    /**
     * returns a new mug object
     */
    public static Mug create() {
        System.out.println("pick your Mug"); //asks the user to pick a mug
        System.out.println("1-superman Mug, Blue, 4,99$"); //prints the options
        System.out.println("2-batman Mug, Black, 4,99$"); //prints the options
        System.out.println("3-ironman Mug, Yellow, 4,99$"); //prints the options

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
                name="Superman Mug"; //sets the name
                color= Color.BLUE; //sets the color
                cost=2.00; //sets the cost
                price=4.99; //sets the price

                break;

            case 2:
                name="Batman Mug"; //sets the name
                color= Color.BLACK; //sets the color
                cost=2.00; //sets the cost
                price=4.99; //sets the price
                break;

            case 3:
                name="Ironman Mug"; //sets the name
                color= Color.YELLOW; //sets the color
                cost=2.00; //sets the cost
                price=4.99; //sets the price
                break;
        }
        return new Mug(name,color,cost,price); //returns a new mug object
    }

    /**
     * returns the color of the mug
     */
    public Color getColor(){
        return color;
    }

    /**
     * @param color color of the mug to write in toString the name and not hex value
     */
    private String colorName(Color color) {
        if (color.equals(Color.BLACK)) { //checks if the color is black
            return "Black";
        } else if (color.equals(Color.BLUE)) { //checks if the color is blue
            return "Blue";
        } else if (color.equals(Color.YELLOW)) { //checks if the color is yellow
            return "Yellow";
        } else {
            return "invalid"; //returns invalid if the color is not black, blue or yellow
        }
    }

    /**
     * returns the name, cost, price and color of the mug
     */
    public String toString() {
        return super.toString() + " the color of your Mug is " +colorName(color);}
}
