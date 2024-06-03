package functions;

import java.util.Scanner;

public class binarytoDecimal {


    public static int bitodec(int num)
    {
        int pow = 0 , dec = 0 , ld;
        while(num > 0)
        {
            ld = num % 10;
            dec = dec + (ld * (int)Math.pow(2 , pow));
            pow++;
            num /= 10;
        }
        return dec;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your binary number");
        int n = sc.nextInt();
        System.out.println(bitodec(n));
    }
}
