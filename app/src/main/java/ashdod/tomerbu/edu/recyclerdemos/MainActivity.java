package ashdod.tomerbu.edu.recyclerdemos;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

import ashdod.tomerbu.edu.recyclerdemos.models.Cheese;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //4.1
        RecyclerView recycler = (RecyclerView) findViewById(R.id.cheeseRecycler);
        //4.2
        recycler.setAdapter(new CheeseAdapter(getLayoutInflater(), getCheese()));
        //4.3
        recycler.setLayoutManager(new LinearLayoutManager(this));
    }

    private ArrayList<Cheese> getCheese() {
        ArrayList<Cheese> cheeses = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            cheeses.add(new Cheese("Mozzarella", "", R.drawable.cheese_1));
            cheeses.add(new Cheese("Gouda", "", R.drawable.cheese_2));
            cheeses.add(new Cheese("Camembert", "", R.drawable.cheese_3));
            cheeses.add(new Cheese("Labneh", "", R.drawable.cheese_4));
            cheeses.add(new Cheese("Cream", "", R.drawable.cheese_5));
            cheeses.add(new Cheese("Halloumi", "", R.drawable.cheese_6));
            cheeses.add(new Cheese("Parmigiano", "", R.drawable.cheese_7));
        }

        return cheeses;
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
