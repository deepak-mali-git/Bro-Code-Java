public class OConstructor {
    public static void main(String[] args) {

        // overloaded constructors = multiple constructor withing a class with the same name, but have different parameters

        Pizza pizza = new Pizza("thick crust","tomato","cheese","pepperoni");
        Pizza pizza2 = new Pizza("thick crust","tomato");

        System.out.println(); 
        
        System.out.println("Here are the ingredients of the pizza: ");
        System.out.println(pizza.bread);        
        System.out.println(pizza.sauce);        
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);

        System.out.println(); 

        System.out.println("Here are the ingredients of the pizza2: ");
        System.out.println(pizza2.bread);        
        System.out.println(pizza2.sauce);        
        System.out.println(pizza2.cheese);
        System.out.println(pizza2.topping);

    }
}