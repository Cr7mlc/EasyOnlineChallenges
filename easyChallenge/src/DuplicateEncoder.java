import java.util.HashSet;

public class DuplicateEncoder {
   public static String encode(String word){

//        HashSet<Character> duplicate = new HashSet<>();
//        HashSet<Character> h = new HashSet<>();
//        char[] c = word.toLowerCase().toCharArray();
//        for(char a : c){
//            if(duplicate.contains(a))
//                h.add(a);
//            duplicate.add(a);
//        }
//
//        word = "";
//        for(char a : c){
//            if(h.contains(a))
//                word += ")";
//            else
//                word += "(";
//
//        }


       word = word.toLowerCase();
       String result = "";
       for (int i = 0; i < word.length(); i++) {
           if (word.indexOf(word.charAt(i)) == word.lastIndexOf(word.charAt(i)))
               result += "(";
           else result += ")";
       }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(encode("Prespecialized"));
    }

}
