class Solution {

    public String encode(List<String> strs) {
        if (strs == null) return null;
        if (strs.size() == 0) return "";

        StringBuilder res = new StringBuilder();
        for (String s : strs) {
            res.append(s).append("é");
        }

        return res.toString();
    }

    public List<String> decode(String str) {
        if (str == null) return null;
        List<String> res = new ArrayList();
        if (str == "") return res;
        String crt = "";
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'é') {
                res.add(crt);
                crt = "";
            } else {
                crt += chars[i];
            }
        }

        return res;
    }
}
