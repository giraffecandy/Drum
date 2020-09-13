package app.babachan.drum

import android.media.AudioAttributes
import android.media.SoundPool
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onResume() {
        super.onResume()

        lateinit var mSoundPool: SoundPool
        lateinit var mSoundId: Array<Int?>

        val mSoundResource = arrayOf(
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


        val audioAttributes = AudioAttributes.Builder()
            .setUsage(AudioAttributes.USAGE_MEDIA)
            .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
            .build()


        mSoundPool = SoundPool.Builder()
            .setAudioAttributes(audioAttributes)
            .setMaxStreams(mSoundResource.size)
            .build()

        mSoundId = arrayOfNulls(mSoundResource.size)

        for (i in mSoundResource.indices) {
            mSoundId[i] = mSoundPool.load(applicationContext, mSoundResource[i], 0)
        }

        val cym1Button: Button? = null
        val cym2Button:Button? = null
        val cym3Button:Button? = null
        val tom1Button:Button? = null
        val tom2Button:Button? = null
        val tom3Button:Button? = null
        val hihatButton:Button? = null
        val snareButton:Button? = null
        val bassButton:Button? = null


        if (cym1Button != null) {
            cym1Button.setOnClickListener {
                if (mSoundId[0] != null)
                    mSoundPool.play(mSoundId[0] as Int, 1.0F, 1.0F, 0, 0, 1.0F)

            }
        }

        if (cym2Button != null) {
            cym2Button.setOnClickListener {
                if (mSoundId[1] != null){
                    mSoundPool.play(mSoundId[0] as Int, 1.0F, 1.0F, 0, 0, 1.0F)
                }
            }
        }
        if (cym3Button != null) {
            cym3Button.setOnClickListener {
                if (mSoundId[2] != null){
                    mSoundPool.play(mSoundId[0] as Int, 1.0F, 1.0F, 0, 0, 1.0F)
                }
            }
        }
        if (tom1Button != null) {
            tom1Button.setOnClickListener {
                if (mSoundId[3] != null){
                    mSoundPool.play(mSoundId[0] as Int, 1.0F, 1.0F, 0, 0, 1.0F)
                }
            }
        }
        if (tom2Button != null) {
            tom2Button.setOnClickListener {
                if (mSoundId[4] != null){
                    mSoundPool.play(mSoundId[0] as Int, 1.0F, 1.0F, 0, 0, 1.0F)
                }
            }
        }
        if (tom3Button != null) {
            tom3Button.setOnClickListener {
                if (mSoundId[5] != null){
                    mSoundPool.play(mSoundId[0] as Int, 1.0F, 1.0F, 0, 0, 1.0F)
                }
            }
        }

        if (hihatButton != null) {
            hihatButton.setOnClickListener {
                if (mSoundId[6] != null){
                    mSoundPool.play(mSoundId[0] as Int, 1.0F, 1.0F, 0, 0, 1.0F)
                }
            }
        }

        if (snareButton != null) {
            snareButton.setOnClickListener {
                if (mSoundId[7] != null){
                    mSoundPool.play(mSoundId[0] as Int, 1.0F, 1.0F, 0, 0, 1.0F)
                }
            }
        }

        if (bassButton != null) {
            bassButton.setOnClickListener {
                if (mSoundId[8] != null){
                    mSoundPool.play(mSoundId[0] as Int, 1.0F, 1.0F, 0, 0, 1.0F)
                }
            }
        }

        fun onDestroy() {
            super.onDestroy()

            mSoundPool.release()
        }

    }


}
