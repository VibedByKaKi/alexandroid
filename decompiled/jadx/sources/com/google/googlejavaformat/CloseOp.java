package com.google.googlejavaformat;

import com.google.common.base.MoreObjects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public enum CloseOp implements Op {
    CLOSE;

    public static Op make() {
        return CLOSE;
    }

    @Override // com.google.googlejavaformat.Op
    public void add(DocBuilder docBuilder) {
        docBuilder.close();
    }

    @Override // java.lang.Enum
    public String toString() {
        return MoreObjects.toStringHelper(this).toString();
    }
}
