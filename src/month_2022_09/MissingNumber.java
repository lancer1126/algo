package month_2022_09;

import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个包含 [0, n] 中 n 个数的数组 nums ，找出 [0, n] 这个范围内没有出现在数组中的那个数。
 * 示例 1：
 * 输入：nums = [3,0,1]
 * 输出：2
 * 解释：n = 3，因为有 3 个数字，所以所有的数字都在范围 [0,3] 内。2 是丢失的数字，因为它没有出现在 nums 中。
 * 示例 2：
 * 输入：nums = [0,1]
 * 输出：2
 * 解释：n = 2，因为有 2 个数字，所以所有的数字都在范围 [0,2] 内。2 是丢失的数字，因为它没有出现在 nums 中。
 */
public class MissingNumber {

    public int missingNumber(int[] nums) {
        Set<Integer> list = new HashSet<>();
        for (int n : nums) {
            list.add(n);
        }

        int missingNum = -1;
        for (int i = 0; i <= nums.length; i++) {
            if (!list.contains(i)) {
                missingNum = i;
                break;
            }
        }
        return missingNum;
    }
}
