package com.timsoft.tim.newwavesoundboard;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;
import android.util.SparseArray;

import java.io.Serializable;

/**
 * Created by Tim on 25-07-16.
 */
public class SoundManager implements Serializable{

        public static int CHIEFKEEF_BANG         = 0;
        public static int CHIEFKEEF_BANGBANG              = 1;
        public static int DESIIGNER_RAH            = 2;
        public static int DESIIGNER_YEH             = 3;
        public static int FAMOUSDEX_OHHMANN            = 4;
        public static int FAMOUSDEX_YEAH            = 5;
        public static int FETTYWAP_AYE      = 6;
        public static int FETTYWAP_YEAHBABY          = 7;
        public static int FUTURE_GUCCI   = 8;
        public static int GUCCIMANE_BITCHIMIGHT            = 9;
        public static int GUCCIMANE_BURR             = 10;
        public static int GUCCIMANE_MINDBLOWING            = 11;
        public static int GUCCIMANE_SGOOCI            = 12;
        public static int LILUZI_YEAH1      = 13;
        public static int LILUZI_YEAH2          = 14;
        public static int LILUZI_YEAH3   = 15;
        public static int LILYACHTY_LILBOAT             = 16;
        public static int QUAVO_MIGO            = 17;
        public static int QUAVO_UGH            = 18;
        public static int TRAVIS_ITSLIT      = 19;
        public static int TRAVIS_STRAIGHTUP          = 20;

        public static boolean isSoundTurnedOff;

        private static SoundManager mSoundManager;

        protected SoundPool mSoundPool;
        protected SparseArray<Integer> mSoundPoolMap;
        protected AudioManager mAudioManager;

        public static final int maxSounds = 4;

        public static SoundManager getInstance(Context context)
        {
            if (mSoundManager == null){
                mSoundManager = new SoundManager(context);
            }

            return mSoundManager;
        }

        public SoundManager(Context mContext)
        {
            mAudioManager = (AudioManager)mContext.getSystemService(Context.AUDIO_SERVICE);
            mSoundPool = new SoundPool(maxSounds, AudioManager.STREAM_MUSIC, 0);

//        mSoundPool.setOnLoadCompleteListener(new OnLoadCompleteListener() {
//            public void onLoadComplete(SoundPool soundPool, int sampleId,int status) {
//               loaded = true;
//            }
//        });

            mSoundPoolMap = new SparseArray<Integer>();
            mSoundPoolMap.put(CHIEFKEEF_BANG, mSoundPool.load(mContext, R.raw.chiefkeef_bang, 1));
            mSoundPoolMap.put(CHIEFKEEF_BANGBANG, mSoundPool.load(mContext, R.raw.chiefkeef_bangbang, 1));
            mSoundPoolMap.put(DESIIGNER_RAH, mSoundPool.load(mContext, R.raw.desiigner_rahhh, 1));
            mSoundPoolMap.put(DESIIGNER_YEH, mSoundPool.load(mContext, R.raw.desiigner_yeha, 1));
            mSoundPoolMap.put(FAMOUSDEX_OHHMANN, mSoundPool.load(mContext, R.raw.famousdex_ohhmanngoddamm, 1));
            mSoundPoolMap.put(FAMOUSDEX_YEAH, mSoundPool.load(mContext, R.raw.famousdex_yeah, 1));
            mSoundPoolMap.put(FETTYWAP_AYE, mSoundPool.load(mContext, R.raw.fettywap_aye, 1));
            mSoundPoolMap.put(FETTYWAP_YEAHBABY, mSoundPool.load(mContext, R.raw.fettywap_yeahbaby, 1));

            mSoundPoolMap.put(FUTURE_GUCCI, mSoundPool.load(mContext, R.raw.future_gucciflipflops, 1));
            mSoundPoolMap.put(GUCCIMANE_BITCHIMIGHT, mSoundPool.load(mContext, R.raw.guccimane_bitchimightbe, 1));
            mSoundPoolMap.put(GUCCIMANE_BURR, mSoundPool.load(mContext, R.raw.guccimane_burr, 1));
            mSoundPoolMap.put(GUCCIMANE_MINDBLOWING, mSoundPool.load(mContext, R.raw.guccimane_mindblowing, 1));
            mSoundPoolMap.put(GUCCIMANE_SGOOCI, mSoundPool.load(mContext, R.raw.guccimane_sgooci, 1));
            mSoundPoolMap.put(LILUZI_YEAH1, mSoundPool.load(mContext, R.raw.liluzivert_yeah1, 1));
            mSoundPoolMap.put(LILUZI_YEAH2, mSoundPool.load(mContext, R.raw.liluzivert_yeah2, 1));
            mSoundPoolMap.put(LILUZI_YEAH3, mSoundPool.load(mContext, R.raw.liluzivert_yeah3, 1));

            mSoundPoolMap.put(LILYACHTY_LILBOAT, mSoundPool.load(mContext, R.raw.lilyachty_lilboat, 1));
            mSoundPoolMap.put(QUAVO_MIGO, mSoundPool.load(mContext, R.raw.quavo_migo, 1));
            mSoundPoolMap.put(QUAVO_UGH, mSoundPool.load(mContext, R.raw.quavo_ugh, 1));
            mSoundPoolMap.put(TRAVIS_ITSLIT, mSoundPool.load(mContext, R.raw.travis_itslit, 1));
            mSoundPoolMap.put(TRAVIS_STRAIGHTUP, mSoundPool.load(mContext, R.raw.travis_straightup, 1));

        }

        public void playSound(int index) {
            if (isSoundTurnedOff)
                return;

            int streamVolume = mAudioManager.getStreamVolume(AudioManager.STREAM_MUSIC);
            mSoundPool.play(mSoundPoolMap.get(index), streamVolume, streamVolume, 1, 0, 1f);
        }

        public static void clear()
        {
            if (mSoundManager != null){
                mSoundManager.mSoundPool = null;
                mSoundManager.mAudioManager = null;
                mSoundManager.mSoundPoolMap = null;
            }
            mSoundManager = null;
        }

}
