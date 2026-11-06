package com.esotericsoftware.kryo;

import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class KryoException extends RuntimeException {
    private StringBuffer trace;

    public KryoException() {
    }

    public void addTrace(String str) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("info cannot be null.");
            return;
        }
        if (this.trace == null) {
            this.trace = new StringBuffer(512);
        }
        this.trace.append('\n');
        this.trace.append(str);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        if (this.trace == null) {
            return super.getMessage();
        }
        StringBuffer stringBuffer = new StringBuffer(512);
        stringBuffer.append(super.getMessage());
        if (stringBuffer.length() > 0) {
            stringBuffer.append('\n');
        }
        stringBuffer.append("Serialization trace:");
        stringBuffer.append(this.trace);
        return stringBuffer.toString();
    }

    public KryoException(String str, Throwable th) {
        super(str, th);
    }

    public KryoException(String str) {
        super(str);
    }

    public KryoException(Throwable th) {
        super(th);
    }
}
