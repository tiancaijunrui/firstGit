package test.test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * User:ZhaCongJie@HF
 * Date:2016/7/4/004.
 * Time:12:32
 */
public class test {
    public static void main(String[] args) {
        System.out.println("5" + 2);//52
        int[] a = new int[10];
        System.out.println(a[5]); //0
        String[] strings = new String[10];
        System.out.println(strings[5]);//null

        //  判断两个list是否相等
        List<String> list1 = new ArrayList<String>();
        list1.add("2");
        list1.add("1");
        list1.add("1");
        List<String> list2 = new ArrayList<String>();
        list2.add("1");
        list2.add("2");
        System.out.println(list1.equals(list2));

        // Arrays.asList();返回的List 是否可以做更新（添加或删除）？为什么？
        // 这个ArraysList类并非是java.util.ArrayList类，而是Array类的静态内部类，源码中的a是final修饰，所以说这个静态内部类不能
        // 做任何的添加和删除操作和String一样
        String[] strs = new String[]{"1", "2", "3"};
        list1 = Arrays.asList(strs);
        System.out.println(list1.size());
        System.out.println(list1.toString());
        // 若要做添加和删除操作，这可以使用下面的方法
        list1 = new ArrayList<String>(Arrays.asList(strs));
        list1.add("4");
        System.out.println(list1.toString());

    }

}
