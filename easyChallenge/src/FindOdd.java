
/**
 *
 * Given an array, find the integer that appears an odd number of times.
There will always be only one integer that an odd number of times.

 FOR EXAMPLE : having a set of these numbers {-1,1,2,-2,5,2,4,4,-1,-2,5,-1} --> return -1


 */


public class FindOdd {

    public static int findIt(int[] a) {

        int count = 0;
        int odd = 0;
        for(int i =0; i< a.length; i++){
            for( int j = 0; j< a.length; j++){
                if(a[i] == a[j]){
                    count++;
                }
            }
            if (count%2 == 1)  odd = a[i];
            count = 0;
        }

        return odd;
    }


    /*  OR

    public static int findIt(int[] A) {
    int odd=0;
    for (int item: A)
      {
        odd = odd ^ item;// XOR will cancel out every time you XOR with the same number so 1^1=0 but 1^1^1=1 so every pair should cancel out leaving the odd number out
      }

    return odd;

  }*/

    public static void main(String[] args) {

        int[] arr = {-1,1,2,-2,5,2,4,4,-1,-2,5, -1};
        int[] arr2 = {10};
        System.out.println(findIt(arr));
        System.out.println(findIt(arr2));

    }

}
