class Solution {
    public boolean isIsomorphic(String s, String t) {
        int map1[] = new int[256];
        int map2[] = new int[256];
        int count=1;
        for(int i=0;i<s.length();i++){
            int ch1 = s.charAt(i);
            int ch2 = t.charAt(i);
            if(map1[ch1] == 0 && map2[ch2] == 0){
                map1[ch1] = count;
                map2[ch2] = count;
                count++;
            }
            else if(map1[ch1] != map2[ch2]){
                return false;
            }
        }
        return true;
    }
}
