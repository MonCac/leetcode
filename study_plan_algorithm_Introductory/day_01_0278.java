package study_plan_algorithm_Introductory;

// 第一个错误的版本

/* The isBadVersion API is defined in the parent class VersionControl.
 *     boolean isBadVersion(int version);
 */
public class day_01_0278{
    public int firstBadVersion(int n) {
        int left = 1, right = n;
        while (left < right){
            int mid = (left + right) / 2;
            if (isBadVersion(mid)){
                right = mid;
            }
            else{
                left = mid + 1;
            }
        }
        return left;
    }
    public boolean isBadVersion(int version){
        return false;
    }
}
