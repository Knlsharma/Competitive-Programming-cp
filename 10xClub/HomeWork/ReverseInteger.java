// https://leetcode.com/problems/reverse-integer/



class ReverseInteger {
    public int reverse(int number) {
        long reverse = 0;

        while(number != 0)
        {
        int remainder = number % 10;
        number = number/10;
        reverse = reverse * 10 + remainder;
        }


   if(reverse < Integer.MIN_VALUE || reverse > Integer.MAX_VALUE)
        {
            return 0;
        }

        return (int) reverse;

    }

}
