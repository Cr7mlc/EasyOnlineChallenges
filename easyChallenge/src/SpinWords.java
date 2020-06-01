/**
 *
 *
 *
 * Write a function that takes in a string of one or more words, and returns the same string, but with all five or more letter words
 * reversed (Just like the name of this Kata). Strings passed in will consist of only letters and spaces. Spaces will be included only
 * when more than one word is present.
 *
 * Examples: spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw" spinWords( "This is a test") =>
 * returns "This is a test" spinWords( "This is another test" )=> returns "This is rehtona test"
 *
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


public class SpinWords {

    public static String spinWords(String sentence) {
        //TODO: Code stuff here
        String [] s = sentence.split("\\s");
        String newSentence = "";
        for( String a : s){
            if(a.length() >=5){
                newSentence  += reverseString(a)+" ";
            }else
                newSentence += a + " ";
        }
        return newSentence.trim();
    }

    public static String reverseString(String s){
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println("Hey fellow warriors");
        System.out.println(spinWords("Hey fellow warriors"));

        System.out.println("This is another Test of this Implementation");
        System.out.println(spinWords("This is another Test of this Implementation"));

    }
}
