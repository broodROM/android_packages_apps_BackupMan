package com.broodplank.backupman;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceScreen;
import com.broodplank.backupman.R;
import com.stericson.RootTools.RootTools;

@SuppressLint("SdCardPath")
public class mainActivity extends PreferenceActivity {
	
	
	public static final int MODE_WORLD_WRITEABLE = 0x00000002;



    @SuppressWarnings("deprecation")
	@Override
    protected void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	
        RootTools.debugMode = true; //ON


        setTitle(R.string.app_name);
        addPreferencesFromResource(R.xml.backupman);

        @SuppressWarnings("unused")
		PreferenceScreen PrefScreen = getPreferenceScreen();
        
        
         }
        
     
 
    

    @Override
    public void onResume() {

        super.onResume();

 

    }




		

} 
    
    
