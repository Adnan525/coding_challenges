package isValidRegex;
import java.util.Scanner;
import java.util.regex.*;

public class IsValidRegex {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String pattern = in.nextLine();
            boolean isValid = true;
            try {
                new String().matches(pattern);
            }
            catch(PatternSyntaxException e) {
                isValid = false;
            }
            String result = (isValid) ? "Valid" :  "Invalid";
            System.out.println(result);
            testCases--;
        }
    }
}
