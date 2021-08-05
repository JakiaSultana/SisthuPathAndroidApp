package bd.com.websolutionsmb.www.shishupath;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Welcome extends Activity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        //for hide action bar
        //getSupportActionBar().hide();
        //media player
       /* MediaPlayer mediaPlayer = MediaPlayer.create(Welcome.this, R.raw.childt);
        mediaPlayer.start();*/

        imageView=(ImageView)findViewById(R.id.imageView);
        Animation animation=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.welcome_animation);
        imageView.setAnimation(animation);


        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                finish();
                startActivity(new Intent(getApplicationContext(),Shishupath.class));


            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

    }

}
