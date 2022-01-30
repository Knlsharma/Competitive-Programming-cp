//// https://leetcode.com/problems/set-matrix-zeroes/
//// TC : O(N * M)
//// SC : O(M + N)
//// BRUTE FORCE
//
//class Solution {
//    public void setZeroes(int[][] matrix) {
//
//        Set<Integer> rowSet = new HashSet<>();
//        Set<Integer> colSet = new HashSet<>();
//
//        for(int i = 0 ; i < matrix.length ; i++)
//        {
//            for(int j = 0 ; j < matrix[0].length; j++)
//            {
//                if(matrix[i][j] == 0)
//                {
//                    rowSet.add(i);
//                    colSet.add(j);
//                }
//            }
//        }
//
//        // System.out.println(rowSet);
//        // System.out.println(colSet);
//
//        for(int row : rowSet)
//        {
//            for(int j = 0 ; j < matrix[row].length; j++)
//            {
//                matrix[row][j] = 0;
//            }
//        }
//
//        for(int i = 0 ; i < matrix.length ; i++)
//        {
//            for(int col : colSet)
//            {
//                matrix[i][col] = 0;
//            }
//        }
//
//        colSet.clear();
//        rowSet.clear();
//
//    }
//}
//
//// Optimized way
//// TC : O(N * M)
//// SC : O(1)
//
//   boolean isZeroCol = false;
//        boolean isZeroRow = false;
//        for (int i = 0; i < matrix.length; i++) { //check the first column
//            if (matrix[i][0] == 0) {
//                isZeroCol = true;
//                break;
//            }
//        }
//        for (int i = 0; i < matrix[0].length; i++) { //check the first row
//            if (matrix[0][i] == 0) {
//                isZeroRow = true;
//                break;
//            }
//        }
//        for (int i = 1; i < matrix.length; i++) { //check except the first row and column
//            for (int j = 1; j < matrix[0].length; j++)
//                if (matrix[i][j] == 0) {
//                    matrix[i][0] = 0;
//                    matrix[0][j] = 0;
//                }
//        }
//        for (int i = 1; i < matrix.length; i++) { //process except the first row and column
//           for (int j = 1; j < matrix[0].length; j++)
//               if (matrix[i][0] == 0 || matrix[0][j] == 0)
//                   matrix[i][j] = 0;
//        }
//        if (isZeroCol) { //handle the first column
//            for (int i = 0; i < matrix.length; i++)
//                matrix[i][0] = 0;
//        }
//        if (isZeroRow) { //handle the first row
//            for (int i = 0; i < matrix[0].length; i++)
//                matrix[0][i] = 0;
//        }
//
//
