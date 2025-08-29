public class PythChall {
    public static void main(String[] args) {
        String theText = "g fmnc wms bgblr rpylqjyrc gr zw fylb. rfyrq ufyr amknsrcpq ypc dmp. bmgle gr gl zw fylb gq glcddgagclr ylb rfyr'q ufw rfgq rcvr gq qm jmle. sqgle qrpgle.kyicrpylq() gq pcamkkclbcb. lmu ynnjw ml rfc spj";
        System.out.println(moveLetter(2, theText));
    }

    public static String moveLetter(int moveNum, String imput){
        String firstAlph = "abcdefghijklmnopqrstuvwxyz";
        String output = "";
        String secondAlph = firstAlph.substring(moveNum) + firstAlph.substring(0, moveNum);
        for (int i = 0; i < imput.length(); i++){
            if (imput.substring(i, i+1).equals(" ")){
                output = output + " ";
            } else {
            for (int k = 0; k < firstAlph.length(); k++) {
                if (imput.substring(i, i+1).equals(firstAlph.substring(k, k+1))){
                    output = output + secondAlph.substring(k, k+1);
                }
            }
        }
    }
        return output;
    }
}