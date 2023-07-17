class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] ranks = new String[score.length];
        Map<Integer, String> map = new HashMap<>();
        int[] sortedScores = new int[score.length];
        for(int i=0; i<score.length; i++) {
            sortedScores[i] = score[i];
        }
        Arrays.sort(sortedScores);
        int count = 0;
        for(int i=sortedScores.length-1; i>=0; i--) {
            count++;
            if(count == 1) {
                map.put(sortedScores[i], "Gold Medal");
            }
            else if(count == 2) {
                map.put(sortedScores[i], "Silver Medal");
            }
            else if(count == 3) {
                map.put(sortedScores[i], "Bronze Medal");
            }
            else {
                map.put(sortedScores[i], Integer.toString(count));
            }
        }
        for(int i=0; i<score.length; i++) {
            ranks[i] = map.get(score[i]);
        }

        return ranks;
    }
}
