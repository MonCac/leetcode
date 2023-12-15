package a_daily_topic;

// 最大和查询
import java.util.Arrays;
import java.util.Comparator;

public class No_2736 {

    public static void main(String[] args){
        int[] nums1 = new int[]{4,3,1,2};
        int[] nums2 = new int[]{2,4,9,5};
        int[][] queries = new int[][]{{4, 1}, {1, 3}, {2, 5}};
        int[] nums3 = maximumSumQueries(nums1, nums2, queries);
    }

    // 通过对传入的nums1和nums2进行求和，然后对第三行值也就是求和的值进行从大到小排序，在排序过程中nums1、nums2对应的值也跟着移动。然后就写一个for循环遍历queries并进行判断统计结果即可。
    public static int[] maximumSumQueries(int[] nums1, int[] nums2, int[][] queries) {

        return null;
    }
}
