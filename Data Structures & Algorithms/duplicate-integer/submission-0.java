class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        int value = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int h = 0; h < value; h++) {
                if (value = nums[i]) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return;



    }
}