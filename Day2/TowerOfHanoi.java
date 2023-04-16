//GFG Practice - https://practice.geeksforgeeks.org/problems/tower-of-hanoi-1587115621/1 
class Hanoi {

    public long toh(int n, int from, int to, int aux) {
        int moves = 0;
        //base case
        if(n == 0) {
            return 0;
        }
        
        //rec case
        moves += toh(n-1, from, aux, to);
        System.out.println("move disk "+n+" from rod "+from+" to rod "+to);
        moves += toh(n-1, aux, to, from);
        
        return moves;
    }
}
