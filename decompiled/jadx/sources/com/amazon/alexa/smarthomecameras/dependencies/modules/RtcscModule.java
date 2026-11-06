package com.amazon.alexa.smarthomecameras.dependencies.modules;

import com.amazon.rtcsc.interfaces.RtcscAppInfo;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes19.dex */
public abstract class RtcscModule {
    private static final String RTCSC_APP_CLIENT_NAME = "SmartHome-LiveView";

    @Provides
    @Singleton
    public static RtcscAppInfo providesRtcscAppInfo() {
        return new RtcscAppInfo(RTCSC_APP_CLIENT_NAME);
    }
}
