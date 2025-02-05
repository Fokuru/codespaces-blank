package WordDistance;
//
//  Class author:  Raley
//  Date created:  12/19/2024
//  General description: Given an array of strings wordsDict and two different strings that already exist in the array word1 and word2, return the shortest distance between these two words in the list.
//

public class WordDist {
    
    // Precondition: 2 <= wordsDict.length <= 3 * 10^4, 1 <= wordsDict[i].length <= 10, 
    // wordsDict[i] consists of lowercase English letters., word1 and word2 are in wordsDict., word1 != word2
    // Postcondition: Returns the distance between word1 and word2 in wordsDict.

    public static int wordDist(String[] wordsDict, String word1, String word2) 
    {
        int placeOfOne = -1;
        int placeOfTwo = -1;
        int distance = wordsDict.length + 10;

        for (int i = 0; i < wordsDict.length; i++)
        {
            if (wordsDict[i].equals(word1)) 
            {
                placeOfOne = i;
            }

            if (wordsDict[i].equals(word2)) 
            {
                placeOfTwo = i;
            }
            if(placeOfOne!=-1 && placeOfTwo!=-1)
            {
                if (distance > Math.abs(placeOfTwo-placeOfOne))
                {
                distance = Math.abs(placeOfTwo-placeOfOne);
                }
            }
            

        }

        if (distance < wordsDict.length)
        {
            return distance;
        } else {
            return -1;
        }

    } 

}
