package org.apache.commons.lang3.concurrent;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class ConcurrentException extends Exception {
    private static final long serialVersionUID = 6622707671812226130L;

    public ConcurrentException(String str, Throwable th) {
        super(str, ConcurrentUtils.checkedException(th));
    }

    public ConcurrentException(String str) {
        super(str);
    }

    public ConcurrentException() {
    }

    public ConcurrentException(Throwable th) {
        super(ConcurrentUtils.checkedException(th));
    }
}
