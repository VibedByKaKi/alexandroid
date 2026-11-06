package com.amazonaws;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes4.dex */
public class AbortedException extends AmazonClientException {
    private static final long serialVersionUID = 1;

    public AbortedException(Throwable th) {
        super("", th);
    }

    @Override // com.amazonaws.AmazonClientException
    public boolean isRetryable() {
        return false;
    }

    public AbortedException(String str, Throwable th) {
        super(str, th);
    }

    public AbortedException(String str) {
        super(str);
    }

    public AbortedException() {
        super("");
    }
}
