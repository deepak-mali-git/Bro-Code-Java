public class Wrapper {
    public static void main(String[] args) {

        // Wrapper class = provides a way to use primitive data types ar reference data types
        //                 reference data types contain useful methods
        //                 can be used with collections (ex.ArrayList)


        //Primitive     Wrapper
        //boolean       Boolean
        //char          Character
        //int           Integer
        //double        Double
        //String        String


        // autoboxing = the automatic conversion that java compiler makes between the primitive data and there corresponding object wrapper classes

        // unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive

        Boolean b = true;
        Character c = '@';
        Integer  i = 123;
        Double d = 3.14;
        String s = "wrapper class";

        if(b == true)
        System.out.println("This is true");


        System.out.println(b  + " " + c  + " " + i  + " " + d  + " " + s);

    }
}