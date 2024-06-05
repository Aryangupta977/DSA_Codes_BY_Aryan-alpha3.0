package arrays;

import java.util.Scanner;

public class binary_search {

    public static int binarysearch(int numbers[] , int key)
    {

        int start = 0 , end = numbers.length - 1;

        while(start <= end)
        {
            int mid = (start+end)/2;

            //comparisions
            if(numbers[mid] == key)
            {
                return mid;
            }
            if(numbers[mid] < key)
            {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int numbers[] = {2 , 4  , 6 , 8 , 10 , 12 , 14 , 18};
        System.out.println("Enter your key");
        int key = sc.nextInt();

        System.out.println("Index of key : " + binarysearch(numbers , key));
    }
}
