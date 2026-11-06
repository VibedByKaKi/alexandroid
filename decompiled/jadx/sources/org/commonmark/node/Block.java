package org.commonmark.node;

import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public abstract class Block extends Node {
    @Override // org.commonmark.node.Node
    public Block getParent() {
        return (Block) super.getParent();
    }

    @Override // org.commonmark.node.Node
    public void setParent(Node node) {
        if (node instanceof Block) {
            super.setParent(node);
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("Parent of block must also be block (can not be inline)");
        }
    }
}
