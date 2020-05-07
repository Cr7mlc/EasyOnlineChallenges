/***
 *
 *
 *Given the triangle of consecutive odd numbers:
 *
 *              1
 *           3     5
 *        7     9    11
 *    13    15    17    19
 * 21    23    25    27    29
 *
 * get the sum of every row for a given integer representing the row of the triangle
 *
 * for example --> given an integer i=3 --> it will be 7+9+11 = 27
 *
 *
 */

public class RowSumOddNumbers {

    public static int rowSumOddNumbers(int n) {

        int start = (n*n)-(n-1);
        int sum = 0;
        for(int i =0; i<n; i++){
           sum += (start+(2*i));
        }
        return sum;

        /*OR
        *
        *public static int rowSumOddNumbers(int n) {
        *
        *       return (int)Math.Pow(n,3)
        *
        * }
        *
        * */


    }


    public static void main(String[] args) {

        System.out.println(rowSumOddNumbers(1));

    }


}
