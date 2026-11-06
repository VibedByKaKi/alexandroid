package com.amazon.rtcmedia.webrtc;

import org.webrtc.EglBase;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class EglBaseWrapper {
    private static EglBase.Context eglContext;
    private static int eglRefCount;
    private static EglBase rootEglBase;

    public static synchronized EglBase.Context getEglBaseContext() {
        EglBase.Context context;
        synchronized (EglBaseWrapper.class) {
            try {
                EglBase eglBase = rootEglBase;
                if (eglBase == null) {
                    EglBase create = EglBase.create();
                    rootEglBase = create;
                    eglContext = create.getEglBaseContext();
                } else if (eglContext == null) {
                    eglContext = eglBase.getEglBaseContext();
                }
                eglRefCount++;
                context = eglContext;
            } catch (Throwable th) {
                throw th;
            }
        }
        return context;
    }

    public static synchronized void release() {
        EglBase eglBase;
        synchronized (EglBaseWrapper.class) {
            try {
                int i = eglRefCount;
                if (i > 0) {
                    eglRefCount = i - 1;
                }
                if (eglRefCount == 0 && (eglBase = rootEglBase) != null) {
                    eglBase.release();
                    rootEglBase = null;
                    eglContext = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
