package jp.sikisize;

import android.content.Intent;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;



public class IntentFunction implements FREFunction {

	 @Override
	 public FREObject call(FREContext arg0, FREObject[] arg1) {

		 try{
			 String packageName = arg1[0].getAsString();
			 Intent LaunchIntent = arg0.getActivity().getPackageManager().getLaunchIntentForPackage(packageName);
			 arg0.getActivity().startActivity(LaunchIntent);
        
		 }catch(Exception e){
    
		 }
		 return null;
	}
	
}
