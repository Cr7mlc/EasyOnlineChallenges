/**
 *
 * With any given First and Last name, Get the first character of both and displays it to the console
 *
 * For example: name : Christin Mugisha ==> AbbrevName ==> C.M
 *
 * */

public class AbbreviationName {

    public static String abbrevName(String name) {

        char[] a = name.toCharArray();

        for ( int i= 0 ;  i< a.length; i++) {
            //whenever it reaches the space character
            if(a[i]==' '){
                name = (a[0]+ "." + a[i+1]).toUpperCase() ;
                break;
            }

        }
        /*

        Or

        //I take the name string and take the first character,
        //add a point and take the next character later the first space.
        name = name.charAt(0) + "." + (name.charAt(name.indexOf(" ")+1));
        //I put it everything on the string to upper case:
        name = name.toUpperCase();
        //Return the string.
        return name;


        */



        return name;

    }


    public static void main(String[] args) {
        System.out.println(abbrevName("Christin Mugisha"));
        System.out.println(abbrevName("Boris Gabrel"));

    }

}
