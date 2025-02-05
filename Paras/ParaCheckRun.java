package Paras;
//
//  Class author:  Raley
//  Date created:  11/11/2024
//  General description: Checks to see if a string of different parenthesis is valid. 
//

public class ParaCheckRun {
    /*
      Pre-condition: A string containing only '(', '[', '{', ')', ']', or '}' characters is imputed.
      Post-condition: Prints out whether the imputed text closes all parenthesis with a matching type.
    */
    public static void check (String checkThis)  {
        int open1Num = 0;
        int open2Num = 0;
        int open3Num = 0;
        int closed1Num = 0;
        int closed2Num = 0;
        int closed3Num = 0;
        boolean canGo = true;
        if ((checkThis.length()%2 == 0) && (canGo == true)) {
            for (int i=0; i<checkThis.length(); i++) {
                if ((checkThis.substring(i, i+1).contains("(")) || (checkThis.substring(i, i+1).contains("[")) || (checkThis.substring(i, i+1).contains("{")) || (checkThis.substring(i, i+1).contains(")")) || (checkThis.substring(i, i+1).contains("]")) || (checkThis.substring(i, i+1).contains("}"))) {
                    canGo = true;
                    if (checkThis.substring(i, i+1).contains("(")) {
                        open1Num++;
                    } else if (checkThis.substring(i, i+1).contains("[")) {
                        open2Num++;
                    } else if (checkThis.substring(i, i+1).contains("{")) {
                        open3Num++;
                    } else if (checkThis.substring(i, i+1).contains(")")) {
                        closed1Num++;
                    } else if (checkThis.substring(i, i+1).contains("]")) {
                        closed2Num++;
                    } else if (checkThis.substring(i, i+1).contains("}")) {
                        closed3Num++;
                    }
                } else {
                    System.out.println("Doesn't match.");
                    return;
                }
            }
            if ((open1Num == closed1Num)&&(open2Num == closed2Num)&&(open3Num == closed3Num)) {
                boolean stillMatches = true;
                for (int i = 0; i < checkThis.length();) {
                    if (((checkThis.substring(i, i+1).contains("("))&&(checkThis.substring(i+1, i+2).contains(")"))) ||
                    ((checkThis.substring(i, i+1).contains("["))&&(checkThis.substring(i+1, i+2).contains("]"))) || 
                    ((checkThis.substring(i, i+1).contains("{"))&&(checkThis.substring(i+1, i+2).contains("}")))) {
                        String placeOne = checkThis.substring(0, i);
                        String placeTwo = checkThis.substring(i+2);
                        checkThis = placeOne + placeTwo;
                        i = 0;
                        stillMatches = true;
                    } else if  ((!(checkThis.substring(i, i+1).contains("("))&&(checkThis.substring(i+1, i+2).contains(")"))) ||
                    (!(checkThis.substring(i, i+1).contains("["))&&(checkThis.substring(i+1, i+2).contains("]"))) || 
                    (!(checkThis.substring(i, i+1).contains("{"))&&(checkThis.substring(i+1, i+2).contains("}")))){
                        stillMatches = false;
                        System.out.println("Doesn't match.");
                        return;
                    } else {
                        i++;
                    }
                }
                if (stillMatches == true) {
                    System.out.println("Matches!");
                    return;
                } else {
                    System.out.println("Doesn't match.");
                    return;
                }
            } else {
                System.out.println("Doesn't match.");
                return;
            }
        } else {
            System.out.println("Doesn't match.");
            return;
        }
    }
    
}
