package com.amazon.apl.android.audio;

import androidx.annotation.NonNull;
import com.amazon.apl.android.providers.ITtsPlayerProvider;
import com.amazon.common.BoundObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class AudioPlayerFactoryProxy extends BoundObject {
    private final IAudioPlayerFactory mAudioPlayerFactory;

    public AudioPlayerFactoryProxy(@NonNull IAudioPlayerFactory iAudioPlayerFactory) {
        bind(nCreate());
        this.mAudioPlayerFactory = iAudioPlayerFactory;
    }

    private AudioPlayer createPlayer(long j) {
        return new AudioPlayer(j, getAudioProvider());
    }

    private native long nCreate();

    public ITtsPlayerProvider getAudioProvider() {
        return this.mAudioPlayerFactory.getTtsPlayerProvider();
    }
}
