package com.amazon.rtcmedia.webrtc;

import com.amazon.rtcmedia.util.RtcscLogger;
import com.amazon.rtcmedia.util.ViewDirection;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class RTCRendererEventsHandler implements RendererCommon.RendererEvents {
    private static RtcscLogger mLog = RtcscLogger.getLogger(RTCRendererEventsListener.class);
    private ViewDirection direction;
    private boolean isNotificationPending;
    private RTCRendererEventsListener listener;
    private boolean isResolutionCached = false;
    private int frameWidth = 0;
    private int frameHeight = 0;
    private int rotation = 0;
    private final Object notificationStateLock = new Object();
    private final Object resolutionLock = new Object();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface RTCRendererEventsListener {
        void onFirstFrameRendered(ViewDirection viewDirection);

        void onFrameResolutionChanged(ViewDirection viewDirection, int i, int i2, int i3);

        void onVideoFrameTimeStampReceived(long j);
    }

    public RTCRendererEventsHandler(ViewDirection viewDirection) {
        this.direction = viewDirection;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public void onFirstFrameRendered() {
        mLog.i("onFirstFrameRendered");
        synchronized (this.notificationStateLock) {
            try {
                RTCRendererEventsListener rTCRendererEventsListener = this.listener;
                if (rTCRendererEventsListener != null) {
                    rTCRendererEventsListener.onFirstFrameRendered(this.direction);
                } else {
                    this.isNotificationPending = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public void onFrameResolutionChanged(int i, int i2, int i3) {
        mLog.i("onFrameResolutionChanged");
        synchronized (this.resolutionLock) {
            try {
                this.isResolutionCached = true;
                this.frameWidth = i;
                this.frameHeight = i2;
                this.rotation = i3;
                RTCRendererEventsListener rTCRendererEventsListener = this.listener;
                if (rTCRendererEventsListener != null) {
                    rTCRendererEventsListener.onFrameResolutionChanged(this.direction, i, i2, i3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onVideoFrameTimeStampReceived(long j) {
        synchronized (this.notificationStateLock) {
            try {
                RTCRendererEventsListener rTCRendererEventsListener = this.listener;
                if (rTCRendererEventsListener != null) {
                    rTCRendererEventsListener.onVideoFrameTimeStampReceived(j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void registerListener(RTCRendererEventsListener rTCRendererEventsListener) {
        mLog.i("registerListener");
        synchronized (this.notificationStateLock) {
            try {
                this.listener = rTCRendererEventsListener;
                if (this.isNotificationPending) {
                    rTCRendererEventsListener.onFirstFrameRendered(this.direction);
                    this.isNotificationPending = false;
                }
            } finally {
            }
        }
        synchronized (this.resolutionLock) {
            try {
                if (this.isResolutionCached) {
                    rTCRendererEventsListener.onFrameResolutionChanged(this.direction, this.frameWidth, this.frameHeight, this.rotation);
                }
            } finally {
            }
        }
    }
}
