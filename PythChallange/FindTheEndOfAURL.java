//  Class author:  Raley Wilkin
//  Date created:  9/9/2025
//  General description: This program takes in a URL and finds the next number in a sequence based on a pattern in the webpage's content.
//  It continues this process until it reaches the end of the sequence or encounters an error.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class FindTheEndOfAURL {
    public static void main(String[] args) {

     // The base URL to start the search from
     String baseURL = "http://www.pythonchallenge.com/pc/def/linkedlist.php?nothing=";
     // The initial number to start the sequence
     String currentURL =  "12345";
     // To keep track of the last number to avoid infinite loops
     int lastNum = 0;

     try {
          while (!currentURL.equals("Ends Here") && !currentURL.equals("No content found") && Integer.parseInt(currentURL) > 0 && Integer.parseInt(currentURL) < 100000 && Integer.parseInt(currentURL) != lastNum) {
               // Special case handling for a known anomaly in the sequence
               if (currentURL.equals("16044")) {
                    currentURL = "8022";
               } 
               // Update the last number and find the next number in the sequence
               lastNum = Integer.parseInt(currentURL);
               // Fetch the next number from the URL
               currentURL = findNextNumber(baseURL + currentURL);
               // Print the current URL or number being processed
               System.out.println(currentURL);
          }
          // Handle the end of the sequence or errors
          if (currentURL.equals("Ends Here")) {
               System.out.println("The URL sequence has ended.");
          } else if (currentURL.equals("No content found")) {
               System.out.println("No content found at the URL.");
          } else if (currentURL.matches("\\d+")) {
               System.out.println(findNextNumber(baseURL + Integer.parseInt(currentURL)));
          }
         
     // Catch and print any IO exceptions that occur during the process
     } catch (IOException e) {
          e.printStackTrace();
     }


    }

     /*
      Pre-condition: Input a URL as a string
      Post-condition: Outputs the next number in the sequence found in the webpage's content or indicates the end of the sequence.
     */
     public static String findNextNumber(String thisURL) throws IOException {
          // Check for null or empty URL
          if (thisURL == null || thisURL.length() == 0) {
               return "";
          }
          // Regular expression pattern to find the next number in the content
          String firstPattern = "(?:the|and the) next nothing is ([0-9]{1,5})";
          // Try to read the content from the URL and find the next number
          try {
               URL url = new URL(thisURL);
               BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
               StringBuilder content = new StringBuilder();
               String line;
               // Read the entire content of the webpage
               while ((line = reader.readLine()) != null) {
                    content.append(line).append(" ");
               }
               // Make string for pattern matching
               String allText = content.toString();
               // Check if content is empty
               if (allText.length() < 1) {
                    return ("No content found");
               }
               // Use regex to find the next number in the content
               Pattern n = Pattern.compile(firstPattern);
               Matcher m = n.matcher(allText);
               // Return the found number or indicate the end of the sequence
               if (m.find()) {
                    return (m.group(1));
               } else {
                    // If no number is found, print the entire content for debugging
                    System.out.println("The answer is " + allText);
                    return ("Ends Here");
               }
               
          }
          // Catch and print any exceptions that occur during URL reading or pattern matching
          catch (Exception e) {
               e.printStackTrace();
          }
          return ("");
     }
}