// https://leetcode.com/problems/plus-one/
// TC  : O(N)

class PlusOne {
    public int[] plusOne(int[] digits) {
        
        int len = digits.length;
        
        for(int i = len - 1 ; i >= 0 ; i--)
        {
            
            if(digits[i] < 9)
            {
                digits[i]++;
                return digits;
            }
            
            digits[i] = 0;
        }
        
        int[] new_num = new int[len + 1];
        new_num[0] = 1;
        return new_num;
    }
}
