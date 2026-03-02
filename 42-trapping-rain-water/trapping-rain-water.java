class Solution {
    public int trap(int[] height) {
        int l=0, r= height.length-1;
        int lmax=height[l], rmax=height[r];
        int tot=0;
        while(l<r){
            if(height[l]<height[r]){
                lmax = Math.max(lmax,height[l]);
                tot+= lmax-height[l];
                l++;
            }else{
                rmax = Math.max(rmax,height[r]);
                tot+= rmax-height[r];
                r--;                
            }
        }
        return tot;
    }
}