package org.webrtc;

import android.opengl.EGLContext;
import org.webrtc.EglBase;
import org.webrtc.EglBase14;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final class EglBaseFactory {
    private EglBaseFactory() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EglBase create(EGLContext eGLContext) {
        return eGLContext == 0 ? create() : create((EglBase.Context) eGLContext);
    }

    public static EglBase create(EglBase.Context context) {
        return EglBase.create((EglBase14.Context) context, EglBase.CONFIG_PLAIN);
    }

    public static EglBase create() {
        return EglBase.create(null, EglBase.CONFIG_PLAIN);
    }
}
