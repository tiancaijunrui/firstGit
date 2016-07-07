package thread;

import java.util.Date;

/**
 * User:ZhaCongJie@HF
 * Date:2016/7/6/006.
 * Time:20:11
 */
public class test2 implements Runnable {
    private int p1;
    private String p2;

    public test2(int p1, String p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void run() {
        while (true) {
            try {
                System.out.println(p2 + " : " + new Date(System.currentTimeMillis()));
                Thread.sleep(p1);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new test2(1000,"p1"));
        Thread t2 = new Thread(new test2(5000,"p2"));
        t1.start();
        t2.start();
    }
}
