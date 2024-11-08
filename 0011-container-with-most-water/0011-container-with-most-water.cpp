class Solution {
public:
    int maxArea(vector<int>& height) {
    int water = 0; int i =0 ; int j = height.size()-1;

    while( j > i )
    {
                 int area = min(height[i], height[j]) * (j - i);
            // Update the maximum area
            water = max(water, area);

        if (height[i] < height[j])
        {
            i++;
        }
        else
        {
              j--;
        }
          
    }
    return water;
         }
};