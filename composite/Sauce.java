package composite;


/**
 * Write a description of class Sauce here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sauce extends BurgerDecorator 
{
   BurgerComponent burgerComponent;
   String[] sauce = new String[15];
   public Sauce(BurgerComponent burgerComponent,String[] sauce){
       this.burgerComponent= burgerComponent;
       this.sauce = sauce;
    }
    public void printDescription(){
        String desc= "";
        
        burgerComponent.printDescription();
        for (int i=0;i<sauce.length;i++){
            desc =desc + sauce[i];
            if(i!=sauce.length-1)
            {
                desc = desc + "+";
            }
            
        }
        System.out.println(desc);
    }
    //one cheese is free
    public double cost(){
        if(sauce.length>1){
            return (1*(sauce.length-1))+burgerComponent.cost();
        }
     else {
     return 0+ burgerComponent.cost();
    }
}
}
