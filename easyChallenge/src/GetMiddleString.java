/**
 * You are given a word. Your job is to return the middle character of the word. If the word's length is odd,
 return the middle character. If the word's length is even, return the middle 2 characters.

 getMiddle("test") should return "es";
 getMiddle("testing") should return "t";

 */


public class GetMiddleString {
    public static String getMiddle(String word) {

        int len = word.length();

        if(len %2 == 0) return word.substring(len/2-1, len/2+1);

        else
            return word.substring((len-1)/2,(len+1)/2);


    }
    public static void main(String[] args) {

        System.out.println(getMiddle("Test"));
        System.out.println(getMiddle("Testing"));

    }

}
