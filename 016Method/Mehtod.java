public class Mehtod {
    public static void main(String[] args) {

        // method = a block of code that is executed whenever it is called upon

        int x = 5;
        int y = 2;
        
        hello();
        int result = add(x,y);

        System.out.println(result);

        
    }
    static int add(int a, int b)
    {
        return a + b;
    }
    
    static void hello()
    {
        System.out.println("Hello");
    }
}