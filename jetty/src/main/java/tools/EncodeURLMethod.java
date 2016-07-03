package tools;

import freemarker.template.TemplateMethodModelEx;
import freemarker.template.TemplateModelException;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * User:ZhaCongJie@HF
 * Date:2016/7/4/004.
 * Time:0:14
 */
public class EncodeURLMethod implements TemplateMethodModelEx {
    public Object exec(List list) throws TemplateModelException {
        if (list.size() != 1) {
            throw new TemplateModelException("wrong arguments");
        }

        return response.encodeURL((String) list.get(0));
    }

    private HttpServletResponse response;

    public EncodeURLMethod(HttpServletResponse response) {
        this.response = response;
    }

}
