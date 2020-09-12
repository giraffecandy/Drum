package app.babachan.drum

import android.media.AudioAttributes
import android.media.SoundPool
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var mSoundPool: SoundPool
    private lateinit var mSoundId: Array<Int?>

    private val mSoundResource = arrayOf(
        R.raw.cymbal1,
        R.raw.cymbal2,
        R.raw.cymbal3,
        R.raw.tom1,
        R.raw.tom2,
        R.raw.tom3,
        R.raw.hihat,
        R.raw.snare,
        R.raw.bass
    )


    override fun onResume() {
        super.onResume()

        val audioAttributes = AudioAttributes.Builder()
            .setUsage(AudioAttributes.USAGE_MEDIA)
            .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
            .build()

        mSoundPool = SoundPool.Builder()
            .setAudioAttributes(audioAttributes)
            .setMaxStreams(mSoundResource.size)
            .build()

        mSoundId = arrayOfNulls(mSoundResource.size)

        for (i in 0..(mSoundResource.size - 1)) {
            mSoundId[i] = mSoundPool.load(applicationContext, mSoundResource[i], 0)
        }

        cym1Button2.setOnClickListener {
            if (mSoundId[0] != null){
                mSoundPool.play(mSoundId[0] as Int, 1.0F, 1.0F, 0, 0, 1.0F)
            }
        }

        cym2Button3.setOnClickListener {
            if (mSoundId[1] != null){
                mSoundPool.play(mSoundId[0] as Int, 1.0F, 1.0F, 0, 0, 1.0F)
            }
        }
        cym3Button4.setOnClickListener {
            if (mSoundId[2] != null){
                mSoundPool.play(mSoundId[0] as Int, 1.0F, 1.0F, 0, 0, 1.0F)
            }
        }
        tom1Button6.setOnClickListener {
            if (mSoundId[3] != null){
                mSoundPool.play(mSoundId[0] as Int, 1.0F, 1.0F, 0, 0, 1.0F)
            }
        }
        tom2Button7.setOnClickListener {
            if (mSoundId[4] != null){
                mSoundPool.play(mSoundId[0] as Int, 1.0F, 1.0F, 0, 0, 1.0F)
            }
        }
        tom3Button8.setOnClickListener {
            if (mSoundId[5] != null){
                mSoundPool.play(mSoundId[0] as Int, 1.0F, 1.0F, 0, 0, 1.0F)
            }
        }

        hihatButton.setOnClickListener {
            if (mSoundId[6] != null){
                mSoundPool.play(mSoundId[0] as Int, 1.0F, 1.0F, 0, 0, 1.0F)
            }
        }

        snareButton5.setOnClickListener {
            if (mSoundId[7] != null){
                mSoundPool.play(mSoundId[0] as Int, 1.0F, 1.0F, 0, 0, 1.0F)
            }
        }

        bassButton.setOnClickListener {
            if (mSoundId[8] != null){
                mSoundPool.play(mSoundId[0] as Int, 1.0F, 1.0F, 0, 0, 1.0F)
            }
        }

    }
    override fun onDestroy() {
        super.onDestroy()

        mSoundPool.release()
    }


}
