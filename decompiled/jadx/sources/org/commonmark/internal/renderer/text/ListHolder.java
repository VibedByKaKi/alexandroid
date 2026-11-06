package org.commonmark.internal.renderer.text;

import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public abstract class ListHolder {
    private static final String INDENT_DEFAULT = "   ";
    private static final String INDENT_EMPTY = "";
    private final String indent;
    private final ListHolder parent;

    public ListHolder(ListHolder listHolder) {
        this.parent = listHolder;
        if (listHolder != null) {
            this.indent = a$$ExternalSyntheticOutline0.m(new StringBuilder(), listHolder.indent, INDENT_DEFAULT);
        } else {
            this.indent = "";
        }
    }

    public String getIndent() {
        return this.indent;
    }

    public ListHolder getParent() {
        return this.parent;
    }
}
