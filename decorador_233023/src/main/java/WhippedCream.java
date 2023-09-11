/**
 * Es un condimento que puede agregarse a las bebidas.
 * @author berly
 */
public class WhippedCream extends Condiment {

    public WhippedCream(Beverage beverage) {
        this.beverage = beverage;
    }

    public double getCost() {
        return beverage.getCost() + 10;
    }

    public String getDescription() {
        return beverage.getDescription() + " - whippedCream";
    }

}
