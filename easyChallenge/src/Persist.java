/**
 *
 * Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence, which is the number of times you must multiply the digits in num until you reach a single digit.
 * For example:
 *
 *
 * persistence(39) == 3 // because 3*9 = 27, 2*7 = 14, 1*4=4
 *                       // and 4 has only one digit
 *
 *  persistence(999) == 4 // because 9*9*9 = 729, 7*2*9 = 126,
 *                        // 1*2*6 = 12, and finally 1*2 = 2
 *
 *  persistence(4) == 0 // because 4 is already a one-digit number
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * */


public class Persist {

    public static int persistence(int n) {
        if(n < 10) return 0;
        return 1 + persistence(multiply(n));

    }
    public static int multiply(int m){
        if(m <10){
            return m;
        }
        return m%10 * multiply(m/10);
    }


    public static void main(String[] args) {
        System.out.println(persistence(999)); // returns 4
        System.out.println(persistence(39)); // returns 3
        System.out.println(persistence(4)); // return 0
    }
}
