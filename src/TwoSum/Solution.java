//for leet code, the other TwoSum is not working

package TwoSum;

public class Solution{
    public static int[] twoSum(int[] arr, int target)
    {
        for(int i = 0; i<arr.length; i++)
        {
            for(int j = 0; j<arr.length; j++)
            {
                if(arr[i] + arr[j] == target){
                    if(i != j)
                        return new int[] {i, j};
                }
            }
        }
        return new int[] {-1, -1};
    }
}