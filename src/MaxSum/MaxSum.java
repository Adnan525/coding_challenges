package MaxSum;

//assume all positive

public class MaxSum {
    public static Integer getMaxSum(int[] arr)
    {
        int max =Integer.MIN_VALUE;
        int smaller = Integer.MIN_VALUE;
        for(int i=0; i<=arr.length -1; i++)
        {
            if(arr[i]>smaller)
            {
                if(arr[i]>max)
                {
                    smaller = max;
                    max = arr[i];
                }
                else
                    smaller = arr[i];
            }
        }
        return max+smaller;

    }
    public static void main(String[] args)
    {
        int[] arr = {6,3,7,5,2}; //13
        int[] arr1 = {5,6,3,2,3,6,9}; //15
        int[] arr2 = {-10, -1, 0, -110, -9}; //-1
        int[] arr3 = {0, -2, -2, -4, 0}; //0

        System.out.println(getMaxSum(arr));
        System.out.println(getMaxSum(arr1));
        System.out.println(getMaxSum(arr2));
        System.out.println(getMaxSum(arr3));
    }
}
