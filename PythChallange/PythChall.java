//  Class author:  Raley
//  Date created:  10/30/2024
//  General description: This program is a Ceaser Cypher and takes a string and a number to tell it how far to move and then outputs the solved string. 
public class PythChall {
    public static void main(String[] args) {
        // The imputed text should replace 'theText' 
        String theText = "g fmnc wms bgblr rpylqjyrc gr zw fylb. rfyrq ufyr amknsrcpq ypc dmp. bmgle gr gl zw fylb gq glcddgagclr ylb rfyr'q ufw rfgq rcvr gq qm jmle. sqgle qrpgle.kyicrpylq() gq pcamkkclbcb. lmu ynnjw ml rfc spj";
        // Call the cypher, imput the number to move by and then the text
        System.out.println(moveLetter(2, theText));
    }

    public static String moveLetter(int moveNum, String imput){
        // The alphabet 
        String firstAlph = "abcdefghijklmnopqrstuvwxyz";
        // The output
        String output = "";
        // The new alphabet 
        String secondAlph = "abcdefghijklmnopqrstuvwxyz";
        if (moveNum >= 0) {
            secondAlph = firstAlph.substring(moveNum) + firstAlph.substring(0, moveNum);
        } else {
            
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