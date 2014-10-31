package composite;
import java.text.DecimalFormat;


/**
 * Write a description of class CustomBurger here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CustomBurger implements Component
{
    private String description ;
    private Double price ;
    private BurgerComponent burger;
    
    public CustomBurger ( BurgerComponent burger)
    {
        this.burger = burger;
        price = burger.cost() ;
        description = "Build Your Own Burger";
    }
    
    public void printDescription() {
        DecimalFormat fmt = new DecimalFormat("0.00");
        System.out.println( description + " " + fmt.format(price) ) ;
        this.burger.printDescription();
    }

    public void addChild(Component c) {
        // no implementation
    }

    public void removeChild(Component c) {
        // no implementation
    }

    public Component getChild(int i) {
        // no implementation
        return null ;
    }
}
