package com.amazon.rtcsc.service.surfaceview;

import android.os.RemoteException;
import com.amazon.rtcmedia.service.android.RTCSurfaceRendererServiceInterface;
import com.amazon.rtcsc.interfaces.IRtcscViewRendererListener;
import com.amazon.rtcsc.utils.RtcscLogger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class RtcscViewRendererListenerWrapper implements RTCSurfaceRendererServiceInterface.RendererListener {
    IRtcscViewRendererListener mListener;
    private RtcscLogger mLog;

    public RtcscViewRendererListenerWrapper(IRtcscViewRendererListener iRtcscViewRendererListener) {
        RtcscLogger logger = RtcscLogger.getLogger(RtcscViewRendererListenerWrapper.class);
        this.mLog = logger;
        if (iRtcscViewRendererListener == null) {
            logger.e("RtcscViewRendererListenerWrapper. null value passed for listener");
        } else {
            this.mListener = iRtcscViewRendererListener;
        }
    }

    @Override // com.amazon.rtcmedia.service.android.RTCSurfaceRendererServiceInterface.RendererListener
    public int onGetHeight() {
        try {
            return this.mListener.onGetHeight();
        } catch (RemoteException unused) {
            this.mLog.w("onGetHeight callback could not be invoked.");
            return -1;
        }
    }

    @Override // com.amazon.rtcmedia.service.android.RTCSurfaceRendererServiceInterface.RendererListener
    public int onGetWidth() {
        try {
            return this.mListener.onGetWidth();
        } catch (RemoteException unused) {
            this.mLog.w("onGetWidth callback could not be invoked.");
            return -1;
        }
    }

    @Override // com.amazon.rtcmedia.service.android.RTCSurfaceRendererServiceInterface.RendererListener
    public void onHolderSetFixedSize(int i, int i2) {
        try {
            this.mListener.onHolderSetFixedSize(i, i2);
        } catch (RemoteException unused) {
            this.mLog.w("onHolderSetFixedSize callback could not be invoked.");
        }
    }

    @Override // com.amazon.rtcmedia.service.android.RTCSurfaceRendererServiceInterface.RendererListener
    public void onHolderSetSizeFromLayout() {
        try {
            this.mListener.onHolderSetSizeFromLayout();
        } catch (RemoteException unused) {
            this.mLog.w("onHolderSetSizeFromLayout callback could not be invoked.");
        }
    }

    @Override // com.amazon.rtcmedia.service.android.RTCSurfaceRendererServiceInterface.RendererListener
    public void onMeasuredDimension(int i, int i2) {
        try {
            this.mListener.onMeasuredDimension(i, i2);
        } catch (RemoteException unused) {
            this.mLog.w("onMeasuredDimension callback could not be invoked.");
        }
    }

    @Override // com.amazon.rtcmedia.service.android.RTCSurfaceRendererServiceInterface.RendererListener
    public void onRequestLayout() {
        try {
            this.mListener.onRequestLayout();
        } catch (RemoteException unused) {
            this.mLog.w("onRequestLayout callback could not be invoked.");
        }
    }
}
