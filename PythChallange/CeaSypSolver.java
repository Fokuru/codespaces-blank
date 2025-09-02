//  Class author:  Raley
//  Date created:  8/29/2025
//  General description: This program is a Ceaser Cypher and takes a string and a number to tell it how far to move and then outputs the solved string. 
//  The imputed text has to be enterly lowercase with no punctuation.
public class CeaSypSolver {
    public static void main(String[] args) {
        // The imputed text should replace 'theText' 
        String theText = "g fmnc wms bgblr rpylqjyrc gr zw fylb. rfyrq ufyr amknsrcpq ypc dmp. bmgle gr gl zw fylb gq glcddgagclr ylb rfyr'q ufw rfgq rcvr gq qm jmle. sqgle qrpgle.kyicrpylq() gq pcamkkclbcb. lmu ynnjw ml rfc spj";
        // Call the cypher, imput the number to move by and then the text
        System.out.println(moveLetter(2, theText));
        String test = "m pszi gexw";
        System.out.println(moveLetter(-4, test));
    }

    /*
      Pre-condition: Imput a whole number (either pos or neg) and a String
      Post-condition: Outputs the imputed string shiffted so that each letter 
            is the imputed number away from its starting position.
    */
    public static String moveLetter(int moveNum, String imput){
        // The alphabet 
        String firstAlph = "abcdefghijklmnopqrstuvwxyz";
        // The output
        String output = "";
        // The new alphabet 
        String secondAlph = "abcdefghijklmnopqrstuvwxyz";

        // Checks if moveNum is pos or neg and then makes the ceasared alphabet acordingly.
        if (moveNum >= 0) {
            secondAlph = firstAlph.substring(moveNum) + firstAlph.substring(0, moveNum);
        } else {
            int check = moveNum*-1;
            secondAlph = firstAlph.substring(firstAlph.length()-check) + firstAlph.substring(0, firstAlph.length()-check);
        }
        
        for (int i = 0; i < imput.length(); i++){
            // Checks if the current character is a ' ' and then imputs a space in output if it is 
            if (imput.substring(i, i+1).equals(" ")){
                output = output + " ";
            } else {
            for (int k = 0; k < firstAlph.length(); k++) {
                // Checks where the current character appears in the regular alphabet and 
                // then adds the index of that character from the secondAlph into output.
                if (imput.substring(i, i+1).equals(firstAlph.substring(k, k+1))){
                    output = output + secondAlph.substring(k, k+1);
                }
            }
        }
    }
        // Returns solved
        return output;
    }
}