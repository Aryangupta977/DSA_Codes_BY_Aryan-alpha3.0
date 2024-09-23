package arrays_part2;

public class trappedrainwaterques
{

    public static int trappedrainwater(int height[])
    {
        int trappedwater = 0;
        int n = height.length;

        //Left max boundary
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for(int i = 1;i<n; i++)
        {
            leftmax[i] = Math.max(leftmax[i-1] , height[i]);
        }

        //Right max boundary
        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];
        for(int i = n-2; i>=0; i--)
        {
            rightmax[i] = Math.max(rightmax[i+1], height[i]);
        }

        // waterlevel calculation and trapped rain water
        int width = 1;
        for(int i = 0; i<n ;  i++)
        {
            int waterlevel = Math.min(leftmax[i], rightmax[i]);

            trappedwater += (waterlevel - height[i]) * width;
        }
        return trappedwater;
    }

    public static void main(String[] args)
    {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappedrainwater(height));
    }
}
