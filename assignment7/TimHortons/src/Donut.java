/**
 * this class contains code for the Donut class
 * @author Hamza Saleh,000887384
 */
import java.util.Scanner;
/**
 * @author: Hamza Saleh,000887384
 * this class is a subclass of TimsProduct and implements Consumable
 */
public class Donut extends TimsProduct implements Consumable {
    private String description; //description of the donut
    private int calorieCount; //calorie count of the donut

    /**
     * @param name name of the donut
     * @param description description of the donut
     * @param cost cost of the donut
     * @param price price of the donut
     * @param calorieCount calorie count of the donut
     */
    private Donut (String name,String description,double cost, double price, int calorieCount){
        super(name, cost, price); //calls the constructor of the superclass
        this.calorieCount=calorieCount; //sets the calorie count
        this.description=description; //sets the description
    }

    /**
     * returns a new donut object
     */
    public static Donut create(){
        System.out.println("pick your donut"); //asks the user to pick a donut
        System.out.println("1-chocolate dip donut, chocolate dipped Donut,2,99$,250 calories"); //prints the options
        System.out.println("2-strawberry donut, a donut stuffed with blueberry jam , 3,79$, 290 calories"); //prints the options
        System.out.println("3-blueberry donut,a donut stuffed with blueberry jam,3,99$,290 calories"); //prints the options

        Scanner input = new Scanner(System.in); //creates a scanner object
        int chosen= input.nextInt(); //gets the user input

        String name=""; //creates a string to store the name of the donut
        int calorieCount = 0; //creates an int to store the calorie count of the donut
        String description=""; //creates a string to store the description of the donut
        double price= 0; // creates a double to store the price of the donut
        double cost=0; //creates a double to store the cost of the donut

        /**
         * this switch statement sets the name, description, calorie count, price and cost of the donut
         */
        switch(chosen){
            case 1:
                name="chocolate Donut"; //sets the name
                description=" chocolate dipped Donut"; //sets the description
                cost=1.00; //sets the cost
                price=2.99; //sets the price
                calorieCount=250; //sets the calorie count
                break;

            case 2:
                name="strawberry donut"; //sets the name
                description=" a donut stuffed with strawberry jam"; //sets the description
                cost=1.40; //sets the cost
                price=3.79; //sets the price
                calorieCount=290; //sets the calorie count
                break;

            case 3:
                name="blueberry Donut"; //sets the name
                description=" a donut stuffed with blueberry jam"; //sets the description
                cost=1.50; //sets the cost
                price=3.99; //sets the price
                calorieCount=290; //sets the calorie count
                break;
        }
        return new Donut(name,description,cost,price,calorieCount); //returns a new donut object

    }

    /**
     * returns the description of the donut
     */
    public String getDescription() {
        return description;
    }

    /**
     *  returns the calorie count of the donut
     */
    @Override
    public int getCalorieCount() {
        return calorieCount;
    }

    /**
     * returns the method of consumption of the donut
     */
    @Override
    public String getConsumptionMethod() {
        return "eat it";
    }

    /**
     * returns a string representation of the donut
     */
    public String toString(){
        return super.toString() + " which is "+ description + " that has "+ calorieCount + " calories ";
    }
}

