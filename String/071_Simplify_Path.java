class Solution {
    public String simplifyPath(String path) {
        Stack<String> stk = new Stack<>();
        String[] dirArr = path.split("/");
        String ans = "";
        for (String dir : dirArr) {
            if (dir.equals("") || dir.equals(".")) {
                continue;
            } else if (dir.equals("..")) {
                if (!stk.isEmpty()) stk.pop();
            } else {
                stk.push(dir);
            }
        }

        while(!stk.isEmpty()) {
            ans = "/" + stk.pop() + ans;
        }
        return ans.equals("") ? "/" : ans;
    }
}