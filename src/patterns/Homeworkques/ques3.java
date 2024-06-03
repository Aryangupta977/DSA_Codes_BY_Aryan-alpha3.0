package patterns.Homeworkques;

import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your rows");
        int n = sc.nextInt();

        /*
               *
             * *
           * * *
         */

        int j ;
        for(int i = 1; i<=n; i++)
        {
             for(j = 1; j<=i; j++)
             {
                 System.out.print(" ");
             }
             if (j == i)
             {
                 System.out.println("*");
             }
        }
    }
}
