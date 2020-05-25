package jokesbutandroidlib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.jokesbutandroidlib.R;

public class JokesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes);

        if(savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().add(R.id.container,new jokesbutandroidlib.JokesActivityFragment()).commit();
        }
    }
}
