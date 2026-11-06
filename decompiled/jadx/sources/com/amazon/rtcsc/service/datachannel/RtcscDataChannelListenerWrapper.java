package com.amazon.rtcsc.service.datachannel;

import android.os.RemoteException;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.rtcmedia.service.android.RTCDataChannelServiceInterface;
import com.amazon.rtcsc.interfaces.IRtcscDataChannelListener;
import com.amazon.rtcsc.interfaces.RtcscDataChannelState;
import com.amazon.rtcsc.utils.RtcscLogger;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
class RtcscDataChannelListenerWrapper implements RTCDataChannelServiceInterface.RTCDataChannelListenerInterface {
    private IRtcscDataChannelListener mListener;
    private RtcscLogger mLog;

    public RtcscDataChannelListenerWrapper(IRtcscDataChannelListener iRtcscDataChannelListener) {
        RtcscLogger logger = RtcscLogger.getLogger(RtcscDataChannelListenerWrapper.class);
        this.mLog = logger;
        logger.i("RtcscDataChannelListenerWrapper constructor called");
        this.mListener = iRtcscDataChannelListener;
    }

    @Override // com.amazon.rtcmedia.service.android.RTCDataChannelServiceInterface.RTCDataChannelListenerInterface
    public void onMessageReceived(String str, String str2, byte[] bArr, boolean z) {
        RtcscLogger rtcscLogger = this.mLog;
        Locale locale = Locale.US;
        rtcscLogger.i("RtcscDataChannelListenerWrapper onMessageReceived called. Passing to AppClientListener. SessionId: " + str + ", Label: " + str2);
        int length = bArr == null ? 0 : bArr.length;
        this.mLog.d("Data Length: " + length + ", isBinary: " + z);
        try {
            this.mListener.onMessageReceived(str, str2, bArr, z);
        } catch (RemoteException e) {
            this.mLog.e("Exception while passing onMessageReceived call to AppClient's Listener: ", e);
        }
    }

    @Override // com.amazon.rtcmedia.service.android.RTCDataChannelServiceInterface.RTCDataChannelListenerInterface
    public void onStateChange(String str, String str2, RTCDataChannelServiceInterface.RTCDataChannelListenerInterface.State state) {
        RtcscLogger rtcscLogger = this.mLog;
        Locale locale = Locale.US;
        String name = state.name();
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("RtcscDataChannelListenerWrapper onStateChange called. Passing to AppClientListener. SessionId: ", str, ", Label: ", str2, ", State: ");
        m.append(name);
        rtcscLogger.i(m.toString());
        try {
            this.mListener.onStateChange(str, str2, RtcscDataChannelState.valueOf(state.toString()));
        } catch (RemoteException e) {
            this.mLog.e("Exception while passing onStateChange call to AppClient's Listener: ", e);
        }
    }
}
