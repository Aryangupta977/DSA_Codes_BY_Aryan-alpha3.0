package arrays;
import  java.util.*;
public class subarray {

    public static void printsubarray(int numbers[])
    {
        int ts = 0 , sum = 0, max = Integer.MIN_VALUE , min = Integer.MAX_VALUE;
        for(int i = 0; i< numbers.length; i++)
        {
            int start = i;
            for (int j = i; j < numbers.length;j++)
            {
                int end = j;
                for(int k = start; k<=end; k++)
                {

                    sum = sum + numbers[k];
                    System.out.print(numbers[k] + " ");
                }
                System.out.println(" --> "+"Sum of sub-array is : " + sum);
                ts++;
                if(max < sum)
                {
                    max = sum;
                }
                if(min > sum)
                {
                    min = sum;
                }
                sum = 0;

            }
            System.out.println();
        }
        System.out.println("Total subarray : " + ts);
        System.out.println("Max of Sub-array : " + max);
        System.out.println("Min of Sun-rray : " + min);
    }
    public static void main(String[] args) {

        int number[] = {2,4,6,8,10};

        printsubarray(number);
    }
}
