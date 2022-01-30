// https://leetcode.com/problems/product-of-array-except-self/
// TC  : O(N^2)


class ProductArrayExceptSelf {
    public int[] productExceptSelf1(int[] nums) {

        if (nums.length == 1 || nums.length == 0) {
            return nums;
        }

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int product = 1;

            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    product = product * nums[j];
                    result[i] = product;
                }
            }
        }
        return result;

    }

// Second Approach
// TC  : O(N^2)

    public int[] productExceptSelf2(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            int j = i - 1;

            while (j >= 0)    // left product
            {
                product *= nums[j];
                j--;
            }

            j = i + 1;
            while (j <= nums.length - 1)   // right product
            {
                product *= nums[j];
                j++;
            }

            result[i] = product;

        }
        return result;
    }

// Third Apporach
// TC : O(N)
// SC : O(N)

    public int[] trap(int[] nums) {
        if (nums.length == 1 || nums.length == 0) {
            return nums;
        }
        int len = nums.length;

        int[] result = new int[len];


        int[] leftProduct = new int[len];

        int[] rightProduct = new int[len];

        int Lproduct = 1;

        int j = len - 1;

        while (j >= 0)    // left product
        {
            Lproduct *= nums[j];
            leftProduct[j] = Lproduct;
            result[j] *= Lproduct;
            j--;
        }

//        System.out.println(Arrays.toString(leftProduct));

        int Rproduct = 1;
        int i = 0;
        while (i < len)    // right product
        {
            Rproduct *= nums[i];
            rightProduct[i] = Rproduct;
            result[i] *= Rproduct;
            i++;
        }

//        System.out.println(Arrays.toString(rightProduct));


//       for(int k = 0 ; k < len ; k++)
//         {

//            result[k] = leftProduct[k-1] * rightProduct[k+1];   
//          }


        return result;
    }


// Fourth Approach 
// TC : O(N)

    public int[] productExceptSelf3(int[] nums) {

        if (nums.length == 1 || nums.length == 0) {
            return nums;
        }

        int[] result = new int[nums.length];
        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            product = product * nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                result[i] = product / 1;
            } else {
                result[i] = product / nums[i];
            }
        }


        return result;

    }

// Fifth Approach : In this no need to calculate right product seperately we
// will calculate it on the fly then store in result array


// TC : O(N)
// SC : O(N) for left product array only

    public int[] productExceptSelf(int[] nums) {

        if (nums.length == 1 || nums.length == 0) {
            return nums;
        }
        int len = nums.length;

        int[] result = new int[len];
        int[] leftProd = new int[len];
        // nums = [1,2,3,4]

        for (int i = 0; i < len; i++) {
            if (i == 0) {
                leftProd[i] = 1;  // left Product calculated
                continue;
            }
            leftProd[i] = leftProd[i - 1] * nums[i - 1];
        }
        // Left product = [ 1, 1 ,2 ,6]

        // System.out.println(Arrays.toString(leftProd));

        int rightTemp = 1;
        for (int i = len - 1; i >= 0; i--) {
            if (i == len - 1) {
                rightTemp = 1;
            } else {
                rightTemp *= nums[i + 1];
            }

            result[i] = leftProd[i] * rightTemp;
        }

        // Right product = [24, 12, 8, 6]

        // System.out.println(Arrays.toString(result));


        return result;
    }

}
