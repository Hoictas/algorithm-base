package cn.tiakon.java.leetcode.simple;

/**
 * 【 #07 难易程度：简单 】
 * <p>
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * <p>
 * 示例 1
 * 输入: 123
 * 输出: 321
 * <p>
 * 示例 2
 * 输入: -123
 * 输出: -321
 * <p>
 * 示例 3
 * 输入: 120
 * 输出: 21
 * 注意:
 * <p>
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−2^31,  2^31 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 * <p>
 * project : algorithm-base
 * package : cn.tiakon.java.leetcode.simple
 * email : tiankai.me@gmail.com
 *
 * @author Created by Tiakon on 2019/2/14 22:07.
 */
public class LC07IntReverse {

    // −2^31      = -2147483648
    //  2^31 − 1  =  2147483647
    public static int intReverse(int n){
        String intStr = String.valueOf(n);
        char[] chars = intStr.toCharArray();
        char[] newChars = new char[chars.length];
        for (int i = chars.length-1; i > 0; i--) {
            for (int j = 0; j < newChars.length; j++) {
                newChars[j]=chars[i];
            }
        }
        System.out.println(newChars.toString());

        return 0;
    }

    public static void main(String[] args) {
        int result = intReverse(125);
        System.out.println(result);
    }

}
