package co.infinum.hellostaticcodecheckers.activities;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import butterknife.Bind;
import co.infinum.hellostaticcodecheckers.R;


/**
 * Created by Željko Plesac on 03/11/15.
 */
public class MainActivity extends Activity {

    private String mirko;

    public static int sexyFactor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sexyFactor = 1;

        switch (sexyFactor){
            case 1:
                Log.d("Sexy factor", "Is 1");
                break;
        }
    }

    @Override
    protected void onResume() {

    }
}


