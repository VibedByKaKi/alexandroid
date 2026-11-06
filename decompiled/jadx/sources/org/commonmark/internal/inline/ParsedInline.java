package org.commonmark.internal.inline;

import org.commonmark.node.Node;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public abstract class ParsedInline {
    public static ParsedInline none() {
        return null;
    }

    public static ParsedInline of(Node node, Position position) {
        if (node == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("node must not be null");
            return null;
        }
        if (position != null) {
            return new ParsedInlineImpl(node, position);
        }
        Single$$ExternalSyntheticBUOutline0.m$1("position must not be null");
        return null;
    }
}
