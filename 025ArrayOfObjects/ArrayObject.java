public class ArrayObject {
    public static void main(String[] args) {


       // Food[] refrigerator = new Food[3];

        Food food1 = new Food("Pizza");
        Food food2 = new Food("hamburger");
        Food food3 = new Food("hotdog");

        Food[] refrigerator = {food1,food2,food3};

        System.out.println(refrigerator[0]);
        System.out.println(refrigerator[0].name);

        
    }

    static public class Food
    {

        String name;

        Food(String name)
        {
            this.name = name;
        }
        
    }
}