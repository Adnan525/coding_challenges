package GridTraveler;

//grid can be travelled by going right and down only
//how many ways we can travel the grid

//don't worry about the position of the cell
//just focus on the decreasing size of the grid

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GridTraveler
{
    static Map<List<Integer>, Long> memo= new HashMap<>();
    public static long getWays(int i, int j)
    {
        if(i == 1 && j == 1)
            return 1;
        if(i == 0 || j == 0)
            return 0;
        //making the grid smaller every time
        //2^n again
        //return getWays(i-1, j) + getWays(i, j-1);

        if(!memo.containsKey(Arrays.asList(i-1, j)))
        {
            memo.put(Arrays.asList(i-1, j), getWays(i-1, j));
        }
        if(!memo.containsKey(Arrays.asList(i, j-1)))
        {
            memo.put(Arrays.asList(i, j-1), getWays(i, j-1));
        }
        return memo.get(Arrays.asList(i-1,j))+memo.get(Arrays.asList(i, j-1));
    }
    public static void main(String[] args)
    {
        System.out.println(getWays(18,18));
    }
}
