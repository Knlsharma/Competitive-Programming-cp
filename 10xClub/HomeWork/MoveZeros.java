// https://leetcode.com/problems/move-zeroes
// TC : O(N)
// SC : O(1)


class MoveZero {
    public void moveZeroes(int[] nums) {
     if(nums.length == 1) return;
        
        int i = 0;
        int j = 0;
        
        int len  = nums.length -1;
        while (j <= len)
        {
            if(nums[j] == 0)
            {
                j++;
            }
            else
            {
                swap(nums,i,j);
                i++;
                j++;
            }
        }
    }
    
    public static void swap(int[] nums , int i_index , int j_index)
    {
        int temp = nums[i_index];
        nums[i_index] = nums[j_index];
        nums[j_index] = temp; 
        
    }
}
