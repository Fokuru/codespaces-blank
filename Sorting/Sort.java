/*
 * Code is by Raley Wilkin
 * This is Raley's Sorting Code
 * Started 2/3/2025
 * Fiinished 2/4/2025
 */


public class Sort {
    //precondition: Input is an int array and contains at least one element
    //poscondition: An array containing all the elements of input in ascending order is returned.
    public static int[] SortThis (int[] input) {
        for (int k = 0; k < input.length-1; k++)
            {
            for (int i = 0; i < input.length-1; i++){
                if (input[i] > input[i+1]){
                    int first = input[i];
                    input[i] = input[i+1];
                    input[i+1] = first;
                }
            }
        }
        return input;
    }

    //precondition: Input is an int array and contains at least one element
    //poscondition: A string is returned that contains all the items of the array in the order given is returned
    public static String toString (int[] input)
    {
        String end = "{";
        int a = input.length-1;
        for (int b = 0 ; b < input.length; b++)
        {
            if (b < a)
            {
                end = end + (input[b] + ", ");
            } else {
                end = end + (input[b]);
            }
        }
        return end + "}";
    }
}