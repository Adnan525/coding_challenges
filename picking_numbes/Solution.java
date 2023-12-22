package picking_numbes;

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
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */
    public static Map<Integer, Integer> countIntegerOccurrences(List<Integer> a) {
        Map<Integer, Integer> occurrenceMap = new HashMap<>();

        for (int num : a) {
            occurrenceMap.put(num, occurrenceMap.getOrDefault(num, 0) + 1);
        }

        return occurrenceMap;
    }
    public static int pickingNumbers(List<Integer> a) {
        Map<Integer, Integer> occurrence = countIntegerOccurrences(a);
        List<Integer> result = a.stream()
                                .map(num -> occurrence.getOrDefault(num, 0) + occurrence.getOrDefault(num + 1, 0))
                                .sorted(java.util.Collections.reverseOrder())
                                .collect(Collectors.toList());

        return result.get(0);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.pickingNumbers(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
