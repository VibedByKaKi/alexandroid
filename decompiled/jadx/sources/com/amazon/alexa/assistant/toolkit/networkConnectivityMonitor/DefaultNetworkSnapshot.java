package com.amazon.alexa.assistant.toolkit.networkConnectivityMonitor;

import android.net.Network;
import com.amazon.alexa.assistant.foundation.internal.InternalAssistantSdkApi;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@InternalAssistantSdkApi
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0000J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/assistant/toolkit/networkConnectivityMonitor/DefaultNetworkSnapshot;", "", "network", "Landroid/net/Network;", "state", "Lcom/amazon/alexa/assistant/toolkit/networkConnectivityMonitor/NetworkState;", "<init>", "(Landroid/net/Network;Lcom/amazon/alexa/assistant/toolkit/networkConnectivityMonitor/NetworkState;)V", "getNetwork", "()Landroid/net/Network;", "getState", "()Lcom/amazon/alexa/assistant/toolkit/networkConnectivityMonitor/NetworkState;", "sameNetworkAs", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "component1", "component2", "copy", "equals", "hashCode", "", "toString", "", "toolkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class DefaultNetworkSnapshot {

    @Nullable
    private final Network network;

    @NotNull
    private final NetworkState state;

    public DefaultNetworkSnapshot(@Nullable Network network, @NotNull NetworkState networkState) {
        networkState.getClass();
        this.network = network;
        this.state = networkState;
    }

    public static /* synthetic */ DefaultNetworkSnapshot copy$default(DefaultNetworkSnapshot defaultNetworkSnapshot, Network network, NetworkState networkState, int i, Object obj) {
        if ((i & 1) != 0) {
            network = defaultNetworkSnapshot.network;
        }
        if ((i & 2) != 0) {
            networkState = defaultNetworkSnapshot.state;
        }
        return defaultNetworkSnapshot.copy(network, networkState);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Network getNetwork() {
        return this.network;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final NetworkState getState() {
        return this.state;
    }

    @NotNull
    public final DefaultNetworkSnapshot copy(@Nullable Network network, @NotNull NetworkState state) {
        state.getClass();
        return new DefaultNetworkSnapshot(network, state);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DefaultNetworkSnapshot)) {
            return false;
        }
        DefaultNetworkSnapshot defaultNetworkSnapshot = (DefaultNetworkSnapshot) other;
        return Intrinsics.areEqual(this.network, defaultNetworkSnapshot.network) && this.state == defaultNetworkSnapshot.state;
    }

    @Nullable
    public final Network getNetwork() {
        return this.network;
    }

    @NotNull
    public final NetworkState getState() {
        return this.state;
    }

    public int hashCode() {
        Network network = this.network;
        return this.state.hashCode() + ((network == null ? 0 : network.hashCode()) * 31);
    }

    public final boolean sameNetworkAs(@Nullable DefaultNetworkSnapshot other) {
        return other != null && Intrinsics.areEqual(this.network, other.network) && this.state == other.state;
    }

    @NotNull
    public String toString() {
        return "DefaultNetworkSnapshot(network=" + this.network + ", state=" + this.state + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
