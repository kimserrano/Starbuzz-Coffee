/**
 * Es la clase intermedia para envolver un objeto dentro de otro, es decir, es la clase que se encargara 
 * de ponerle condimento a la bebida si se requiere.
 * @author berly
 */
public abstract class Condiment extends Beverage {

    /**
     * Es el cafe al que se le agregara el condimento.
     */
    public Beverage beverage;

    /**
     * Nombre del condimento, tambien es abstracto porque debe 
     * de existir en las hijas.
     * @return 
     */
    public abstract String getDescription();

}
