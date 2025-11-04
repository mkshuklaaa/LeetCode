class Solution {

    private int find(Map<Integer, Integer> freqMap, int x) {
        // Max heap based on (frequency, number)
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> {
                if (b[0] == a[0]) return b[1] - a[1]; // same freq → higher number first
                return b[0] - a[0]; // higher freq first
            }
        );

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            pq.offer(new int[]{entry.getValue(), entry.getKey()});
        }

        int sum = 0;
        while (x-- > 0 && !pq.isEmpty()) {
            int[] top = pq.poll();
            sum += top[1] * top[0];
        }
        return sum;
    }

    public int[] findXSum(int[] nums, int k, int x) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        List<Integer> resultList = new ArrayList<>();
        int l = 0;

        for (int r = 0; r < nums.length; r++) {
            freqMap.put(nums[r], freqMap.getOrDefault(nums[r], 0) + 1);

            while (r - l + 1 > k) {
                freqMap.put(nums[l], freqMap.get(nums[l]) - 1);
                if (freqMap.get(nums[l]) == 0) freqMap.remove(nums[l]);
                l++;
            }

            if (r - l + 1 == k) {
                resultList.add(find(freqMap, x));
            }
        }

        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }
}
