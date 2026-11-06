package org.apache.commons.lang3.concurrent;

import org.apache.commons.lang3.exception.UncheckedException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class UncheckedTimeoutException extends UncheckedException {
    private static final long serialVersionUID = 1;

    public UncheckedTimeoutException(Throwable th) {
        super(th);
    }
}
