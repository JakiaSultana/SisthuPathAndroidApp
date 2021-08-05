package bd.com.websolutionsmb.www.shishupath;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class Rhymes extends Activity {
    MediaPlayer mp = new MediaPlayer();
    Button playr1,playr2,playr3,playr4,playr5,playr6,playr7,playr8,playr9,playr10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rhymes);
        playr1 = (Button) findViewById(R.id.btnplayr1);
        playr2 = (Button) findViewById(R.id.btnplayr2);
        playr3 = (Button) findViewById(R.id.btnplayr3);
        playr4 = (Button) findViewById(R.id.btnplayr4);
        playr5 = (Button) findViewById(R.id.btnplayr5);
        playr6 = (Button) findViewById(R.id.btnplayr6);
        playr7 = (Button) findViewById(R.id.btnplayr7);
        playr8 = (Button) findViewById(R.id.btnplayr8);
        playr9 = (Button) findViewById(R.id.btnplayr9);
        playr10 = (Button) findViewById(R.id.btnplayr10);

    }
    public void onClickPlayr1(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.love);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        playr1.startAnimation(animation);
    }

    public void onClickPlayr2(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.early);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        playr2.startAnimation(animation);
    }

    public void onClickPlayr3(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.hikori);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        playr3.startAnimation(animation);
    }

    public void onClickPlayr4(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.see);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        playr4.startAnimation(animation);
    }

    public void onClickPlayr5(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.rain);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        playr5.startAnimation(animation);
    }

    public void onClickPlayr6(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.twin);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();


        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        playr6.startAnimation(animation);
    }



    public void onClickPlayr7(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.jony);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        playr7.startAnimation(animation);
    }


    public void onClickPlayr8(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.baba);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        playr8.startAnimation(animation);
    }


    public void onClickPlayr9(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.onetwo);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        playr9.startAnimation(animation);
    }


    public void onClickPlayr10(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.areu);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        playr10.startAnimation(animation);

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this,Shishupath.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        mp.stop();
        finish();
    }
}
