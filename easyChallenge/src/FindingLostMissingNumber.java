/**
Given any set of numbers starting at 1, and incrementing by 1, find the missing number in the array
 *
 * for example : {13, 11, 10, 3, 2, 1, 4, 5, 6, 9, 7, 8} the missing number is 12
 *
*
* */


import java.util.Arrays;

public class FindingLostMissingNumber {

    public static int findMissingNumber(int[] numbers) {
       Arrays.sort(numbers);
        int m= 0;
        for (int i : numbers) {
            m++;
            if(m!= i) return m;

        }
        return 0;
    }



    public static void main(String[] args) {

        int [] numbers3 = {2, 3, 4};
        int [] numbers2 = {1, 3};
        int [] numbers = {13, 11, 10, 3, 2, 1, 4, 5, 6, 9, 7, 8};


        System.out.println(findMissingNumber(numbers3));
        System.out.println(findMissingNumber(numbers2));
        System.out.println(findMissingNumber(numbers));





    }


}
