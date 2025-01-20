/**
 *
 * This class is the super class for all the products in Tim Hortons
 * It implements the Commodity interface and provides the basic
 * functionality for all the products.
 *
 * @author Hamza Saleh,000887384
 */
public abstract class TimsProduct implements Commidity {
    private String name; //name of the product
    private double price; //price of the product
    private double cost; //cost of the product


    /**
     * @param name name of the product
     * @param cost cost of the product
     * @param price price of the product
     */
    public TimsProduct(String name, double cost, double price) {
        this.name = name; //sets the name
        this.cost = cost; //sets the cost
        this.price = price; //sets the price

    }

    /**
     * returns the name of the product
     */
    public String getName() {
        return name;
    }

    /**
     * returns the price of the product
     */
    public double getRetailPrice() {
        return price;
    }

    /**
     * returns the cost of the product
     */
    public double getProductionCost() {
        return cost;
    }

    /**
     * returns a string representation of the product
     */
    public String toString() {
        return  name + " for " + price ;
    }

}
