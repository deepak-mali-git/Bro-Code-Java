public class Array {
    public static void main(String[] args) {

        // array = used to store multiple value in a single variable 

        int[] num = {1,2,3,4};
        //int[] num2 = new int[3];

        num[0] = 1;
        num[1] = 11;
        num[2] = 111;



        // 2D Array = an array of array

        int[][] array = new int[3][3];

        array[0][0] = 10;
        array[0][1] = 20;
        array[0][2] = 30;
        array[1][0] = 40;
        array[1][1] = 50;
        array[1][2] = 60;
        array[2][0] = 70;
        array[2][1] = 80;
        array[2][2] = 90;

        for(int i = 0 ; i < 3; i++)
        {
            for(int j = 0; j<3; j++)
            {
                System.out.print(array[i][j] + "  ");
            }

            System.out.println();
        }



        
    }
}