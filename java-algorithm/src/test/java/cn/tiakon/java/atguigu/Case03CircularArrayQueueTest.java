package cn.tiakon.java.atguigu;


import java.util.Scanner;

/**
 * project : algorithm-base
 * package : cn.tiakon.scala.atguigu
 * email : tiankai.me@gmail.com
 *
 * @author Created by Tiakon on 2019/6/7 16:25.
 */
public class Case03CircularArrayQueueTest {

    public static void main(String[] args) {
        Case03CircularArrayQueue arrayQueue = new Case03CircularArrayQueue(5);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("数组模拟环形队列 - 操作:");
            System.out.println(" (s)显示环形队列");
            System.out.println(" (p)显示首尾指针");
            System.out.println(" (h)显示队列头");
            System.out.println(" (l)队列长度");
            System.out.println(" (i)入队列");
            System.out.println(" (g)出队列");
            System.out.println(" (q)退出");
            System.out.println(">> 请输入指令...");

            String input = scanner.nextLine();

            try {
                switch (input) {
                    case "s":
                        arrayQueue.showCircularQueue();
                        break;
                    case "p":
                        arrayQueue.showPointer();
                        break;
                    case "i":
                        System.out.println(">> 请输入一个数...");
                        int nextInt = new Scanner(System.in).nextInt();
                        arrayQueue.insertQueue(nextInt);
                        break;
                    case "l":
                        System.out.printf(">> 队列长度：%d\r\n", arrayQueue.length);
                        break;
                    case "h":
                        arrayQueue.headQueue();
                        break;
                    case "g":
                        System.out.println(arrayQueue.outQueue());
                        break;
                    case "q":
                        System.out.println("ヾ(￣▽￣)Bye~Bye~");
                        System.exit(1);
                    default:
                        System.out.println(">> 未知指令，请重新输入...");
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println();
        }
    }
}

