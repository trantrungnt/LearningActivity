package academy.android.vietnam.trungnt.learningacitvity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    public static final String strmessage = "Nguyen Tran Trung";

    //call on Create function
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(strmessage, "on Create");
    }

    //call on Resume function
    @Override
    protected void onResume(){
        super.onResume();
        Log.i(strmessage,"on Resume");
    }

    //call onPause function
    @Override
    protected void onPause(){
        super.onPause();
        Log.i(strmessage, "on Pause");
    }

    //call onStop Function
    @Override
    protected void onStop(){
        super.onStop();
        Log.i(strmessage, "on Stop");
    }

    //call onDestroy
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(strmessage, "on Destroy");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        // Print Log
        Log.i(strmessage, "onCreateOptionsMenu");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Print Log
        Log.i(strmessage, "onOptionsItemSelected");

        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
