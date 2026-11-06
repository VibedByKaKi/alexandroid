package org.apache.logging.log4j.util;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class InternalException extends RuntimeException {
    private static final long serialVersionUID = 6366395965071580537L;

    public InternalException(String str) {
        super(str);
    }

    public InternalException(String str, Throwable th) {
        super(str, th);
    }

    public InternalException(Throwable th) {
        super(th);
    }
}
