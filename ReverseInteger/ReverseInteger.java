package ReverseInteger;

import java.util.ArrayList;
import java.util.List;

public class ReverseInteger {
    public static int getReverse(int num)
    {
        Integer temp = num;
        double result = 0;
        boolean isLastDigit = true;
        List<Integer> reverseNumber = new ArrayList<>();
        while(true)
        {
            if(temp == 0)
            {
                break;
            }
            else
            {
                reverseNumber.add(temp%10);
                temp = temp/10;
            }
        }
//        for(Integer i : reverseNumber)
//        {
//            System.out.println(i);
//        }
        for(int i = 0; i<=reverseNumber.size()-1; i++)
        {
            result += reverseNumber.get(i)*Math.pow(10, reverseNumber.size()-(1+i));
        }
        return (int)result;
    }
    public static void main(String[] args)
    {
        System.out.println(getReverse(654321));
    }
}
