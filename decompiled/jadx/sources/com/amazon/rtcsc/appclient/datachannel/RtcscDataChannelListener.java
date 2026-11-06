package com.amazon.rtcsc.appclient.datachannel;

import com.amazon.rtcsc.interfaces.IRtcscDataChannelListener;
import com.amazon.rtcsc.interfaces.RtcscDataChannelState;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class RtcscDataChannelListener extends IRtcscDataChannelListener.Stub {
    @Override // com.amazon.rtcsc.interfaces.IRtcscDataChannelListener
    public int getAPIVersion() {
        return 1;
    }

    public void onMessageReceived(String str, String str2, byte[] bArr, boolean z) {
        throw new UnsupportedOperationException("onMessageReceived is not implemented.");
    }

    public void onStateChange(String str, String str2, RtcscDataChannelState rtcscDataChannelState) {
        throw new UnsupportedOperationException("onStateChange is not implemented.");
    }
}
