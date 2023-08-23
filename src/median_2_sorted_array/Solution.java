package median_2_sorted_array;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        Integer[] arr1 = Arrays.stream(nums1).boxed().toArray( Integer[]::new );
        Integer[] arr2 = IntStream.of(nums2).boxed().toArray( Integer[]::new );
        Object[] merged = Stream.of(arr1, arr2).flatMap(Stream::of).toArray();
        Arrays.sort(merged);
        return (merged.length % 2 == 0) ? //even
        ((Integer)merged[(merged.length-1)/2] + (Integer)merged[(merged.length-1)/2 + 1])/2.0 : 
        (Integer)merged[((merged.length-1)/2)];
    }
}