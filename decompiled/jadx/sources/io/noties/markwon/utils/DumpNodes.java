package io.noties.markwon.utils;

import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import org.commonmark.node.Node;
import org.commonmark.node.Visitor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public abstract class DumpNodes {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Indent {
        private int count;

        private Indent() {
        }

        public void appendTo(@NonNull StringBuilder sb) {
            for (int i = 0; i < this.count; i++) {
                sb.append(' ');
                sb.append(' ');
            }
        }

        public void decrement() {
            this.count--;
        }

        public void increment() {
            this.count++;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface NodeProcessor {
        @NonNull
        String process(@NonNull Node node);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class NodeProcessorToString implements NodeProcessor {
        private NodeProcessorToString() {
        }

        @Override // io.noties.markwon.utils.DumpNodes.NodeProcessor
        @NonNull
        public String process(@NonNull Node node) {
            return node.toString();
        }
    }

    private DumpNodes() {
    }

    @NonNull
    @CheckResult
    public static String dump(@NonNull Node node, @Nullable final NodeProcessor nodeProcessor) {
        if (nodeProcessor == null) {
            nodeProcessor = new NodeProcessorToString();
        }
        final Indent indent = new Indent();
        final StringBuilder sb = new StringBuilder();
        node.accept((Visitor) Proxy.newProxyInstance(Visitor.class.getClassLoader(), new Class[]{Visitor.class}, new InvocationHandler() { // from class: io.noties.markwon.utils.DumpNodes.1
            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj, Method method, Object[] objArr) {
                Node node2 = (Node) objArr[0];
                Indent.this.appendTo(sb);
                sb.append(nodeProcessor.process(node2));
                Node firstChild = node2.getFirstChild();
                StringBuilder sb2 = sb;
                if (firstChild == null) {
                    sb2.append("\n");
                    return null;
                }
                sb2.append(" [\n");
                Indent.this.increment();
                DumpNodes.visitChildren((Visitor) obj, node2);
                Indent.this.decrement();
                Indent.this.appendTo(sb);
                sb.append("]\n");
                return null;
            }
        }));
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void visitChildren(@NonNull Visitor visitor, @NonNull Node node) {
        Node firstChild = node.getFirstChild();
        while (firstChild != null) {
            Node next = firstChild.getNext();
            firstChild.accept(visitor);
            firstChild = next;
        }
    }

    @NonNull
    @CheckResult
    public static String dump(@NonNull Node node) {
        return dump(node, null);
    }
}
