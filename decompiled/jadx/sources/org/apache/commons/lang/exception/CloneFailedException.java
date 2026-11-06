package org.apache.commons.lang.exception;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class CloneFailedException extends NestableRuntimeException {
    private static final long serialVersionUID = 20091223;

    public CloneFailedException(String str) {
        super(str);
    }

    public CloneFailedException(Throwable th) {
        super(th);
    }

    public CloneFailedException(String str, Throwable th) {
        super(str, th);
    }
}
