package stringToken;
import java.io.*;
import java.util.*;


public class Token {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String s = scan.nextLine();
        // Write your code here.
        //test
        String s = "           YES      leading spaces        are valid,    problemsetters are         evillllll";
        s = s.trim();
        if(s.isEmpty())
            System.out.println(0);
        else
        {
            String[] res = s.split("[!,?._'@\\s]+");
            System.out.println(res.length);
            Arrays.stream(res).forEach(t -> System.out.println(t));
        }
//        scan.close();
    }
}
