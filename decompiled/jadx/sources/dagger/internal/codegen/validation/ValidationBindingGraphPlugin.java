package dagger.internal.codegen.validation;

import com.google.common.base.Preconditions;
import dagger.spi.model.BindingGraph;
import dagger.spi.model.BindingGraphPlugin;
import dagger.spi.model.DiagnosticReporter;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public abstract class ValidationBindingGraphPlugin implements BindingGraphPlugin {
    private final Set<BindingGraph.ComponentNode> visitFullGraphRequested = new HashSet();

    public final void requestVisitFullGraph(BindingGraph bindingGraph) {
        Preconditions.checkState(!bindingGraph.isFullBindingGraph(), "Cannot request revisit full graph when visiting full graph.");
        this.visitFullGraphRequested.add(bindingGraph.rootComponentNode());
    }

    public final boolean visitFullGraphRequested(BindingGraph bindingGraph) {
        return this.visitFullGraphRequested.contains(bindingGraph.rootComponentNode());
    }

    public void revisitFullGraph(BindingGraph bindingGraph, BindingGraph bindingGraph2, DiagnosticReporter diagnosticReporter) {
    }
}
