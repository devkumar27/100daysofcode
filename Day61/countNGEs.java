class Solution {
  public static int[] count_NGEs(int N, int arr[], int queries, int indices[]) {
    int[] nges = new int[queries];
    for(int i=0; i<queries; i++) {
        int count = 0;
        for(int j=indices[i]; j<arr.length; j++) {
            if(arr[indices[i]] < arr[j]) {
                count++;
            }
        }
        nges[i] = count;
    }
    return nges;
  }
}
