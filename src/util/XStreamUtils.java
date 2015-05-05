package util;

import java.io.Writer;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.json.JsonHierarchicalStreamDriver;
import com.thoughtworks.xstream.io.json.JsonWriter;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class XStreamUtils {

	public static String toXMl(Object o) {
        XStream xStream = new XStream();
        xStream.processAnnotations(o.getClass());
        return xStream.toXML(o);
    }

	@SuppressWarnings("unchecked")
	public static <T> T toBean(String xml, Class<T> cls) {
        XStream xStream = new XStream(new DomDriver());
        xStream.processAnnotations(cls);
		T t = (T) xStream.fromXML(xml);
        return t;
    }

	public static String toJSON(Object o) {
		XStream xstream = new XStream(new JsonHierarchicalStreamDriver() {
			// 对象转JSON删除根节点
			public HierarchicalStreamWriter createWriter(Writer out) {
				return new JsonWriter(out, JsonWriter.DROP_ROOT_MODE);
			}
		});
		xstream.aliasSystemAttribute(null, "class"); // 去掉 class 属性
		return xstream.toXML(o);
	}

}
