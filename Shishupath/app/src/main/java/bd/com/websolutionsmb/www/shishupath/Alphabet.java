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

public class Alphabet extends Activity {
    MediaPlayer mp = new MediaPlayer();
    Button btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI, btnJ, btnK, btnL, btnM, btnN, btnO, btnP, btnQ, btnR, btnS, btnT, btnU, btnV, btnW, btnX, btnY, btnZ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);


        btnA = (Button) findViewById(R.id.btnA);
        btnB = (Button) findViewById(R.id.btnB);
        btnC = (Button) findViewById(R.id.btnC);
        btnD = (Button) findViewById(R.id.btnD);
        btnE = (Button) findViewById(R.id.btnE);
        btnF = (Button) findViewById(R.id.btnF);
        btnG = (Button) findViewById(R.id.btnG);
        btnH = (Button) findViewById(R.id.btnH);
        btnI = (Button) findViewById(R.id.btnI);
        btnJ = (Button) findViewById(R.id.btnJ);
        btnK = (Button) findViewById(R.id.btnK);
        btnL = (Button) findViewById(R.id.btnL);
        btnM = (Button) findViewById(R.id.btnM);
        btnN = (Button) findViewById(R.id.btnN);
        btnO = (Button) findViewById(R.id.btnO);
        btnP = (Button) findViewById(R.id.btnP);
        btnQ = (Button) findViewById(R.id.btnQ);
        btnR = (Button) findViewById(R.id.btnR);
        btnS = (Button) findViewById(R.id.btnS);
        btnT = (Button) findViewById(R.id.btnT);
        btnU = (Button) findViewById(R.id.btnU);
        btnV = (Button) findViewById(R.id.btnV);
        btnW = (Button) findViewById(R.id.btnW);
        btnX = (Button) findViewById(R.id.btnX);
        btnY = (Button) findViewById(R.id.btnY);
        btnZ = (Button) findViewById(R.id.btnZ);
    }

    public void onClickButA(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.a1);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.welcome_animation);
        btnA.startAnimation(animation);
    }

    public void onClickButB(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.a2);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        btnB.startAnimation(animation);
    }


    public void onClickButC(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.a3);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
        btnC.startAnimation(animation);

    }


    public void onClickButD(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.a4);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        btnD.startAnimation(animation);

    }


    public void onClickButE(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.a5);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.welcome_animation);
        btnE.startAnimation(animation);

    }

    public void onClickButF(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.a6);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        btnF.startAnimation(animation);

    }


    public void onClickButG(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.a7);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
        btnG.startAnimation(animation);

    }


    public void onClickButH(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.a8);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        btnH.startAnimation(animation);

    }


    public void onClickButI(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.a9);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();


        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.welcome_animation);
        btnI.startAnimation(animation);

    }


    public void onClickButJ(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.a10);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        btnJ.startAnimation(animation);

    }

    public void onClickButK(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.a11);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
        btnK.startAnimation(animation);

    }

    public void onClickButL(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.a12);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        btnL.startAnimation(animation);
    }


    public void onClickButM(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.a13);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.welcome_animation);
        btnM.startAnimation(animation);

    }


    public void onClickButN(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.a14);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        btnN.startAnimation(animation);

    }


    public void onClickButO(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.a15);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
        btnO.startAnimation(animation);

    }


    public void onClickButP(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.a16);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        btnP.startAnimation(animation);

    }


    public void onClickButQ(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.a17);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.welcome_animation);
        btnQ.startAnimation(animation);

    }


    public void onClickButR(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.a18);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();


        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        btnR.startAnimation(animation);
    }


    public void onClickButS(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.a19);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
        btnS.startAnimation(animation);

    }


    public void onClickButT(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.a20);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        btnT.startAnimation(animation);
    }


    public void onClickButU(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.a21);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.welcome_animation);
        btnU.startAnimation(animation);
    }

    public void onClickButV(View view) {
        mp.release();
        mp = MediaPlayer.create(this, R.raw.a22);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        btnV.startAnimation(animation);

    }


    public void onClickButW(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.a23);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
        btnW.startAnimation(animation);

    }

    public void onClickButX(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.a24);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        btnX.startAnimation(animation);

    }


    public void onClickButY(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.a25);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.welcome_animation);
        btnY.startAnimation(animation);

    }


    public void onClickButZ(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.a26);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        btnA.startAnimation(animation);

    }
}
