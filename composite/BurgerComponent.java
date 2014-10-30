package composite;


/**
 * Abstract class BurgerComponent - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class BurgerComponent
{
   String description ="Unkown";
   public String getDesc(){
       return description;
    }
    public abstract double cost();
}
