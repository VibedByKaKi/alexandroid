package com.amazon.rtcmedia.webrtc;

import com.amazon.rtcmedia.util.LooperExecutor;
import com.amazon.rtcmedia.util.RtcscLogger;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class RTCRemoteVideoEffect {
    private static final RtcscLogger mLog = RtcscLogger.getLogger(RTCRemoteVideoEffect.class);
    private final GlBlurDrawer blurDrawer;
    private final LooperExecutor executor;
    private final RemoteVideoEffectTransitionListener listener;
    private Timer transitionTimer;
    private volatile boolean isFrosted = false;
    private int transitionGeneration = 0;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface RemoteVideoEffectTransitionListener {
        void onRemoteVideoEffectTransition(String str);
    }

    public RTCRemoteVideoEffect(GlBlurDrawer glBlurDrawer, RemoteVideoEffectTransitionListener remoteVideoEffectTransitionListener, LooperExecutor looperExecutor) {
        this.blurDrawer = glBlurDrawer;
        this.listener = remoteVideoEffectTransitionListener;
        this.executor = looperExecutor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelTransitionTimer() {
        this.transitionGeneration++;
        Timer timer = this.transitionTimer;
        if (timer != null) {
            timer.cancel();
            this.transitionTimer = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyTransition(String str) {
        RemoteVideoEffectTransitionListener remoteVideoEffectTransitionListener = this.listener;
        if (remoteVideoEffectTransitionListener != null) {
            remoteVideoEffectTransitionListener.onRemoteVideoEffectTransition(str);
        }
    }

    private void startFrostTransition(float f, final float f2) {
        final int i = this.transitionGeneration;
        long j = (long) ((f * 1000.0f) / 10.0f);
        final float f3 = f2 / 10.0f;
        Timer timer = new Timer("RemoteVideoEffectTransition", true);
        this.transitionTimer = timer;
        timer.scheduleAtFixedRate(new TimerTask() { // from class: com.amazon.rtcmedia.webrtc.RTCRemoteVideoEffect.1
            private int currentStep = 0;

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                int i2 = this.currentStep + 1;
                this.currentStep = i2;
                final float min = Math.min(f3 * i2, f2);
                final boolean z = this.currentStep >= 10;
                if (z) {
                    cancel();
                }
                RTCRemoteVideoEffect.this.executor.execute(new Runnable() { // from class: com.amazon.rtcmedia.webrtc.RTCRemoteVideoEffect.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        if (i != RTCRemoteVideoEffect.this.transitionGeneration) {
                            return;
                        }
                        RTCRemoteVideoEffect.this.blurDrawer.setBlurEnabled(true, min);
                        if (z) {
                            RTCRemoteVideoEffect.this.isFrosted = true;
                            RTCRemoteVideoEffect.this.cancelTransitionTimer();
                            RTCRemoteVideoEffect.this.notifyTransition("frost_enabled");
                        }
                    }
                });
            }
        }, j, j);
    }

    public void disableFrost() {
        mLog.i("disableFrost");
        cancelTransitionTimer();
        this.blurDrawer.setBlurEnabled(false, 0.0f);
        this.isFrosted = false;
        notifyTransition("frost_disabled");
    }

    public void enableFrost(float f, float f2) {
        mLog.i(String.format(Locale.US, "enableFrost: transitionTime=%.2f, strength=%.2f", Float.valueOf(f), Float.valueOf(f2)));
        cancelTransitionTimer();
        if (f > 0.0f) {
            startFrostTransition(f, f2);
            return;
        }
        this.blurDrawer.setBlurEnabled(true, f2);
        this.isFrosted = true;
        notifyTransition("frost_enabled");
    }

    public boolean isFrosted() {
        return this.isFrosted;
    }

    public void release() {
        mLog.i("release");
        cancelTransitionTimer();
        this.isFrosted = false;
    }
}
