package dagger.model;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.Sets;
import com.google.common.graph.EndpointPair;
import com.google.common.graph.Graph;
import com.google.common.graph.Graphs;
import com.google.common.graph.ImmutableNetwork;
import com.google.common.graph.MutableNetwork;
import com.google.common.graph.NetworkBuilder;
import dagger.internal.codegen.extension.DaggerStreams;
import dagger.model.BindingGraph;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public abstract class BindingGraph {
    private static final ImmutableSet<Class<? extends Node>> NODE_TYPES = ImmutableSet.of(Binding.class, MissingBinding.class, ComponentNode.class);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ChildFactoryMethodEdge extends Edge {
        ExecutableElement factoryMethod();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ComponentNode extends Node {
        @Override // dagger.model.BindingGraph.Node
        ComponentPath componentPath();

        ImmutableSet<DependencyRequest> entryPoints();

        boolean isRealComponent();

        boolean isSubcomponent();

        ImmutableSet<Scope> scopes();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface DependencyEdge extends Edge {
        DependencyRequest dependencyRequest();

        boolean isEntryPoint();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Edge {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface MaybeBinding extends Node {
        Optional<Binding> binding();

        @Override // dagger.model.BindingGraph.Node
        ComponentPath componentPath();

        Key key();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class MissingBinding implements MaybeBinding {
        @Override // dagger.model.BindingGraph.MaybeBinding
        @Deprecated
        public Optional<Binding> binding() {
            return Optional.empty();
        }

        @Override // dagger.model.BindingGraph.MaybeBinding, dagger.model.BindingGraph.Node
        public abstract ComponentPath componentPath();

        @Override // dagger.model.BindingGraph.MaybeBinding
        public abstract Key key();

        public String toString() {
            return String.format("missing binding for %s in %s", key(), componentPath());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Node {
        ComponentPath componentPath();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface SubcomponentCreatorBindingEdge extends Edge {
        ImmutableSet<TypeElement> declaringModules();
    }

    private Stream<DependencyEdge> dependencyEdgeStream(Node node) {
        return network().outEdges(node).stream().flatMap(DaggerStreams.instancesOf(DependencyEdge.class));
    }

    private ImmutableNetwork<Node, DependencyEdge> dependencyGraph() {
        final MutableNetwork build = NetworkBuilder.from(network()).expectedNodeCount(network().nodes().size()).expectedEdgeCount((int) dependencyEdgeStream().count()).build();
        Set nodes = network().nodes();
        Objects.requireNonNull(build);
        nodes.forEach(new Consumer() { // from class: dagger.model.BindingGraph$$ExternalSyntheticLambda6
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                MutableNetwork.this.addNode((BindingGraph.Node) obj);
            }
        });
        dependencyEdgeStream().forEach(new BindingGraph$$ExternalSyntheticLambda7(this, build, 0));
        return ImmutableNetwork.copyOf(build);
    }

    private Stream<DependencyEdge> entryPointEdgeStream() {
        return dependencyEdgeStream().filter(new BindingGraph$$ExternalSyntheticLambda1(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$bindings$0(Key key, Binding binding) {
        return binding.key().equals(key);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$componentNode$1(ComponentPath componentPath, ComponentNode componentNode) {
        return componentNode.componentPath().equals(componentPath);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$componentNodes$2(TypeElement typeElement, ComponentNode componentNode) {
        return componentNode.componentPath().currentComponent().equals(typeElement);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$dependencyEdges$5(DependencyRequest dependencyRequest, DependencyEdge dependencyEdge) {
        return dependencyEdge.dependencyRequest().equals(dependencyRequest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dependencyGraph$7(MutableNetwork mutableNetwork, DependencyEdge dependencyEdge) {
        EndpointPair incidentNodes = network().incidentNodes(dependencyEdge);
        mutableNetwork.addEdge((Node) incidentNodes.source(), (Node) incidentNodes.target(), dependencyEdge);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ MaybeBinding lambda$entryPointBindings$6(DependencyEdge dependencyEdge) {
        return (MaybeBinding) network().incidentNodes(dependencyEdge).target();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$nodesByClass$8(Node node, Class cls) {
        return cls.isInstance(node);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Class lambda$nodesByClass$9(Node node) {
        return NODE_TYPES.stream().filter(new BindingGraph$$ExternalSyntheticLambda4(node, 0)).findFirst().get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$rootComponentNode$3(ComponentNode componentNode) {
        return componentNode.componentPath().atRoot();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N extends Node> ImmutableSet<N> nodes(Class<N> cls) {
        return (ImmutableSet<N>) nodesByClass().get((ImmutableSetMultimap<Class<? extends Node>, ? extends Node>) cls);
    }

    public ImmutableSet<Binding> bindings(Key key) {
        return (ImmutableSet) nodes(Binding.class).stream().filter(new BindingGraph$$ExternalSyntheticLambda4(key, 3)).collect(DaggerStreams.toImmutableSet());
    }

    public Optional<ComponentNode> componentNode(ComponentPath componentPath) {
        return componentNodes().stream().filter(new BindingGraph$$ExternalSyntheticLambda4(componentPath, 4)).findFirst();
    }

    public ImmutableSet<ComponentNode> componentNodes(TypeElement typeElement) {
        return (ImmutableSet) componentNodes().stream().filter(new BindingGraph$$ExternalSyntheticLambda4(typeElement, 1)).collect(DaggerStreams.toImmutableSet());
    }

    public ImmutableSetMultimap<DependencyRequest, DependencyEdge> dependencyEdges(Binding binding) {
        return (ImmutableSetMultimap) dependencyEdgeStream(binding).collect(DaggerStreams.toImmutableSetMultimap(new BindingGraph$$ExternalSyntheticLambda2(1), new BindingGraph$$ExternalSyntheticLambda2(2)));
    }

    public ImmutableSet<MaybeBinding> entryPointBindings() {
        return (ImmutableSet) entryPointEdgeStream().map(new Function() { // from class: dagger.model.BindingGraph$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                BindingGraph.MaybeBinding lambda$entryPointBindings$6;
                lambda$entryPointBindings$6 = BindingGraph.this.lambda$entryPointBindings$6((BindingGraph.DependencyEdge) obj);
                return lambda$entryPointBindings$6;
            }
        }).collect(DaggerStreams.toImmutableSet());
    }

    public ImmutableSet<DependencyEdge> entryPointEdges(ComponentPath componentPath) {
        return (ImmutableSet) dependencyEdgeStream(componentNode(componentPath).get()).collect(DaggerStreams.toImmutableSet());
    }

    public ImmutableSet<DependencyEdge> entryPointEdgesDependingOnBinding(MaybeBinding maybeBinding) {
        ImmutableNetwork<Node, DependencyEdge> dependencyGraph = dependencyGraph();
        return Sets.intersection(entryPointEdges(), Graphs.inducedSubgraph(dependencyGraph, Graphs.reachableNodes((Graph<MaybeBinding>) Graphs.transpose(dependencyGraph).asGraph(), maybeBinding)).edges()).immutableCopy();
    }

    public abstract boolean isFullBindingGraph();

    @Deprecated
    public boolean isModuleBindingGraph() {
        return !rootComponentNode().isRealComponent();
    }

    @Deprecated
    public boolean isPartialBindingGraph() {
        return rootComponentNode().isSubcomponent();
    }

    public ImmutableSet<MissingBinding> missingBindings() {
        return nodes(MissingBinding.class);
    }

    public abstract ImmutableNetwork<Node, Edge> network();

    public ImmutableSetMultimap<Class<? extends Node>, ? extends Node> nodesByClass() {
        return (ImmutableSetMultimap) network().nodes().stream().collect(DaggerStreams.toImmutableSetMultimap(new BindingGraph$$ExternalSyntheticLambda2(0), new BindingGraph$$ExternalSyntheticLambda2(3)));
    }

    public ImmutableSet<Binding> requestedBindings(Binding binding) {
        return (ImmutableSet) network().successors((Object) binding).stream().flatMap(DaggerStreams.instancesOf(Binding.class)).collect(DaggerStreams.toImmutableSet());
    }

    public ImmutableSet<MaybeBinding> requestedMaybeMissingBindings(Binding binding) {
        return (ImmutableSet) network().successors((Object) binding).stream().flatMap(DaggerStreams.instancesOf(MaybeBinding.class)).collect(DaggerStreams.toImmutableSet());
    }

    public ImmutableSet<Binding> requestingBindings(MaybeBinding maybeBinding) {
        return (ImmutableSet) network().predecessors((Object) maybeBinding).stream().flatMap(DaggerStreams.instancesOf(Binding.class)).collect(DaggerStreams.toImmutableSet());
    }

    public ComponentNode rootComponentNode() {
        return componentNodes().stream().filter(new BindingGraph$$ExternalSyntheticLambda1(0)).findFirst().get();
    }

    public String toString() {
        return network().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ DependencyEdge lambda$dependencyEdges$4(DependencyEdge dependencyEdge) {
        return dependencyEdge;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Node lambda$nodesByClass$10(Node node) {
        return node;
    }

    private Stream<DependencyEdge> dependencyEdgeStream() {
        return network().edges().stream().flatMap(DaggerStreams.instancesOf(DependencyEdge.class));
    }

    public ImmutableSet<DependencyEdge> entryPointEdges() {
        return (ImmutableSet) entryPointEdgeStream().collect(DaggerStreams.toImmutableSet());
    }

    public ImmutableSet<DependencyEdge> dependencyEdges() {
        return (ImmutableSet) dependencyEdgeStream().collect(DaggerStreams.toImmutableSet());
    }

    public ImmutableSet<DependencyEdge> dependencyEdges(DependencyRequest dependencyRequest) {
        return (ImmutableSet) dependencyEdgeStream().filter(new BindingGraph$$ExternalSyntheticLambda4(dependencyRequest, 2)).collect(DaggerStreams.toImmutableSet());
    }

    public ImmutableSet<ComponentNode> componentNodes() {
        return nodes(ComponentNode.class);
    }

    public ImmutableSet<Binding> bindings() {
        return nodes(Binding.class);
    }
}
