package UseCapital;

import java.util.regex.Pattern;

public class UseCapital {
    public static boolean checkIfValidCapital(String str)
    {
        Pattern allCap = Pattern.compile("[A-Z]*");
        Pattern allSmall = Pattern.compile("[a-z]*");
        Pattern firstCap = Pattern.compile("[A-Z]{1}[a-z]+");
        if(allCap.matcher(str).matches() ||
            allSmall.matcher(str).matches() ||
            firstCap.matcher(str).matches())
        {
            return  true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        System.out.println(checkIfValidCapital("")); //true
        System.out.println(checkIfValidCapital("AAAA")); //true
        System.out.println(checkIfValidCapital("Aaaa")); //true
        System.out.println(checkIfValidCapital("aaaa")); //true
        System.out.println(checkIfValidCapital("aaAa")); //false
        System.out.println(checkIfValidCapital("aAAA")); //false
        System.out.println(checkIfValidCapital("AaAA")); //false
    }
}
