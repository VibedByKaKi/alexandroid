package com.amazon.ion;

import java.util.IdentityHashMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class IonException extends RuntimeException {
    private static final long serialVersionUID = 5769577011706279252L;

    public IonException(Throwable th) {
        super(th.getMessage(), th);
    }

    private <T extends Throwable> void rethrowCauseOfType(Class<T> cls) throws Throwable {
        Throwable causeOfType = causeOfType(cls);
        if (causeOfType != null) {
            throw causeOfType;
        }
    }

    public <T extends Throwable> T causeOfType(Class<T> cls) {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        T t = (T) getCause();
        while (t != null && !cls.isInstance(t)) {
            if (identityHashMap.put(t, t) != null) {
                return null;
            }
            t = (T) t.getCause();
        }
        return t;
    }

    public Throwable externalCause() {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        Throwable cause = getCause();
        while (cause instanceof IonException) {
            if (identityHashMap.put(cause, cause) != null) {
                return null;
            }
            cause = cause.getCause();
        }
        return cause;
    }

    public IonException(String str) {
        super(str);
    }

    public IonException(String str, Throwable th) {
        super(str, th);
    }

    public IonException() {
    }
}
