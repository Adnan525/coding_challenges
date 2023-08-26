package most_water_container;
class Solution {

    public int maxArea(int[] height) {
        int maxArea = 0;
        for(int i = 0; i<height.length; i++)
        {
            int tempX = height[i];
            for(int j = height.length -1; j>i; j--)
            {
                int area = (tempX < height[j]) ? (j-i) * tempX : (j-i) * height[j];
                if (area > maxArea)
                    maxArea = area;
            }
        }
        return maxArea;
        
    }

    public int test(int[] height) {
        int maxArea = 0;
        for(int i = 0; i<height.length; i++)
        {
            int tempX = height[i];
            for(int j = i + 1; j<height.length; j++)
            {
                int area = (tempX < height[j]) ? (j-i) * tempX : (j-i) * height[j];
                if (area > maxArea)
                    maxArea = area;
            }
        }
        return maxArea;
    }
}