/**
 *
 *Finding the Largest 5 digits number in a set of numbers given as a string
 *
 * For example: given the String "123456789854211" --> the largest 5 digits of this set of number is 98542
 *
 *
 *
 * */




public class Largest5Digits {
    public static int solve(String digits) {

    int max=0;
    for (int i = 0; i < digits.length(); i++) {
        if(i+5>digits.length())
            break;
        int temp=Integer.parseInt(digits.substring(i,i+5));
        if(temp>max)
            max=temp;
}
    return max;

    }


    public static void main(String[] args) {

        System.out.println(solve("123456789854211"));
        System.out.println(solve("8964125678974189651"));

    }


}
