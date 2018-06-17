package cn.tiakon.java.code.chapter03;

/**
 * Desc : 实现字符串反转的工具类
 * User : By Tiakon
 * Time : 2018/6/17 19:02
 */
public class D02_StringReverse {
    private String input;
    private String output;


    public D02_StringReverse(String input) {
        this.input = input;
    }

    public String doReverse() {
        int maxSize = input.length();

        D02_StackArrayChar stackArrayChar = new D02_StackArrayChar(maxSize);

//        char[] chars = input.toCharArray();
        for (int i = 0; i < maxSize; i++) {
            char c = input.charAt(i);
//            stackArrayChar.push(chars[i]);
            stackArrayChar.push(c);
        }

        output = "";
        while (!stackArrayChar.isEmpty()) {
            char c = stackArrayChar.pop();
            output += c;
        }

        return output;
    }

}
