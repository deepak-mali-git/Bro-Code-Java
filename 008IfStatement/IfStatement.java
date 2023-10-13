public class IfStatement {
    public static void main(String[] args) {

        // if statement = performs a block of code if it's condition evaluates to be true

        int num = 8;

        if(num > 100)
        {
            System.out.println("Number is greater then 100");
        }
        else if(num > 50)
        {
            System.out.println("Number is greater then 50");
        }

        else
        {
            System.out.println("Number is less then 50");
        }
        
    }
}