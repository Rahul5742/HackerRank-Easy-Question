import java.util.Scanner;
public class Question_no_4__loops_2 {
    public static void main(String[] args) {
        System.out.println("HackerRank loops (2) Question no 5 :");
        Scanner in = new Scanner(System.in);

        //input :
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();



            //logic :
            for (int j = 1; j <= n; j++) {
                a = a + b;
                b = b * 2;

            }
            System.out.println();  //new line :


            //Sample of Input :
            //2
            //0 2 10
            //5 3 5

            //Sample of Output :
            
            //2 6 14 30 62 126 254 510 1022 2046
            //8 14 26 50 98

        }
    }
}