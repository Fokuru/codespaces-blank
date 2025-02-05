// Given an integer x, return true if x is a 
// palindrome, and false otherwise.

// Example 1:

// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.
// Example 2:

// Input: x = -121
// Output: false
// Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
// Example 3:

// Input: x = 10
// Output: false
// Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

// Constraints:
// -2^31 <= x <= 2^31 - 1


class HelloWorld {
    public static void main(String[] args) {
        int x = 121;
        theCode(x);
        x = 5885;
        theCode(x);
        x = 12345;
        theCode(x);
        x = 123454321;
        theCode(x);
    }
     
     public static void theCode(int x) {
        if(isPalindrome(x))
            System.out.println(x + " is a palindrome!");
        else
            System.out.println(x + " is not a palindrome!");
     }


     public static boolean isPalindrome(int x) {
        // your code here
        if (x < 1 || (x%10 == 0 && x != 0)) {
            return false;
        }
        String theThing = "" + x;
        for (int i = 0; i < theThing.length()/2; i++) {
            if (!theThing.substring(i,i+1).equals(theThing.substring(theThing.length()-1-i, theThing.length()-i))) {
                return false;
            }
        }
        return true;
    }
    
}














