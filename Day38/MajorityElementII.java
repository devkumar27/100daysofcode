class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i: nums) {
            if(map.containsKey(i)) {
                map.put(i, map.get(i)+1);
            }
            else {
                map.put(i, 1);
            }
        }
        List<Integer> res = new ArrayList<>();
        for(Map.Entry<Integer, Integer> e: map.entrySet()) {
            if(e.getValue() > nums.length/3) {
                res.add(e.getKey());
            }
        }

        return res;
    }
}
