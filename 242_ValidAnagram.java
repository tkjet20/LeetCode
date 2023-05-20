class Solution {
    public boolean isAnagram(String s, String t) {
        //if string lengths are not equal, they return false
        // add s to hashmap
        // iterate through t and decrease the count for each character. If the character count is ever 0 before          /       // decrementing or the key doesn't exist, return false
        //otherwise return true

        if(s.length() != t.length()){
            return false;
        }

        char[] sArr = s.toCharArray();
        HashMap<Character, Integer> hashmap = new HashMap<>();

        for(char c: sArr){
            int count = 0;
            if(hashmap.containsKey(c)){
                 count = hashmap.get(c);
            }           
            hashmap.put(c, ++count);
        }

        char[] tArr = t.toCharArray();

        for(char c: tArr){
            if(!hashmap.containsKey(c) || hashmap.get(c) == 0){
                return false;
            }
            Integer countVal = hashmap.get(c);
            hashmap.put(c, --countVal);
        }
        
        return true;
    }
}