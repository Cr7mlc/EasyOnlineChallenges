/**
 * Given two integers a and b, which can be positive or negative, find the sum of all the numbers between including them too and return it. If the two numbers are equal return a or b.
 * Note: a and b are not ordered!
 *
 *  GetSum(1, 0) == 1 ===> 1 + 0 = 1
 * GetSum(1, 2) == 3 ===> 1 + 0 = 1
 * GetSum(0, 1) == 1 ===> 1 + 0 = 1
 * GetSum(1, 1) == 1 ===> 1 Since both are same.
 *
 *
 */


public class GetSumOfNum {
    public static int GetSum(int a, int b) {

        int res = 0;
        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
            res += i;
        }
        return a == b ? a : res;

    }
        /* using Euler's formula to find the numbers in between*/
//        return (a + b) * (Math.abs(a - b) + 1) / 2;


    public static void main(String[] args){

        System.out.println(GetSum(0,-1));
        System.out.println(GetSum(1,-1));
        System.out.println(GetSum(-1,7));
        System.out.println(GetSum(-1,0));


    }

}
