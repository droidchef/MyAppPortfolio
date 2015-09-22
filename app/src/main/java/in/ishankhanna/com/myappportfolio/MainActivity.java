package in.ishankhanna.com.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btSpotifyStreamer, btSuperDuo,
            btBuildItBigger, btXYZReader, btCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btSpotifyStreamer = (Button) findViewById(R.id.btn_spotify_streamer);
        btSuperDuo = (Button) findViewById(R.id.btn_super_duo);
        btBuildItBigger = (Button) findViewById(R.id.btn_build_it_bigger);
        btXYZReader = (Button) findViewById(R.id.btn_xyz_reader);
        btCapstone = (Button) findViewById(R.id.btn_capstone);

        btSpotifyStreamer.setOnClickListener(MainActivity.this);
        btSuperDuo.setOnClickListener(MainActivity.this);
        btBuildItBigger.setOnClickListener(MainActivity.this);
        btXYZReader.setOnClickListener(MainActivity.this);
        btCapstone.setOnClickListener(MainActivity.this);

    }


    @Override
    public void onClick(View v) {

        switch(v.getId()) {
            case R.id.btn_spotify_streamer: showToast(btSpotifyStreamer);
                break;
            case R.id.btn_super_duo: showToast(btSuperDuo);
                break;
            case R.id.btn_build_it_bigger: showToast(btBuildItBigger);
                break;
            case R.id.btn_xyz_reader: showToast(btXYZReader);
                break;
            case R.id.btn_capstone: showToast(btCapstone);
                break;
        }

    }

    private void showToast(Button button) {

        Toast.makeText(MainActivity.this, getString(R.string.button_click_toast_text) + button.getText(), Toast.LENGTH_SHORT).show();

    }
}
