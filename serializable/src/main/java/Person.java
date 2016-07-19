import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * User:ZhaCongJie@HF
 * Date:2016/7/19/019.
 * Time:12:42
 */
public class Person implements Serializable {
    private static final long serialVersionUID = 7592930394427200495L;

    private String name;
    private Salary salary;

    public Person(String name, Salary salary) {
        this.name = name;
        this.salary = salary;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    private void writeObject(ObjectOutputStream out) throws Exception {
        out.defaultWriteObject();
        out.writeInt(salary.getBasePay());
    }

    private void readObject(ObjectInputStream in) throws Exception {
        in.defaultReadObject();
        salary = new Salary(in.readInt(), 0);
    }
}
