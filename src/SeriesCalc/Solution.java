package SeriesCalc;

import java.util.*;
import java.io.*;

class Solution{
    public static void getSequence(List<List<Integer>> arr)
    {
        List<List<Integer>> result = new ArrayList<>(); //keeping it cause why not?


        for(int i = 0; i<= arr.size() -1; i++)
        {
            int a = arr.get(i).get(0);
            int b = arr.get(i).get(1);
            int n = arr.get(i).get(2);
            StringBuilder line = new StringBuilder();

            List<Integer> temp = new ArrayList<>();

            for(int j =0; j<=n - 1; j++)
            {
                int value = a;
                // not very helpful for time complexity, I can just add the previous value to the next one
                //but i've never used a 3 nested loop code, so i will keep it
                for(int k = 0; k<=j; k++)
                {
                    value+=Math.pow(2, k) * b;
                }
                temp.add(value);
                line.append((j==n-1)? value : value+" ");

            }
            result.add(temp);
            System.out.println(line.toString());
        }
    }
    public static void main(String []argh){

        List<List<Integer>> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            list.add(Arrays.asList(new Integer[]{a,b,n}));
        }
        getSequence(list);
        in.close();
    }
}