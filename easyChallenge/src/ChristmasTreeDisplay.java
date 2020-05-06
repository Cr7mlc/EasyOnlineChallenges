/** The program takes a number of rows and a starter and displays a christmas tree of numbers starting at the starter and adding 3 each time.
 *
 *
 * it will display something like: for 15 rows and starting at 12
 *
 *                12
 *               1215
 *              121518
 *             12151821
 *            1215182124
 *           121518212427
 *          12151821242730
 *         1215182124273033
 *        121518212427303336
 *       12151821242730333639
 *      1215182124273033363942
 *     121518212427303336394245
 *    12151821242730333639424548
 *   1215182124273033363942454851
 *  121518212427303336394245485154
 *
 *
 *
 *
 * */


import java.util.Scanner;

public class ChristmasTreeDisplay {
    public static int [] getArray(int row,int starter){
        int[] arr = new int[row];

       for (int i= 0; i<arr.length; i++){
            arr[i] = starter;
            starter +=3;
        }
        return arr;
    }

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.print("Number of Rows: ");
        int row = sc.nextInt();
        System.out.print("The starter: ");
        int starter = sc.nextInt();
        int [] arr = getArray(row,starter);

            for (int j = 0; j < arr.length; j++) {

                // Displays it in a christmas tree fashion
                for (int m = 0; m < arr.length - j; m++)
                    System.out.print(" ");
                for (int n = 0; n < j + 1; n++) {
                    System.out.print(arr[n]);
                }
                System.out.println();
            }
            }



    }


