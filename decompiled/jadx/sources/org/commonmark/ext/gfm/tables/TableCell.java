package org.commonmark.ext.gfm.tables;

import org.commonmark.node.CustomNode;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class TableCell extends CustomNode {
    private Alignment alignment;
    private boolean header;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Alignment {
        LEFT,
        CENTER,
        RIGHT
    }

    public Alignment getAlignment() {
        return this.alignment;
    }

    public boolean isHeader() {
        return this.header;
    }

    public void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }

    public void setHeader(boolean z) {
        this.header = z;
    }
}
