package bd.com.websolutionsmb.www.shishupath;

import android.app.Activity;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class Number extends Activity {
    MediaPlayer mp = new MediaPlayer();
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);

        button1= (Button) findViewById(R.id.button1);
        button2= (Button) findViewById(R.id.button2);
        button3= (Button) findViewById(R.id.button3);
        button4= (Button) findViewById(R.id.button4);
        button5= (Button) findViewById(R.id.button5);
        button6= (Button) findViewById(R.id.button6);
        button7= (Button) findViewById(R.id.button7);
        button8= (Button) findViewById(R.id.button8);
        button9= (Button) findViewById(R.id.button9);
        button10= (Button) findViewById(R.id.button10);



    }
    public void onClickButton1(View view){

        mp.reset();
        mp.release();
        mp=MediaPlayer.create(this, R.raw.e1);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
        button1.startAnimation(animation);
    }



    public void onClickButton2(View view){

        mp.reset();
        mp.release();
        mp=MediaPlayer.create(this, R.raw.e2);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
        button2.startAnimation(animation);
    }
    public void onClickButton3(View view){

        mp.reset();
        mp.release();
        mp=MediaPlayer.create(this, R.raw.e3);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        button3.startAnimation(animation);
    }

    public void onClickButton4(View view){

        mp.reset();
        mp.release();
        mp=MediaPlayer.create(this, R.raw.e4);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        button4.startAnimation(animation);
    }


    public void onClickButton5(View view){

        mp.reset();
        mp.release();
        mp=MediaPlayer.create(this, R.raw.e5);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.welcome_animation);
        button5.startAnimation(animation);
    }


    public void onClickButton6(View view){

        mp.reset();
        mp.release();
        mp=MediaPlayer.create(this, R.raw.e6);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
        button6.startAnimation(animation);
    }

    public void onClickButton7(View view){

        mp.reset();
        mp.release();
        mp=MediaPlayer.create(this, R.raw.e7);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
        button7.startAnimation(animation);
    }


    public void onClickButton8(View view){

        mp.reset();
        mp.release();
        mp=MediaPlayer.create(this, R.raw.e8);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        button8.startAnimation(animation);
    }

    public void onClickButton9(View view){

        mp.reset();
        mp.release();
        mp=MediaPlayer.create(this, R.raw.e9);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        button9.startAnimation(animation);
    }

    public void onClickButton10(View view){

        mp.reset();
        mp.release();
        mp=MediaPlayer.create(this, R.raw.e10);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.welcome_animation);
        button10.startAnimation(animation);
    }
}
