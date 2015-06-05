package com.safecomp.verticaltab;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;
import android.widget.ViewFlipper;

public class MainActivity extends Activity {

	ViewFlipper myViewFlipper;
	ToggleButton tab[]=new ToggleButton[3];
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		

		tab[0]=(ToggleButton)findViewById(R.id.tab1);
		tab[1]=(ToggleButton)findViewById(R.id.tab2);
		tab[2]=(ToggleButton)findViewById(R.id.tab3);
		
		myViewFlipper=(ViewFlipper)findViewById(R.id.myViewFlipper);
		
		myViewFlipper.setInAnimation(this,android.R.anim.slide_in_left);
		myViewFlipper.setOutAnimation(this,android.R.anim.slide_out_right);
		
		myViewFlipper.setDisplayedChild(2);
		
	}
	public void unCheck(int id){
		for(ToggleButton tb:tab){
			if(tb.getId()!=id)
				tb.setChecked(false);
			else
				tb.setChecked(true);
		}
	}
    public void tabClick(View target) {
    	unCheck(target.getId());
    	
    	switch(target.getId()){
    	case R.id.tab1:
    		myViewFlipper.setDisplayedChild(0);
    		break;
    	case R.id.tab2:
    		myViewFlipper.setDisplayedChild(1);
    		break;
    	case R.id.tab3:
    		myViewFlipper.setDisplayedChild(2);
    		break;
    		
    	}
    	
    }
}
