package cut_the_sticks;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static List<Integer> cutTheSticks(List<Integer> arr) {
        List<Integer> result = new ArrayList<>();
        result.add(arr.size());

        while (!isComplete(arr)) {
            // In Java, lambda expressions can only access effectively final variables or final variables
            final List<Integer> target = arr.stream()
                    .sorted()
                    .collect(Collectors.toList());

            arr.clear();  // Clear the original list before adding elements
            arr.addAll(target);

            List<Integer> modifiedArr = arr.stream()
                    .map(val -> val - target.get(0))
                    .filter(val -> val != 0)
                    .collect(Collectors.toList());

            arr.clear();  // Clear the original list before adding elements
            arr.addAll(modifiedArr);

            result.add(modifiedArr.size());
        }

        return result;
    }

    public static boolean isComplete(List<Integer> list) {
        int firstElement = list.get(0);
        return list.stream().allMatch(val -> val.equals(firstElement)) || list.stream().filter(val -> val != 0).count() == 1;
    }
    
}
