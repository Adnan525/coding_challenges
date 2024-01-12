package append_delete;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'appendAndDelete' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. STRING t
     *  3. INTEGER k
     */

     // does not pass y, yu, 2
    // public static String appendAndDelete(String s, String t, int k) {
    //     // best case
    //     if(s.equals(t)) 
    //         return "Yes";
    //     int same_index = 0;
    //     int limit = s.length() < t.length() ? s.length() : t.length();
    //     for(int i = 0; i <= limit - 1; i++){
    //         if(s.charAt(i) == t.charAt(i))
    //             same_index += 1;
    //         else
    //             break;
    //     }
    //     if(t.length() - same_index == 0){
    //         return s.length() - same_index <= k ? "Yes" : "No";
    //     }
    //     else if(s.length() == same_index)
    //         return (t.length() - same_index == k || k % (t.length() - same_index) * 3 == 0 ) ? "Yes" : "No";
    //     else{
    //             if((t.length() - same_index) * 2 <= k)
    //                 return "Yes";
    //             else
    //                 return "No";
    //     }

    // }
    public static String appendAndDelete(String s, String t, int k) {
    // Best case
    if (s.equals(t))
        return "Yes";

    int sameIndex = 0;
    int limit = Math.min(s.length(), t.length());

    // Find the common prefix
    for (int i = 0; i < limit; i++) {
        if (s.charAt(i) == t.charAt(i))
            sameIndex++;
        else
            break;
    }

    // Calculate the operations required
    int totalOperations = (s.length() - sameIndex) + (t.length() - sameIndex);

    // Check if it's possible to perform the operations within the given limit
    if (totalOperations <= k && (k - totalOperations) % 2 == 0 || k >= s.length() + t.length())
        return "Yes";
    else
        return "No";
}


}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String t = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.appendAndDelete(s, t, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
