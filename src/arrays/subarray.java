package arrays;

public class subarray {

    public static void printsubarray(int numbers[])
    {
        int ts = 0 , sum = 0, max , min;
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

            }
            System.out.println();
        }
        System.out.println("Total subarray : " + ts);
    }
    public static void main(String[] args) {

        int number[] = {2,4,6,8,10};

        printsubarray(number);
    }
}
