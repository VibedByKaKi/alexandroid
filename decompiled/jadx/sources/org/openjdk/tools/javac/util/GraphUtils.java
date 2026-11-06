package org.openjdk.tools.javac.util;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.rtcsc.service.deviceconfiguration.util.DeviceConfigConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Properties;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class GraphUtils {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class AbstractNode<D, N extends AbstractNode<D, N>> implements Node<D, N> {
        public final D data;

        public AbstractNode(D d) {
            this.data = d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.openjdk.tools.javac.util.GraphUtils.Node
        public <A> void accept(NodeVisitor<D, N, A> nodeVisitor, A a2) {
            nodeVisitor.visitNode(this, a2);
            for (DependencyKind dependencyKind : getSupportedDependencyKinds()) {
                Iterator it2 = new ArrayList(getDependenciesByKind(dependencyKind)).iterator();
                while (it2.hasNext()) {
                    nodeVisitor.visitDependency(dependencyKind, this, (AbstractNode) it2.next(), a2);
                }
            }
        }

        public abstract Collection<? extends N> getDependenciesByKind(DependencyKind dependencyKind);

        public abstract DependencyKind[] getSupportedDependencyKinds();

        public String toString() {
            return this.data.toString();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface DependencyKind {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class DotVisitor<D, N extends DottableNode<D, N>> extends NodeVisitor<D, N, StringBuilder> {
        public static String wrap(String str) {
            return (DeviceConfigConstants.DOUBLE_QUOTE + str + DeviceConfigConstants.DOUBLE_QUOTE).replaceAll("\n", "");
        }

        public String formatProperties(Properties properties) {
            return properties.toString().replaceAll(",", " ").replaceAll("\\{", MarkdownConstants.LEFT_BRACKET).replaceAll("\\}", MarkdownConstants.RIGHT_BRACKET);
        }

        @Override // org.openjdk.tools.javac.util.GraphUtils.NodeVisitor
        public void visitDependency(DependencyKind dependencyKind, N n, N n2, StringBuilder sb) {
            sb.append(n.hashCode() + " -> " + n2.hashCode());
            sb.append(formatProperties(n.dependencyAttributes(n2, dependencyKind)));
            sb.append('\n');
        }

        @Override // org.openjdk.tools.javac.util.GraphUtils.NodeVisitor
        public void visitNode(N n, StringBuilder sb) {
            sb.append(n.hashCode() + " ");
            sb.append(formatProperties(n.nodeAttributes()));
            sb.append('\n');
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface DottableNode<D, N extends DottableNode<D, N>> extends Node<D, N> {
        Properties dependencyAttributes(N n, DependencyKind dependencyKind);

        Properties nodeAttributes();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Node<D, N extends Node<D, N>> {
        <A> void accept(NodeVisitor<D, N, A> nodeVisitor, A a2);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class NodeVisitor<D, N extends Node<D, N>, A> {
        public void visit(Collection<? extends N> collection, A a2) {
            Iterator it2 = new ArrayList(collection).iterator();
            while (it2.hasNext()) {
                ((Node) it2.next()).accept(this, a2);
            }
        }

        public abstract void visitDependency(DependencyKind dependencyKind, N n, N n2, A a2);

        public abstract void visitNode(N n, A a2);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class TarjanNode<D, N extends TarjanNode<D, N>> extends AbstractNode<D, N> implements Comparable<N> {
        boolean active;
        int index;
        int lowlink;

        public TarjanNode(D d) {
            super(d);
            this.index = -1;
        }

        @Override // java.lang.Comparable
        public int compareTo(N n) {
            int i = this.index;
            int i2 = n.index;
            if (i < i2) {
                return -1;
            }
            return i == i2 ? 0 : 1;
        }

        public abstract Iterable<? extends N> getAllDependencies();
    }

    public static <D, N extends TarjanNode<D, N>> List<? extends List<? extends N>> tarjan(Iterable<? extends N> iterable) {
        return new Tarjan().findSCC(iterable);
    }

    public static <D, N extends DottableNode<D, N>> String toDot(Collection<? extends N> collection, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("digraph " + str + " {\n");
        sb.append("label = " + DotVisitor.wrap(str2) + ";\n");
        new DotVisitor().visit(collection, sb);
        sb.append("}\n");
        return sb.toString();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Tarjan<D, N extends TarjanNode<D, N>> {
        int index;
        ListBuffer<List<N>> sccs;
        ListBuffer<N> stack;

        private Tarjan() {
            this.index = 0;
            this.sccs = new ListBuffer<>();
            this.stack = new ListBuffer<>();
        }

        private void addSCC(N n) {
            N remove;
            ListBuffer listBuffer = new ListBuffer();
            do {
                remove = this.stack.remove();
                remove.active = false;
                listBuffer.add(remove);
            } while (remove != n);
            this.sccs.add(listBuffer.toList());
        }

        private void findSCC(N n) {
            visitNode(n);
            for (N n2 : n.getAllDependencies()) {
                if (n2.index == -1) {
                    findSCC((Tarjan<D, N>) n2);
                    n.lowlink = Math.min(n.lowlink, n2.lowlink);
                } else if (this.stack.contains(n2)) {
                    n.lowlink = Math.min(n.lowlink, n2.index);
                }
            }
            if (n.lowlink == n.index) {
                addSCC(n);
            }
        }

        private void visitNode(N n) {
            int i = this.index;
            n.index = i;
            n.lowlink = i;
            this.index = i + 1;
            this.stack.prepend(n);
            n.active = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public List<? extends List<? extends N>> findSCC(Iterable<? extends N> iterable) {
            for (N n : iterable) {
                if (n.index == -1) {
                    findSCC((Tarjan<D, N>) n);
                }
            }
            return this.sccs.toList();
        }
    }
}
