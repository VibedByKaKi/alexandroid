package io.noties.markwon.core;

import androidx.annotation.NonNull;
import io.noties.markwon.MarkwonVisitor;
import org.commonmark.node.Node;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class SimpleBlockNodeVisitor implements MarkwonVisitor.NodeVisitor<Node> {
    @Override // io.noties.markwon.MarkwonVisitor.NodeVisitor
    public void visit(@NonNull MarkwonVisitor markwonVisitor, @NonNull Node node) {
        markwonVisitor.blockStart(node);
        int length = markwonVisitor.length();
        markwonVisitor.visitChildren(node);
        markwonVisitor.setSpansForNodeOptional((MarkwonVisitor) node, length);
        markwonVisitor.blockEnd(node);
    }
}
