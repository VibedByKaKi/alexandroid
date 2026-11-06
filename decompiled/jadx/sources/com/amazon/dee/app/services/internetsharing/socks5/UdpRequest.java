package com.amazon.dee.app.services.internetsharing.socks5;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J'\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/amazon/dee/app/services/internetsharing/socks5/UdpRequest;", "", "host", "", ClientCookie.PORT_ATTR, "", "payload", "", "<init>", "(Ljava/lang/String;I[B)V", "getHost", "()Ljava/lang/String;", "getPort", "()I", "getPayload", "()[B", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "component1", "component2", "component3", "copy", "toString", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UdpRequest {

    @NotNull
    private final String host;

    @NotNull
    private final byte[] payload;
    private final int port;

    public UdpRequest(@NotNull String str, int i, @NotNull byte[] bArr) {
        str.getClass();
        bArr.getClass();
        this.host = str;
        this.port = i;
        this.payload = bArr;
    }

    public static /* synthetic */ UdpRequest copy$default(UdpRequest udpRequest, String str, int i, byte[] bArr, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = udpRequest.host;
        }
        if ((i2 & 2) != 0) {
            i = udpRequest.port;
        }
        if ((i2 & 4) != 0) {
            bArr = udpRequest.payload;
        }
        return udpRequest.copy(str, i, bArr);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getHost() {
        return this.host;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPort() {
        return this.port;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final byte[] getPayload() {
        return this.payload;
    }

    @NotNull
    public final UdpRequest copy(@NotNull String host, int port, @NotNull byte[] payload) {
        host.getClass();
        payload.getClass();
        return new UdpRequest(host, port, payload);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UdpRequest)) {
            return false;
        }
        UdpRequest udpRequest = (UdpRequest) other;
        return Intrinsics.areEqual(this.host, udpRequest.host) && this.port == udpRequest.port && Arrays.equals(this.payload, udpRequest.payload);
    }

    @NotNull
    public final String getHost() {
        return this.host;
    }

    @NotNull
    public final byte[] getPayload() {
        return this.payload;
    }

    public final int getPort() {
        return this.port;
    }

    public int hashCode() {
        return Arrays.hashCode(this.payload) + (((this.host.hashCode() * 31) + this.port) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.host;
        int i = this.port;
        return a$$ExternalSyntheticOutline0.m(DoubleList$$ExternalSyntheticOutline0.m(i, "UdpRequest(host=", str, ", port=", ", payload="), Arrays.toString(this.payload), MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
