import java.util.Scanner;
public class Question_no_4__loops {
    public static void main(String[] args) {
        System.out.println("HackerRank loops Question no 4");
        Scanner sc=new Scanner (System.in);



        // Task :
        // Given an integer,n , print its first 10 multiples. Each multiple n*i (where 1<=i<=10 ) should be printed on a new line in the form: N x i = result.
        // Input Format :
        // A single integer,n.

        // input case :
        int n=sc.nextInt();
        for (int i = 1; i <=10; i++) {  // loops
            int sum=i*n;                // making table logic


            //Output Format :
            //Print 10 lines of output; each line i (where 1<=i<=10 ) contains the result of n*i in the form:
            //N x i = result.

            // output :
            System.out.println(n+" x "+i+" = "+sum);    //result





//            Sample Input :
//           2

// //--------------------------

//            Sample Output :
//            2 x 1 = 2
//            2 x 2 = 4
//            2 x 3 = 6
//            2 x 4 = 8
//            2 x 5 = 10
//            2 x 6 = 12
//            2 x 7 = 14
//            2 x 8 = 16
//            2 x 9 = 18
//            2 x 10 = 20



        }
    }
}
