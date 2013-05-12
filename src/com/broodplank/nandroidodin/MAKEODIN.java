package com.broodplank.nandroidodin;


import java.io.IOException;
import java.util.concurrent.TimeoutException;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.widget.Toast;
import com.stericson.RootTools.CommandCapture;
import com.stericson.RootTools.RootTools;



public class MAKEODIN extends mainActivity {


	
		@Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(null);
	        	        
	        
	        MAKEODINNOW();

		}
		
		
	
public void MAKEODINNOW() {
	
	
	final AlertDialog.Builder builder=new AlertDialog.Builder(this);
    builder.setTitle("Build Odin Flashable from current ROM");
    builder.setIcon(android.R.drawable.ic_dialog_alert);
    builder.setMessage("Press OK to dump boot, recovery, system, cache and data into an Odin flashable.\nThe process may need upto 2gb space and 5 minutes in order to complete");
   builder.setPositiveButton("OK", new OnClickListener() {


  	   @Override
  	   public void onClick(DialogInterface dialog, int which) {
  		   
  		   
  		 Toast.makeText(getApplicationContext(), 
  			     "Making Odin ROM... this may take a while", Toast.LENGTH_LONG).show();     
  		

  		
  		 CommandCapture command = new CommandCapture(0, "cd /system/bin", "busybox chmod 755 makeodin", "./makeodin"); {
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
  		 

  		 
  		 Toast.makeText(getApplicationContext(), 
  			     "Finished building Odin ROM!", Toast.LENGTH_LONG).show();  
  		   

		 	    	
  		
  		    };
  			    	 
  			    	
  		
  		   });
   

   builder.setNegativeButton("Cancel", new OnClickListener() {

  	   @Override
  	   public void onClick(DialogInterface dialog, int which) {
  		   
  		 
  	    // TODO Auto-generated method stub

  	   }
  	  });

  builder.show();

	
}
	
	  

 
 	 
}

    		 
     

