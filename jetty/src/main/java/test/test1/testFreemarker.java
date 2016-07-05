package test.test1;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import tools.LabelDirective;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * User:ZhaCongJie@HF
 * Date:2016/7/5/005.
 * Time:13:08
 */
public class testFreemarker {
    public static void main(String[] args) throws IOException, TemplateException {
        Configuration cfg = new Configuration();
        //将写好的标签加入，起名叫label
        cfg.setSharedVariable("label", new LabelDirective());
        cfg.setDirectoryForTemplateLoading(new File("temp"));
        cfg.setObjectWrapper(new DefaultObjectWrapper());

        Template temp = cfg.getTemplate("tools/LabelDirective");

        Map root = new HashMap();
        root.put("user", "rzy");

                 /* Writer out = new OutputStreamWriter(System.out); */

        File htmlFile = new File("E:/a.html");
        Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(htmlFile), "UTF-8"));

        temp.process(root, out);
        out.flush();
    }
}
