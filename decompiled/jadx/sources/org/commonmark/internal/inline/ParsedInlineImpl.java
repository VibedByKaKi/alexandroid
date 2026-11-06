package org.commonmark.internal.inline;

import org.commonmark.node.Node;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class ParsedInlineImpl extends ParsedInline {
    private final Node node;
    private final Position position;

    public ParsedInlineImpl(Node node, Position position) {
        this.node = node;
        this.position = position;
    }

    public Node getNode() {
        return this.node;
    }

    public Position getPosition() {
        return this.position;
    }
}
