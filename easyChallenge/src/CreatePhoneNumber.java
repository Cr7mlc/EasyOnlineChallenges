

/**
 *
 *
 * Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers in the form of a phone number.
 *
 * Example:
 * Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"
 * The returned format must be correct in order to complete this challenge.
 * Don't forget the space after the closing parentheses!
 *
 *
 *
 * */



public class CreatePhoneNumber {
    public static String getPhoneNumber(int[] numbers) {
        String phoneNumber = new String("(xxx) xxx-xxxx");

        for (int i : numbers) {
            phoneNumber = phoneNumber.replaceFirst("x", Integer.toString(i));
        }

        return phoneNumber;
    }

    public static void main(String[] args) {
        System.out.println(getPhoneNumber(new int[]{1,2,3,4,5,6,7,8,9,0}));
        System.out.println(getPhoneNumber(new int[]{8,6,6,1,2,6,7,4,5,9}));
    }

}

