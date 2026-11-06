package org.aspectj.internal.lang.reflect;

import org.aspectj.lang.reflect.TypePattern;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class TypePatternImpl implements TypePattern {
    private String typePattern;

    public TypePatternImpl(String str) {
        this.typePattern = str;
    }

    @Override // org.aspectj.lang.reflect.TypePattern
    public String asString() {
        return this.typePattern;
    }

    public String toString() {
        return asString();
    }
}
