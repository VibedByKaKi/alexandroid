package org.openjdk.tools.javac.util;

import com.amazon.leapfrogmapgl.indoor.RoadProbe;
import java.io.Closeable;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Stack;
import org.openjdk.javax.tools.JavaFileObject;
import org.openjdk.tools.javac.code.Symbol;
import org.openjdk.tools.javac.main.JavaCompiler;
import org.openjdk.tools.javac.util.Context;
import org.openjdk.tools.javac.util.GraphUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public abstract class Dependencies {
    protected static final Context.Key<Dependencies> dependenciesKey = new Context.Key<>();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum CompletionCause implements GraphUtils.DependencyKind {
        CLASS_READER,
        HEADER_PHASE,
        HIERARCHY_PHASE,
        IMPORTS_PHASE,
        MEMBER_ENTER,
        MEMBERS_PHASE,
        OTHER
    }

    public Dependencies(Context context) {
        context.put((Context.Key<Context.Key<Dependencies>>) dependenciesKey, (Context.Key<Dependencies>) this);
    }

    public static Dependencies instance(Context context) {
        Dependencies dependencies = (Dependencies) context.get(dependenciesKey);
        return dependencies == null ? new DummyDependencies(context) : dependencies;
    }

    public abstract void pop();

    public abstract void push(Symbol.ClassSymbol classSymbol, CompletionCause completionCause);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class DummyDependencies extends Dependencies {
        private DummyDependencies(Context context) {
            super(context);
        }

        @Override // org.openjdk.tools.javac.util.Dependencies
        public void pop() {
        }

        @Override // org.openjdk.tools.javac.util.Dependencies
        public void push(Symbol.ClassSymbol classSymbol, CompletionCause completionCause) {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class GraphDependencies extends Dependencies implements Closeable, Symbol.Completer {
        private String dependenciesFile;
        private EnumSet<DependenciesMode> dependenciesModes;
        Map<Symbol.ClassSymbol, Node> dependencyNodeMap;
        Stack<Node> nodeStack;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class CompletionNode extends Node {
            final Kind ck;

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public enum Kind {
                SOURCE("solid"),
                CLASS("dotted");

                final String dotStyle;

                Kind(String str) {
                    this.dotStyle = str;
                }
            }

            public CompletionNode(Symbol.ClassSymbol classSymbol) {
                super(classSymbol);
                JavaFileObject javaFileObject = classSymbol.classfile;
                this.ck = (!(javaFileObject == null && classSymbol.sourcefile == null) && (javaFileObject == null || javaFileObject.getKind() != JavaFileObject.Kind.CLASS)) ? Kind.SOURCE : Kind.CLASS;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Symbol.ClassSymbol getClassSymbol() {
                return (Symbol.ClassSymbol) this.data;
            }

            @Override // org.openjdk.tools.javac.util.Dependencies.GraphDependencies.Node, org.openjdk.tools.javac.util.GraphUtils.DottableNode
            public Properties nodeAttributes() {
                Properties nodeAttributes = super.nodeAttributes();
                nodeAttributes.put("style", this.ck.dotStyle);
                nodeAttributes.put("shape", "ellipse");
                return nodeAttributes;
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum DependenciesMode {
            SOURCE("source"),
            CLASS(RoadProbe.CLASS_PROPERTY),
            REDUNDANT("redundant");

            final String opt;

            DependenciesMode(String str) {
                this.opt = str;
            }

            public static EnumSet<DependenciesMode> getDependenciesModes(String[] strArr) {
                EnumSet<DependenciesMode> noneOf = EnumSet.noneOf(DependenciesMode.class);
                java.util.List asList = Arrays.asList(strArr);
                if (asList.contains("all")) {
                    noneOf = EnumSet.allOf(DependenciesMode.class);
                }
                for (DependenciesMode dependenciesMode : values()) {
                    if (asList.contains(dependenciesMode.opt)) {
                        noneOf.add(dependenciesMode);
                    } else {
                        if (asList.contains("-" + dependenciesMode.opt)) {
                            noneOf.remove(dependenciesMode);
                        }
                    }
                }
                return noneOf;
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public class FilterVisitor extends GraphUtils.NodeVisitor<Symbol.ClassSymbol, Node, Void> {
            CompletionNode.Kind ck;

            private FilterVisitor(CompletionNode.Kind kind) {
                this.ck = kind;
            }

            @Override // org.openjdk.tools.javac.util.GraphUtils.NodeVisitor
            public void visitDependency(GraphUtils.DependencyKind dependencyKind, Node node, Node node2, Void r4) {
                if (!(node2 instanceof CompletionNode) || ((CompletionNode) node2).ck == this.ck) {
                    return;
                }
                node.depsByKind.get(dependencyKind).remove(node2);
            }

            @Override // org.openjdk.tools.javac.util.GraphUtils.NodeVisitor
            public void visitNode(Node node, Void r3) {
                if (!(node instanceof CompletionNode) || ((CompletionNode) node).ck == this.ck) {
                    return;
                }
                GraphDependencies.this.dependencyNodeMap.remove(node.data);
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static abstract class Node extends GraphUtils.AbstractNode<Symbol.ClassSymbol, Node> implements GraphUtils.DottableNode<Symbol.ClassSymbol, Node> {
            EnumMap<CompletionCause, java.util.List<Node>> depsByKind;

            public Node(Symbol.ClassSymbol classSymbol) {
                super(classSymbol);
                this.depsByKind = new EnumMap<>(CompletionCause.class);
                for (CompletionCause completionCause : CompletionCause.values()) {
                    this.depsByKind.put((EnumMap<CompletionCause, java.util.List<Node>>) completionCause, (CompletionCause) new ArrayList());
                }
            }

            public void addDependency(GraphUtils.DependencyKind dependencyKind, Node node) {
                java.util.List<Node> list = this.depsByKind.get(dependencyKind);
                if (list.contains(node)) {
                    return;
                }
                list.add(node);
            }

            @Override // org.openjdk.tools.javac.util.GraphUtils.DottableNode
            public Properties dependencyAttributes(Node node, GraphUtils.DependencyKind dependencyKind) {
                Properties properties = new Properties();
                properties.put("label", dependencyKind);
                return properties;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public boolean equals(Object obj) {
                return (obj instanceof Node) && ((Symbol.ClassSymbol) this.data).equals(((Node) obj).data);
            }

            @Override // org.openjdk.tools.javac.util.GraphUtils.AbstractNode
            public Collection<? extends Node> getDependenciesByKind(GraphUtils.DependencyKind dependencyKind) {
                return this.depsByKind.get(dependencyKind);
            }

            @Override // org.openjdk.tools.javac.util.GraphUtils.AbstractNode
            public GraphUtils.DependencyKind[] getSupportedDependencyKinds() {
                return CompletionCause.values();
            }

            /* JADX WARN: Multi-variable type inference failed */
            public int hashCode() {
                return ((Symbol.ClassSymbol) this.data).hashCode();
            }

            public Properties nodeAttributes() {
                Properties properties = new Properties();
                properties.put("label", GraphUtils.DotVisitor.wrap(toString()));
                return properties;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // org.openjdk.tools.javac.util.GraphUtils.AbstractNode
            public String toString() {
                return ((Symbol.ClassSymbol) this.data).getQualifiedName().toString();
            }
        }

        public GraphDependencies(Context context) {
            super(context);
            this.nodeStack = new Stack<>();
            this.dependencyNodeMap = new LinkedHashMap();
            String[] split = Options.instance(context).get("debug.completionDeps").split(",");
            for (String str : split) {
                if (str.startsWith("file=")) {
                    this.dependenciesFile = str.substring(5);
                }
            }
            this.dependenciesModes = DependenciesMode.getDependenciesModes(split);
            JavaCompiler instance = JavaCompiler.instance(context);
            instance.closeables = instance.closeables.prepend(this);
        }

        public static void preRegister(Context context) {
            context.put((Context.Key) Dependencies.dependenciesKey, (Context.Factory) new Dependencies$GraphDependencies$$ExternalSyntheticLambda0());
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (!this.dependenciesModes.contains(DependenciesMode.REDUNDANT)) {
                new PruneVisitor().visit(this.dependencyNodeMap.values(), null);
            }
            if (!this.dependenciesModes.contains(DependenciesMode.CLASS)) {
                new FilterVisitor(CompletionNode.Kind.SOURCE).visit(this.dependencyNodeMap.values(), null);
            }
            if (!this.dependenciesModes.contains(DependenciesMode.SOURCE)) {
                new FilterVisitor(CompletionNode.Kind.CLASS).visit(this.dependencyNodeMap.values(), null);
            }
            if (this.dependenciesFile == null) {
                return;
            }
            FileWriter fileWriter = new FileWriter(this.dependenciesFile);
            try {
                fileWriter.append((CharSequence) GraphUtils.toDot(this.dependencyNodeMap.values(), "CompletionDeps", ""));
                fileWriter.close();
            } finally {
            }
        }

        @Override // org.openjdk.tools.javac.code.Symbol.Completer
        public void complete(Symbol symbol) throws Symbol.CompletionFailure {
            push((Symbol.ClassSymbol) symbol, CompletionCause.OTHER);
            pop();
            symbol.completer = this;
        }

        public Collection<Node> getNodes() {
            return this.dependencyNodeMap.values();
        }

        @Override // org.openjdk.tools.javac.code.Symbol.Completer
        public boolean isTerminal() {
            return true;
        }

        @Override // org.openjdk.tools.javac.util.Dependencies
        public void pop() {
            this.nodeStack.pop();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Node push(Node node, CompletionCause completionCause) {
            Node node2 = this.dependencyNodeMap.get(node.data);
            if (node2 == null) {
                this.dependencyNodeMap.put(node.data, node);
            } else {
                node = node2;
            }
            if (!this.nodeStack.isEmpty()) {
                this.nodeStack.peek().addDependency(completionCause, node);
            }
            this.nodeStack.push(node);
            return node;
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class PruneVisitor extends GraphUtils.NodeVisitor<Symbol.ClassSymbol, Node, Void> {
            private PruneVisitor() {
            }

            @Override // org.openjdk.tools.javac.util.GraphUtils.NodeVisitor
            public void visitDependency(GraphUtils.DependencyKind dependencyKind, Node node, Node node2, Void r4) {
                if (node.equals(node2)) {
                    node2.depsByKind.get(dependencyKind).remove(node);
                }
            }

            @Override // org.openjdk.tools.javac.util.GraphUtils.NodeVisitor
            public void visitNode(Node node, Void r2) {
            }
        }

        @Override // org.openjdk.tools.javac.util.Dependencies
        public void push(Symbol.ClassSymbol classSymbol, CompletionCause completionCause) {
            CompletionNode completionNode = new CompletionNode(classSymbol);
            if (completionNode == push(completionNode, completionCause)) {
                classSymbol.completer = this;
            }
        }
    }
}
