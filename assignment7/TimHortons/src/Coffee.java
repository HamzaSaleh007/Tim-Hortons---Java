import java.util.Scanner;

/**
 * @author: Hamza Saleh,000887384
 * this class is a subclass of TimsProduct and implements Consumable
 */
public class Coffee extends TimsProduct implements Consumable{
    private String description; //description of the coffee
    private int calorieCount; //calorie count of the coffee

    /**
     * @param name name of the coffee
     * @param description description of the coffee
     * @param cost cost of the coffee
     * @param price price of the coffee
     * @param calorieCount calorie count of the coffee
     */
    private Coffee (String name,String description,double cost, double price, int calorieCount){
        super(name, cost, price); //calls the constructor of the superclass
        this.calorieCount=calorieCount; //sets the calorie count
        this.description=description; //sets the description
    }

    /**
     * returns a new coffee object
     */
    public static Coffee create(){
        System.out.println("pick your Coffee"); //asks the user to pick a coffee
        System.out.println("1-Hot coffee, Fresh Brazilian Coffee beans served hot, 2,50$, 50 Calories"); //prints the options
        System.out.println("2-Iced Coffee,Fresh cold brew with cream and sugar, 3,79$, 100 Calories"); //prints the options


        Scanner input = new Scanner(System.in); //creates a scanner object
        int chosen= input.nextInt(); //gets the user input

        String name=""; //creates a string to store the name of the coffee
        int calorieCount = 0; //creates an int to store the calorie count of the coffee
        String description=""; //creates a string to store the description of the coffee
        double price= 0; //creates a double to store the price of the coffee
        double cost=0; //creates a double to store the cost of the coffee

        /**
         * this switch statement sets the name, description, calorie count, price and cost of the coffee
         */
        switch(chosen){
            case 1:
                name="Hot Coffee"; //sets the name
                description="Fresh Brazilian Coffee beans served hot"; //sets the description
                cost=0.70; //sets the cost
                price=2.50; //sets the price
                calorieCount=50; //sets the calorie count
                break;

            case 2:
                name="Iced Coffee"; //sets the name
                description="Fresh cold brew with cream and sugar"; //sets the description
                cost=1.00; //sets the cost
                price=3.79; //sets the price
                calorieCount=100; //sets the calorie count
                break;

        }
        return new Coffee(name,description,cost,price,calorieCount); //returns a new coffee object

    }

    /**
     * returns the description of the coffee
     */
    public String getDescription() {
        return description;
    }

    /**
     * returns the calorie count of the coffee
     */
    @Override
    public int getCalorieCount() {
        return calorieCount;
    }

    /**
     * returns the method of consumption of the coffee
     */
    @Override
    public String getConsumptionMethod() {
        return "Drink it";
    }

    /**
     * returns the name, description and calorie count of the coffee
     */
    public String toString(){
        return super.toString() + " which is "+ description + " that has "+ calorieCount + " calories ";
    }
}
