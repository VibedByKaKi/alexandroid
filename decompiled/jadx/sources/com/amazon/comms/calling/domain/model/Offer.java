package com.amazon.comms.calling.domain.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003J8\u0010\u0015\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\bHÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/amazon/comms/calling/domain/model/Offer;", "", "mediaStreams", "", "Lcom/amazon/comms/calling/domain/model/MediaStream;", "trickleICE", "", "rtcpMuxPolicy", "", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;)V", "getMediaStreams", "()Ljava/util/List;", "getTrickleICE", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRtcpMuxPolicy", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/amazon/comms/calling/domain/model/Offer;", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class Offer {

    @SerializedName("mediaStreams")
    @Nullable
    private final List<MediaStream> mediaStreams;

    @SerializedName("rtcpMuxPolicy")
    @Nullable
    private final String rtcpMuxPolicy;

    @SerializedName("trickleICE")
    @Nullable
    private final Boolean trickleICE;

    public /* synthetic */ Offer(List list, Boolean bool, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Offer copy$default(Offer offer, List list, Boolean bool, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = offer.mediaStreams;
        }
        if ((i & 2) != 0) {
            bool = offer.trickleICE;
        }
        if ((i & 4) != 0) {
            str = offer.rtcpMuxPolicy;
        }
        return offer.copy(list, bool, str);
    }

    @Nullable
    public final List<MediaStream> component1() {
        return this.mediaStreams;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Boolean getTrickleICE() {
        return this.trickleICE;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getRtcpMuxPolicy() {
        return this.rtcpMuxPolicy;
    }

    @NotNull
    public final Offer copy(@Nullable List<MediaStream> mediaStreams, @Nullable Boolean trickleICE, @Nullable String rtcpMuxPolicy) {
        return new Offer(mediaStreams, trickleICE, rtcpMuxPolicy);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Offer)) {
            return false;
        }
        Offer offer = (Offer) other;
        return Intrinsics.areEqual(this.mediaStreams, offer.mediaStreams) && Intrinsics.areEqual(this.trickleICE, offer.trickleICE) && Intrinsics.areEqual(this.rtcpMuxPolicy, offer.rtcpMuxPolicy);
    }

    @Nullable
    public final List<MediaStream> getMediaStreams() {
        return this.mediaStreams;
    }

    @Nullable
    public final String getRtcpMuxPolicy() {
        return this.rtcpMuxPolicy;
    }

    @Nullable
    public final Boolean getTrickleICE() {
        return this.trickleICE;
    }

    public int hashCode() {
        List<MediaStream> list = this.mediaStreams;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.trickleICE;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.rtcpMuxPolicy;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<MediaStream> list = this.mediaStreams;
        Boolean bool = this.trickleICE;
        String str = this.rtcpMuxPolicy;
        StringBuilder sb = new StringBuilder("Offer(mediaStreams=");
        sb.append(list);
        sb.append(", trickleICE=");
        sb.append(bool);
        sb.append(", rtcpMuxPolicy=");
        return a$$ExternalSyntheticOutline0.m(sb, str, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public Offer(@Nullable List<MediaStream> list, @Nullable Boolean bool, @Nullable String str) {
        this.mediaStreams = list;
        this.trickleICE = bool;
        this.rtcpMuxPolicy = str;
    }

    public Offer() {
        this(null, null, null, 7, null);
    }
}
