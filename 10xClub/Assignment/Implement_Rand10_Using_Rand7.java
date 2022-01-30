//// https://leetcode.com/problems/implement-rand10-using-rand7/
//
///**
// * The rand7() API is already defined in the parent class SolBase.
// * public int rand7();
// * @return a random integer in the range 1 to 7
// */
//
//class Rand10UsingRand7 {
//    public int rand10() {
//
//        int row = rand7();  // give number from 1 to 7
//
//        int col = rand7();  // give number from 1 to 7
//
//        int result = 7 * (row - 1) + col;  // give how
//
//        if(result > 40)
//        {
//            return rand10();  // for unbiasing we need to call again
//        }
//
//        return result % 10 + 1;   // will give from 1 to 10 not from 0 to 9
//
//
//        /*
//
//        To make any randY using randX num
//
//        ( X * (row - 1) + col ) % Y
//
//        */
//
//
//    }
//}
