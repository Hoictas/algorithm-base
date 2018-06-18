
package cn.tiakon.java.code.example.demo01;

/**
 * 迷宫通道类，一个Cell代表地图上的一个方块
 *
 * @author Gavin
 */
public class Cell {
    private int x; // 单元所在行
    private int y; // 单元所在列
    private char c; // 字符，通道对应'0'，墙对应'1'
    private boolean isVisited;// 是否访问过

    public Cell(int x, int y, char c, boolean isVisited) {
        super();
        this.x = x;
        this.y = y;
        this.c = c;
        this.isVisited = isVisited;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean isVisited) {
        this.isVisited = isVisited;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
