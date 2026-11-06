package org.apache.http.client.utils;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
@Deprecated
/* loaded from: classes11.dex */
public class JdkIdn implements Idn {
    private final Method toUnicode;

    public JdkIdn() throws ClassNotFoundException {
        try {
            this.toUnicode = Class.forName("java.net.IDN").getMethod("toUnicode", String.class);
        } catch (NoSuchMethodException e) {
            Single$$ExternalSyntheticBUOutline0.m$1(e.getMessage(), e);
            throw null;
        } catch (SecurityException e2) {
            Single$$ExternalSyntheticBUOutline0.m$1(e2.getMessage(), e2);
            throw null;
        }
    }

    @Override // org.apache.http.client.utils.Idn
    public String toUnicode(String str) {
        try {
            return (String) this.toUnicode.invoke(null, str);
        } catch (IllegalAccessException e) {
            Single$$ExternalSyntheticBUOutline0.m$1(e.getMessage(), e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            OnnxMap$$ExternalSyntheticBUOutline0.m(cause.getMessage(), cause);
            return null;
        }
    }
}
