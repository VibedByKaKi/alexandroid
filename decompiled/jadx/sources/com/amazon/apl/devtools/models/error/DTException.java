package com.amazon.apl.devtools.models.error;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class DTException extends Exception {
    private final int mCode;
    private final int mId;

    public DTException(int i, int i2, String str) {
        super(str);
        this.mId = i;
        this.mCode = i2;
    }

    public int getCode() {
        return this.mCode;
    }

    public int getId() {
        return this.mId;
    }

    public DTException(int i, int i2, String str, Throwable th) {
        super(str, th);
        this.mId = i;
        this.mCode = i2;
    }
}
