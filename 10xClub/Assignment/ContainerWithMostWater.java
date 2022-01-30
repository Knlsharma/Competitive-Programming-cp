// https://leetcode.com/problems/container-with-most-water/
// Brute force
// TC : O(N^2)

class ContainerWithMostWater {

    public int maxArea1(int[] ar) {

        int global_max_area = 0;


        for (int i = 0; i < ar.length; i++) {
            int curr_max = 0;

            for (int j = i + 1; j < ar.length; j++) {
                int distance = j - i;
                int min_ht = Math.min(ar[i], ar[j]);
                int area = distance * min_ht;
                curr_max = Math.max(curr_max, area);
            }

            global_max_area = Math.max(curr_max, global_max_area);
        }
        return global_max_area;

    }

// Second Approach : two pointer
// TC : O(N)

    public int maxArea2(int[] ar) {

        int global_max_area = 0;


        int left = 0;
        int right = ar.length - 1;

        while (left < right) {
            global_max_area = Math.max(Math.min(ar[left], ar[right]) * (right - left), global_max_area);

            if (ar[left] <= ar[right]) left++;
            else right--;
        }
        return global_max_area;

    }
}
