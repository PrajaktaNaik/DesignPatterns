package composite;


/**
 * Write a description of class ThePurist here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ThePurist implements Component
{
     private String description ;
    private Double price ;

    public ThePurist( String d, Double p )
    {
        description = d ;
        price = p ;
    }
    
    public void printDescription() {
        
        System.out.println( description + " " + price ) ;
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
