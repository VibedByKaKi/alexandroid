package com.amazon.clouddrive.exceptions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ActionRequiredException extends NoRetryException {
    public ActionRequiredException() {
    }

    public ActionRequiredException(Throwable th) {
        super(th);
    }

    public ActionRequiredException(String str) {
        super(str);
    }

    public ActionRequiredException(String str, Throwable th) {
        super(str, th);
    }

    public ActionRequiredException(String str, String str2, String str3) {
        super(str, str2, str3);
    }
}
