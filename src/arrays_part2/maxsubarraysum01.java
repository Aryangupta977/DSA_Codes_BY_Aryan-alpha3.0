package arrays_part2;

import java.util.Scanner;

public class maxsubarraysum01
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int maxsum = Integer.MIN_VALUE;
        int sum = 0;
        int arr[] = {1,6,-2,4,-1};
        for(int i = 0; i< arr.length; i++)
        {
            for(int j = i; j < arr.length; j++)
            {
                for(int k = i; k<j; k++)
                {
                    sum = sum + arr[k];
                }
                System.out.println(sum);
                if(sum > maxsum)
                {
                    maxsum = sum ;
                }
                sum = 0;
            }
        }
        System.out.println(maxsum);
    }
}
