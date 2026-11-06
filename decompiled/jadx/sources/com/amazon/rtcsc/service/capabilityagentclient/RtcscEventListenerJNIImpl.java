package com.amazon.rtcsc.service.capabilityagentclient;

import android.os.RemoteException;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.rtcsc.interfaces.IRtcscEventListener;
import com.amazon.rtcsc.interfaces.RtcscErrorCode;
import com.amazon.rtcsc.service.appclient.RtcscAppClientCommon;
import com.amazon.rtcsc.utils.RtcscLogger;
import com.amazon.rtcsc.wrappers.RTCEventListenerInterface;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class RtcscEventListenerJNIImpl extends RTCEventListenerInterface {
    private IRtcscEventListener mEventListener;
    private RtcscLogger mLog = RtcscLogger.getLogger(RtcscEventListenerJNIImpl.class);
    private RtcscAppClientCommon mRtcscAppClientCommon;

    public RtcscEventListenerJNIImpl(IRtcscEventListener iRtcscEventListener, RtcscAppClientCommon rtcscAppClientCommon) {
        this.mEventListener = null;
        this.mEventListener = iRtcscEventListener;
        this.mRtcscAppClientCommon = rtcscAppClientCommon;
    }

    public void onError(RtcscErrorCode rtcscErrorCode) {
        try {
            this.mEventListener.onError(rtcscErrorCode);
        } catch (RemoteException unused) {
            this.mLog.w("onError callback could not be invoked.");
        }
    }

    @Override // com.amazon.rtcsc.wrappers.RTCEventListenerInterface
    public void onRTCSessionContextUpdated(String str) {
        RtcscLogger rtcscLogger = this.mLog;
        if (str == null) {
            rtcscLogger.e("onRTCSessionContextUpdated. null value passed for rtcSessionContext");
            return;
        }
        rtcscLogger.i("Updated Session Context Received from Native Layer ");
        this.mLog.i("SessionContext : ".concat(str));
        try {
            this.mEventListener.onRTCSessionContextUpdated(str);
        } catch (RemoteException unused) {
            this.mLog.w("onRTCSessionContextUpdated callback could not be invoked.");
        }
    }

    @Override // com.amazon.rtcsc.wrappers.RTCEventListenerInterface
    public void onSendEvent(String str, String str2, String str3, String str4) {
        RtcscLogger rtcscLogger = this.mLog;
        Locale locale = Locale.US;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("onSendEvent. Received event from Native Layer. sessionId: ", str, ". eventName: ", str2, ", sessionContext: ");
        m.append(str4);
        rtcscLogger.i(m.toString());
        this.mLog.d("Payload: " + str3);
        if (str == null || str2 == null || str3 == null || str4 == null) {
            this.mLog.e("onSendEvent. null parameter passed");
            return;
        }
        try {
            this.mEventListener.onSendEvent(str, str2, str3, str4);
        } catch (RemoteException unused) {
            this.mLog.w("onSendEvent callback could not be invoked.");
        }
    }
}
