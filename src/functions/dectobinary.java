package functions;

import java.util.Scanner;

public class dectobinary {

    public static int dectobinary(int num)
    {
        int bin = 0 , pow = 0 , rem;
        while(num>0)
        {
            rem = num % 2;
            bin = bin + (rem * (int)Math.pow(10, pow));
            pow++;
            num /= 2;
        }
        return bin;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your decimal num");
        int n = sc.nextInt();
        System.out.println(dectobinary(n));
    }
}
