package composite;


/**
 * Abstract class BurgerComponent - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class BurgerComponent implements Component 
{
   String description ="Unkown";
   private Double price ;
  /* public String getDesc(){
       return description;
    }*/
    public abstract double cost();
    
    public void printDescription() {
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
