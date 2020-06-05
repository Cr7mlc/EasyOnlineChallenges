/**
 *
 * I implemented the Luhn Algorithm, which is used to help validate credit card numbers. via https://en.wikipedia.org/wiki/Luhn_algorithm
 *
 * Given a positive integer of up to 16 digits, return true if it is a valid credit card number, and false if it is not.
 *
 * Here is the algorithm:
 *
 * Double every other digit, scanning from right to left, starting from the second digit (from the right).
 *
 * 12345 ==> [1, 2*, 3, 4*, 5] ==> [1, 4, 3, 8, 5] or 891 ==> [8, 9*, 1] ==> [8, 18, 1] or 1714 ==> [1*, 7, 1*, 4] ==> [2, 7, 2, 4]
 *
 *
 * If a resulting number is greater than 9, replace it with the sum of its own digits (which is the same as subtracting 9 from it):
 *
 * [8, 18*, 1] ==> [8, (1+8), 1] ==> [8, 9, 1] or [8, 18*, 1] ==> [8, (18-9), 1] ==> [8, 9, 1]
 *
 * Last Step
 * [8, 9, 1] ==> 8 + 9 + 1 = 18 ==> if the sum % 10 of this last step is 0 return true else return false
 *
 *
 * */


public class Validate {
    public static boolean validate(String n) {
        /*
        * Since we are skipping a number from the right we create a variable that we will switch back and forth*/
        boolean switcher = false;
        int sum = 0;

        for(int i= n.length()-1 ; i >=0; i--){
            //grabbing the number from to left to the right;
            int num = Integer.parseInt(String.valueOf(n.charAt(i)));

            //if true
            if(switcher){
                num+=num;
            }
            //else
            sum += num;

            //check the sum is greater than 9
            if(sum > 9) sum -=9;

            // switching the switcher from false to true or true to false
            switcher = !switcher;

        }

        //returning true if sum mod 10 == 0
        return sum%10 == 0;

    }


    public static void main(String[] args) {

        System.out.println(validate("981"));
        System.out.println(validate("4500280056474883"));


    }

}
