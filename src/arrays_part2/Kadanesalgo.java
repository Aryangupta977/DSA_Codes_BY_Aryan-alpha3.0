package arrays_part2;

import java.util.Scanner;

public class Kadanesalgo
{

    public static void kadanes(int numbers[])
    {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i = 0; i< numbers.length; i++)
        {
            cs = cs + numbers[i];
            if (cs < 0)
            {
                cs = 0;
            }

            ms = Math.max(cs , ms);
        }

        // This condition is for edge case if all no. in array is negative .
        if(ms == 0)
        {
            ms = Integer.MIN_VALUE;
            for(int i = 0; i< numbers.length; i++)
            {
                if(ms < numbers[i])
                {
                    ms = numbers[i];
                }
            }
        }

        System.out.println("The max sum is : " + ms);
    }


    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadanes(numbers);
    }
}
