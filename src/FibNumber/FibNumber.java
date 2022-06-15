package FibNumber;

import java.util.HashMap;
import java.util.Map;

public class FibNumber {
    static Map<Integer, Long> memo = new HashMap<>();
    public static long getFib(int n)
    {
        if(n == 1 || n ==2)
            return 1;
        else
            //time complexity 2^n
            //return getFib(n-1) + getFib(n-2);
        {
            if(!memo.containsKey(n-1))
                memo.put(n-1, getFib(n-1));
            if(!memo.containsKey(n-2))
                memo.put(n-2, getFib(n-2));
            return memo.get(n-1)+memo.get(n-2);
        }
    }
    public static void main(String[] args)
    {
        System.out.println(getFib(60));
    }
}
