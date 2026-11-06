package org.apache.commons.lang;

import org.apache.commons.lang.exception.NestableRuntimeException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class UnhandledException extends NestableRuntimeException {
    private static final long serialVersionUID = 1832101364842773720L;

    public UnhandledException(Throwable th) {
        super(th);
    }

    public UnhandledException(String str, Throwable th) {
        super(str, th);
    }
}
