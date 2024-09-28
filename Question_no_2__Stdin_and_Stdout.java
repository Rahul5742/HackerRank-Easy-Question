import java.util.Scanner;
public class Question_no_2__Stdin_and_Stdout {
    public static void main(String[] args) {
        System.out.println(" HackerRank Stdin and Stdout Question no 2 : ");
        Scanner sc = new Scanner(System.in);

        //Input Format :
        //There are three lines of input:
        //case 1 :The first line contains an integer.
        //case 2 :The second line contains a double.
        //case 3 :The third line contains a String.

        int a=sc.nextInt();         // case 1 :input of int.
        double b=sc.nextDouble();   // case 2 :input of double.
        sc.nextLine();              // case 3 :input of String.

        //Output Format
        //There are three lines of output:
        // case 1 :On the first line, print String: followed by the unaltered String read from stdin.
        // case 2 :On the second line, print Double: followed by the unaltered double read from stdin.
        //case 3 :On the third line, print Int: followed by the unaltered integer read from stdin.


        String c=sc.nextLine();               //new Line.
        System.out.println("String: "+c);     //case 1 :output String.
        System.out.println("Double: "+b);     //case 2 :output double.
        System.out.println("Int: " +a);       //case 3 :output int.





        //Sample Input
        //42
        //3.1415
        //Welcome to  Java tutorials!

        //---------------------------------------------


        //Sample Output
        //String: Welcome to  Java tutorials!
        //Double: 3.1415
        //Int: 42

    }
}