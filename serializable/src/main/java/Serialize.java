
import org.apache.commons.lang3.SerializationUtils;

import java.io.Serializable;

/**
 * User:ZhaCongJie@HF
 * Date:2016/7/19/019.
 * Time:12:30
 */
public class Serialize implements Serializable {

    private static final long serialVersionUID = -2083116318430150669L;

    public static void main(String[] args) {
        Salary salary = new Salary(1000,25000);
        Person person = new Person("查从杰",salary);
        SerializationUtils.serialize(person);
    }
}
