public class ChallengeReplace
{
    public static void main(String[] args)
    {
        String message =
                "I love cats! I have a cat named Coco. My cat's very smart!";

        // Write a loop here that replaces every occurrence of "cat"
        // in the message with "dog", using indexOf and substring.
        for (int i = 0; i+3 < message.length(); i++) {
            String letter = message.substring(i,i+3);
                if (letter.equals("cat")) {
                    String start = message.substring(0,i);
                    String end = message.substring(i+3);
                    message = start + "dog" + end;;
                }
        }
        boolean placeHolder = true;
        while (placeHolder) {
        System.out.print(message);
        placeHolder = false;
        }
    }
}

