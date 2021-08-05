package bd.com.websolutionsmb.www.shishupath;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class Gonona extends Activity {
    MediaPlayer mp = new MediaPlayer();
    Button but1, but2, but3, but4, but5, but6, but7, but8, but9, but10, but11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gonona);


        but1 = (Button) findViewById(R.id.but1);
        but2 = (Button) findViewById(R.id.but2);
        but3 = (Button) findViewById(R.id.but3);
        but4 = (Button) findViewById(R.id.but4);
        but5 = (Button) findViewById(R.id.but5);
        but6 = (Button) findViewById(R.id.but6);
        but7 = (Button) findViewById(R.id.but7);
        but8 = (Button) findViewById(R.id.but8);
        but9 = (Button) findViewById(R.id.but9);
        but10 = (Button) findViewById(R.id.but10);


    }


    public void onClickBut1(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.b1);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.welcome_animation);
        but1.startAnimation(animation);


    }

    public void onClickBut2(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.b2);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        but2.startAnimation(animation);


    }

    public void onClickBut3(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.b3);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
        but3.startAnimation(animation);


    }

    public void onClickBut4(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.b4);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide);
        but4.startAnimation(animation);


    }

    public void onClickBut5(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.b5);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        but5.startAnimation(animation);


    }

    public void onClickBut6(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.b6);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
        but6.startAnimation(animation);


    }

    public void onClickBut7(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.b7);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.welcome_animation);
        but7.startAnimation(animation);


    }

    public void onClickBut8(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.b8);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        but8.startAnimation(animation);

    }

    public void onClickBut9(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.b9);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        but9.startAnimation(animation);


    }

    public void onClickBut10(View view) {

        mp.reset();
        mp.release();
        mp = MediaPlayer.create(this, R.raw.b10);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.seekTo(0);
        mp.start();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
        but10.startAnimation(animation);


    }

    public static class Chora extends Activity {
        MediaPlayer mp = new MediaPlayer();
        Button play1, play2, play3, play4, play5, play6, play7, play8, play9, play10, play11, play15, play16, play17, play18, play19, play20, play21, play22, play23, play25, play26, play27, play28, play29, play30, play32, play33, play34, play36;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_chora);

            play1 = (Button) findViewById(R.id.btnplay1);
            play2 = (Button) findViewById(R.id.btnplay2);
            play3 = (Button) findViewById(R.id.btnplay3);
            play4 = (Button) findViewById(R.id.btnplay4);
            play5 = (Button) findViewById(R.id.btnplay5);
            play6 = (Button) findViewById(R.id.btnplay6);
            play7 = (Button) findViewById(R.id.btnplay7);
            play8 = (Button) findViewById(R.id.btnplay8);
            play9 = (Button) findViewById(R.id.btnplay9);
            play10 = (Button) findViewById(R.id.btnplay10);
            play11 = (Button) findViewById(R.id.btnplay11);


            play15 = (Button) findViewById(R.id.btnplay15);
            play16 = (Button) findViewById(R.id.btnplay16);
            play17 = (Button) findViewById(R.id.btnplay17);
            play18 = (Button) findViewById(R.id.btnplay18);
            play19 = (Button) findViewById(R.id.btnplay19);
            play20 = (Button) findViewById(R.id.btnplay20);
            play21 = (Button) findViewById(R.id.btnplay21);
            play22 = (Button) findViewById(R.id.btnplay22);
            play23 = (Button) findViewById(R.id.btnplay23);

            play25 = (Button) findViewById(R.id.btnplay25);
            play26 = (Button) findViewById(R.id.btnplay26);
            play27 = (Button) findViewById(R.id.btnplay27);
            play28 = (Button) findViewById(R.id.btnplay28);
            play29 = (Button) findViewById(R.id.btnplay29);
            play30 = (Button) findViewById(R.id.btnplay30);
            play32 = (Button) findViewById(R.id.btnplay32);
            play33 = (Button) findViewById(R.id.btnplay33);
            play34 = (Button) findViewById(R.id.btnplay34);
            play36 = (Button) findViewById(R.id.btnplay36);


        }

        public void onClickPlay1(View view) {

            mp.reset();
            mp.release();
            mp = MediaPlayer.create(this, R.raw.ata);
            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
            mp.seekTo(0);
            mp.start();
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
            play1.startAnimation(animation);
        }

        public void onClickPlay2(View view) {

            mp.reset();
            mp.release();
            mp = MediaPlayer.create(this, R.raw.hatima);
            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
            mp.seekTo(0);
            mp.start();

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
            play2.startAnimation(animation);
        }

        public void onClickPlay3(View view) {

            mp.reset();
            mp.release();
            mp = MediaPlayer.create(this, R.raw.chadma);
            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
            mp.seekTo(0);
            mp.start();

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
            play3.startAnimation(animation);

        }

        public void onClickPlay4(View view) {

            mp.reset();
            mp.release();
            mp = MediaPlayer.create(this, R.raw.ghumpa);
            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
            mp.seekTo(0);
            mp.start();

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
            play4.startAnimation(animation);
        }


        public void onClickPlay5(View view) {

            mp.reset();
            mp.release();
            mp = MediaPlayer.create(this, R.raw.ampata);
            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
            mp.seekTo(0);
            mp.start();

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);

            play5.startAnimation(animation);


        }

        public void onClickPlay6(View view) {
            mp.reset();
            mp.release();
            mp = MediaPlayer.create(this, R.raw.aybristi);
            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
            mp.seekTo(0);
            mp.start();
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
            play6.startAnimation(animation);
            play5.startAnimation(animation);
        }

        public void onClickPlay7(View view) {

            mp.reset();
            mp.release();
            mp = MediaPlayer.create(this, R.raw.bakbakum);
            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
            mp.seekTo(0);
            mp.start();

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
            play7.startAnimation(animation);
        }

        public void onClickPlay8(View view) {

            mp.reset();
            mp.release();
            mp = MediaPlayer.create(this, R.raw.chadut);
            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
            mp.seekTo(0);
            mp.start();

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
            play8.startAnimation(animation);
        }

        public void onClickPlay9(View view) {

            mp.reset();
            mp.release();
            mp = MediaPlayer.create(this, R.raw.aytie);
            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
            mp.seekTo(0);
            mp.start();

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
            play9.startAnimation(animation);


        }

        public void onClickPlay10(View view) {

            mp.reset();
            mp.release();
            mp = MediaPlayer.create(this, R.raw.okane);
            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
            mp.seekTo(0);
            mp.start();

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
            play10.startAnimation(animation);


        }

        public void onClickPlay11(View view) {

            mp.reset();
            mp.release();
            mp = MediaPlayer.create(this, R.raw.koremay);
            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
            mp.seekTo(0);
            mp.start();

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
            play11.startAnimation(animation);


        }


        public void onClickPlay15(View view) {

            mp.reset();
            mp.release();
            mp = MediaPlayer.create(this, R.raw.aikorini);
            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
            mp.seekTo(0);
            mp.start();

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
            play15.startAnimation(animation);


        }


        public void onClickPlay16(View view) {

            mp.reset();
            mp.release();
            mp = MediaPlayer.create(this, R.raw.skaleuti);
            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
            mp.seekTo(0);
            mp.start();

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
            play16.startAnimation(animation);


        }


        public void onClickPlay17(View view) {

            mp.reset();
            mp.release();
            mp = MediaPlayer.create(this, R.raw.supaki);
            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
            mp.seekTo(0);
            mp.start();

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
            play17.startAnimation(animation);


        }

        public void onClickPlay18(View view) {

            mp.reset();
            mp.release();
            mp = MediaPlayer.create(this, R.raw.kukasosu);
            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
            mp.seekTo(0);
            mp.start();

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
            play18.startAnimation(animation);


        }

        public void onClickPlay19(View view) {

            mp.reset();
            mp.release();
            mp = MediaPlayer.create(this, R.raw.beholo);
            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
            mp.seekTo(0);
            mp.start();

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
            play19.startAnimation(animation);


        }


        public void onClickPlay20(View view) {

            mp.reset();
            mp.release();
            mp = MediaPlayer.create(this, R.raw.kugeche);
            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
            mp.seekTo(0);
            mp.start();

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
            play20.startAnimation(animation);


        }

        public void onClickPlay21(View view) {

            mp.reset();
            mp.release();
            mp = MediaPlayer.create(this, R.raw.duldul);
            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
            mp.seekTo(0);
            mp.start();

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
            play21.startAnimation(animation);


        }

        public void onClickPlay22(View view) {

            mp.reset();
            mp.release();
            mp = MediaPlayer.create(this, R.raw.train);
            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
            mp.seekTo(0);
            mp.start();

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
            play22.startAnimation(animation);


        }

        public void onClickPlay23(View view) {

            mp.reset();
            mp.release();
            mp = MediaPlayer.create(this, R.raw.sojji);
            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
            mp.seekTo(0);
            mp.start();

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
            play23.startAnimation(animation);


        }


        public void onClickPlay25(View view) {

            mp.reset();
            mp.release();
            mp = MediaPlayer.create(this, R.raw.amihobo);
            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
            mp.seekTo(0);
            mp.start();

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
            play25.startAnimation(animation);


        }

        public void onClickPlay26(View view) {

            mp.reset();
            mp.release();
            mp = MediaPlayer.create(this, R.raw.sunanace);
            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
            mp.seekTo(0);
            mp.start();

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
            play26.startAnimation(animation);


        }

        public void onClickPlay27(View view) {

            mp.reset();
            mp.release();
            mp = MediaPlayer.create(this, R.raw.kuku);
            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
            mp.seekTo(0);
            mp.start();

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
            play27.startAnimation(animation);


        }

        public void onClickPlay28(View view) {

            mp.reset();
            mp.release();
            mp = MediaPlayer.create(this, R.raw.nuton);
            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
            mp.seekTo(0);
            mp.start();

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
            play28.startAnimation(animation);


        }

        public void onClickPlay29(View view) {

            mp.reset();
            mp.release();
            mp = MediaPlayer.create(this, R.raw.taitai);
            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
            mp.seekTo(0);
            mp.start();

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
            play29.startAnimation(animation);


        }

        public void onClickPlay30(View view) {

            mp.reset();
            mp.release();
            mp = MediaPlayer.create(this, R.raw.udbiral);
            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
            mp.seekTo(0);
            mp.start();

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
            play30.startAnimation(animation);


        }

        public void onClickPlay32(View view) {

            mp.reset();
            mp.release();
            mp = MediaPlayer.create(this, R.raw.kukondak);
            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
            mp.seekTo(0);
            mp.start();

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
            play32.startAnimation(animation);


        }

        public void onClickPlay33(View view) {

            mp.reset();
            mp.release();
            mp = MediaPlayer.create(this, R.raw.tatir);
            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
            mp.seekTo(0);
            mp.start();

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
            play33.startAnimation(animation);


        }

        public void onClickPlay34(View view) {

            mp.reset();
            mp.release();
            mp = MediaPlayer.create(this, R.raw.amarma);
            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
            mp.seekTo(0);
            mp.start();

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
            play34.startAnimation(animation);


        }

        public void onClickPlay36(View view) {

            mp.reset();
            mp.release();
            mp = MediaPlayer.create(this, R.raw.ayremeni);
            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
            mp.seekTo(0);
            mp.start();

            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
            play36.startAnimation(animation);


        }


        @Override
        public void onBackPressed() {
            Intent intent = new Intent(this, Shishupath.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            mp.stop();
            finish();
        }
    }
}
