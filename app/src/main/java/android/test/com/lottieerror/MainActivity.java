package android.test.com.lottieerror;

import android.animation.Animator;
import android.app.Application;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Application application = getApplication();

        ((LottieAnimationView) findViewById(R.id.lottieView)).addAnimatorListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {

            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {
                Toast.makeText(application, "repeat", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onStop() {
        Toast.makeText(getApplicationContext(), "stop", Toast.LENGTH_SHORT).show();
        super.onStop();
    }

    @Override
    protected void onPause() {
        Toast.makeText(getApplicationContext(), "pause", Toast.LENGTH_SHORT).show();
        super.onPause();
    }

    @Override
    protected void onResume() {
        Toast.makeText(getApplicationContext(), "resume", Toast.LENGTH_SHORT).show();
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        Toast.makeText(getApplicationContext(), "destroy", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }
}
