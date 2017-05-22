package springMvc;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
  
@Controller
public class firstController {
	private static Logger logger = LoggerFactory.getLogger(firstController.class);
	@RequestMapping("myfirst")
	 public String  first(HttpServletResponse response, RedirectAttributes redirectAttributes,Model model){
		model.addAttribute("nihao", "防守打法1"); 
		redirectAttributes.addFlashAttribute("message", "nihaosd1");
		return "redirect:mysecond";
	 }
	
	@RequestMapping("mysecond")
	 public String  second(HttpServletResponse response, RedirectAttributes redirectAttributes,Model model){
		model.addAttribute("nihao2", "防守打法2"); 
		redirectAttributes.addFlashAttribute("message2", "nihaosd2");
	    return "MyJsp";
	 }
	public static void write(HttpServletResponse response,String content) {
		response.reset();
		response.setContentType("application/xml");
		response.setHeader("Cache-Control", "no-store");
		response.setCharacterEncoding("UTF-8");
		try {
			PrintWriter pw=response.getWriter();
			pw.write(content);
			pw.flush();
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
   public static void main(String[] args) {
//	   List<Integer> list = new ArrayList<Integer>(10);
//		 list.add(1);
//		 list.add(2);
//	 
////	  System.out.println(list);
//	  Iterator<Integer> it = list.iterator();
/*	  while(it.hasNext()){
		  System.out.println(it.next());
		  System.out.println(list.indexOf(2));
	  }*/
	  List<Integer> list2 = new Vector<Integer>(10);
	  list2.add(3);
	  Set<Integer> list3 =  new HashSet<Integer>();
	  list3.add(23);
	  list3.add(55);
	  System.out.println(list3);
	  Map<String,Object> list5 =  new ConcurrentHashMap<String,Object>();
	  list5.put("ww", 1);
//	  System.out.println(list5);
	  Map<String,Object> list6 =  new Hashtable<String,Object>();
	  String str="abc";
	  String str2="abc3";
	  AtomicInteger one = new AtomicInteger();
	  one.addAndGet(0);
	  System.out.println(one.incrementAndGet()); 
//	  System.out.println(str.hashCode());
//	  System.out.println(str2.hashCode()); 
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("id", 1);
		map.put("pId", -1);
		map.put("name", "根节点");
		list.add(map);
		map = new HashMap<String,Object>();
		map.put("id", 2);
		map.put("pId", 1);
		map.put("name", "你好");
		map.put("open", true);
		list.add(map);
//		System.out.println(JSONObject.toJSON(list));
//		System.out.println(JSONObject.toJSON(list).toString());
//		System.out.println(list);
	
//		Object json = JSONObject.toJSON(list);
//		String jsonlist = JSONObject.toJSON(list).toString();
//		System.out.println(json);
//		System.out.println(jsonlist);
		
		List<ProductInfo> productInfoList = new  ArrayList<ProductInfo>();
		ProductInfo entity = new ProductInfo();
		entity.setConditionRequire("你");
		entity.setDeadlineUnitStr("好");
		productInfoList.add(entity);
		String jsonProductInfo= JSONObject.toJSON(productInfoList).toString(); 
		List<ProductInfo> job = (List<ProductInfo>) JSONObject.parseArray(jsonProductInfo, ProductInfo.class); 
		System.out.println(job.get(0).getConditionRequire());
		JSONArray data = JSONArray.parseArray(jsonProductInfo);
		for(int i=0;i<data.size();i++){
		     JSONObject jobj =  (JSONObject) data.get(i);
		     String name = (String) jobj.get("conditionRequire");
		     System.out.println(name);
		}
    }

public final static List<Object> JSONDecodeList(String sJson, Class classOfT)
{
	if (sJson.equals("[]"))
	{
		return null;
	}
	List<String> lstsfs = dealJsonStr(sJson);
	List<Object> lst = new ArrayList<Object>();
	
	for (String str : lstsfs)
	{
		// 使用JSON作为传输
		Object o = JSONDecode(str, classOfT);
		lst.add(o);
	}
	return lst;
}

public final static Object JSONDecode(String sJson, Class classOfT)
{
	Gson gson = new Gson();
	return gson.fromJson(sJson, classOfT);
}
/**
 * 将json列表转换为字符串列表,每个字符串为一个对象
 * 
 * @param json
 * @return List<String>
 */
public static List<String> dealJsonStr(String json)
{
	List<String> lst = new ArrayList<String>();
	try
	{
		String[] sfs = json.split("\"\\},\\{\"");
		for (String str : sfs)
		{
			if (str.startsWith("["))
			{
				str = str.substring(1);
			}
			else if (str.startsWith("{\""))
			{
				
			}
			else
			{
				str = "{\"" + str;
			}
			if (str.endsWith("\\\"}]"))
			{
				str += "\"}";
			}
			else
			{
				if (str.endsWith("]"))
				{
					str = str.substring(0, str.length() - 1);
				}
				else if (str.endsWith("\"}"))
				{
					
				}
				else
				{
					str += "\"}";
				}
			}
			
			lst.add(str);
		}
	}
	catch (Exception e)
	{
		e.printStackTrace();
	}
	return lst;
}
}
