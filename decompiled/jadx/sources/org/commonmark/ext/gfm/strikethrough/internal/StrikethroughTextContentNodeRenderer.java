package org.commonmark.ext.gfm.strikethrough.internal;

import java.util.Set;
import org.commonmark.node.Node;
import org.commonmark.renderer.text.TextContentNodeRendererContext;
import org.commonmark.renderer.text.TextContentWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class StrikethroughTextContentNodeRenderer extends StrikethroughNodeRenderer {
    private final TextContentNodeRendererContext context;
    private final TextContentWriter textContent;

    public StrikethroughTextContentNodeRenderer(TextContentNodeRendererContext textContentNodeRendererContext) {
        this.context = textContentNodeRendererContext;
        this.textContent = textContentNodeRendererContext.getWriter();
    }

    private void renderChildren(Node node) {
        Node firstChild = node.getFirstChild();
        while (firstChild != null) {
            Node next = firstChild.getNext();
            this.context.render(firstChild);
            firstChild = next;
        }
    }

    @Override // org.commonmark.ext.gfm.strikethrough.internal.StrikethroughNodeRenderer, org.commonmark.renderer.NodeRenderer
    public /* bridge */ /* synthetic */ Set getNodeTypes() {
        return super.getNodeTypes();
    }

    @Override // org.commonmark.renderer.NodeRenderer
    public void render(Node node) {
        this.textContent.write('/');
        renderChildren(node);
        this.textContent.write('/');
    }
}
