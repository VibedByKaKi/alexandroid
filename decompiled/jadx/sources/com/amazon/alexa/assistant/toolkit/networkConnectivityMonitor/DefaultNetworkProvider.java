package com.amazon.alexa.assistant.toolkit.networkConnectivityMonitor;

import android.net.Network;
import com.amazon.alexa.assistant.foundation.internal.InternalAssistantSdkApi;
import kotlin.Metadata;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@InternalAssistantSdkApi
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/assistant/toolkit/networkConnectivityMonitor/DefaultNetworkProvider;", "", "defaultNetwork", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/amazon/alexa/assistant/toolkit/networkConnectivityMonitor/DefaultNetworkSnapshot;", "isValidated", "", "network", "Landroid/net/Network;", "toolkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface DefaultNetworkProvider {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static boolean isValidated(@NotNull DefaultNetworkProvider defaultNetworkProvider, @NotNull Network network) {
            network.getClass();
            return false;
        }
    }

    @NotNull
    StateFlow<DefaultNetworkSnapshot> defaultNetwork();

    boolean isValidated(@NotNull Network network);
}
