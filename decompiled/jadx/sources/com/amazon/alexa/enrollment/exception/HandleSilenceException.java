package com.amazon.alexa.enrollment.exception;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class HandleSilenceException extends EnrollmentException {
    public HandleSilenceException(String str) {
        super(str);
    }

    @Override // com.amazon.alexa.enrollment.exception.EnrollmentException
    public boolean canShowInlineError() {
        return true;
    }

    public HandleSilenceException(String str, Throwable th) {
        super(str, th);
    }

    public HandleSilenceException(Throwable th) {
        super(th);
    }
}
