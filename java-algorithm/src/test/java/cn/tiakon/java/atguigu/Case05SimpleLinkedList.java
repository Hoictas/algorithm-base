package cn.tiakon.java.atguigu;

import java.util.Scanner;

/**
 * 单链表:以节点(值域与next)的方式进行存储，链式存储。
 * project : algorithm-base
 * package : cn.tiakon.java.atguigu
 * email : tiankai.me@gmail.com
 *
 * @author Created by Tiakon on 2019/6/10 22:13.
 */
public class Case05SimpleLinkedList {
    public static void main(String[] args) {
        /**
         * 1 宋江 及时雨
         * 2 卢俊 玉麒麟
         * 3 吴用 智多星
         * 4 公孙胜 入云龙
         * 5 关胜 大刀
         * 6 林冲 豹子头
         * 7 秦明 霹雳火
         * 8 呼延灼 双鞭
         * */
        HerosNode heroNode01 = new HerosNode(1, "宋江", "及时雨", null);
        HerosNode heroNode02 = new HerosNode(2, "卢俊义", "玉麒麟", null);
        HerosNode heroNode03 = new HerosNode(3, "吴用", "智多星", null);
        HerosNode heroNode04 = new HerosNode(4, "公孙胜", "入云龙", null);
        HerosNode heroNode05 = new HerosNode(5, "关胜", "大刀", null);
        HerosNode heroNode06 = new HerosNode(6, "林冲", "豹子头", null);
        HerosNode heroNode07 = new HerosNode(7, "秦明", "霹雳火", null);
        HerosNode heroNode08 = new HerosNode(8, "呼延灼", "双鞭", null);

        SimpleLinkedList linkedList = new SimpleLinkedList();

        System.out.println("单链表 - 操作:");
        System.out.println(">> 初始化,单链表已可用...");
        linkedList.appendNode(heroNode01);
        linkedList.appendNode(heroNode02);
        System.out.println("");


        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("单链表 - 操作:");
            System.out.println(" (s)遍历单链表");
            System.out.println(" (p)打印单链表");
            System.out.println(" (l)链表长度");
            System.out.println(" (a)追加结点");
            System.out.println(" (u)修改节点");
            System.out.println(" (d)删除节点");
            System.out.println(" (q)退出");
            System.out.println(">> 请输入指令...");

            String input = scanner.nextLine();

            try {
                switch (input) {
                    case "s":
                        linkedList.showLinkedList();
                        break;
                    case "p":
                        System.out.println(linkedList.getHeadNode().toString());
                        break;
                    case "l":
                        System.out.printf(">> 当前单链表长度为: %d \r\n", linkedList.length());
                        break;
                    case "a":
                        Scanner sc = new Scanner(System.in);
                        System.out.println(">> 请输入英雄排名...");
                        int num = sc.nextInt();
                        System.out.println(">> 请输入英雄姓名...");
                        String name = sc.next();
                        System.out.println(">> 请输入英雄诨名...");
                        String nickName = sc.next();
                        linkedList.appendNode(new HerosNode(num, name, nickName));
                        break;
                    case "u":
                        Scanner sc2 = new Scanner(System.in);
                        System.out.println(">> 更新几号节点？");
                        int updateNum = sc2.nextInt();
                        HerosNode updateNode = linkedList.findNodeByNum(updateNum);
                        if (updateNode == null) {
                            throw new RuntimeException(">> 更新节点不存在...");
                        }
                        System.out.println(">> 请输入英雄排名...");
                        int updatedNum = sc2.nextInt();
                        System.out.println(">> 请输入英雄姓名...");
                        String updatedName = sc2.next();
                        System.out.println(">> 请输入英雄诨名...");
                        String updatedNickName = sc2.next();
                        linkedList.updateNodeByNum(updateNode, new HerosNode(updatedNum, updatedName, updatedNickName));
                        break;
                    case "d":
                        Scanner sc3 = new Scanner(System.in);
                        System.out.println(">> 删除几号节点？");
                        linkedList.deleteNode(sc3.nextInt());
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

/**
 * 单链表节点：
 * 1.追加结点
 * 2.删除节点
 * 3.修改节点
 * 4.遍历节点
 * <p>
 * last time   : 2019/6/16 0:32
 * last update : tiankai.me@gmail.com
 * status : test success
 *
 * @author Created by Tiakon on 2019/6/16 0:32.
 */
class SimpleLinkedList {

    private HerosNode headNode;

    /**
     * 默认带头结点
     * last time   : 2019/6/16 0:40
     * last update : tiankai.me@gmail.com
     * status : test success
     *
     * @author Created by Tiakon on 2019/6/16 0:40.
     */
    public SimpleLinkedList() {
        headNode = new HerosNode(null);
    }

    public HerosNode getHeadNode() {
        return headNode;
    }

    public void setHeadNode(HerosNode headNode) {
        this.headNode = headNode;
    }

    /**
     * 将节点追加到单链表中
     * last time   : 2019/6/10 22:23
     * last update : tiankai.me@gmail.com
     * status : test success
     *
     * @author Created by Tiakon on 2019/6/10 22:23.
     */
    public void appendNode(HerosNode appendNode) {
        HerosNode tempNode = headNode;
        while (tempNode.getNextNode() != null) {
            tempNode = tempNode.getNextNode();
        }
        tempNode.setNextNode(appendNode);
        System.out.println(">> 添加结点成功...");
    }

    /**
     * 通过 num 删除链表节点
     * last time   : 2019/6/11 0:28
     * last update : tiankai.me@gmail.com
     * status : test success
     *
     * @author Created by Tiakon on 2019/6/11 0:28.
     */
    public void deleteNode(int num) {
        //  检查要删除节点是否存在
        HerosNode deletedNode = this.findNodeByNum(num);
        if (deletedNode == null) {
            throw new RuntimeException(">> 要删除的节点不存在...");
        }
        //  先取出前一个节点
        HerosNode preNode = this.findPreNodeByNum(num);
        //  判断要删除节点是否为最后一个节点
        if (deletedNode.getNextNode() != null) {
            HerosNode nextNode = this.findNextNodeByNum(num);
            preNode.setNextNode(nextNode);
        } else {
            preNode.setNextNode(null);
        }
        System.out.println("节点已删除");
    }


    /**
     * 通过 num 查找单链表节点
     * last time   : 2019/6/11 0:14
     * last update : tiankai.me@gmail.com
     * status : test success
     *
     * @author Created by Tiakon on 2019/6/11 0:14.
     */
    public HerosNode findNodeByNum(int num) {
        HerosNode nextNode = headNode.getNextNode();
        while (nextNode != null) {
            if (nextNode.getNumber() == num) {
                break;
            }
            nextNode = nextNode.getNextNode();
        }
        return nextNode;
    }

    /**
     * 通过 num 查找它的前一个节点
     * last time   : 2019/6/11 10:21
     * last update : tiankai.me@gmail.com
     * status : test success
     *
     * @author Created by Tiakon on 2019/6/11 10:21.
     */
    public HerosNode findPreNodeByNum(int num) {
        HerosNode preNode = this.headNode;
        HerosNode nextNode = preNode.getNextNode();
        while (nextNode != null) {
            if (nextNode.getNumber() == num) {
                break;
            }
            //记录上一个节点
            preNode = nextNode;
            nextNode = preNode.getNextNode();
        }
        return preNode;
    }


    /**
     * 通过 num 查找它的下一个节点
     * last time   : 2019/6/11 10:21
     * last update : tiankai.me@gmail.com
     * status : test success
     *
     * @author Created by Tiakon on 2019/6/11 10:21.
     */
    public HerosNode findNextNodeByNum(int num) {
        HerosNode nextNode = this.headNode.getNextNode();
        while (nextNode != null) {
            if (nextNode.getNumber() == num) {
                if (nextNode.getNextNode() != null) {
                    return nextNode.getNextNode();
                } else {
                    throw new RuntimeException(">> 要求输入节点一定有next节点...");
                }
            }
            nextNode = nextNode.getNextNode();
        }
        throw new RuntimeException(">> 要求输入节点一定存在，且有子节点...");
    }


    /**
     * 通过 num 更新单链表节点
     * last time   : 2019/6/11 0:49
     * last update : tiankai.me@gmail.com
     * status : test success
     *
     * @author Created by Tiakon on 2019/6/11 0:49.
     */
    public void updateNodeByNum(HerosNode updateNode, HerosNode newNode) {
        updateNode.setNumber(newNode.getNumber());
        updateNode.setName(newNode.getName());
        updateNode.setNickName(newNode.getNickName());
    }


    /**
     * 遍历单链表
     * last time   : 2019/6/11 1:13
     * last update : tiankai.me@gmail.com
     * status : test success | test failied | no test
     *
     * @author Created by Tiakon on 2019/6/11 1:13.
     */
    public void showLinkedList() {
        HerosNode tempNode = headNode.getNextNode();
        while (tempNode != null) {
            System.out.printf(">> %d\t%s\t%s\r\n", tempNode.getNumber(), tempNode.getName(), tempNode.getNickName());
            tempNode = tempNode.getNextNode();
        }
        System.out.println(">> 单链表为空或已结束...");
    }

    /**
     * 获取链表长度
     * last time   : 2019/6/16 1:13
     * last update : tiankai.me@gmail.com
     * status : test success
     *
     * @author Created by Tiakon on 2019/6/16 1:13.
     */
    public int length() {
        int total = 0;
        HerosNode tempNode = headNode.getNextNode();
        while (tempNode != null) {
            total += 1;
            tempNode = tempNode.getNextNode();
        }
        return total;
    }

//    public HeroNode getHeadNode() {
//        return headNode;
//    }
//
//    public void setHeadNode(HeroNode headNode) {
//        this.headNode = headNode;
//    }
}


class HerosNode {
    private int number;
    private String name;
    private String nickName;
    private HerosNode nextNode;

    HerosNode() {
    }

    public HerosNode(HerosNode nextNode) {
        this.nextNode = nextNode;
    }

    HerosNode(int number, String name, String nickName) {
        this.number = number;
        this.name = name;
        this.nickName = nickName;
    }

    HerosNode(int number, String name, String nickName, HerosNode nextNode) {
        this.number = number;
        this.name = name;
        this.nickName = nickName;
        this.nextNode = nextNode;
    }

    /**
     * 将节点追加到单链表中
     * last time   : 2019/6/10 22:23
     * last update : tiankai.me@gmail.com
     * status : test success | test failied | no test
     *
     * @author Created by Tiakon on 2019/6/10 22:23.
     */
    public static void appendNode2LinkedList(HeroNode currentNode, HeroNode appendNode) {
        if (currentNode.getNextNode() != null) {
            // 递归
            HeroNode.appendNode2LinkedList(currentNode.getNextNode(), appendNode);
        } else {
            currentNode.setNextNode(appendNode);
        }
    }

    /**
     * 通过 num 删除链表节点
     * last time   : 2019/6/11 0:28
     * last update : tiankai.me@gmail.com
     * status : test success | test failied | no test
     *
     * @author Created by Tiakon on 2019/6/11 0:28.
     */
    public static void deleteNode(HeroNode headNode, int num) {
        //  检查要删除节点是否存在
        HeroNode deletedNode = HeroNode.findNodeByNum(headNode, num);
        if (deletedNode == null) {
            throw new RuntimeException(">> 要删除的节点不存在...");
        }
        //  先取出前一个节点
        HeroNode preNode = HeroNode.findPreNodeByNum(headNode, num);
        //  判断要删除节点是否为最后一个节点
        if (deletedNode.getNextNode() != null) {
            // deletedNode.setNextNode(null);
            HeroNode nextNode = HeroNode.findNextNodeByNum(headNode, num);
            preNode.setNextNode(nextNode);
        } else {
            preNode.setNextNode(null);
        }
        System.out.println("节点已删除");
    }

    /**
     * 通过 num 查找单链表节点
     * last time   : 2019/6/11 0:14
     * last update : tiankai.me@gmail.com
     * status : test success | test failied | no test
     *
     * @author Created by Tiakon on 2019/6/11 0:14.
     */
    public static HeroNode findNodeByNum(HeroNode headNode, int num) {
        HeroNode nextNode = headNode.nextNode;
        while (nextNode != null) {
            if (nextNode.number == num) {
                break;
            }
            nextNode = nextNode.getNextNode();
        }
        return nextNode;
    }

    /**
     * 通过 num 查找它的前一个节点
     * last time   : 2019/6/11 10:21
     * last update : tiankai.me@gmail.com
     * status : test success | test failied | no test
     *
     * @author Created by Tiakon on 2019/6/11 10:21.
     */
    public static HeroNode findPreNodeByNum(HeroNode headNode, int num) {
        HeroNode preNode = headNode;
        HeroNode nextNode = headNode.nextNode;
        while (nextNode != null) {
            if (nextNode.number == num) {
                break;
            }
            preNode = nextNode;
            nextNode = preNode.getNextNode();
        }
        return preNode;
    }

    /**
     * 通过 num 查找它的下一个节点
     * last time   : 2019/6/11 10:21
     * last update : tiankai.me@gmail.com
     * status : test success | test failied | no test
     *
     * @author Created by Tiakon on 2019/6/11 10:21.
     */
    public static HeroNode findNextNodeByNum(HeroNode headNode, int num) {
        HeroNode nextNode = headNode.nextNode;
        while (nextNode != null) {
            if (nextNode.number == num) {
                if (nextNode.getNextNode() != null) {
                    return nextNode.getNextNode();
                } else {
                    throw new RuntimeException(">> 要求输入节点一定有next节点...");
                }
            }
            nextNode = nextNode.getNextNode();
        }
        throw new RuntimeException(">> 要求输入节点一定存在，且有子节点...");
    }

    /**
     * 通过 num 更新单链表节点
     * last time   : 2019/6/11 0:49
     * last update : tiankai.me@gmail.com
     * status : test success | test failied | no test
     *
     * @author Created by Tiakon on 2019/6/11 0:49.
     */
    public static void updateNodeByNum(HeroNode updateNode, HeroNode newNode) {
        updateNode.number = newNode.number;
        updateNode.name = newNode.name;
        updateNode.nickName = newNode.nickName;
    }

    /**
     * 遍历单链表
     * last time   : 2019/6/11 1:13
     * last update : tiankai.me@gmail.com
     * status : test success | test failied | no test
     *
     * @author Created by Tiakon on 2019/6/11 1:13.
     */
    public static void showLinkedList(HeroNode heroNode) {
        System.out.printf(">> %d\t%s\t%s\r\n", heroNode.number, heroNode.name, heroNode.nickName);
        if (heroNode.nextNode != null) {
            HeroNode.showLinkedList(heroNode.nextNode);
        } else {
            System.out.println(">> 单链表为空或已结束...");
        }
    }

    public int length() {
        int total = 0;
        HerosNode tempNode = this.nextNode;
        while (tempNode != null) {
            total += 1;
            tempNode = tempNode.getNextNode();
        }
        return total;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setNextNode(HerosNode nextNode) {
        this.nextNode = nextNode;
    }

    public HerosNode getNextNode() {
        return nextNode;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                ", nextNode=" + nextNode +
                '}';
    }
}
