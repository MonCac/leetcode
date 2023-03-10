public class binary_search_example {
    /**
     * 二分查找万能模板。 arr 是单调不减数组。
     * 如果返回值等于 arr.length，代表 arr 中不存在 满足 arr[i] >= x 的 i，也就是所有元素都小于 x。
     * 否则返回满足 arr[i] >= x 的最小 i（最左 i）。也就是说，如果有多个连续的 x，会返回最靠左的那个的下标。
     * @param arr 单调不减数组
     * @param x 边界值
     * @return
     */
    public int binarySearch(int [] arr, int x) {
        int l = 0, r =  arr.length - 1;
        // 二分查找的左右初始边界
        while(l <= r){
            // 注意这里不是 l < r
            int m = l + (r - l)/2;
            if(arr[m] >= x) {
                r = --m;
            }
            else {
                l = ++m;
            }
        }
        return l;
        // 此时，l 代表arr[i] >= x 的最大 i。
        // 如果要知道这个数字存不存在，需要返回boolean，进行arr[l]与x的判断即可
    }
}
