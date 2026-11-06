package com.amazon.alexa.assistant.toolkit;

import com.amazon.alexa.assistant.foundation.logging.Logger;
import com.amazon.alexa.assistant.foundation.model.diagnostics.DiagnosticsDelegate;
import com.amazon.alexa.assistant.toolkit.metric.model.MetricsManager;
import com.amazon.alexa.assistant.toolkit.networkConnectivityMonitor.NetworkConnectivityMonitor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/assistant/toolkit/ToolkitLayerDependencyProvider;", "", "networkConnectivityMonitor", "Lcom/amazon/alexa/assistant/toolkit/networkConnectivityMonitor/NetworkConnectivityMonitor;", "logger", "Lcom/amazon/alexa/assistant/foundation/logging/Logger;", "metricsManager", "Lcom/amazon/alexa/assistant/toolkit/metric/model/MetricsManager;", "diagnosticsDelegate", "Lcom/amazon/alexa/assistant/foundation/model/diagnostics/DiagnosticsDelegate;", "<init>", "(Lcom/amazon/alexa/assistant/toolkit/networkConnectivityMonitor/NetworkConnectivityMonitor;Lcom/amazon/alexa/assistant/foundation/logging/Logger;Lcom/amazon/alexa/assistant/toolkit/metric/model/MetricsManager;Lcom/amazon/alexa/assistant/foundation/model/diagnostics/DiagnosticsDelegate;)V", "getNetworkConnectivityMonitor", "()Lcom/amazon/alexa/assistant/toolkit/networkConnectivityMonitor/NetworkConnectivityMonitor;", "getLogger", "()Lcom/amazon/alexa/assistant/foundation/logging/Logger;", "getMetricsManager", "()Lcom/amazon/alexa/assistant/toolkit/metric/model/MetricsManager;", "getDiagnosticsDelegate", "()Lcom/amazon/alexa/assistant/foundation/model/diagnostics/DiagnosticsDelegate;", "toolkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ToolkitLayerDependencyProvider {

    @Nullable
    private final DiagnosticsDelegate diagnosticsDelegate;

    @NotNull
    private final Logger logger;

    @NotNull
    private final MetricsManager metricsManager;

    @NotNull
    private final NetworkConnectivityMonitor networkConnectivityMonitor;

    public ToolkitLayerDependencyProvider(@NotNull NetworkConnectivityMonitor networkConnectivityMonitor, @NotNull Logger logger, @NotNull MetricsManager metricsManager, @Nullable DiagnosticsDelegate diagnosticsDelegate) {
        networkConnectivityMonitor.getClass();
        logger.getClass();
        metricsManager.getClass();
        this.networkConnectivityMonitor = networkConnectivityMonitor;
        this.logger = logger;
        this.metricsManager = metricsManager;
        this.diagnosticsDelegate = diagnosticsDelegate;
    }

    @Nullable
    public final DiagnosticsDelegate getDiagnosticsDelegate() {
        return this.diagnosticsDelegate;
    }

    @NotNull
    public final Logger getLogger() {
        return this.logger;
    }

    @NotNull
    public final MetricsManager getMetricsManager() {
        return this.metricsManager;
    }

    @NotNull
    public final NetworkConnectivityMonitor getNetworkConnectivityMonitor() {
        return this.networkConnectivityMonitor;
    }

    public /* synthetic */ ToolkitLayerDependencyProvider(NetworkConnectivityMonitor networkConnectivityMonitor, Logger logger, MetricsManager metricsManager, DiagnosticsDelegate diagnosticsDelegate, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(networkConnectivityMonitor, logger, metricsManager, (i & 8) != 0 ? null : diagnosticsDelegate);
    }
}
