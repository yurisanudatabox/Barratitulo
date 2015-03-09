package com.example.udatabox.barratitulo;

import android.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.TabHost;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        TabHost tabHost = (TabHost) findViewById(R.id.tabhost);
        tabHost.setup();
        TabHost.TabSpec tabSpec=tabHost.newTabSpec("Todos");
        tabSpec.setContent(R.id.TabTodos);
        tabSpec.setIndicator("Todos");
        tabHost.addTab(tabSpec);
        tabSpec=tabHost.newTabSpec("Asignados");
        tabSpec.setContent(R.id.TabAsignados);
        tabSpec.setIndicator("Asignados");
        tabHost.addTab(tabSpec);
        tabSpec=tabHost.newTabSpec("Pendiente");
        tabSpec.setContent(R.id.TabPendiente);
        tabSpec.setIndicator("Pendiente");
        tabHost.addTab(tabSpec);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
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
