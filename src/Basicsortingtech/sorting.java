package Basicsortingtech;

import java.util.Arrays;
import java.util.Scanner;

public class sorting
{

    public static void printarr(int arr[])
    {
        for(int i = 0; i< arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }


    public static void bubble(int arr[])
    {
        for(int turn = 0; turn < arr.length-1; turn++)
        {
            int swap = 0;

            for(int j = 0; j < arr.length - 1 - turn ; j++)
            {
                //swapping
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }

            }
            System.out.println(swap);
            if(swap == 0)
            {
                break;
            }
        }
        printarr(arr);
    }


    public static void selection(int arr[])
    {
        for(int i = 0; i< arr.length-1; i++)
        {
            int minpos = i;
            for(int j = i+1; j<arr.length; j++)
            {
                if(arr[minpos] > arr[j]) {
                    minpos = j;
                }
            }
            //swap
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }


    public static void Insertion(int arr[])
    {
        for(int i = 1; i< arr.length; i++)
        {
            int curr = arr[i];
            int prev = i-1;
            while (prev >= 0 && arr[prev] > curr)
            {
                arr[prev+1] = arr[prev];
                prev--;
            }

            //insertion
            arr[prev+1] = curr;
        }
    }


    public static void Countingsort(int arr[])
    {
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++)
        {
            largest = Math.max(largest,arr[i]);
        }

        int count[] = new int[largest+1];
        for(int i = 0; i< arr.length; i++)
        {
            count[arr[i]]++;
        }

        //sorting
        int j = 0;
        for(int i = 0; i< count.length; i++)
        {
            while(count[i] > 0)
            {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }



    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int arr[] = {1,4,1,3,2,4,3,7};
//        bubble(arr);
//        selection(arr);
//        Insertion(arr);
//        Arrays.sort(arr);
//        Arrays.sort(arr, 0,3);
        Countingsort(arr);
        printarr(arr);
    }
}
