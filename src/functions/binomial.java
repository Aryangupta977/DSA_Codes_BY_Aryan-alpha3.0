package functions;

import java.util.Scanner;

public class binomial {

    public static int factorial(int n)
    {
        int fact = 1 ;
        for(int i =1; i<=n; i++)
        {
            fact = fact * i;
        }


        return fact;

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your n and r");
        int n = sc.nextInt();
        int r = sc.nextInt();
        int ans = factorial(n);
        int ans2 = factorial(r);
        int c = n-r;
        int ans3 = factorial(c);

        System.out.println(ans/(ans2*ans3));
    }
}
