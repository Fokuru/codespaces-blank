package AlphaSoup;
/* 
 * My name is Raley Wilkin
 * This is the Alphabet Soup Code
 * Finished 9/26/2024
 */ 

 



 public class AlphaSoup {

   //instance variables
   private String letters;
   private String company;
   private int wordCount;
   
     //constructors
     // Takes: Nothing
     // Output: Vars to default
     public AlphaSoup() {
        letters = "";
        company = "";
        wordCount = 0;
    }

    

    // Takes: A new company name
    // Output: Company to the new company 
    // and the rest to defult.
    public AlphaSoup(String newCompany) {
        letters = "";
        company = newCompany;
        wordCount = 0;
    }
    
   
    // Adjusts variables

    // Takes: Company name
    // Output: Resets company
    public void resetAlphaSoup(String newCompany) {
        letters = "";
        company = newCompany;
        wordCount = 0;
    }

    // Takes: A new company name
    // Output: Company to the new company 
    // and leaves the rest the same.
    public void setCompany (String newCompanyChange) {
        company = newCompanyChange;
    }

    // Takes: New word
    // Does: Adds new word to 
    // end of letters string
    // Output: Nothing
    public void addWord(String word) {
        letters = letters + word;
        wordCount = wordCount +1;
    }

     //getters setters

     // Takes: Nothing
     // Output: Returns the string of letters 
     // with the company name in the middle
     public String allLetters() {
        int lettersLength = letters.length()/2;
        String stringedLetters = letters.substring(0,lettersLength) + company + letters.substring(lettersLength,letters.length());
        return stringedLetters;
    }

    // Takes: Nothing
    // Output: Company name
    public String getCompany() {
        return company;
    }

    // Takes: A string
    // Does: Tells you if a string is in the 
    // Output: A booleon
    public boolean removeWord(String word) {
        int isIn = letters.indexOf(word);
        if (isIn == -1) {
            return false;
        } else {
            String start = letters.substring(0,isIn);
            String end = letters.substring(isIn+word.length());
            letters = start + end;
            wordCount = wordCount -1;
            return true;
        }
    }

    // Takes: Nothing
    // Output: A random character that
    // appearsin the compony's string
    public char randomLetter() {
        if (letters.length() > -1) {
        int numberRandom = ((int)(Math.random()*letters.length()));
        char randomNess = letters.charAt(numberRandom);
        return randomNess;
        } else {
        return 'A';
        }
    

    

    /* public int generatorNow(int minNum, int maxNum) {
        int generated = minNum + (int)(Math.random() * ((maxNum - minNum) + 1));
        return generated;
    } */


}
 }

