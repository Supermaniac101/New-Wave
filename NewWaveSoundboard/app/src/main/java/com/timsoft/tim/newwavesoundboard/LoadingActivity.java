package com.timsoft.tim.newwavesoundboard;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;


import java.util.concurrent.TimeUnit;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class LoadingActivity extends AppCompatActivity {

    @InjectView(R.id.textView) protected TextView mainLabel;

    //row 1 ______________________________________________
    @InjectView(R.id.chiefkeef1) protected ImageView keef1;
    @InjectView(R.id.chiefkeef2) protected ImageView keef2;
    @InjectView(R.id.desiigner1) protected ImageView desiigner1;
    //row 2 ______________________________________________
    @InjectView(R.id.desiigner2) protected ImageView desiigner2;
    @InjectView(R.id.famousdex1) protected ImageView dex1;
    @InjectView(R.id.famousdex2) protected ImageView dex2;
    //row 3 ______________________________________________
    @InjectView(R.id.fetty1) protected ImageView fetty1;
    @InjectView(R.id.fetty2) protected ImageView fetty2;
    @InjectView(R.id.future1) protected ImageView future1;
    //row 4 ______________________________________________
    @InjectView(R.id.gucci1) protected ImageView gucci1;
    @InjectView(R.id.gucci2) protected ImageView gucci2;
    @InjectView(R.id.gucci3) protected ImageView gucci3;
    //row 5 ______________________________________________
    @InjectView(R.id.gucci4) protected ImageView gucci4;
    @InjectView(R.id.liluzi1) protected ImageView liluzi1;
    @InjectView(R.id.liluzi2) protected ImageView liluzi2;
    //row 6 ______________________________________________
    @InjectView(R.id.liluzi3) protected ImageView liluzi3;
    @InjectView(R.id.lilyachty1) protected ImageView lilyachty1;
    @InjectView(R.id.quavo1) protected ImageView quavo1;
    //row 7 ______________________________________________
    @InjectView(R.id.quavo2) protected ImageView quavo2;
    @InjectView(R.id.travis1) protected ImageView travis1;
    @InjectView(R.id.travis2) protected ImageView travis2;

    private SoundManager sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_loading);

        ButterKnife.inject(this);
        Typeface tf = Typeface.createFromAsset(this.getAssets(),
                "billy.ttf");
        mainLabel.setTypeface(tf);
        sound = new SoundManager(this);

    }

    @Override
    protected void onStart(){
        super.onStart();
        setIconListeners();
    }

    private void setIconListeners(){

        keef1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runOnUiThread(new Runnable() {
                    public void run() {
                        YoYo.with(Techniques.Bounce).duration(600).playOn(keef1);
                    }
                });
                sound.mSoundPool.play(sound.mSoundPoolMap.get(0), 1f, 1f, 1, 0, 1f);

//                Toast.makeText(LoadingActivity.this,
//                        "Pressed",
//                        Toast.LENGTH_SHORT).show();
            }
        });

        keef2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runOnUiThread(new Runnable() {
                    public void run() {
                        YoYo.with(Techniques.Bounce).duration(600).playOn(keef2);
                    }
                });
                sound.mSoundPool.play(sound.mSoundPoolMap.get(1), 1f, 1f, 1, 0, 1f);
            }
        });

        desiigner1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runOnUiThread(new Runnable() {
                    public void run() {
                        YoYo.with(Techniques.Bounce).duration(600).playOn(desiigner1);
                    }
                });
                sound.mSoundPool.play(sound.mSoundPoolMap.get(2), 1f, 1f, 1, 0, 1f);
            }
        });

        desiigner2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runOnUiThread(new Runnable() {
                    public void run() {
                        YoYo.with(Techniques.Bounce).duration(600).playOn(desiigner2);
                    }
                });
                sound.mSoundPool.play(sound.mSoundPoolMap.get(3), 1f, 1f, 1, 0, 1f);
            }
        });

        dex1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runOnUiThread(new Runnable() {
                    public void run() {
                        YoYo.with(Techniques.Bounce).duration(600).playOn(dex1);
                    }
                });
                sound.mSoundPool.play(sound.mSoundPoolMap.get(4), 1f, 1f, 1, 0, 1f);
            }
        });

        dex2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runOnUiThread(new Runnable() {
                    public void run() {
                        YoYo.with(Techniques.Bounce).duration(600).playOn(dex2);
                    }
                });
                sound.mSoundPool.play(sound.mSoundPoolMap.get(5), 1f, 1f, 1, 0, 1f);
            }
        });

        fetty1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runOnUiThread(new Runnable() {
                    public void run() {
                        YoYo.with(Techniques.Bounce).duration(600).playOn(fetty1);
                    }
                });
                sound.mSoundPool.play(sound.mSoundPoolMap.get(6), 1f, 1f, 1, 0, 1f);
            }
        });

        fetty2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runOnUiThread(new Runnable() {
                    public void run() {
                        YoYo.with(Techniques.Bounce).duration(600).playOn(fetty2);
                    }
                });
                sound.mSoundPool.play(sound.mSoundPoolMap.get(7), 1f, 1f, 1, 0, 1f);
            }
        });

        future1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runOnUiThread(new Runnable() {
                    public void run() {
                        YoYo.with(Techniques.Bounce).duration(600).playOn(future1);
                    }
                });
                sound.mSoundPool.play(sound.mSoundPoolMap.get(8), 1f, 1f, 1, 0, 1f);
            }
        });

        gucci1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runOnUiThread(new Runnable() {
                    public void run() {
                        YoYo.with(Techniques.Bounce).duration(600).playOn(gucci1);
                    }
                });
                sound.mSoundPool.play(sound.mSoundPoolMap.get(9), 1f, 1f, 1, 0, 1f);
            }
        });

        gucci2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runOnUiThread(new Runnable() {
                    public void run() {
                        YoYo.with(Techniques.Bounce).duration(600).playOn(gucci2);
                    }
                });
                sound.mSoundPool.play(sound.mSoundPoolMap.get(10), 1f, 1f, 1, 0, 1f);
            }
        });

        gucci3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runOnUiThread(new Runnable() {
                    public void run() {
                        YoYo.with(Techniques.Bounce).duration(600).playOn(gucci3);
                    }
                });
                sound.mSoundPool.play(sound.mSoundPoolMap.get(11), 1f, 1f, 1, 0, 1f);
            }
        });

        gucci4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runOnUiThread(new Runnable() {
                    public void run() {
                        YoYo.with(Techniques.Bounce).duration(600).playOn(gucci4);
                    }
                });
                sound.mSoundPool.play(sound.mSoundPoolMap.get(12), 1f, 1f, 1, 0, 1f);
            }
        });

        liluzi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runOnUiThread(new Runnable() {
                    public void run() {
                        YoYo.with(Techniques.Bounce).duration(600).playOn(liluzi1);
                    }
                });
                sound.mSoundPool.play(sound.mSoundPoolMap.get(13), 1f, 1f, 1, 0, 1f);
            }
        });

        liluzi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runOnUiThread(new Runnable() {
                    public void run() {
                        YoYo.with(Techniques.Bounce).duration(600).playOn(liluzi2);
                    }
                });
                sound.mSoundPool.play(sound.mSoundPoolMap.get(14), 1f, 1f, 1, 0, 1f);
            }
        });

        liluzi3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runOnUiThread(new Runnable() {
                    public void run() {
                        YoYo.with(Techniques.Bounce).duration(600).playOn(liluzi3);
                    }
                });
                sound.mSoundPool.play(sound.mSoundPoolMap.get(15), 1f, 1f, 1, 0, 1f);
            }
        });

        lilyachty1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runOnUiThread(new Runnable() {
                    public void run() {
                        YoYo.with(Techniques.Bounce).duration(600).playOn(lilyachty1);
                    }
                });
                sound.mSoundPool.play(sound.mSoundPoolMap.get(16), 1f, 1f, 1, 0, 1f);
            }
        });

        quavo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runOnUiThread(new Runnable() {
                    public void run() {
                        YoYo.with(Techniques.Bounce).duration(600).playOn(quavo1);
                    }
                });
                sound.mSoundPool.play(sound.mSoundPoolMap.get(17), 1f, 1f, 1, 0, 1f);
            }
        });

        quavo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runOnUiThread(new Runnable() {
                    public void run() {
                        YoYo.with(Techniques.Bounce).duration(600).playOn(quavo2);
                    }
                });
                sound.mSoundPool.play(sound.mSoundPoolMap.get(18), 1f, 1f, 1, 0, 1f);
            }
        });

        travis1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runOnUiThread(new Runnable() {
                    public void run() {
                        YoYo.with(Techniques.Bounce).duration(600).playOn(travis1);
                    }
                });
                sound.mSoundPool.play(sound.mSoundPoolMap.get(19), 1f, 1f, 1, 0, 1f);
            }
        });

        travis2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runOnUiThread(new Runnable() {
                    public void run() {
                        YoYo.with(Techniques.Bounce).duration(600).playOn(travis2);
                    }
                });
                sound.mSoundPool.play(sound.mSoundPoolMap.get(20), 1f, 1f, 1, 0, 1f);
            }
        });
    }

}
