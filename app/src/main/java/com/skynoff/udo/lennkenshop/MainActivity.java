package com.skynoff.udo.lennkenshop;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{
    //http://demos.dflabs.io/store/v1/products/?format=json
        //http://demos.dflabs.io/store/v1/stores/?format=json
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<producto> productos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        RelativeLayout.LayoutParams lp =
                new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, 500);
        mRecyclerView.setLayoutParams(lp);
        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new GridLayoutManager(this,2);

        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        initializeData();
        mAdapter = new adaptador(productos);
        mRecyclerView.setAdapter(mAdapter);




    }
    public boolean conexionInternet()
    {
        ConnectivityManager conexion=(ConnectivityManager)this.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo network=conexion.getActiveNetworkInfo();
        if(network != null && network.isConnectedOrConnecting())
        {
            return true;

        }else{
            return false;
        }
    }

    private void initializeData(){
        productos = new ArrayList<>();
        productos.add(new producto( R.drawable.motog4plus,"Moto g4 Plus",5990.00));
        productos.add(new producto( R.drawable.motog4plus,"Moto g4 ",4990.00));
        productos.add(new producto( R.drawable.motog4plus,"Moto g4 Play",3990.00));
        productos.add(new producto( R.drawable.motog4plus,"Moto g4 Plus",5990.00));
        productos.add(new producto( R.drawable.motog4plus,"Moto g4 ",4990.00));
        productos.add(new producto( R.drawable.motog4plus,"Moto g4 Play",3990.00));

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
   Intent i=new Intent(MainActivity.this,locaciones.class);
           startActivity(i);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
