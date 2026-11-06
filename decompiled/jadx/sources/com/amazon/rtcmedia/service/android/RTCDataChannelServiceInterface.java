package com.amazon.rtcmedia.service.android;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface RTCDataChannelServiceInterface {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface RTCDataChannelListenerInterface {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum State {
            CONNECTING,
            OPEN,
            CLOSING,
            CLOSED
        }

        void onMessageReceived(String str, String str2, byte[] bArr, boolean z);

        void onStateChange(String str, String str2, State state);
    }

    boolean registerDataChannelListener(String str, RTCDataChannelListenerInterface rTCDataChannelListenerInterface);

    boolean sendData(String str, String str2, byte[] bArr, boolean z);

    boolean unregisterDataChannelListener(String str);
}
