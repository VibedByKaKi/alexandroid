package com.bugsnag.android.repackaged.dslplatform.json;

import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ParsingException extends IOException {
    public static ParsingException create(String str, boolean z) {
        return z ? new ParsingException(str) : new ParsingStacklessException(str);
    }

    private ParsingException(String str) {
        super(str);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ParsingStacklessException extends ParsingException {
        private ParsingStacklessException(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }

        private ParsingStacklessException(String str, Throwable th) {
            super(str, th);
        }
    }

    private ParsingException(String str, Throwable th) {
        super(str, th);
    }

    public static ParsingException create(String str, Throwable th, boolean z) {
        if (z) {
            return new ParsingException(str, th);
        }
        return new ParsingStacklessException(str, th);
    }
}
