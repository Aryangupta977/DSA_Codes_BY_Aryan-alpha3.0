package arrays;

public class pairsinarray {

    public static void pairarr(int numbers[])
    {
        int totalpairs = 0;
        for(int i = 0; i< numbers.length; i++)
        {
            int curr = numbers[i];
            for(int j = i+1; j< numbers.length; j++)
            {
                System.out.print("( " + curr + ", " + numbers[j] + ") ");
                totalpairs++;
            }
            System.out.println();
        }
        System.out.println("Total pairs : " + totalpairs);
    }
    public static void main(String[] args) {
        int number[] = {2,3,4,5,6,7,8};
        pairarr(number);

    }
}
