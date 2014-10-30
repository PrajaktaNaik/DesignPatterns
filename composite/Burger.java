package composite;


/**
 * Write a description of class Burger here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Burger extends BurgerComponent 
{
    String type ="";
    String size ="";
    String serve="";
    public Burger(String type,String size,String serve){
        this.type=type;
        this.size=size;
        this.serve=serve;
        description = "Burger type" + type + ","+ size + "," + serve;
    }
    public double cost(){
        double cost=0;
        if(size.equals("1/3lb")){
        cost= 9.50;
    }else if(size.equals("2/3lb")){
        cost=11.50;
    }else if(size.equals("1lb")){
        cost= 15.50;
    }
    if(serve.equals("In a Bowl")){
        cost=cost+1;
    }
    return cost;
    }
  
}
