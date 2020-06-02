import java.util.Arrays;
/**
 *
 * You are going to be given an array of integers. Your job is to take that array and find an index N where the sum of the integers
 * to the left of N is equal to the sum of the integers to the right of N. If there is no index that would make this happen, return -1.
 *
 * input: {1,2,3,4,3,2,1}
 * output : 3 --> because at index 3 the sum of the leftSide and the sum of the rightSide are equal
 *
 *input: {1,100,50,-51,1,1}
 * output : 1 --> because at index 1 the sum of the leftSide and the sum of the rightSide are equal
 *
 * */
public class EqualSidesOfAnArray {
    public static int findEvenIndex(int[] arr) {

        int [] sumLeft= new int [arr.length];
        int leftNum = 0;
        int rightNum = 0;

  /*Getting the array of all the sum of items from the left
    going to the right for example if we have: {1,2,3,4,3,2,1}
    the result of this left sum array is going to be {1,3,6,10,13,15,16}
    */
        for(int i = 0; i < sumLeft.length; i++){
            sumLeft[i] = leftNum + arr[i];
            //changing the value of the leftNum to the previous index value of the array
            leftNum = sumLeft[i];

        }
    /*We are checking from the last index of the array, we keep adding the number from the right
      and saving it in a variable and check if that number is == at the number at the same index in the
      sumLeft Array that we created before.
    */
        for(int j = arr.length-1; j>=0;j-- ){
            rightNum += arr[j];
            if(rightNum == sumLeft[j]) return j;

        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,2,1};
        System.out.print("The array ");
        System.out.println(Arrays.toString(arr));
        System.out.println("At index: "+findEvenIndex(arr) + " The sum of the right side, and the left side are even");
    }
}

