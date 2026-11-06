package com.amazon.alexa.voice.apl;

import com.amazon.alexa.device.api.DeviceInformation;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes19.dex */
public final class AplModule {
    private AplModule() {
    }

    @Provides
    @Singleton
    public static AplFeatureEnabler provideAplFeatureEnabler(DeviceInformation deviceInformation) {
        return new AplFeatureEnabler(deviceInformation);
    }
}
