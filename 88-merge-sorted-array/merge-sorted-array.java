class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
        int k=0;
        int[] arr= new int[m+n];

        //creating merged array
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                arr[k]=nums1[i];
                i++;
                k++;
            } else {
                arr[k]=nums2[j];
                j++;
                k++;
            }
        }

        //copy remaining elements incase the other array finishes first

        while(i<m){
            arr[k]=nums1[i];
            k++;
            i++;
        }

        while(j<n){
            arr[k]=nums2[j];
            k++;
            j++;
        }

        //printing no back to nums1
        for(int r=0;r<arr.length;r++){
            nums1[r]=arr[r];
        }
    }
}