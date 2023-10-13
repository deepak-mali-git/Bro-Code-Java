public class Var {
    

    public static void main(String[] args) {

        // local = declared inside a method visible only to the method

        // global = declared outside of a method, but within a class  visible to all parts of a class
    
        call c = new call();
        
      

        System.out.println(c.num);
    }

    static class call
    {
        int num = 10;
        call()
        {   int num = 4;
            System.out.println(num);
            call2();
        }

        void call2(){
            System.out.println(num);
        }


    }

      
}