public class SwitchStatement {
    public static void main(String[] args) {
        
        // switch = statements that allows a variable  to be tested for equality against a list of values

        int num = 2;

        switch(num)
        {
            case 1: System.out.println("The number is 1");
            break;

            case 2: System.out.println("The number is 2");
            break;

            case 3: System.out.println("The number is 3");
            break;

            case 4: System.out.println("The number is 4");
            break;

            case 5: System.out.println("The number is 5");
            break;

            case 6: System.out.println("The number is 6");
            break;

            case 7: System.out.println("The number is 7");
            break;            

            default :
                     System.out.println("The number is grater then 7 ");
            break;  


        }

    }
}