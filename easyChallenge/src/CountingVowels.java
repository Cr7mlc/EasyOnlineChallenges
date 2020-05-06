/** Counting the vowels in a given String considering that the vowels are :
*
 * * {'a', 'e', 'i', 'o', 'u'};
*
* */

public class CountingVowels {

    public static int getCount(String str) {
        int vowelsCount = 0;
        int len = str.length();

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < len; i++) {
            for (char c : vowels) {
                if (str.charAt(i) == c) {
                    vowelsCount++;
                    break;
                }
            }
        }

        return vowelsCount;


        /*Another Solution would be*/

       /* for(char c : str.toCharArray())
            vowelsCount += (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;

        return vowelsCount;
    }*/




    }

    public static void main(String[] args){

        System.out.println(getCount("Christmas"));
        System.out.println(getCount("This Challenge was easy"));


    }

}
