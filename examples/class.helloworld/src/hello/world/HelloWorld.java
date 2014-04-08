package hello.world;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class HelloWorld extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello_world);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.hello_world, menu);
        return true;
    }
    
}
