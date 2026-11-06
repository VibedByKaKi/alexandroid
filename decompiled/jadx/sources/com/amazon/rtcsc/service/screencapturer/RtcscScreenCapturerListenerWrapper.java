package com.amazon.rtcsc.service.screencapturer;

import android.os.RemoteException;
import com.amazon.rtcmedia.service.android.RTCScreenCapturerServiceInterface;
import com.amazon.rtcsc.interfaces.IRtcscScreenCapturerListener;
import com.amazon.rtcsc.utils.RtcscLogger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class RtcscScreenCapturerListenerWrapper implements RTCScreenCapturerServiceInterface.RTCScreenCapturerServiceListener {
    IRtcscScreenCapturerListener mListener;
    private RtcscLogger mLog = RtcscLogger.getLogger(RtcscScreenCapturerListenerWrapper.class);

    public RtcscScreenCapturerListenerWrapper(IRtcscScreenCapturerListener iRtcscScreenCapturerListener) {
        this.mListener = iRtcscScreenCapturerListener;
    }

    @Override // com.amazon.rtcmedia.service.android.RTCScreenCapturerServiceInterface.RTCScreenCapturerServiceListener
    public void onPutScreenCapturerData() {
        try {
            this.mListener.onPutScreenCapturerData();
        } catch (RemoteException unused) {
            this.mLog.w("onPutScreenCapturerData callback could not be invoked.");
        }
    }

    @Override // com.amazon.rtcmedia.service.android.RTCScreenCapturerServiceInterface.RTCScreenCapturerServiceListener
    public void onScreenCapturerStop() {
        try {
            this.mListener.onScreenCapturerStop();
        } catch (RemoteException unused) {
            this.mLog.w("onScreenCapturerStop callback could not be invoked.");
        }
    }
}
