package isPalindrome;
import java.io.*;
import java.util.*;

public class IsPalindrome {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        //for length = odd we will go up to midlength - 1
        //for length = even will go up to mid length
        boolean result = false;
        int midLength = (A.length() % 2 == 1) ? (A.length()-1)/2 -1 : (A.length()-1)/2;
        for(int i = 0; i<=midLength; i++)
        {
            if(A.charAt(i) != A.charAt(A.length() - 1 - i))
            {
                System.out.println("No");
                result = true;
                break;
            }
        }
        if(!result)
            System.out.println("Yes");

    }
}