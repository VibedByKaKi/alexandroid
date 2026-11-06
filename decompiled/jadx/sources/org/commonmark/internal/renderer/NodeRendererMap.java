package org.commonmark.internal.renderer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.commonmark.node.Node;
import org.commonmark.renderer.NodeRenderer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class NodeRendererMap {
    private final Map<Class<? extends Node>, NodeRenderer> renderers = new HashMap(32);

    public void add(NodeRenderer nodeRenderer) {
        Iterator<Class<? extends Node>> it2 = nodeRenderer.getNodeTypes().iterator();
        while (it2.hasNext()) {
            this.renderers.put(it2.next(), nodeRenderer);
        }
    }

    public void render(Node node) {
        NodeRenderer nodeRenderer = this.renderers.get(node.getClass());
        if (nodeRenderer != null) {
            nodeRenderer.render(node);
        }
    }
}
