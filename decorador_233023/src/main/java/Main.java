
/**
 * Es la clase que se utiliza para probar el sistema.
 * @author berly
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // cafe simple
        Beverage cafe = new DarkRoast();
        System.out.println(cafe.getDescription() + " $" + cafe.getCost());

        // cafe con leche, una porción
        Beverage cafeConLeche = new Expresso();
        cafeConLeche = new Milk(cafeConLeche);
        System.out.println(cafeConLeche.getDescription() + " $" + cafeConLeche.getCost());

        // cafe con dos porciones de leche 
        Beverage cafeDobleLeche = new Decaf();
        cafeDobleLeche = new Milk(cafeDobleLeche);
        cafeDobleLeche = new Milk(cafeDobleLeche);
        System.out.println(cafeDobleLeche.getDescription() + " $" + cafeDobleLeche.getCost());

        // ahora un cafe con todos 
        Beverage cafeConTodo = new HouseBlend();
        cafeConTodo = new Milk(cafeConTodo);
        cafeConTodo = new Soy(cafeConTodo);
        cafeConTodo = new Chocolate(cafeConTodo);
        cafeConTodo = new WhippedCream(cafeConTodo);
        System.out.println(cafeConTodo.getDescription() + " $" + cafeConTodo.getCost());

    }

}
