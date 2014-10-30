package composite;


/**
 * Write a description of class Toppings here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Toppings extends BurgerDecorator
{
   BurgerComponent burgerComponent;
   String[] toppings = new String[15];
   public Toppings(BurgerComponent burgerComponent, String[] toppings){
       this.burgerComponent=burgerComponent;
       this.toppings=toppings;
    }
    public double cost(){
        if(toppings.length>4){
            return (0.75*(toppings.length-4))+burgerComponent.cost();
        }
        else
         return 0+burgerComponent.cost();
    }
   public String getDesc(){
       String desc = burgerComponent.getDesc()+"\n";
       for(int i=0;i<toppings.length;i++){
          
            desc =desc + toppings[i];
             if(i!=toppings.length-1){
               desc =desc + "+";
            }
        }
        return desc;
    }
}
