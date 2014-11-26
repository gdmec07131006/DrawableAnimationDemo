package cn.edu.gdmec.c07131006.drawableanimationdemo;

import android.support.v7.app.ActionBarActivity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity {
	private ImageView myimage;
	
	private Button btn1;
	
	private AnimationDrawable drawable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        myimage = (ImageView) findViewById(R.id.imageView1);
        
        btn1 = (Button) findViewById(R.id.button1);
        
        myimage.setBackgroundResource(R.drawable.drawable_animation);
        
        drawable =  (AnimationDrawable) myimage.getBackground();
        
        btn1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				drawable.start();
			}
        	
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
