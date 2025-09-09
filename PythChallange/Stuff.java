// package stuff;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class FindTheEndOfAUR {
     
    public static void main(String[] args) {

     String baseURL = "http://www.pythonchallenge.com/pc/def/linkedlist.php?nothing=";
     String currentURL =  "12345";
     int lastNum = 0;

     try {
          while (!currentURL.equals("Ends Here") && !currentURL.equals("No content found") && Integer.parseInt(currentURL) > 0 && Integer.parseInt(currentURL) < 100000 && Integer.parseInt(currentURL) != lastNum) {
               if (currentURL.equals("16044")) {
                    currentURL = "8022";
               } 
               lastNum = Integer.parseInt(currentURL);
               currentURL = findNextNumber(baseURL + currentURL);
               System.out.println(currentURL);
          }
          if (currentURL.equals("Ends Here")) {
               System.out.println("The sequence has ended.");
          } else if (currentURL.equals("No content found")) {
               System.out.println("No content found at the URL.");
          } else if (currentURL.matches("\\d+")) {
               System.out.println(findNextNumber(baseURL + Integer.parseInt(currentURL)));
          }
         
     } catch (IOException e) {
          e.printStackTrace();
     }


    }


     public static String findNextNumber(String thisURL) throws IOException {
          if (thisURL == null || thisURL.length() == 0) {
               return "";
          }
          String firstPattern = "(?:the|and the) next nothing is ([0-9]{1,5})";
          try {
               URL url = new URL(thisURL);
               BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
               StringBuilder content = new StringBuilder();
               String line;
               while ((line = reader.readLine()) != null) {
                    content.append(line).append(" ");
               }
               String allText = content.toString();
               if (allText.length() < 1) {
                    return ("No content found");
               }
               Pattern n = Pattern.compile(firstPattern);
               Matcher m = n.matcher(allText);
               if (m.find()) {
                    return (m.group(1));
               } else {
                    System.out.println("The answer is " + allText);
                    return ("Ends Here");
               }
               
          }
          catch (Exception e) {
               e.printStackTrace();
          }
          return ("");
     }
}