class LastStoneWt {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> Integer.compare(b,a));

        for(int wt : stones) {
            pq.add(wt);
        }

        while(pq.size() > 1) {
            int s1 = pq.poll();
            int s2 = pq.poll();
            if(s1 != s2) {
                pq.add(Math.abs(s1-s2));
            }
        }

        return pq.size() == 0 ? 0 : pq.poll();
    }
}
