package singletonTest;

/**
 * User:ZhaCongJie@HF
 * Date:2016/7/4/004.
 * Time:18:56
 */
public class Singleton3 {
    private static Singleton3 singleton3 = null;

    private Singleton3() {
    }

    public static Singleton3 instance() {
        if (null == singleton3) {
            synchronized (Singleton3.class) {
                if (null == singleton3) {
                    singleton3 = new Singleton3();
                }
            }
        }
        return singleton3;
    }
}
