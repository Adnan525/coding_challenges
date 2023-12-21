package most_water_container;
class Solution {

    // the idea is we start with highest length so either side of the array
    // move inwards
    //but move inwards only for the less height
    //so basically, the highest value of the array will definitely be one of the 2 sides
    public int maxArea(int[] height) {
        int start = 0;
        int highestLength = height.length-1;
        int maxArea = 0;
        while(start != highestLength)
        {
            int tempArea = (height[start] < height[highestLength]) ? height[start] * (highestLength - start) : height[highestLength] * (highestLength - start);
            if(tempArea>maxArea)
                maxArea = tempArea;
            if(height[start] < height[highestLength])
                start++;
            else
                highestLength--;
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