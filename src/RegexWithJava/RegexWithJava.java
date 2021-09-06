/*check in a given string if any present alphabet both capital and small has a "+" sign on either side
==>return true if the condition is met
==>e.g. +a++++h+<./''123+m+// will return true
==> --==++/+q+m+>>>\\--+k+// will return true
==> --==++/+q+m+>>>\\---k+// will return false
==> +a/+++h+<./''123+m+// will return false
==> RETURN TRUE IF EMPTY
*/


package RegexWithJava;

import java.util.regex.*;

public class RegexWithJava {

    public static boolean checkCondition(String str)
    {
        Pattern regex = Pattern.compile("[a-zA-Z]");
        if (str == "")
            return true;
        for(int i=0; i<str.length(); i++)
        {
            String temp = String.valueOf(str.charAt(i));
            if(regex.matcher(temp).matches())
            {
                if(i == 0 || i == str.length()-1 ||
                        !String.valueOf(str.charAt(i-1)).equals("+") ||
                                !String.valueOf(str.charAt(i+1)).equals("+"))
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        System.out.println(checkCondition("")); //true
        System.out.println(checkCondition("+a+")); //true
        System.out.println(checkCondition("+a++++h+<./''123+m+//")); //true
        System.out.println(checkCondition("--==++/+q+m+>>>--+k+//")); //true
        System.out.println(checkCondition("--==++/+q+m+>>>---k+//")); //false
        System.out.println(checkCondition("+a/+++h+<./''123+m+//"));//false
        System.out.println(checkCondition("a++++h+<./''123+m+//")); //false
        System.out.println(checkCondition("+q+m+a+b>>>?/--+k")); //false
    }

}
