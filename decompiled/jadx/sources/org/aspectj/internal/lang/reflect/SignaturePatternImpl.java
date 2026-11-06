package org.aspectj.internal.lang.reflect;

import org.aspectj.lang.reflect.SignaturePattern;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class SignaturePatternImpl implements SignaturePattern {
    private String sigPattern;

    public SignaturePatternImpl(String str) {
        this.sigPattern = str;
    }

    @Override // org.aspectj.lang.reflect.SignaturePattern
    public String asString() {
        return this.sigPattern;
    }

    public String toString() {
        return asString();
    }
}
