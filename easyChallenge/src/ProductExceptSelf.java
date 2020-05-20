/**
 *
 *
 * Given an array, return the product of all the integer except the pointer integer
 *
 * Example: input = {1,2,3,4}
 *          output = {24,12,8,6} //--> when the pointer is at 1 ==> we multiply 2*3*4
 *                               // --> when the pointer is at 2 ==> we multiply 1*3*4
 *                              // --> when the pointer is at 3 ==> we multiply 1*2*4
 *                              // --> when the pointer is at 4 ==> we multiply 1*2*3
 *
 *
 *
 *
 *
 * */

public class ProductExceptSelf {

/*    public static int[] solution(int [] arr){

        int N = arr.length;
        int[] left_arr = new int[N];
        int[] right_arr = new int[N];

        int[] output_arr = new int[N];

        left_arr[0] = 1;
        right_arr[N-1] =1;

        for(int i =1; i<N;i++){
            left_arr[i] = arr[i-1]* left_arr[i-1];
        }

        for(int i =N-2; i>=0;i--){
            right_arr[i] = arr[i+1]* right_arr[i+1];
        }

        for(int i =0; i<N; i++){
            output_arr[i] = left_arr[i]* right_arr[i];
        }
        return output_arr;
    }
    */


/*
* 2nd Solution
*  */
    public static int[] solution(int [] arr){

        int N = arr.length;
        int[] right_arr = new int[N];
        int[] output_arr = new int[N];

        right_arr[N-1] =1;

        for(int i =N-2; i>=0;i--){
            right_arr[i] = arr[i+1]* right_arr[i+1];
        }

        int R=1;
        for(int i =0; i<N; i++){
            output_arr[i] = R* right_arr[i];
            R *= arr[i];
        }
        return output_arr;
    }



    public static void main(String []args){

        int[] arr = {1,2,3,4};
        System.out.println(java.util.Arrays.toString(solution(arr)));
    }

}
