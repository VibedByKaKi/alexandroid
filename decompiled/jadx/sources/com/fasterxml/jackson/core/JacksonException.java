package com.fasterxml.jackson.core;

import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public abstract class JacksonException extends IOException {
    private static final long serialVersionUID = 123;

    public JacksonException(String str) {
        super(str);
    }

    public abstract JsonLocation getLocation();

    public abstract String getOriginalMessage();

    public abstract Object getProcessor();

    public JacksonException(Throwable th) {
        super(th);
    }

    public JacksonException(String str, Throwable th) {
        super(str, th);
    }
}
