package com.amazon.alexa.enrollment.unified.speakerid.error;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class EnrollmentException extends RuntimeException {
    public EnrollmentException(String str) {
        super(str);
    }

    public abstract boolean canShowInlineError();

    public EnrollmentException(String str, Throwable th) {
        super(str, th);
    }
}
