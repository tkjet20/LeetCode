class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();

        for(int i : nums){
            if(hashmap.containsKey(i)){
                return true;
            }
            hashmap.put(i, 1);
        }

        return false;
    }
}