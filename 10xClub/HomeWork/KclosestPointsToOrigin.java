// https://leetcode.com/problems/k-closest-points-to-origin/
//

import java.util.Arrays;
import java.util.Comparator;

class KClosestPointsToOrigin {
  public int[][] kClosest(int[][] points, int k) {
         Arrays.sort(points, new Comparator<int[]>() {
             @Override
             public int compare(int[] a, int[] b) {
                 double pointAdistanceToOrigin = Math.sqrt((a[0] * a[0]) + a[1] * a[1]);
                 double pointBdistanceToOrigin = Math.sqrt((b[0] * b[0]) + b[1] * b[1]);
                 if (pointAdistanceToOrigin >= pointBdistanceToOrigin) return 1;
                 else return -1;
             }
         });

         return Arrays.copyOf(points,k);

     }
}
