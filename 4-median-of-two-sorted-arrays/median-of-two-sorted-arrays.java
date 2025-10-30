class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int totlen = n1+n2;
        int med=totlen/2;
        int mergedArr[] = new int[med+1] ;
        int p1=0,p2=0;
        for(int i=0;i<=med;i++){
            if(p1<n1 && (p2 >= n2 || nums1[p1] < nums2[p2])){
                mergedArr[i]=nums1[p1];
                p1++;
            }else{
                mergedArr[i]=nums2[p2];
                p2++;
            }
        }
        if(totlen%2==0){
            return (mergedArr[med]+mergedArr[med-1])/2.0;
        }else{
            return mergedArr[med]/1;
        }
    }
}