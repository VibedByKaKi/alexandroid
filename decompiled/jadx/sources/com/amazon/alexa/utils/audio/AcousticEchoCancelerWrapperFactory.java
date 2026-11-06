package com.amazon.alexa.utils.audio;

import android.media.AudioRecord;
import android.media.audiofx.AcousticEchoCanceler;
import android.util.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class AcousticEchoCancelerWrapperFactory {
    private static final String TAG = "AcousticEchoCancelerWrapperFactory";
    private static final NoOpAcousticEchoCancelerWrapper nop = new NoOpAcousticEchoCancelerWrapper();

    public AcousticEchoCancelerWrapper create(AudioRecord audioRecord) {
        if (audioRecord == null) {
            return nop;
        }
        if (!AcousticEchoCanceler.isAvailable()) {
            Log.w(TAG, "AEC is not available");
            return nop;
        }
        AcousticEchoCanceler create = AcousticEchoCanceler.create(audioRecord.getAudioSessionId());
        if (create != null) {
            return new DefaultAcousticEchoCancelerWrapper(create);
        }
        Log.w(TAG, "Couldn't create AEC");
        return nop;
    }
}
