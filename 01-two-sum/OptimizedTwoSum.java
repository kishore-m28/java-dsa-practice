// Optimized approach using HashMap — O(n) time, O(n) space

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            Integer value = map.get(target - nums[i]);
            if(value == null){
                map.put(nums[i], i);
            }else{
                arr[0]=value;
                arr[1] = i;
                break;
            }
        }
        return arr;
    }
}
