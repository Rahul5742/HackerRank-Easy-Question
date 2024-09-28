import java.util.Scanner;

public class Question_no_1__if_else {


    public static void main(String[] args) {
        System.out.println("HackerRank if_else Question :");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number :");
        int n=sc.nextInt();
        //case :
        //Given an integer,n , perform the following conditional actions:
        // case 1 :If  is odd, print Weird
        // case 2 :If  is even and in the inclusive range of 2 to 5, print Not Weird
        // case 3 :If  is even and in the inclusive range of 6 to 20 , print Weird
        //case 4 :If  is even and greater than 20, print Not Weird
        //Complete the stub code provided in your editor to print whether or not n is weird.


        //cass 1 solution :even
        if(n%2!=0) {
            System.out.println("Weird");
            //case 2 solution :range of 2 to 5, print Not Weird
        }else{
            if(n >= 2 && n <= 5){
                System.out.println("Not Weird");

                //case 3 solution :range of 6 to 20 , print Weird
            } else if(n >= 6 && n <= 20){
                System.out.println("Weird");
                //case 4 solution :greater than 20, print Not Weird
            } else if(n > 20){
                System.out.println("Not Weird");




            }

        }
    }
}


