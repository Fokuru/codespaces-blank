public class PythChall {
    public static void main(String[] args) {
        String alph = "abcdefghijklmnopqrstuvwxyz";
        String theText = "g fmnc wms bgblr rpylqjyrc gr zw fylb. rfyrq ufyr amknsrcpq ypc dmp. bmgle gr gl zw fylb gq glcddgagclr ylb rfyr'q ufw rfgq rcvr gq qm jmle. sqgle qrpgle.kyicrpylq() gq pcamkkclbcb. lmu ynnjw ml rfc spj";
        System.out.println(moveLetter(alph, 2, theText));
    }

    public static String moveLetter(String firstAlph, int moveNum, String imput){
        String output = "";
        String secondAlph = firstAlph.subString(moveNum+1) + firstAlph.subString(0, moveNum+1);
        for (int i = 0; i < imput.length; i++){
            int index = 0;
                for (int k = 0; k < firstAlph.length; k++) {
                    if (imput.subString(i, i+1).equals(secondAlph.subString(k, k+1))){
                        output = output + firstAlph.subString(k, k+1);
                    }
                }
        }
        return output;
    }
}