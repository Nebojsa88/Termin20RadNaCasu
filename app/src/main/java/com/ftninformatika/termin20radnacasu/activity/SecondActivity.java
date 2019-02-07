package com.ftninformatika.termin20radnacasu.activity;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.ftninformatika.termin20radnacasu.R;
import com.ftninformatika.termin20radnacasu.providers.GlumacProvider;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class SecondActivity extends AppCompatActivity {

    private int position = 0;
    private DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        setupActionBar();

        if(savedInstanceState != null ){
            this.position = savedInstanceState.getInt("position");

        }
        position = getIntent().getIntExtra("position", 0);

        ImageView iv = findViewById(R.id.imageView);

        InputStream is = null;
        try{
            is = getAssets().open(GlumacProvider.getGlumacById(position).getImageString());
            Drawable drawable = Drawable.createFromStream(is, null);
            iv.setImageDrawable(drawable);

        }catch (IOException e){
            e.printStackTrace();
        }
        TextView tvName = findViewById(R.id.textView_ime);
        tvName.setText(GlumacProvider.getGlumacById(position).getIme());

        TextView tvSurname = findViewById(R.id.textView_prezime);
        tvSurname.setText(GlumacProvider.getGlumacById(position).getPrezime());

        TextView tvBio = findViewById(R.id.textView_biografija);
        tvBio.setText(GlumacProvider.getGlumacById(position).getBiografija());

        TextView tvFilmovi = findViewById(R.id.textView_filmovi);
        tvFilmovi.setText(GlumacProvider.getGlumacById(position).getFilmoviUkojimaJeigrao());

        TextView tvDatum = findViewById(R.id.textView_datum);

        SimpleDateFormat sdf = new SimpleDateFormat("MM. DD. yyyy", Locale.US);

        tvDatum.setText(sdf.format(GlumacProvider.getGlumacById(position).getDatumRodjenja()));

       RatingBar rb = findViewById(R.id.ratingBar);
        rb.setRating(GlumacProvider.getGlumacById(position).getOcena());
    }

    private void setupActionBar(){
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final android.support.v7.app.ActionBar actionBar = getSupportActionBar();

        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(R.drawable.ic_action_name);
            actionBar.setHomeButtonEnabled(true);
            actionBar.show();
        }
    }

    // onCreateOptionsMenu method initialize the contents of the Activity's Toolbar.
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    // onOptionsItemSelected method is called whenever an item in the Toolbar is selected.
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_create:
                Toast.makeText(this, "Action create executed.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_update:
                Toast.makeText(this, "Action update executed.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_delete:
                Toast.makeText(this, "Action delete executed.", Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
    private void setupDrawer(){


        mDrawerLayout = findViewById(R.id.);

            NavigationView navigationView = findViewById(R.id);
            navigationView.setNavigationItemSelectedListener(
                    new NavigationView.OnNavigationItemSelectedListener() {
                        @Override
                        public boolean onNavigationItemSelected(MenuItem menuItem) {
                            // set item as selected to persist highlight
                            menuItem.setChecked(true);
                            // close drawer when item is tapped
                            mDrawerLayout.closeDrawers();

                            // Add code here to update the UI based on the item selected
                            // For example, swap UI fragments here

                            return true;
                        }
                    });
        }

    }

}

