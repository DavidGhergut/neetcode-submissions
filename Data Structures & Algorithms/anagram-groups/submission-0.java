class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList();
        Map<Map<Character, Integer>, List<String>> maps = new HashMap();

        for (String s : strs) {
            Map<Character, Integer> chars = new HashMap();

            for (char c : s.toCharArray()) {
                chars.put(c, chars.getOrDefault(c, 0) + 1);
            }

            List<String> sublist = maps.getOrDefault(chars, new ArrayList());
            sublist.add(s);
            if (sublist.size() == 1) {
                maps.put(chars, sublist);
                res.add(sublist);
            }

            // boolean newList = true;
            // for (int i = 0; i < res.size(); i++) {
            //     Map<Character, Integer> map = maps.get(i);
            //     List<String> sublist = res.get(i);

            //     boolean match = true;
            //     for (char c = 'a'; c <= 'z'; c++) {
            //         int count1 = chars.getOrDefault(c, 0);
            //         int count2 = map.getOrDefault(c, 0);

            //         if (count1 != count2) {
            //             match = false;
            //             break;
            //         }
            //     }

            //     if (match) {
            //         sublist.add(s);
            //         newList = false;
            //         break;
            //     }
            // }

            // if (newList) {
            //     res.add(new ArrayList(List.of(s)));
            //     maps.add(chars);
            // }
        }

        return res;
    }
}