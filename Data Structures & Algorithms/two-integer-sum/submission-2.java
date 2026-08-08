class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> values = new HashMap<>();
        int difference;
        
        for (int i = 0; i < nums.length; i++) {
            difference = target - nums[i];

            if (values.containsKey(difference)) {
                return new int[]{values.get(difference), i};
            }
            values.put(nums[i], i);
        }
        return new int[] {};
    }
}
