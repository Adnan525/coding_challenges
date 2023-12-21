package ReverseString;

public class ReverseString {
    public static  String reverseWithFor(String str)
    {
        String result = ""; //should use string builder here
        for(int i = str.length()-1; i>=0; i--)
           result+=str.charAt(i);
        return result;
    }
    public static String reverseRecursion(String str)
    {
        if(str.equals(""))
            return "";
        else
            return str.charAt(str.length()-1) + reverseRecursion(str.substring(0, str.length()-1));
    }
    public static String reverseAPI(String str)
    {
        return new StringBuilder(str)
                .reverse()
                .toString();
    }
    public static void main(String[] args) {
        String name = "Muntasir Adnan";
        System.out.println("Using for loop: ");
        System.out.println(reverseWithFor(name));
        System.out.println("Using recursion: ");
        System.out.println(reverseRecursion(name));
        System.out.println("Using reverseAPI: ");
        System.out.println(reverseAPI(name));
    }
}
