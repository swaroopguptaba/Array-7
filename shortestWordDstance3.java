// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

public class shortestWordDstance3 {

    public int shortestWordDistance(String[] wordsDict, String word1, String word2) {

        if(wordsDict == null) return 0;
        int i1 = -1, i2 = -1;
        int min = Integer.MAX_VALUE;

        for(int i = 0 ; i < wordsDict.length; i++){
            if(wordsDict[i].equals(word1)){
                i1 = i;
            }
            if (wordsDict[i].equals(word2)){
                if(i1 == i) i1 = i2;
                i2 = i;
            }
            if(i1 != -1 && i2 != -1){
                min = Math.min(min, Math.abs(i1 - i2));
            }
        }
        return min;
    }

}
