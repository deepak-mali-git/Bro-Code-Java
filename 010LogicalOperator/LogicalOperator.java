public class LogicalOperator {
    public static void main(String[] args) {

        // logical operator = used to connect two or more expressions
        //                      && = (AND) both conditions must be true
        //                      || = (OR)  either condition must be true
        //                       ! = (NOT)  reverse boolean value of a condition


        // &&


        if(true && true)
        {
            System.out.println("true && true");
        }

        if(true && false)
        {
            System.out.println("true && false");
        }

         if(false && true )
        {
            System.out.println("false && true");
        }

         if(false && false )
        {
            System.out.println("false && false");
        }







        // ||

          if(true || true)
        {
            System.out.println("true || true");
        }

        if(true || false)
        {
            System.out.println("true || false");
        }

         if(false || true )
        {
            System.out.println("false || true");
        }

        if(false || false )
        {
            System.out.println("false || false");
        }


        // !

        if(!true)
        {
            System.out.println("!true");
        }

        if(!false)
        {
            System.out.println("!false");
        }

        

          
          
        
    }
}