package com.amazon.comms.calling.domain.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/amazon/comms/calling/domain/model/MediaInfo;", "", "turnUDP", "Lcom/amazon/comms/calling/domain/model/MediaRelayInfo;", "turnTCP", "stun", "srtp", "Lcom/amazon/comms/calling/domain/model/SrtpInfo;", "<init>", "(Lcom/amazon/comms/calling/domain/model/MediaRelayInfo;Lcom/amazon/comms/calling/domain/model/MediaRelayInfo;Lcom/amazon/comms/calling/domain/model/MediaRelayInfo;Lcom/amazon/comms/calling/domain/model/SrtpInfo;)V", "getTurnUDP", "()Lcom/amazon/comms/calling/domain/model/MediaRelayInfo;", "getTurnTCP", "getStun", "getSrtp", "()Lcom/amazon/comms/calling/domain/model/SrtpInfo;", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class MediaInfo {

    @SerializedName("srtp")
    @Nullable
    private final SrtpInfo srtp;

    @SerializedName("stun")
    @Nullable
    private final MediaRelayInfo stun;

    @SerializedName("turnTCP")
    @Nullable
    private final MediaRelayInfo turnTCP;

    @SerializedName("turnUDP")
    @Nullable
    private final MediaRelayInfo turnUDP;

    public /* synthetic */ MediaInfo(MediaRelayInfo mediaRelayInfo, MediaRelayInfo mediaRelayInfo2, MediaRelayInfo mediaRelayInfo3, SrtpInfo srtpInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : mediaRelayInfo, (i & 2) != 0 ? null : mediaRelayInfo2, (i & 4) != 0 ? null : mediaRelayInfo3, (i & 8) != 0 ? null : srtpInfo);
    }

    public static /* synthetic */ MediaInfo copy$default(MediaInfo mediaInfo, MediaRelayInfo mediaRelayInfo, MediaRelayInfo mediaRelayInfo2, MediaRelayInfo mediaRelayInfo3, SrtpInfo srtpInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            mediaRelayInfo = mediaInfo.turnUDP;
        }
        if ((i & 2) != 0) {
            mediaRelayInfo2 = mediaInfo.turnTCP;
        }
        if ((i & 4) != 0) {
            mediaRelayInfo3 = mediaInfo.stun;
        }
        if ((i & 8) != 0) {
            srtpInfo = mediaInfo.srtp;
        }
        return mediaInfo.copy(mediaRelayInfo, mediaRelayInfo2, mediaRelayInfo3, srtpInfo);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final MediaRelayInfo getTurnUDP() {
        return this.turnUDP;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final MediaRelayInfo getTurnTCP() {
        return this.turnTCP;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final MediaRelayInfo getStun() {
        return this.stun;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final SrtpInfo getSrtp() {
        return this.srtp;
    }

    @NotNull
    public final MediaInfo copy(@Nullable MediaRelayInfo turnUDP, @Nullable MediaRelayInfo turnTCP, @Nullable MediaRelayInfo stun, @Nullable SrtpInfo srtp) {
        return new MediaInfo(turnUDP, turnTCP, stun, srtp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaInfo)) {
            return false;
        }
        MediaInfo mediaInfo = (MediaInfo) other;
        return Intrinsics.areEqual(this.turnUDP, mediaInfo.turnUDP) && Intrinsics.areEqual(this.turnTCP, mediaInfo.turnTCP) && Intrinsics.areEqual(this.stun, mediaInfo.stun) && Intrinsics.areEqual(this.srtp, mediaInfo.srtp);
    }

    @Nullable
    public final SrtpInfo getSrtp() {
        return this.srtp;
    }

    @Nullable
    public final MediaRelayInfo getStun() {
        return this.stun;
    }

    @Nullable
    public final MediaRelayInfo getTurnTCP() {
        return this.turnTCP;
    }

    @Nullable
    public final MediaRelayInfo getTurnUDP() {
        return this.turnUDP;
    }

    public int hashCode() {
        MediaRelayInfo mediaRelayInfo = this.turnUDP;
        int hashCode = (mediaRelayInfo == null ? 0 : mediaRelayInfo.hashCode()) * 31;
        MediaRelayInfo mediaRelayInfo2 = this.turnTCP;
        int hashCode2 = (hashCode + (mediaRelayInfo2 == null ? 0 : mediaRelayInfo2.hashCode())) * 31;
        MediaRelayInfo mediaRelayInfo3 = this.stun;
        int hashCode3 = (hashCode2 + (mediaRelayInfo3 == null ? 0 : mediaRelayInfo3.hashCode())) * 31;
        SrtpInfo srtpInfo = this.srtp;
        return hashCode3 + (srtpInfo != null ? srtpInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MediaInfo(turnUDP=" + this.turnUDP + ", turnTCP=" + this.turnTCP + ", stun=" + this.stun + ", srtp=" + this.srtp + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public MediaInfo(@Nullable MediaRelayInfo mediaRelayInfo, @Nullable MediaRelayInfo mediaRelayInfo2, @Nullable MediaRelayInfo mediaRelayInfo3, @Nullable SrtpInfo srtpInfo) {
        this.turnUDP = mediaRelayInfo;
        this.turnTCP = mediaRelayInfo2;
        this.stun = mediaRelayInfo3;
        this.srtp = srtpInfo;
    }

    public MediaInfo() {
        this(null, null, null, null, 15, null);
    }
}
