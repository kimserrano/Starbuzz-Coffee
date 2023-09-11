/**
 * Es la clase padre.
 * @author berly
 */
public abstract class Beverage {

    /**
     * La descripcion del cafe, su nombre.
     */
    String description;

    /**
     * Se obtiene el nombre del cafe.
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * Es un metodo que te va a permitir conocer el costo dependiendo del tipo
     * de cafe y es abstracto porque se require que todas las clases hijas lo
     * implementen.
     *
     * @return
     */
    public abstract double getCost();

}
