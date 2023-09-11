
/**
 * Es un condimento que puede agregarse a las bebidas.
 * @author berly
 */
public class Chocolate extends Condiment {

    public Chocolate(Beverage beverage) {
        this.beverage = beverage;
    }

    public double getCost() {
        return beverage.getCost() + 15;
    }

    public String getDescription() {
        return beverage.getDescription() + " - chocolate";
    }

}
