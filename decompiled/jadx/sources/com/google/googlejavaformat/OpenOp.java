package com.google.googlejavaformat;

import com.google.common.base.MoreObjects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class OpenOp implements Op {
    private final Indent plusIndent;

    private OpenOp(Indent indent) {
        this.plusIndent = indent;
    }

    public static Op make(Indent indent) {
        return new OpenOp(indent);
    }

    @Override // com.google.googlejavaformat.Op
    public void add(DocBuilder docBuilder) {
        docBuilder.open(this.plusIndent);
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("plusIndent", this.plusIndent).toString();
    }
}
