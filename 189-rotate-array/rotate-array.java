class Solution {
    public void rotate(int[] arr, int k) {
        if(arr.length == 0) return;
        k = k % arr.length;

        //reverse the array completely
        int low=0;
        int high=arr.length-1;
        while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        } 

        //reseverse first half
        int f1=0;
        int f2=k-1;
        while(f1<f2){
            int temp=arr[f1];
            arr[f1]=arr[f2];
            arr[f2]=temp;
            f1++;
            f2--;
        }

        int s1=k;
        int s2=arr.length-1;
        while(s1<s2){
            int temp=arr[s1];
            arr[s1]=arr[s2];
            arr[s2]=temp;
            s1++;
            s2--;
        }

        return;
    }
}