package composite;


/**
 * Write a description of class CheeseTopping here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CheeseTopping extends BurgerDecorator 
{
   BurgerComponent burgerComponent;
   String[] cheese = new String[8];
   public CheeseTopping(BurgerComponent burgerComponent,String[] cheese){
       this.burgerComponent= burgerComponent;
       this.cheese = cheese;
    }
    public void printDescription(){
        String desc="";
       burgerComponent.printDescription();
        for (int i=0;i<cheese.length;i++){
            desc =desc + cheese[i];
            if(i!=cheese.length-1)
            {
                desc = desc + "+";
            }
            
        }
        System.out.println(desc);
    }
    //one cheese is free
    public double cost(){
        if(cheese.length>1){
            return (1*(cheese.length-1))+burgerComponent.cost();
        }
     else {
     return 0+ burgerComponent.cost();
    }
}
}
