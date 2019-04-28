package ko.alex.motionlayoutpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //https://github.com/googlesamples/android-ConstraintLayoutExamples
        //https://medium.com/google-developers/introduction-to-motionlayout-part-i-29208674b10d
        //https://medium.com/google-developers/defining-motion-paths-in-motionlayout-6095b874d37

        //SCENE 1 BASIC MOVEMENT
        //SCENE 2 SAME AS SCENE 1, BUT EVERYTHING IS IN ONE SCENE XML FILE
        //SCENE 3 CHANGING COLOR, SAME BASIC MOVEMENT
        //SCENE 4 WITH HUMP //todo: https://medium.com/google-developers/defining-motion-paths-in-motionlayout-6095b874d37
        //SCENE 5 WITH THE LOOP DE LOOP
    }
}
