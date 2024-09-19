package arrays_part2;

import java.util.Scanner;

public class prefixarray
{

    public static void prefixsum(int numbers[])
    {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
        //calculate prefix array
        prefix[0] = numbers[0];

        for(int i = 1; i< prefix.length; i++)
        {
            prefix[i] = prefix[i-1] + numbers[i];
        }
        for(int i = 0 ; i< numbers.length; i++)
        {
            for(int j = i; j< numbers.length; j++)
            {
                currsum = i == 0? prefix[j] : prefix[j] - prefix[i-1];

            }
            if(maxsum < currsum)
            {
                maxsum = currsum;
            }

        }
        System.out.println(maxsum);
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int numbers[] = {1,-2,6,-1,3};
        prefixsum(numbers);
    }


}
