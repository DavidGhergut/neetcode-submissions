class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap();
        Queue<int[]> q = new PriorityQueue<>((x, y) -> Integer.compare(x[1], y[1]));

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (var pair : map.entrySet()) {
            q.add(new int[]{pair.getKey(), pair.getValue()});
            if (q.size() > k) {
                q.poll();
            }
        }

        return q.stream().map(el -> el[0]).mapToInt(Integer::intValue).toArray();
    }
}
