package com.amazon.alexa.client.alexaservice.audio.core;

import android.media.AudioManager;
import android.media.AudioPlaybackConfiguration;
import dagger.Lazy;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class AudioManagerWrapper {
    private static final int ANDROID_MIN_VOLUME = 0;
    private static final int DEFAULT_FLAG_NO_AUDIO_VIDEO = 0;
    private final Lazy<AudioManager> audioManagerLazy;

    @Inject
    public AudioManagerWrapper(Lazy<AudioManager> lazy) {
        this.audioManagerLazy = lazy;
    }

    private int convertFromAVSVolume(long j) {
        return (int) ((j * this.audioManagerLazy.get().getStreamMaxVolume(3)) / 100.0d);
    }

    private int convertToAVSVolume(long j) {
        return (int) Math.round((j * 100.0d) / this.audioManagerLazy.get().getStreamMaxVolume(3));
    }

    private int getVolumefromAudioManager() {
        return this.audioManagerLazy.get().getStreamVolume(3);
    }

    public void adjustVolume(long j) {
        int convertFromAVSVolume = convertFromAVSVolume(j) + getVolumefromAudioManager();
        if (convertFromAVSVolume > this.audioManagerLazy.get().getStreamMaxVolume(3)) {
            convertFromAVSVolume = this.audioManagerLazy.get().getStreamMaxVolume(3);
        }
        if (convertFromAVSVolume < 0) {
            convertFromAVSVolume = 0;
        }
        this.audioManagerLazy.get().setStreamVolume(3, convertFromAVSVolume, 0);
    }

    public boolean getMuteStatus() {
        return this.audioManagerLazy.get().isStreamMute(3);
    }

    public int getVolume() {
        return convertToAVSVolume(getVolumefromAudioManager());
    }

    public boolean hasActiveMedia() {
        List<AudioPlaybackConfiguration> activePlaybackConfigurations = this.audioManagerLazy.get().getActivePlaybackConfigurations();
        if (activePlaybackConfigurations.isEmpty()) {
            return false;
        }
        Iterator<AudioPlaybackConfiguration> it2 = activePlaybackConfigurations.iterator();
        while (it2.hasNext()) {
            if (it2.next().getAudioAttributes().getUsage() == 1) {
                return true;
            }
        }
        return false;
    }

    public void setMute(boolean z) {
        this.audioManagerLazy.get().adjustSuggestedStreamVolume(z ? -100 : 100, 3, 0);
    }

    public void setVolume(long j) {
        this.audioManagerLazy.get().setStreamVolume(3, convertFromAVSVolume(j), 0);
    }
}
