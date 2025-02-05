/*
 * Code is by Raley Wilkin
 * This is Raley's Sorting Code
 * Started 2/3/2025
 * Finished 2/5/2025
 */

 public class SortMain {
   public static void main(String[] args) {

    // Array checking that it works for short
    int[] arr1 = {-7, -3, -10, 9, 4, 2, 10};
    System.out.println ("Array entered was " + Sort.toString(arr1));
    arr1 = Sort.SortThis(arr1);
    System.out.println ("Array sorted is " + Sort.toString(arr1));

    System.out.println("");

    // Array checking that it works for long and will put equal numbers together
    int[] arr2 = {20, 70, 10, -6, 8, 0, 7, -4, 75, 70, 30, 82, 105, 18, 12, 3, -28, 2, -98, -66, 93, 9, 60, 40, 38, 53, 6, 10, -40, -29, -53, 60, 39, 602, 5, 106, 38, -69, 60, 48};
    System.out.println ("Array entered was " + Sort.toString(arr2));
    arr2 = Sort.SortThis(arr2);
    System.out.println ("Array sorted is " + Sort.toString(arr2));

    System.out.println("");

    // Array checking that it works when numbers have to move to other end
    int[] arr3 = {123, 50, 30, 80, -10, 60, 20, 40, 30, -30};
    System.out.println ("Array entered was " + Sort.toString(arr3));
    arr3 = Sort.SortThis(arr3);
    System.out.println ("Array sorted is " + Sort.toString(arr3));

  }
 }

 