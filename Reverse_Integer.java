/*
Given a 32-bit signed integer, reverse digits of an integer.

Example 1:
Input: 123
Output: 321
Note:
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
*/

class Solution {
    public int reverse(int x) {
        int r=0,pop;
        while(x!=0)
        {
           pop=x%10;
           x/=10;
           if (r> Integer.MAX_VALUE / 10 || r< Integer.MIN_VALUE / 10) 
           {
           return 0;
           }
          r=(r*10)+pop;
        }
         return r;
    }
}
