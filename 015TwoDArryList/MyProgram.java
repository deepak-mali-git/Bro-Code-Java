import java.util.ArrayList;

public class MyProgram {
    public static void main(String[] args) {

        // 2D ArrayList = a dynamic list of lists
        // you can change the size of these lists during runtime


        ArrayList<ArrayList<String>> groceryList = new ArrayList<ArrayList<String>>();
             

        ArrayList<String> bakeryList = new ArrayList<String>();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");


        ArrayList<String> produceList = new ArrayList<String>();
        produceList.add("tomatoes");
        produceList.add("garlic");
        produceList.add("pappers");


        ArrayList<String> drinkList = new ArrayList<String>();
        drinkList.add("chai");
        drinkList.add("coffee");
        drinkList.add("bear");



        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinkList);

        System.out.println(groceryList.get(0).get(0));
        
    }
}