package org.apache.commons.lang3.concurrent;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class CircuitBreakingException extends RuntimeException {
    private static final long serialVersionUID = 1408176654686913340L;

    public CircuitBreakingException() {
    }

    public CircuitBreakingException(String str) {
        super(str);
    }

    public CircuitBreakingException(String str, Throwable th) {
        super(str, th);
    }

    public CircuitBreakingException(Throwable th) {
        super(th);
    }
}
