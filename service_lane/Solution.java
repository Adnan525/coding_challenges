package service_lane;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public static List<Integer> serviceLane(int n, List<List<Integer>> cases, List<Integer> width) {
        return cases.stream()
            .map(val -> get_min_width(val, width))
            .collect(Collectors.toList());
    }
    public static Integer get_min_width(List<Integer> range, List<Integer> width){
        return IntStream.rangeClosed(range.get(0), range.get(range.size()-1))
            .map(index -> width.get(index))
            .min()
            .orElse(0);
    }
    
}
