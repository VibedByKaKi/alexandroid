package com.amazon.dee.app.services.internetsharing.nan;

import android.net.Network;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import io.ktor.client.utils.CacheControl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/amazon/dee/app/services/internetsharing/nan/NanConnection;", "", "peerIpv6", "", "network", "Landroid/net/Network;", ClientCookie.PORT_ATTR, "", "<init>", "(Ljava/lang/String;Landroid/net/Network;I)V", "getPeerIpv6", "()Ljava/lang/String;", "getNetwork", "()Landroid/net/Network;", "getPort", "()I", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", CacheControl.PUBLIC}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class NanConnection {

    @NotNull
    private final Network network;

    @NotNull
    private final String peerIpv6;
    private final int port;

    public NanConnection(@NotNull String str, @NotNull Network network, int i) {
        str.getClass();
        network.getClass();
        this.peerIpv6 = str;
        this.network = network;
        this.port = i;
    }

    public static /* synthetic */ NanConnection copy$default(NanConnection nanConnection, String str, Network network, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = nanConnection.peerIpv6;
        }
        if ((i2 & 2) != 0) {
            network = nanConnection.network;
        }
        if ((i2 & 4) != 0) {
            i = nanConnection.port;
        }
        return nanConnection.copy(str, network, i);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPeerIpv6() {
        return this.peerIpv6;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Network getNetwork() {
        return this.network;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPort() {
        return this.port;
    }

    @NotNull
    public final NanConnection copy(@NotNull String peerIpv6, @NotNull Network network, int port) {
        peerIpv6.getClass();
        network.getClass();
        return new NanConnection(peerIpv6, network, port);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NanConnection)) {
            return false;
        }
        NanConnection nanConnection = (NanConnection) other;
        return Intrinsics.areEqual(this.peerIpv6, nanConnection.peerIpv6) && Intrinsics.areEqual(this.network, nanConnection.network) && this.port == nanConnection.port;
    }

    @NotNull
    public final Network getNetwork() {
        return this.network;
    }

    @NotNull
    public final String getPeerIpv6() {
        return this.peerIpv6;
    }

    public final int getPort() {
        return this.port;
    }

    public int hashCode() {
        return Integer.hashCode(this.port) + ((this.network.hashCode() + (this.peerIpv6.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.peerIpv6;
        Network network = this.network;
        int i = this.port;
        StringBuilder sb = new StringBuilder("NanConnection(peerIpv6=");
        sb.append(str);
        sb.append(", network=");
        sb.append(network);
        sb.append(", port=");
        return a$$ExternalSyntheticOutline0.m(sb, i, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
