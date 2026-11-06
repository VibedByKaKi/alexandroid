package org.commonmark.ext.gfm.strikethrough.internal;

import java.util.Collections;
import java.util.Set;
import org.commonmark.ext.gfm.strikethrough.Strikethrough;
import org.commonmark.node.Node;
import org.commonmark.renderer.NodeRenderer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
abstract class StrikethroughNodeRenderer implements NodeRenderer {
    @Override // org.commonmark.renderer.NodeRenderer
    public Set<Class<? extends Node>> getNodeTypes() {
        return Collections.singleton(Strikethrough.class);
    }
}
