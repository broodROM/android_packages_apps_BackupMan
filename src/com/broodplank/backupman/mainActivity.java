package com.broodplank.backupman;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

import android.content.Intent;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceScreen;
import com.broodplank.backupman.R;
import com.stericson.RootTools.CommandCapture;
import com.stericson.RootTools.RootTools;

public class mainActivity extends PreferenceActivity {
	
	
	
    public static final String CUST_ODIN = "custodin";



	public static final int MODE_WORLD_WRITEABLE = 0x00000002;

    private Preference mCustOdin;
    


    @SuppressWarnings("deprecation")
	@Override
    protected void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	
        RootTools.debugMode = true; //ON


        setTitle(R.string.app_name);
        addPreferencesFromResource(R.xml.nandroidodin);

        PreferenceScreen PrefScreen = getPreferenceScreen();
        
		 CommandCapture command = new CommandCapture(0, "echo REQUESTION INITIAL ROOT ACCESS"); {
	  	 		try {
	  	// 	
	  	 			RootTools.getShell(true).add(command).waitForFinish();
//	  	 		
	  	//
	  	 		} catch (InterruptedException e1) {
	  	 			// TODO Auto-generated catch block
	  	 			e1.printStackTrace();
	  	 		} catch (IOException e1) {
	  	 			// TODO Auto-generated catch block
	  	 			e1.printStackTrace();
	  	 		} catch (TimeoutException e1) {
	  	 			// TODO Auto-generated catch block
	  	 			e1.printStackTrace();
	  	 		}
	  	     }
        
		 
		 mCustOdin = (Preference) PrefScreen.findPreference(CUST_ODIN);
		 Intent intent2 = new Intent(mainActivity.this, CUSTODIN.class);
		 mCustOdin.setIntent(intent2);
		 

         }
        
     
 
    
    

    @Override
    public void onResume() {

        super.onResume();

 

    }


   
		

} 
    
    
