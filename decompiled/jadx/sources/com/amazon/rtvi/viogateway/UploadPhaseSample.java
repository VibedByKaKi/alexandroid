package com.amazon.rtvi.viogateway;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u001d\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J`\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0013\u0010\u0010R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0014\u0010\u0010R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0015\u0010\u0010R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0016\u0010\u0010¨\u0006&"}, d2 = {"Lcom/amazon/rtvi/viogateway/UploadPhaseSample;", "", "connectionReused", "", "dnsMs", "", "connectMs", "tlsMs", "requestMs", "ttfbMs", "responseMs", "<init>", "(ZLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "getConnectionReused", "()Z", "getDnsMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getConnectMs", "getTlsMs", "getRequestMs", "getTtfbMs", "getResponseMs", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(ZLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)Lcom/amazon/rtvi/viogateway/UploadPhaseSample;", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "RTVIAndroidAlexaAvsSdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class UploadPhaseSample {

    @Nullable
    private final Long connectMs;
    private final boolean connectionReused;

    @Nullable
    private final Long dnsMs;

    @Nullable
    private final Long requestMs;

    @Nullable
    private final Long responseMs;

    @Nullable
    private final Long tlsMs;

    @Nullable
    private final Long ttfbMs;

    public /* synthetic */ UploadPhaseSample(boolean z, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : l2, (i & 8) != 0 ? null : l3, (i & 16) != 0 ? null : l4, (i & 32) != 0 ? null : l5, (i & 64) != 0 ? null : l6);
    }

    public static /* synthetic */ UploadPhaseSample copy$default(UploadPhaseSample uploadPhaseSample, boolean z, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, int i, Object obj) {
        if ((i & 1) != 0) {
            z = uploadPhaseSample.connectionReused;
        }
        if ((i & 2) != 0) {
            l = uploadPhaseSample.dnsMs;
        }
        if ((i & 4) != 0) {
            l2 = uploadPhaseSample.connectMs;
        }
        if ((i & 8) != 0) {
            l3 = uploadPhaseSample.tlsMs;
        }
        if ((i & 16) != 0) {
            l4 = uploadPhaseSample.requestMs;
        }
        if ((i & 32) != 0) {
            l5 = uploadPhaseSample.ttfbMs;
        }
        if ((i & 64) != 0) {
            l6 = uploadPhaseSample.responseMs;
        }
        Long l7 = l5;
        Long l8 = l6;
        Long l9 = l4;
        Long l10 = l2;
        return uploadPhaseSample.copy(z, l, l10, l3, l9, l7, l8);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getConnectionReused() {
        return this.connectionReused;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Long getDnsMs() {
        return this.dnsMs;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Long getConnectMs() {
        return this.connectMs;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Long getTlsMs() {
        return this.tlsMs;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Long getRequestMs() {
        return this.requestMs;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Long getTtfbMs() {
        return this.ttfbMs;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Long getResponseMs() {
        return this.responseMs;
    }

    @NotNull
    public final UploadPhaseSample copy(boolean connectionReused, @Nullable Long dnsMs, @Nullable Long connectMs, @Nullable Long tlsMs, @Nullable Long requestMs, @Nullable Long ttfbMs, @Nullable Long responseMs) {
        return new UploadPhaseSample(connectionReused, dnsMs, connectMs, tlsMs, requestMs, ttfbMs, responseMs);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadPhaseSample)) {
            return false;
        }
        UploadPhaseSample uploadPhaseSample = (UploadPhaseSample) other;
        return this.connectionReused == uploadPhaseSample.connectionReused && Intrinsics.areEqual(this.dnsMs, uploadPhaseSample.dnsMs) && Intrinsics.areEqual(this.connectMs, uploadPhaseSample.connectMs) && Intrinsics.areEqual(this.tlsMs, uploadPhaseSample.tlsMs) && Intrinsics.areEqual(this.requestMs, uploadPhaseSample.requestMs) && Intrinsics.areEqual(this.ttfbMs, uploadPhaseSample.ttfbMs) && Intrinsics.areEqual(this.responseMs, uploadPhaseSample.responseMs);
    }

    @Nullable
    public final Long getConnectMs() {
        return this.connectMs;
    }

    public final boolean getConnectionReused() {
        return this.connectionReused;
    }

    @Nullable
    public final Long getDnsMs() {
        return this.dnsMs;
    }

    @Nullable
    public final Long getRequestMs() {
        return this.requestMs;
    }

    @Nullable
    public final Long getResponseMs() {
        return this.responseMs;
    }

    @Nullable
    public final Long getTlsMs() {
        return this.tlsMs;
    }

    @Nullable
    public final Long getTtfbMs() {
        return this.ttfbMs;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.connectionReused) * 31;
        Long l = this.dnsMs;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.connectMs;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.tlsMs;
        int hashCode4 = (hashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.requestMs;
        int hashCode5 = (hashCode4 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.ttfbMs;
        int hashCode6 = (hashCode5 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.responseMs;
        return hashCode6 + (l6 != null ? l6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UploadPhaseSample(connectionReused=" + this.connectionReused + ", dnsMs=" + this.dnsMs + ", connectMs=" + this.connectMs + ", tlsMs=" + this.tlsMs + ", requestMs=" + this.requestMs + ", ttfbMs=" + this.ttfbMs + ", responseMs=" + this.responseMs + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public UploadPhaseSample(boolean z, @Nullable Long l, @Nullable Long l2, @Nullable Long l3, @Nullable Long l4, @Nullable Long l5, @Nullable Long l6) {
        this.connectionReused = z;
        this.dnsMs = l;
        this.connectMs = l2;
        this.tlsMs = l3;
        this.requestMs = l4;
        this.ttfbMs = l5;
        this.responseMs = l6;
    }
}
