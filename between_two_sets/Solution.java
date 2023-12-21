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
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static boolean first_array(int val, List<Integer> a){
        return a.stream().allMatch(i -> val % i == 0);
    }
    public static boolean second_array(int val, List<Integer> b){
        return b.stream().allMatch(i -> i % val == 0);
    }

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        Integer result = 0;
        if(!a.isEmpty() && !b.isEmpty()){
            Integer max_a = Collections.max(a);
            Integer min_b = Collections.min(b);
            result = (int) IntStream.rangeClosed(max_a, min_b)
                                .mapToObj(i -> {
                                    if(first_array(i, a) && second_array(i, b)){
                                        return i;
                                    }
                                    return null;
                                })
                                .filter(i -> i != null)
                                .count();
        }
        return result;

    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int total = Result.getTotalX(arr, brr);

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}