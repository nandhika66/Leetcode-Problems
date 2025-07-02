class Solution {
    public int countPalindromicSubsequence(String s) {
        Set<String> unique = new HashSet<>();
        int left[] = new int[26];
        int right[] = new int[26];
        for(int i=0;i<s.length();i++){
            right[s.charAt(i)-'a']++;
        }
        left[s.charAt(0)-'a']++;
        right[s.charAt(0)-'a']--;
        for(int i=1;i<s.length()-1;i++){
            right[s.charAt(i)-'a']--;
            for(int j=0;j<26;j++){
                
            if(left[j] * right[j] !=0){
                StringBuilder word = new StringBuilder() ;
                word.append((char)(j+'a')).append(s.charAt(i)).append((char)(j+'a'));
                unique.add(word.toString());

            }

            }
            
            left[s.charAt(i)-'a']++;
        }
        return unique.size();

    }
}