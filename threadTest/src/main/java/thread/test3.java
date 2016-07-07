package thread;

/**
 * User:ZhaCongJie@HF
 * Date:2016/7/7/007.
 * Time:12:36
 */
// 对一个银行中的多项活动进行同步处理
public class test3 {
    String holderName;
    float amout;

    public test3(String holderName, float amt) {
        this.holderName = holderName;
        this.amout = amt;
    }

    public synchronized void deposit(float amt) {
        amout += amt;
    }

    public synchronized void withdraw(float amt) {
        amout -= amt;
    }

    public float checkBalance() {
        return amout;
    }
}
