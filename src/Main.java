import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {


    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int rightDiag = 0, leftDiag = 0;
        for (int i = 0; i <= arr.size() - 1; i++) {
            rightDiag += arr.get(i).get(i);
            leftDiag += arr.get(i).get(arr.size()-1 - i);
        }
        return Math.abs(rightDiag-leftDiag);
    }

    public static void staircase(int n) {
        // Write your code here
        String result = "";
        for(int i = 1; i<=n; i++)
        {
            int spaceNum = n-i;
            int stairNum = i;
            while(spaceNum>0)
            {
                result+=" ";
                spaceNum--;
            }
            while(stairNum>0)
            {
                result+="#";
                stairNum--;
            }
            result+="\n";
        }
        System.out.println(result);

    }

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        List<Integer> temp = arr;
        Collections.sort(temp);
        long max = 0;
        long min = 0;
        for(int i = 0; i<=temp.size()-1; i++)
        {
            if(i==0)
               min+=temp.get(i);
            else if(i==temp.size()-1)
                max+=temp.get(i);
            else
            {
                min+=temp.get(i);
                max+=temp.get(i);
            }
        }
        System.out.println(min+"  "+max);


    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        if(candles.isEmpty())
            return 0;
        if(candles.size() == 1)
            return 1;
        List<Integer> temp = candles;
        Collections.sort(temp);
        return Collections.frequency(temp, temp.get(temp.size()-1));
    }

    public static void main(String[] args)
    {
//        List<List<Integer>> arr = new ArrayList<>();
//        arr.add(Arrays.asList(new Integer[] {11,2,4}));
//        arr.add(Arrays.asList(new Integer[] {4,5,6}));
//        arr.add(Arrays.asList(new Integer[] {10,8,-12}));
//        System.out.println(diagonalDifference(arr));

//        staircase(6);

        List<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(2);
        arr.add(1);
        arr.add(3);
        System.out.println(birthdayCakeCandles(arr));
    }
}
