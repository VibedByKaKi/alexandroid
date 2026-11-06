package com.amazon.alexa.assistant.toolkit.networkConnectivityMonitor;

import com.amazon.alexa.assistant.toolkit.lifecycle.LifecycleComponent;
import kotlin.Metadata;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/assistant/toolkit/networkConnectivityMonitor/NetworkConnectivityMonitor;", "Lcom/amazon/alexa/assistant/toolkit/lifecycle/LifecycleComponent;", "start", "", "stop", "networkState", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/amazon/alexa/assistant/toolkit/networkConnectivityMonitor/NetworkState;", "toolkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface NetworkConnectivityMonitor extends LifecycleComponent {
    @NotNull
    StateFlow<NetworkState> networkState();

    @Override // com.amazon.alexa.assistant.toolkit.lifecycle.Startable
    void start();

    @Override // com.amazon.alexa.assistant.toolkit.lifecycle.Stoppable
    void stop();
}
