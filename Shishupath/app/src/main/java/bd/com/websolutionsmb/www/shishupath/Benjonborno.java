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

public class Benjonborno extends Activity {
    MediaPlayer mp = new MediaPlayer();
    Button btnkk1,btnkk2,btnkk3,btnkk4,btnkk5,btnkk6,btnkk7,btnkk8,btnkk9,btnkk10,
            btnkk11,btnkk12,btnkk13,btnkk14,btnkk15,btnkk16,btnkk17,btnkk18,btnkk19,btnkk20,
            btnkk21,btnkk22,btnkk23,btnkk24,btnkk25,btnkk26,btnkk27,btnkk28,btnkk29,btnkk30,btnkk31,
            btnkk32,btnkk33,btnkk34,btnkk35,btnkk36,btnkk37,btnkk38,btnkk39
            ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_benjonborno);


        btnkk1= (Button) findViewById(R.id.btnkk1);
        btnkk2= (Button) findViewById(R.id.btnkk2);
        btnkk3= (Button) findViewById(R.id.btnkk3);
        btnkk4= (Button) findViewById(R.id.btnkk4);
        btnkk5= (Button) findViewById(R.id.btnkk5);
        btnkk6= (Button) findViewById(R.id.btnkk6);
        btnkk7= (Button) findViewById(R.id.btnkk7);
        btnkk8= (Button) findViewById(R.id.btnkk8);
        btnkk9= (Button) findViewById(R.id.btnkk9);
        btnkk10= (Button) findViewById(R.id.btnkk10);
        btnkk11= (Button) findViewById(R.id.btnkk11);
        btnkk12= (Button) findViewById(R.id.btnkk12);
        btnkk13= (Button) findViewById(R.id.btnkk13);
        btnkk14= (Button) findViewById(R.id.btnkk14);
        btnkk15= (Button) findViewById(R.id.btnkk15);
        btnkk16= (Button) findViewById(R.id.btnkk16);
        btnkk17= (Button) findViewById(R.id.btnkk17);
        btnkk18= (Button) findViewById(R.id.btnkk18);
        btnkk19= (Button) findViewById(R.id.btnkk19);
        btnkk20= (Button) findViewById(R.id.btnkk20);
        btnkk21= (Button) findViewById(R.id.btnkk21);
        btnkk22= (Button) findViewById(R.id.btnkk22);
        btnkk23= (Button) findViewById(R.id.btnkk23);
        btnkk24= (Button) findViewById(R.id.btnkk24);
        btnkk25= (Button) findViewById(R.id.btnkk25);
        btnkk26= (Button) findViewById(R.id.btnkk26);
        btnkk27= (Button) findViewById(R.id.btnkk27);
        btnkk28= (Button) findViewById(R.id.btnkk28);
        btnkk29= (Button) findViewById(R.id.btnkk29);
        btnkk30= (Button) findViewById(R.id.btnkk30);
        btnkk31= (Button) findViewById(R.id.btnkk31);
        btnkk32= (Button) findViewById(R.id.btnkk32);
        btnkk33= (Button) findViewById(R.id.btnkk33);
        btnkk34= (Button) findViewById(R.id.btnkk34);
        btnkk35= (Button) findViewById(R.id.btnkk35);
        btnkk36= (Button) findViewById(R.id.btnkk36);
        btnkk37= (Button) findViewById(R.id.btnkk37);
        btnkk38= (Button) findViewById(R.id.btnkk38);
        btnkk39= (Button) findViewById(R.id.btnkk39);

    }

    public void onClickButkk1(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.k1);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.welcome_animation);
        btnkk1.startAnimation(animation);
    }

    public void onClickButkk2(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.k2);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        btnkk2.startAnimation(animation);
    }

    public void onClickButkk3(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.k3);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
        btnkk3.startAnimation(animation);
    }

    public void onClickButkk4(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.k4);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        btnkk4.startAnimation(animation);
    }

    public void onClickButkk5(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.k5);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.welcome_animation);
        btnkk5.startAnimation(animation);
    }

    public void onClickButkk6(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.k6);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        btnkk6.startAnimation(animation);
    }

    public void onClickButkk7(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.k7);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
        btnkk7.startAnimation(animation);
    }

    public void onClickButkk8(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.k8);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        btnkk8.startAnimation(animation);
    }

    public void onClickButkk9(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.k9);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.welcome_animation);
        btnkk9.startAnimation(animation);
    }
    public void onClickButkk10(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.k10);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        btnkk10.startAnimation(animation);
    }

    public void onClickButkk11(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.k11);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
        btnkk11.startAnimation(animation);
    }

    public void onClickButkk12(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.k12);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        btnkk12.startAnimation(animation);
    }

    public void onClickButkk13(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.k13);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.welcome_animation);
        btnkk13.startAnimation(animation);
    }

    public void onClickButkk14(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.k14);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        btnkk14.startAnimation(animation);

    }

    public void onClickButkk15(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.k15);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
        btnkk15.startAnimation(animation);
    }

    public void onClickButkk16(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.k16);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        btnkk16.startAnimation(animation);
    }

    public void onClickButkk17(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.k17);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.welcome_animation);
        btnkk17.startAnimation(animation);
    }

    public void onClickButkk18(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.k18);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        btnkk18.startAnimation(animation);
    }

    public void onClickButkk19(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.k19);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
        btnkk19.startAnimation(animation);
    }

    public void onClickButkk20(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.k20);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        btnkk20.startAnimation(animation);
    }

    public void onClickButkk21(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.k21);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.welcome_animation);
        btnkk21.startAnimation(animation);
    }

    public void onClickButkk22(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.k22);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        btnkk22.startAnimation(animation);
    }

    public void onClickButkk23(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.k23);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
        btnkk23.startAnimation(animation);
    }

    public void onClickButkk24(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.k24);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        btnkk24.startAnimation(animation);
    }

    public void onClickButkk25(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.k25);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.welcome_animation);
        btnkk25.startAnimation(animation);
    }

    public void onClickButkk26(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.k27);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        btnkk26.startAnimation(animation);
    }

    public void onClickButkk27(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.k28);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
        btnkk27.startAnimation(animation);
    }

    public void onClickButkk28(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.k29);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        btnkk28.startAnimation(animation);
    }

    public void onClickButkk29(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.k30);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.welcome_animation);
        btnkk29.startAnimation(animation);
    }

    public void onClickButkk30(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.k31);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        btnkk30.startAnimation(animation);
    }
    public void onClickButkk31(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.k32);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
        btnkk31.startAnimation(animation);
    }

    public void onClickButkk32(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.k33);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        btnkk32.startAnimation(animation);
    }

    public void onClickButkk33(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.k35);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.welcome_animation);
        btnkk33.startAnimation(animation);
    }

    public void onClickButkk34(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.k36);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        btnkk34.startAnimation(animation);
    }

    public void onClickButkk35(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.k37);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
        btnkk35.startAnimation(animation);
    }


    public void onClickButkk36(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.k38);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        btnkk36.startAnimation(animation);
    }


    public void onClickButkk37(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.k39);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();


        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.welcome_animation);
        btnkk37.startAnimation(animation);
    }


    public void onClickButkk38(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.k40);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        btnkk38.startAnimation(animation);
    }


    public void onClickButkk39(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.k41);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
        btnkk39.startAnimation(animation);
    }

}
