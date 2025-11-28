package hot100.binarysearch;

import java.util.Map;

public class No_4 {
    public static void main(String[] args){
        findMedianSortedArrays(new int[]{1,2}, new int[]{3,4});
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length){
            return findMedianSortedArrays(nums2, nums1);
        }
        int left = 0, right = nums1.length ;
        int medianSum = (nums1.length + nums2.length + 1) / 2;
        while (left <= right){
            int mid = left + (right - left) / 2;
            int remainNum = medianSum - mid;
            if (mid > 0 && remainNum != nums2.length && nums1[mid - 1] > nums2[remainNum]){
                right = mid - 1;
            }else if (remainNum > 0 && mid != nums1.length && nums2[remainNum - 1] > nums1[mid]) {
                left = mid + 1;
            }else{
                int maxLeft = 0;
                if (mid == 0){
                    maxLeft = nums2[medianSum - 1];
                }
                else if (remainNum == 0){
                    maxLeft = nums1[mid - 1];
                }
                else{
                    maxLeft = Math.max(nums2[remainNum - 1], nums1[mid - 1]);
                }
                if ((nums1.length + nums2.length) % 2 == 1){
                    return maxLeft;
                }
                int minRight = 0;
                if (mid == nums1.length) { minRight = nums2[remainNum]; }
                else if (remainNum == nums2.length) { minRight = nums1[mid]; }
                else { minRight = Math.min(nums1[mid], nums2[remainNum]); }
                return (maxLeft + minRight) / 2.0; //如果是偶数的话返回结果
            }
        }
        return 0.0;
    }

}
