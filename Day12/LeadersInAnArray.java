// GFG Practice - https://practice.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1
class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> res = new ArrayList<>();
        int max = arr[n-1];
        res.add(max);
        for(int i=n-2; i>=0; i--) {
            if(max <= arr[i]) {
                res.add(arr[i]);
                max = arr[i];
            }
        }
        Collections.reverse(res);
        
        return res;
    }
}
