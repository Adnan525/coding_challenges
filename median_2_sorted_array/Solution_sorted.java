package median_2_sorted_array;
class Solution_sorted {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // works only if the resulting array is sorted
        int target = nums1.length + nums2.length;
        int median = target/2;
        if(target % 2 == 0) //even
        {
            if(median <= nums1.length -1)
            {
                return (median + 1 <= nums1.length -1) ? (nums1[median] + nums1[median + 1])/2 : (nums1[median] + nums2[median + 1 - nums2.length])/2;
            }
            else
            {
                return nums2[median] + nums2[median + 1]/2;
            }
        }
        else
        {
            return (median <= nums1.length -1) ? nums1[median] : nums2[median];
        }
    
    }
}