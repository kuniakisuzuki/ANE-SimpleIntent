package jp.sikisize;


import java.util.HashMap;
import java.util.Map;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREExtension;
import com.adobe.fre.FREFunction;
 
public class SimpleIntent implements FREExtension {
    

	 @Override
	    public FREContext createContext(String arg0) {
	        FREContext context = new FREContext() {
	            @Override
	            public Map<String, FREFunction> getFunctions() {
	                Map<String, FREFunction> result = new HashMap<String, FREFunction>();
	                
	                result.put("intent", new IntentFunction());
	                
	                return result;
	            }
	 
	            @Override
	            public void dispose() {}
	        };
	         
	        return context;
	    }
	     
	    @Override
	    public void dispose() {}
	 
	    @Override
	    public void initialize() {}
}