package dagger.spi.model;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public interface BindingGraphPlugin {
    default String pluginName() {
        return getClass().getCanonicalName();
    }

    default Set<String> supportedOptions() {
        return Collections.EMPTY_SET;
    }

    void visitGraph(BindingGraph bindingGraph, DiagnosticReporter diagnosticReporter);

    default void onPluginEnd() {
    }

    default void init(DaggerProcessingEnv daggerProcessingEnv, Map<String, String> map) {
    }
}
