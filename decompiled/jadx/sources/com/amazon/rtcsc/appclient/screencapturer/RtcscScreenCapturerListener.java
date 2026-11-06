package com.amazon.rtcsc.appclient.screencapturer;

import com.amazon.rtcsc.interfaces.IRtcscScreenCapturerListener;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class RtcscScreenCapturerListener extends IRtcscScreenCapturerListener.Stub {
    @Override // com.amazon.rtcsc.interfaces.IRtcscScreenCapturerListener
    public int getAPIVersion() {
        return 2;
    }

    @Override // com.amazon.rtcsc.interfaces.IRtcscScreenCapturerListener
    public void onPutScreenCapturerData() {
        throw new UnsupportedOperationException("onPutScreenCapturerData is not implemented in client application");
    }

    @Override // com.amazon.rtcsc.interfaces.IRtcscScreenCapturerListener
    public void onScreenCapturerStop() {
        throw new UnsupportedOperationException("onScreenCapturerStop is not implemented in client application");
    }
}
