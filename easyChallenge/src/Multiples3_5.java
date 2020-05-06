/**
 *
 * We list all the natural numbers below an integer for example 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * We return the sum of these multiples is 23.
 *
 * */


public class Multiples3_5 {

    public static int solution(int number) {

        int sol =0;
        for(int j =0; j < number; j++){
            if(j %5==0 || j%3 == 0){
                sol+=j;

            }
        }

        return sol;
    }

    public static void main(String[] args) {
        System.out.println(solution(20));
    }

}
