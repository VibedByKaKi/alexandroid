package com.amazon.alexa.handsfree.uservoicerecognition.audio;

import android.content.Context;
import android.media.MediaPlayer;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import com.amazon.alexa.handsfree.uservoicerecognition.ui.steps.StepsContract;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class TrainingSoundPlayer implements StepsContract.SoundPlayer {
    private static final String TAG = "TrainingSoundPlayer";
    private final Context mContext;
    private MediaPlayer mMediaPlayer;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @VisibleForTesting
    public class MediaPlayerCallback implements MediaPlayer.OnCompletionListener {
        private final StepsContract.SoundPlayer.SoundCallback mSoundCallback;

        public MediaPlayerCallback(@Nullable StepsContract.SoundPlayer.SoundCallback soundCallback) {
            this.mSoundCallback = soundCallback;
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(@NonNull MediaPlayer mediaPlayer) {
            Log.d(TrainingSoundPlayer.TAG, "playSound onSilence");
            StepsContract.SoundPlayer.SoundCallback soundCallback = this.mSoundCallback;
            if (soundCallback != null) {
                soundCallback.onSilence();
            }
            mediaPlayer.reset();
            mediaPlayer.release();
            TrainingSoundPlayer.this.mMediaPlayer = null;
        }
    }

    public TrainingSoundPlayer(@NonNull Context context) {
        this.mContext = context;
    }

    @VisibleForTesting
    public MediaPlayer createMediaPlayer(@RawRes int i) {
        return MediaPlayer.create(this.mContext, i);
    }

    @Override // com.amazon.alexa.handsfree.uservoicerecognition.ui.steps.StepsContract.SoundPlayer
    public void playSound(@NonNull TrainingSound trainingSound, @Nullable StepsContract.SoundPlayer.SoundCallback soundCallback) {
        Log.d(TAG, "playSound called with TrainingSound: " + trainingSound.name());
        MediaPlayer createMediaPlayer = createMediaPlayer(trainingSound.getResourceId());
        this.mMediaPlayer = createMediaPlayer;
        createMediaPlayer.start();
        this.mMediaPlayer.setOnCompletionListener(new MediaPlayerCallback(soundCallback));
    }
}
