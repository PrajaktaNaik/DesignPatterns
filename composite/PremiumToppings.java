package composite;


/**
 * Write a description of class PremiumToppings here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PremiumToppings extends BurgerDecorator
{
   BurgerComponent burgerComponent;
   String[] premiumtoppings = new String[15];
   public PremiumToppings(BurgerComponent burgerComponent,String[] premiumtoppings){
       this.burgerComponent=burgerComponent;
       this.premiumtoppings=premiumtoppings;
    }
    
    public String getDesc(){
        String desc=burgerComponent.getDesc()+"\n";
        for(int i=0;i<premiumtoppings.length;i++)
        {
            desc=desc + premiumtoppings[i];
            if(i!=premiumtoppings.length-1)
            desc=desc+"+";
        }
        return desc;
    }
    
    public double cost(){
        if(premiumtoppings.length>0){
            return (1.50*premiumtoppings.length)+burgerComponent.cost();
        }else{
            return 0+ burgerComponent.cost();
    }
}
}
