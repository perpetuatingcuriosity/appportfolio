package com.example.pcurio.appportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();

    private Context mContext;

    //UI Elements
    private Button mSpotify;
    private Button mScores;
    private Button mLibrary;
    private Button mBuildBigger;
    private Button mXyzReader;
    private Button mCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = this;

        //UI Elements
        mSpotify = (Button) findViewById(R.id.main_button_spotify);
        mScores = (Button) findViewById(R.id.main_button_scores);
        mLibrary = (Button) findViewById(R.id.main_button_library);
        mBuildBigger = (Button) findViewById(R.id.main_button_build_bigger);
        mXyzReader = (Button) findViewById(R.id.main_button_xyz);
        mCapstone = (Button) findViewById(R.id.main_button_capstone);

        ArrayList<Button> buttonList = new ArrayList<>();
        buttonList.add(mSpotify);
        buttonList.add(mScores);
        buttonList.add(mLibrary);
        buttonList.add(mBuildBigger);
        buttonList.add(mXyzReader);
        buttonList.add(mCapstone);

        for(Button button : buttonList){
            setButtonClickListener(button, button.getText().toString());
        }

    } //onCreate

    public void setButtonClickListener(Button button, final String title){

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, "This button will launch " + title + "!",
                        Toast.LENGTH_SHORT).show();
            }
        });
    } //setButtonClickListener

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
