import java.util.ArrayList;
public class MyProgram {
    public static void main(String[] args) {
        
          // ArrayList = a resizable array.
        //             elements can be added and removed after compilation phase
        //             store reference data type

        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");

        food.set(2,"sushi");
        food.remove(2);
        food.clear();

        for(int i=0; i<food.size(); i++)
        System.out.println(food.get(i));

    }
}