package a_daily_topic;

// 两个数组的交集 II

import java.sql.Array;
import java.util.Arrays;

public class No_0350 {
    public static void main(String[] args){
        int[] nums1 = new int[]{1,2,2,1};
        int[] nums2 = new int[]{2,2};
        intersect(nums1,nums2);
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int len = Math.min(nums1.length, nums2.length);
        int[] ans = new int[len];
        int start = 0, i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                ans[start] = nums1[i];
                start++;
                i++;
                j++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                i++;
            }
        }
        return Arrays.copyOfRange(ans, 0, start);
    }
}
