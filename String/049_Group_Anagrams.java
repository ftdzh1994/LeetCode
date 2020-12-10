class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // for each string sort it, and using hashmap to store anagrams
        List<List<String>> ans = new ArrayList<List<String>>();
        // Map<String, List> ans = new HashMap<String, List>();
        HashMap<String, List<String>> anagrams = new HashMap<>();
        for (String str : strs) {
            String sortedStr = sortString(str);
            List<String> newList = anagrams.getOrDefault(sortedStr, new ArrayList<String>());
            newList.add(str);
            anagrams.put(sortedStr, newList);
        }
        // return new ArrayList(ans.values());
        for(List<String> list : anagrams.values()) {
            ans.add(list);
        }
        return ans;

    }
    public String sortString (String s) {
        char tempArray[] = s.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    } 
}

//Approach 2: Unique encode for each combination 