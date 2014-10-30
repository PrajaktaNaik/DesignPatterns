package composite;


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

    public CustomBurger(BurgerComponent burger )
    {
        description = burger.getDesc();
        price = burger.cost();
    }
    
    public void printDescription() {
        
        System.out.println("Build your Own Burger "+price); 
        System.out.println( description);
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
