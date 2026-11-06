package io.noties.markwon;

import androidx.annotation.NonNull;
import io.noties.markwon.MarkwonVisitor;
import org.commonmark.node.Node;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class BlockHandlerDef implements MarkwonVisitor.BlockHandler {
    @Override // io.noties.markwon.MarkwonVisitor.BlockHandler
    public void blockEnd(@NonNull MarkwonVisitor markwonVisitor, @NonNull Node node) {
        if (markwonVisitor.hasNext(node)) {
            markwonVisitor.ensureNewLine();
            markwonVisitor.forceNewLine();
        }
    }

    @Override // io.noties.markwon.MarkwonVisitor.BlockHandler
    public void blockStart(@NonNull MarkwonVisitor markwonVisitor, @NonNull Node node) {
        markwonVisitor.ensureNewLine();
    }
}
