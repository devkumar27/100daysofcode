class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] res = new int[num_people];
        int count = 1;
        while(candies > 0) {
            if(count <= candies) {
                res[(count-1)%num_people] += count;
            } else {
                res[(count-1)%num_people] += candies;
                break;
            }
            candies -= count;
            count++;
        }
        return res;
    }
}
