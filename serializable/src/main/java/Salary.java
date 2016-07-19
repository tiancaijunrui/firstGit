import java.io.Serializable;

/**
 * User:ZhaCongJie@HF
 * Date:2016/7/19/019.
 * Time:12:40
 */
public class Salary implements Serializable {
    private static final long serialVersionUID = -5402065593284392992L;

    private int basePay;
    private int bonus;

    public Salary(int basePay,int bonus){
        this.basePay = basePay;
        this.bonus = bonus;
    }

    public int getBasePay() {
        return basePay;
    }

    public void setBasePay(int basePay) {
        this.basePay = basePay;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
