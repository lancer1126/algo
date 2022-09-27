package week_2022_9_26;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定两个字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。
 * 示例 1：
 * 输入: s1 = "abc", s2 = "bca"
 * 输出: true
 * 示例 2：
 * 输入: s1 = "abc", s2 = "bad"
 * 输出: false
 */
public class CheckPermutation {

    public boolean checkPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        Map<Character, Integer> cntMap = new HashMap<>();
        for (char c :  s1.toCharArray()) {
            Integer cnt = cntMap.get(c);
            if (cnt == null) {
                cnt = 0;
            }
            cntMap.put(c, ++cnt);
        }

        for (char c2 : s2.toCharArray()) {
            Integer cnt = cntMap.get(c2);
            if (cnt == null) return false;
            cntMap.put(c2, --cnt);
        }

        return cntMap.values().stream().allMatch(e -> e == 0);
    }
}
