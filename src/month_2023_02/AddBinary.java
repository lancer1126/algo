package month_2023_02;

/**
 * 给你两个二进制字符串 a 和 b ，以二进制字符串的形式返回它们的和。
 * 示例 1：
 * 输入:a = "11", b = "1"
 * 输出："100"
 * <p>
 * 示例 2：
 * 输入：a = "1010", b = "1011"
 * 输出："10101"
 */
public class AddBinary {

    public String addBinary(String a, String b) {
        int aLen = a.length() -1;
        int bLen = b.length() -1;
        int carry = 0;

        StringBuilder sb = new StringBuilder();
        while (aLen >= 0 && bLen >= 0) {
            int sum = carry;
            sum += a.charAt(aLen--) - '0';
            sum += b.charAt(bLen--) - '0';
            carry = sum /2;
            sb.append(sum %2);
        }

        while (aLen >= 0) {
            int sum = carry + a.charAt(aLen--) - '0';
            carry = sum /2;
            sb.append(sum %2);
        }

        while (bLen >= 0) {
            int sum = carry + b.charAt(bLen--) - '0';
            carry = sum/2;
            sb.append(sum%2);
        }

        if (carry == 1) {
            sb.append(carry);
        }

        return sb.reverse().toString();
    }
}
