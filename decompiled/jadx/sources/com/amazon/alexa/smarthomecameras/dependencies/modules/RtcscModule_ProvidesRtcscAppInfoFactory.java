package com.amazon.alexa.smarthomecameras.dependencies.modules;

import com.amazon.rtcsc.interfaces.RtcscAppInfo;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class RtcscModule_ProvidesRtcscAppInfoFactory implements Factory<RtcscAppInfo> {
    private static final RtcscModule_ProvidesRtcscAppInfoFactory INSTANCE = new RtcscModule_ProvidesRtcscAppInfoFactory();

    public static RtcscModule_ProvidesRtcscAppInfoFactory create() {
        return INSTANCE;
    }

    public static RtcscAppInfo providesRtcscAppInfo() {
        return (RtcscAppInfo) Preconditions.checkNotNull(RtcscModule.providesRtcscAppInfo(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public RtcscAppInfo get() {
        return providesRtcscAppInfo();
    }
}
