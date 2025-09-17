class Solution {
    public void level(Node root, List<List<Integer>> ans){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> inner = new ArrayList<>();
            for(int i = 0; i < size; i++){
                Node p = q.poll();
                inner.add(p.val);
                for(Node child : p.children){
                    q.add(child);
                }
            }
            ans.add(inner);
        }
    }
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        level(root, ans);
        return ans;
    }
}
