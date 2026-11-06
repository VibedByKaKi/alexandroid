package com.amazon.rtcsc.capabilityagent.common.dependencies;

import android.content.Context;
import com.amazon.rtcsc.capabilityagent.common.util.RtcscLogger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class RtcscDaggerWrapper {
    static RtcscComponent mRtcscLibraryComponent;

    private RtcscDaggerWrapper() {
    }

    public static RtcscComponent getComponent() {
        if (mRtcscLibraryComponent == null) {
            RtcscLogger.i("RtcscDaggerWrapper", "getComponent -- mRtcscLibraryComponent is NULL. ", new Object[0]);
        }
        return mRtcscLibraryComponent;
    }

    public static RtcscComponent initialize(Context context) {
        RtcscLogger.i("RtcscDaggerWrapper", "initialize -- Initializing the Library Components ", new Object[0]);
        RtcscComponent build = DaggerRtcscComponent.builder().applicationModule(new ApplicationModule(context)).build();
        mRtcscLibraryComponent = build;
        return build;
    }
}
