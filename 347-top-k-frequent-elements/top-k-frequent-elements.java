class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int ans[] = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> max = new PriorityQueue<>(
            (a,b) -> Integer.compare(map.get(b), map.get(a))
        );
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int key : map.keySet()){
            max.add(key);
        }
        for(int i=0;i<k;i++){
            ans[i] = max.poll();
        }
        return ans;
    }
}