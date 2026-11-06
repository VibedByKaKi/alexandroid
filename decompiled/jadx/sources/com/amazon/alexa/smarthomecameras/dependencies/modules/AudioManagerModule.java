package com.amazon.alexa.smarthomecameras.dependencies.modules;

import android.content.Context;
import com.amazon.alexa.smarthomecameras.audio.AudioManager;
import com.amazon.alexa.smarthomecameras.audio.DefaultAudioManager;
import com.amazon.alexa.smarthomecameras.rtcsc.CamerasAppClient;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes19.dex */
public abstract class AudioManagerModule {
    @Provides
    @Singleton
    public static AudioManager providesAudioManager(Context context, CamerasAppClient camerasAppClient) {
        return new DefaultAudioManager(context, camerasAppClient);
    }
}
