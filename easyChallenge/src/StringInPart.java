/***
 *
 * Splitting the below string into other strings of size 3 forExample:
 *
 * 'supercalifragilisticexpialidocious'
 *
 * Will return a new string
 * 'sup erc ali fra gil ist ice xpi ali doc iou s'
 *
 *
 *
 *
 *
 */


public class StringInPart {

    public static String splitInParts(String s, int partLength) {

        /* 1ST WAY
         */

        String newSt = "";
        int count=0;
        for(int i = 0; i< s.length() ; i++){
            count++;
            if(count% partLength==0){
                newSt = newSt +(s.charAt(i)+ " ");
            }
            else {
                newSt = newSt + (s.charAt(i));
            }

        }
        return newSt.trim();
    }



/*  2ND WAY
            StringBuilder builder = new StringBuilder(s);
            //adding a + 1 because we are determining the place of a space

            for(int i = partLength; i < builder.length(); i += partLength + 1) {
                builder.insert(i, ' ');
            }
            return builder.toString(); */



    /* 3RD WAY
                char[] a = s.toCharArray();
                StringBuilder newSt = new StringBuilder();
                int count=0;
                    for(int i = 0; i< a.length ; i++){
                        count++;

                        if(count% partLength==0) newSt.append(" ");

                        newSt.append(a[i]);
                    }
                return newSt.toString().trim();
    } */
    public static void main(String[] args){

        System.out.println(splitInParts("MugishaLyChristin",2));

    }

}
