package leetbooks.intermediate_algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 三数之和
public class No_01_001 {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length < 3){
            return new ArrayList<>();
        }
        //暴力破解需要O(n^3)，然后我们看到要去重，可以用排序的方法避免重复
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < nums.length;i++) {
            // 因为排过序了，所以num[i]>0后面肯定不符合要求了
            if(nums[i] > 0 ){
                break;
            }
            // 重复的就不要走了
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            //采用双指针头尾各一个，往中间走
            int left = i + 1;
            int right = nums.length - 1;
            while(left < right){
                if(nums[i] + nums[left] + nums[right] > 0){
                    right--;
                }else if(nums[i] + nums[left] + nums[right] < 0){
                    left++;
                }else {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    result.add(list);
                    //要继续走下去，可能还有
                    right--;
                    left++;
                    // 重复的不要走了
                    while(left < right && nums[left] == nums[left-1]){
                        left++;
                    }
                    while(left < right && nums[right+1] == nums[right]){
                        right--;
                    }

                }
            }
        }
        return  result;
    }
}
