
/**
 * Es un condimento que puede agregarse a las bebidas.
 * @author berly
 */
public class Soy extends Condiment {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public double getCost() {
        return beverage.getCost() + 5;
    }

    public String getDescription() {
        return beverage.getDescription() + " - soy";
    }

}
