package patterns;

import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in);
        System.out.println("Enter your rows");
        int n = scc.nextInt();

        /*
        1
        12
        123
        1234
        12345
         */


        for(int i = 0; i<n; i++)
        {
            for(int j = 1; j<=i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
