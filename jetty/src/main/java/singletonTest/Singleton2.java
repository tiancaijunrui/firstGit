package singletonTest;

/**
 * User:ZhaCongJie@HF
 * Date:2016/7/4/004.
 * Time:18:56
 */
public class Singleton2 {
    private static Singleton2 singleton2 = null;

    private Singleton2() {
    }

    static public synchronized Singleton2 instance() {
        if (null == singleton2) {
            singleton2 = new Singleton2();
        }
        return singleton2;
    }
}
