package a_daily_topic;

import java.util.*;

// 至少在两个数组中出现的值

public class No_2032 {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Arrays.sort(nums3);
        List<Integer> res = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        int m = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (m != nums1[i]){
                m = nums1[i];
                map.put(m,1);
            }
        }
        m = 0;
        for (int i = 0; i < nums2.length; i++) {
            if (m != nums2[i]){
                m = nums2[i];
                map.put(m,map.getOrDefault(m,0) + 1);
            }
        }
        m = 0;
        for (int i = 0; i < nums3.length; i++) {
            if (m != nums3[i]){
                m = nums3[i];
                map.put(m,map.getOrDefault(m,0) + 1);
            }
        }
        for (int key : map.keySet()){
            if (map.get(key) > 1){
                res.add(key);
            }
        }
        return res;
    }
}
