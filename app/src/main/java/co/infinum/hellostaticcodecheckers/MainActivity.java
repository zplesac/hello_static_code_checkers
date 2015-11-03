package co.infinum.hellostaticcodecheckers;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;


/**
 * Created by Željko Plesac on 03/11/15.
 */
public class MainActivity extends Activity{

    private String mirko;

    private static int sexyFactor;


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
}


