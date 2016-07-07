package thread;

import java.util.Date;

/**
 * User:ZhaCongJie@HF
 * Date:2016/7/6/006.
 * Time:19:58
 */
public class test1 extends Thread {
    private int p1;
    private String p2;

    public test1(int p1, String p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
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
        test1 t1 = new test1(1000, "p1");
        t1.start();
//        t1.run();
        test1 t2 = new test1(5000, "p2");
//        t2.run();
        t2.start();
    }
}
