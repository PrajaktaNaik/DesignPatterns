package composite;

public class BuildOrder {

    public static Component getOrder()
    {
       Composite order = new Composite( "Order" ) ;
        order.addChild(new CrispyOnionSpring("Crispy Onion Strings", 5.50 ));
        order.addChild(new ThePurist("The Purist", 8.00 ));
        
       BurgerComponent burgerComponent3 = new Burger("Beef","1/3lb","In a bun");
       burgerComponent3 = new CheeseTopping(burgerComponent3,new String[] {"Dansh Blue Cheese","Horseadish Cheddar"});
       burgerComponent3 = new Toppings(burgerComponent3, new String[] {"Bermuda Red Onion","Black Olives","Carrot Strings","Coleslaw"});
       burgerComponent3 = new PremiumToppings(burgerComponent3, new String [] {"Applewood Smoked Bacon"});
       burgerComponent3 = new Sauce(burgerComponent3, new String []{"Apricot Sauce","Basil pesto"});
      order.addChild(new CustomBurger(burgerComponent3));
       //  System.out.println(burgerComponent3.getDesc()+ "\n$" + burgerComponent3.cost());
       /* Composite custhjomBurger = new Composite( "Build Your Own Burger" ) ;
        customBurger.addChild(new Leaf("Beef, 1/3 lb on a Bun", 9.50 )); // base price for 1/3 lb
        customBurger.addChild(new Leaf("Danish Blue Cheese", 0.00 )); // 1 cheese free, extra cheese +1.00
        customBurger.addChild(new Leaf("Horseradish Cheddar", 1.00 )); // extra cheese +1.00
        customBurger.addChild(new Leaf("Bermuda Red Onion", 0.00 )); // 4 toppings free, extra +.75
        customBurger.addChild(new Leaf("Black Olives", 0.00 )); // 4 toppings free, extra +.75
        customBurger.addChild(new Leaf("Carrot Strings", 0.00 )); // 4 toppings free, extra +.75
        customBurger.addChild(new Leaf("Coleslaw", 0.00 )); // 4 toppings free, extra +.75
        customBurger.addChild(new Leaf("Applewood Smoked Bacon", 1.50 )); // premium topping +1.50
        customBurger.addChild(new Leaf("Appricot Sauce", 0.00 )); // 1 sauce free, extra +.75
        order.addChild( customBurger );*/  
        return order ;
  //      BurgerComponent burgercomponent = new Burger("beef","1/3lb","in a bun");
//BurgerComponent decoratedburger = new CheeseDecorator(burgercomponent, new String[] {"1","2"})
    }

}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/