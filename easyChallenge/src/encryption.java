public class encryption {

    public static String encryptThis(String text){

        if(text.equals(""))return "";

        StringBuilder val = new StringBuilder();

        String s[] = text.split("\\s");

        for(String m : s){

            int code = m.charAt(0);
            char last = m.charAt(m.length()-1);
            char second = m.charAt(1);
            String middle = m.substring(2,m.length()-1);

            String newString = Integer.toString(code) + Character.toString(last) +middle+ Character.toString(second)+ " ";

            val.append(newString);


        }

        return val.toString().trim();

    }

    public static void main(String []args){

        System.out.print(encryptThis(""));

    }
}
