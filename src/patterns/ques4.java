package patterns;

import java.util.Scanner;

public class ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your rows");
        int n = sc.nextInt();

        //Character Pattern
        /*
        A
        BC
        DEF
        GHIJ
         */

        char ch = 'A';
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<=i; j++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
