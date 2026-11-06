package com.amazon.alexa.ra.core.ui.markdown.parser.extensions;

import kotlin.Metadata;
import org.commonmark.node.AbstractVisitor;
import org.commonmark.node.HardLineBreak;
import org.commonmark.node.Node;
import org.commonmark.node.SoftLineBreak;
import org.commonmark.parser.PostProcessor;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/markdown/parser/extensions/SoftLineBreakPostProcessor;", "Lorg/commonmark/parser/PostProcessor;", "<init>", "()V", "process", "Lorg/commonmark/node/Node;", "node", "SoftLineBreakVisitor", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
final class SoftLineBreakPostProcessor implements PostProcessor {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/markdown/parser/extensions/SoftLineBreakPostProcessor$SoftLineBreakVisitor;", "Lorg/commonmark/node/AbstractVisitor;", "<init>", "(Lcom/amazon/alexa/ra/core/ui/markdown/parser/extensions/SoftLineBreakPostProcessor;)V", "visit", "", "softLineBreak", "Lorg/commonmark/node/SoftLineBreak;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class SoftLineBreakVisitor extends AbstractVisitor {
        public SoftLineBreakVisitor() {
        }

        @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
        public void visit(@NotNull SoftLineBreak softLineBreak) {
            softLineBreak.getClass();
            softLineBreak.insertBefore(new HardLineBreak());
            softLineBreak.unlink();
        }
    }

    @Override // org.commonmark.parser.PostProcessor
    @NotNull
    public Node process(@NotNull Node node) {
        node.getClass();
        node.accept(new SoftLineBreakVisitor());
        return node;
    }
}
