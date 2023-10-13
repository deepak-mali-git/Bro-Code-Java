import java.util.Scanner;
import java.util.ArrayList;

public class Loop {
    public static void main(String[] args) {

        // While loop = execute a block of code as long as a  it's condition remain true

        System.out.println("while loop");

        Scanner sc = new Scanner(System.in);
        String name = "";

        while(name.isEmpty())
        {
            System.out.println("Enter your name: ");
            name = sc.nextLine();
        }
        System.out.println("Hello " + name);

        sc.close();

        System.out.println("do while loop");

        // DO WHILE

        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);



        System.out.println("for loop");

        // FOR LOOP = execute a block of code a limited amount of time

        for ( i = 1; i <= 5; i++) {
            System.out.println(i);
        }



        // For-each = traversing technique to iterate through the element in an array/collection
        //            less steps more readable 
        //            less flexible 


        System.out.println("foreach loop ");

        ArrayList<String> animals = new ArrayList<String>();

        animals.add("dog");
        animals.add("cat");
        animals.add("rat");
        animals.add("bird");

        for(String animal : animals)
        {
            System.out.println(animal);
        }

        
    }
}