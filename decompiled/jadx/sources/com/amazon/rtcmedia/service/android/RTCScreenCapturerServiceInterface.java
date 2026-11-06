package com.amazon.rtcmedia.service.android;

import android.content.Intent;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface RTCScreenCapturerServiceInterface {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface RTCScreenCapturerServiceListener {
        void onPutScreenCapturerData();

        void onScreenCapturerStop();
    }

    void putScreenCapturerData(String str, Intent intent);

    void registerScreenCapturerListener(String str, RTCScreenCapturerServiceListener rTCScreenCapturerServiceListener);

    void removeScreenCapturerData(String str);

    void setScreenCapturerDimensions(String str, int i, int i2);
}
