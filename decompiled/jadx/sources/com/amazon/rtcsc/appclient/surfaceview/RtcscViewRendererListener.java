package com.amazon.rtcsc.appclient.surfaceview;

import com.amazon.rtcsc.interfaces.IRtcscViewRendererListener;
import com.amazon.rtcsc.utils.RtcscLogger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class RtcscViewRendererListener extends IRtcscViewRendererListener.Stub {
    private RtcscLogger mLog;
    private RTCSurfaceView mSurfaceView;

    public RtcscViewRendererListener(RTCSurfaceView rTCSurfaceView) {
        RtcscLogger logger = RtcscLogger.getLogger(RtcscViewRendererListener.class);
        this.mLog = logger;
        this.mSurfaceView = rTCSurfaceView;
        logger.i("Constructor -- mSurfaceView : " + this.mSurfaceView);
    }

    @Override // com.amazon.rtcsc.interfaces.IRtcscViewRendererListener
    public int getAPIVersion() {
        return 1;
    }

    @Override // com.amazon.rtcsc.interfaces.IRtcscViewRendererListener
    public int onGetHeight() {
        this.mLog.i("getHeight");
        return this.mSurfaceView.getHeight();
    }

    @Override // com.amazon.rtcsc.interfaces.IRtcscViewRendererListener
    public int onGetWidth() {
        this.mLog.i("getWidth");
        return this.mSurfaceView.getWidth();
    }

    @Override // com.amazon.rtcsc.interfaces.IRtcscViewRendererListener
    public void onHolderSetFixedSize(final int i, final int i2) {
        this.mLog.i("onSetFixedSize");
        this.mSurfaceView.post(new Runnable() { // from class: com.amazon.rtcsc.appclient.surfaceview.RtcscViewRendererListener.2
            @Override // java.lang.Runnable
            public void run() {
                RtcscViewRendererListener.this.mSurfaceView.getHolder().setFixedSize(i, i2);
            }
        });
    }

    @Override // com.amazon.rtcsc.interfaces.IRtcscViewRendererListener
    public void onHolderSetSizeFromLayout() {
        this.mLog.i("onSetSizeFromLayout");
        this.mSurfaceView.post(new Runnable() { // from class: com.amazon.rtcsc.appclient.surfaceview.RtcscViewRendererListener.1
            @Override // java.lang.Runnable
            public void run() {
                RtcscViewRendererListener.this.mSurfaceView.getHolder().setSizeFromLayout();
            }
        });
    }

    @Override // com.amazon.rtcsc.interfaces.IRtcscViewRendererListener
    public void onMeasuredDimension(int i, int i2) {
        this.mLog.i("onMeasuredDimension");
        this.mSurfaceView.forwardMeasuredDimension(i, i2);
    }

    @Override // com.amazon.rtcsc.interfaces.IRtcscViewRendererListener
    public void onRequestLayout() {
        this.mLog.i("onRequestLayout");
        this.mSurfaceView.post(new Runnable() { // from class: com.amazon.rtcsc.appclient.surfaceview.RtcscViewRendererListener.3
            @Override // java.lang.Runnable
            public void run() {
                RtcscViewRendererListener.this.mSurfaceView.requestLayout();
            }
        });
    }
}
