package com.amazon.rtcmedia.util;

import com.amazon.rtcmedia.webrtc.EglBaseWrapper;
import org.webrtc.EglBase;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class EglBaseProvider {
    private static EglBase.Context eglContext;

    public static synchronized EglBase.Context getEglBaseContext() {
        EglBase.Context context;
        synchronized (EglBaseProvider.class) {
            try {
                if (eglContext == null) {
                    eglContext = EglBaseWrapper.getEglBaseContext();
                }
                context = eglContext;
            } catch (Throwable th) {
                throw th;
            }
        }
        return context;
    }

    public static synchronized void release() {
        synchronized (EglBaseProvider.class) {
            EglBaseWrapper.release();
            eglContext = null;
        }
    }
}
