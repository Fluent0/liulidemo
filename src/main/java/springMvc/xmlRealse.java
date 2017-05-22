package springMvc;

import java.io.IOException;
import java.io.StringReader;
import java.util.List;

import javax.lang.model.element.Element;
import javax.swing.text.Document;
import javax.xml.stream.events.Namespace;

import org.xml.sax.InputSource;

public class xmlRealse {
	  
	    public static void main(String[] args){
	    	xmlRealse doc = new xmlRealse();
	        String xml = "<?xml version=\"1.0\" encoding=\"gb2312\"?>"+
	        "<Result xmlns=\"http://www.fiorano.com/fesb/activity/DBQueryOnInput2/Out\">"+
	           "<row resultcount=\"1\">"+
	              "<users_id>1001     </users_id>"+
	              "<users_name>wangwei   </users_name>"+
	              "<users_group>80        </users_group>"+
	              "<users_address>1001ºÅ   </users_address>"+
	           "</row>"+
	           "<row resultcount=\"1\">"+
	              "<users_id>1002     </users_id>"+
	              "<users_name>wangwei   </users_name>"+
	              "<users_group>80        </users_group>"+
	              "<users_address>1002ºÅ   </users_address>"+
	           "</row>"+
	        "</Result>"; 
	    }
}
