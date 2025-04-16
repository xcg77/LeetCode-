import java.util.HashMap;  

class Solution {  
    public int[] twoSum(int[] nums, int target) {  
        // 创建一个哈希表用于存储数字及其索引  
        HashMap<Integer, Integer> numMap = new HashMap<>();  
        
        // 遍历数组  
        for (int i = 0; i < nums.length; i++) {  
            // 计算补数  
            int complement = target - nums[i];  
            
            // 检查补数是否在哈希表中  
            if (numMap.containsKey(complement)) {  
                // 如果存在，返回补数和当前数字的索引  
                return new int[] { numMap.get(complement), i };  
            }  
            // 将当前数字及其索引存入哈希表  
            numMap.put(nums[i], i);  
        }  
        
        // 根据题目假设，这种情况不会发生  
        return new int[] {};  
    }  
}  