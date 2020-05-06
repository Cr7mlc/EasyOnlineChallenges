
/**
 *
 * A digital root is the recursive sum of all the digits in a number. Given n, take the sum of the digits of n. If that value has more than one digit, continue reducing in this way until a single-digit number is produced. This is only applicable to the natural numbers.
 * Here's how it works:
 *
 * digital_root(16)
 * => 1 + 6
 * => 7
 *
 * digital_root(942)
 * => 9 + 4 + 2
 * => 15 ...
 * => 1 + 5
 * => 6
 * */

public class Digital_Root {


    private static int sumDigits(int in){

        if(in == 0)
            return 0;
        if(in<10) return in;

        in = in%10 + sumDigits(in/10);
        return sumDigits(in);

        // Some other way to do it.
        //return (1 + (in - 1) % 9);

    }

    public static void main(String[] args) {

        System.out.println(sumDigits(16));
        System.out.println(sumDigits(10));
        System.out.println(sumDigits(942));
        System.out.println(sumDigits(132189));

    }



}
