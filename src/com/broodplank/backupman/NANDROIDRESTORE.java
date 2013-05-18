package com.broodplank.backupman;


import java.io.IOException;
import java.util.concurrent.TimeoutException;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.widget.Toast;
import com.stericson.RootTools.CommandCapture;
import com.stericson.RootTools.RootTools;



public class NANDROIDRESTORE extends mainActivity {


	
		@Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(null);
	        	        
	        
	        CWMREBOOTNOW();

		}
		
		
	
public void CWMREBOOTNOW() {
	
	
	final AlertDialog.Builder builder=new AlertDialog.Builder(this);
    builder.setTitle("Restore Nandroid Backup");
    builder.setIcon(android.R.drawable.ic_dialog_alert);
    builder.setMessage("Press OK to reboot your phone in CWM Recover navigate to: backup & restore > restore\nto restore a nandroid backup");
   builder.setPositiveButton("OK", new OnClickListener() {


  	   @Override
  	   public void onClick(DialogInterface dialog, int which) {
  		   
  		   
  		 Toast.makeText(getApplicationContext(), 
  			     "Rebooting into CWM Recovery...", Toast.LENGTH_LONG).show();     
  		

  		
  		 CommandCapture command = new CommandCapture(0, "reboot recovery"); {
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

    		

