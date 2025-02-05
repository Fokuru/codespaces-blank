package WordDistance;

public class WordDistTest {

    public static void main(String[] args) {
    String[] newArry = {"i", "love", "cats", "a", "lot"};
    String word1 = "love";
    String word2 = "lot";


    System.out.println("The smallest distance is " + WordDist.wordDist(newArry, word1, word2));

    String[] newArryTwo = {"i", "love", "cats", "a", "lot", "love"};
    word1 = "love";
    word2 = "lot";

    System.out.println("The smallest distance is " + WordDist.wordDist(newArryTwo, word1, word2));

    String[] wordsDict = {"practice", "makes", "perfect", "coding", "makes"};
    word1 = "coding"; 
    word2 = "practice";

    System.out.println("The smallest distance is " + WordDist.wordDist(wordsDict, word1, word2));

    String[] wordsDictTwo = {"practice", "makes", "perfect", "coding", "makes"};
    word1 = "makes"; 
    word2 = "coding";

    System.out.println("The smallest distance is " + WordDist.wordDist(wordsDictTwo, word1, word2));

    String[] wordsDictThree = {"practice", "makes", "perfect", "makes"};
    word1 = "makes"; 
    word2 = "coding";

    System.out.println("The smallest distance is " + WordDist.wordDist(wordsDictThree, word1, word2));

    String[] wordsDictFour = {"practice", "coding", "perfect", "makes"};
    word1 = "practice"; 
    word2 = "makes";

    System.out.println("The smallest distance is " + WordDist.wordDist(wordsDictFour, word1, word2));

    }
}
