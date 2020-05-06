/**
 *
 * accum("abcd") -> "A-Bb-Ccc-Dddd"
 * accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
 * accum("cwAt") -> "C-Ww-Aaa-Tttt"
 *
 *
 *
*/



public class Mumbling {

    public static String accum(String s) {

        int len = s.length();
        String answer ="";
        for(int i = 0 ; i< len ; i++ ){
            answer += ""+Character.toUpperCase(s.charAt(i));
            for(int j =0; j < i; j++ ){

                answer +=  s.charAt(i);
            }
            answer+="-";
        }
        return answer.substring(0,answer.length()-1);
    }

    public static void main(String[] args) {
        System.out.println(accum("MjtkuBovqrU"));
    }

}
