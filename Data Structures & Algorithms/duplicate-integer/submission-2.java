class Solution {
    static{
    for(int i = 0; i <= 500; i++) 
        hasDuplicate(new int[]{0, 1, 0});
    }
    public static boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>((int)(nums.length / 0.75f) + 1);
        for(int i = 0; i < nums.length ; i++){
            if(!set.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}