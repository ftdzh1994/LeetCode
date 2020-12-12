import java.util.*

class Solution {
    HashMap<String, List<String>> map = new HashMap<>();
    public List<List<String>> groupStrings(String[] strings) {
        List<List<String>> ans;
        for (String s : strings) {
            String p = getPattern(s);
            List<String> group = map.getOrDefault(p, new ArrayList<String>());
            group.add(s);
            map.put(p, group);
        }
        ans = new ArrayList<>(map.values());
        return ans;
    }

    public String getPattern(String s) {
        if (s.length() == 1) {
            return "#-1";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < s.length(); i++) {
            int dif = (s.charAt(i) - s.charAt(i - 1) + 26) % 26;
            sb.append("#");
            sb.append(dif);
        }
        return sb.toString();
    }
}