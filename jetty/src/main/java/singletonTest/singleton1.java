package singletonTest;

/**
 * User:ZhaCongJie@HF
 * Date:2016/7/4/004.
 * Time:18:49
 */
public class Singleton1 {
    private static Singleton1 singleton1 = null;

    private Singleton1() {

    }

    static public Singleton1 instance() {
        if (null == singleton1) {
            singleton1 = new Singleton1();
        }

        return singleton1;
    }
}
