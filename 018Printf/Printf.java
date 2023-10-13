public class Printf {
    public static void main(String[] args) {

        // printf() = an optional method to control,format,and display text to the display to the console window

        boolean bl = true;
        char    ch = 'c';
        String  st = "new string";
        int     in = 123;
        double  db = 123.34;

        System.out.printf("%b\n",bl);
        System.out.printf("%c\n",ch);
        System.out.printf("%s\n",st);
        System.out.printf("%d\n",in);
        System.out.printf("%+.1f\n",db);


        System.out.printf("%015f\n",db);

        System.out.printf("Hello %-20s",st);
        
    }
}