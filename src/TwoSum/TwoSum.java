package TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] checkTwoSum(int[] arr, int target)
    {
        Map<Integer, Integer> temp = new HashMap<>();
        for(int i = 0; i<arr.length; i++)
        {
            //check if arr value is less negative, then add to target and multiply by -1
            Integer checkDiff = arr[i]>=0 ? target - arr[i] : (target + arr[i])*-1;
            if(temp.containsKey(checkDiff))
                return new int[] {i, temp.get(checkDiff).intValue()};
            else
                temp.put(arr[i], i);
        }
        return new int[] {-1, -1};
    }
    public static void main(String[] args)
    {
        int[] arr = {3, 2, 1, 8};
        System.out.println((Arrays.toString(checkTwoSum(arr, 10))));
    }
}
