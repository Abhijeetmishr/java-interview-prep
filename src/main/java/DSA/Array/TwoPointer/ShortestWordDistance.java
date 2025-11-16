package DSA.Array.TwoPointer;

public class ShortestWordDistance {
    // Input: words = ["a", "c", "d", "b", "a"], word1 = "a", word2 = "b"
    // Output: 1
    // Explanation: The shortest distance between "a" and "b" is 1 word. Please note that "a" appeared twice.

    // Input: words = ["a", "b", "c", "d", "e"], word1 = "a", word2 = "e"
    // Output: 4
    // Explanation: The distance between "a" and "e" is 4 words.

    public static int shortestWordDis(String[] words, String word1, String word2) {
        int minDis = Integer.MAX_VALUE;
        int word1Idx = -1;
        int word2Idx = -1;

        for(int i = 0; i < words.length; i++){
            String word = words[i];
            if(word.equals(word1)){
                word1Idx = i;
            }
            else if(word.equals(word2)){
                word2Idx = i;
            }
            if(word1Idx != -1 && word2Idx != -1) {
                minDis = Integer.min(minDis, Math.abs(word1Idx - word2Idx));
            }
        }
        return minDis;
    }


}
