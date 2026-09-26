class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> map = new HashMap<>();
        for(int i=0;i<knowledge.size();i++){
            map.put(knowledge.get(i).get(0),knowledge.get(i).get(1));
        }
        boolean st = false;
        StringBuilder sub = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st = true;
            }else if(st && ch!=')'){
                sub.append(ch);
            }else if(ch==')'){
                String key = sub.toString();
                if(map.containsKey(key)){
                    ans.insert(ans.length(),map.get(key));
                }else{
                    ans.append('?');
                }
                sub = new StringBuilder();
                st = false;
            }else{
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}