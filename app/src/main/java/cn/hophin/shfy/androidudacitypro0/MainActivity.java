package cn.hophin.shfy.androidudacitypro0;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button spotifyStreamer;
    private Button scoresApp;
    private Button libraryApp;
    private Button buildITBigger;
    private Button xyzReader;
    private Button capstonMyOwnApp;

    private String[] toastContent={
            "This button will launch spotify streamer!",
            "This button will launch scores app!",
            "This button will launch library app!",
            "This button will launch build IT bigger app!",
            "This button will launch xyzReader!",
            "This button will launch my capstone app!"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        spotifyStreamer= (Button) findViewById(R.id.spotify_streamer_button);
        scoresApp= (Button) findViewById(R.id.scores_app_button);
        libraryApp= (Button) findViewById(R.id.library_app_button);
        buildITBigger= (Button) findViewById(R.id.build_it_bigger_button);
        xyzReader= (Button) findViewById(R.id.xyz_reader_button);
        capstonMyOwnApp= (Button) findViewById(R.id.capstone_my_own_app_button);

        spotifyStreamer.setOnClickListener(this);
        scoresApp.setOnClickListener(this);
        libraryApp.setOnClickListener(this);
        buildITBigger.setOnClickListener(this);
        xyzReader.setOnClickListener(this);
        capstonMyOwnApp.setOnClickListener(this);

        setTitle(getString(R.string.title_main_activity));
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

    @Override
    public void onClick(View v) {
        String toastInfo="";
        switch (v.getId()){
            case R.id.spotify_streamer_button:
                toastInfo=toastContent[0];
                break;
            case R.id.scores_app_button:
                toastInfo=toastContent[1];
                break;
            case R.id.library_app_button:
                toastInfo=toastContent[2];
                break;
            case R.id.build_it_bigger_button:
                toastInfo=toastContent[3];
                break;
            case R.id.xyz_reader_button:
                toastInfo=toastContent[4];
                break;
            case R.id.capstone_my_own_app_button:
                toastInfo=toastContent[5];
                break;
        }
        Toast.makeText(this,toastInfo,Toast.LENGTH_SHORT).show();
    }
}
