public class OverloadedMethod {
    public static void main(String[] args) {

        // overloaded method = methods that share the same name but have different parameters
        //                     method name + method parameters = method signature

        int result = add(1,2,3,4);

        System.out.println(result);
        
    }

    static int add(int a, int b)
    {
        return a + b;
    }
    static int add(int a, int b, int c)
    {
        return a + b + c;
    }
    static int add(int a, int b, int c , int d)
    {
        return a + b + c + d;
    }
}