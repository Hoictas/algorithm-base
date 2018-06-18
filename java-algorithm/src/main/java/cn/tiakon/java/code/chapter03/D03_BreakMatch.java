package cn.tiakon.java.code.chapter03;

/**
 * Desc : 括号匹配检验
 * User : By Tiakon
 * Time : 2018/6/17 21:44
 */

public class D03_BreakMatch {

    private String input;

    public D03_BreakMatch(String input) {
        this.input = input;
    }

    public void check() {
        int maxSize = input.length();
        D02_StackArrayChar stack = new D02_StackArrayChar(maxSize);

        //  {a[(b)c]d}
        for (int i = 0; i < maxSize; i++) {
            char cha = input.charAt(i);
            switch (cha) {
                case '{':
                case '(':
                case '[':
                    stack.push(cha);//放入栈中
                    break;
                case '}':
                case ')':
                case ']':
                    if (!stack.isEmpty()) {
                        char chx = stack.pop();
                        if (cha == '}' && chx != '{' || cha == ')' && chx != '(' || cha == ']' && chx != '[') {
                            System.out.println("ERROR:" + cha + " at " + i);
                        }

                    } else {
                        System.out.println("ERROR:" + cha + " at " + i);
                    }
                    break;
                default:
                    break;
            }
        }
        if (!stack.isEmpty()) {
            System.out.println("ERROR:missing right delimiter.");
        }
    }
}
