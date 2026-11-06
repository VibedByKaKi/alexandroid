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
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/amazon/comms/calling/domain/model/UtteranceInfo;", "", "requestId", "", "endOfSpeechAbsoluteTimestampInMillis", "", "endOfSpeechRelativeTimestampInMillis", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "getRequestId", "()Ljava/lang/String;", "getEndOfSpeechAbsoluteTimestampInMillis", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getEndOfSpeechRelativeTimestampInMillis", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)Lcom/amazon/comms/calling/domain/model/UtteranceInfo;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class UtteranceInfo {

    @SerializedName("endOfSpeechAbsoluteTimestampInMillis")
    @Nullable
    private final Long endOfSpeechAbsoluteTimestampInMillis;

    @SerializedName("endOfSpeechRelativeTimestampInMillis")
    @Nullable
    private final Long endOfSpeechRelativeTimestampInMillis;

    @SerializedName("requestId")
    @Nullable
    private final String requestId;

    public /* synthetic */ UtteranceInfo(String str, Long l, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : l2);
    }

    public static /* synthetic */ UtteranceInfo copy$default(UtteranceInfo utteranceInfo, String str, Long l, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = utteranceInfo.requestId;
        }
        if ((i & 2) != 0) {
            l = utteranceInfo.endOfSpeechAbsoluteTimestampInMillis;
        }
        if ((i & 4) != 0) {
            l2 = utteranceInfo.endOfSpeechRelativeTimestampInMillis;
        }
        return utteranceInfo.copy(str, l, l2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Long getEndOfSpeechAbsoluteTimestampInMillis() {
        return this.endOfSpeechAbsoluteTimestampInMillis;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Long getEndOfSpeechRelativeTimestampInMillis() {
        return this.endOfSpeechRelativeTimestampInMillis;
    }

    @NotNull
    public final UtteranceInfo copy(@Nullable String requestId, @Nullable Long endOfSpeechAbsoluteTimestampInMillis, @Nullable Long endOfSpeechRelativeTimestampInMillis) {
        return new UtteranceInfo(requestId, endOfSpeechAbsoluteTimestampInMillis, endOfSpeechRelativeTimestampInMillis);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UtteranceInfo)) {
            return false;
        }
        UtteranceInfo utteranceInfo = (UtteranceInfo) other;
        return Intrinsics.areEqual(this.requestId, utteranceInfo.requestId) && Intrinsics.areEqual(this.endOfSpeechAbsoluteTimestampInMillis, utteranceInfo.endOfSpeechAbsoluteTimestampInMillis) && Intrinsics.areEqual(this.endOfSpeechRelativeTimestampInMillis, utteranceInfo.endOfSpeechRelativeTimestampInMillis);
    }

    @Nullable
    public final Long getEndOfSpeechAbsoluteTimestampInMillis() {
        return this.endOfSpeechAbsoluteTimestampInMillis;
    }

    @Nullable
    public final Long getEndOfSpeechRelativeTimestampInMillis() {
        return this.endOfSpeechRelativeTimestampInMillis;
    }

    @Nullable
    public final String getRequestId() {
        return this.requestId;
    }

    public int hashCode() {
        String str = this.requestId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.endOfSpeechAbsoluteTimestampInMillis;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.endOfSpeechRelativeTimestampInMillis;
        return hashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UtteranceInfo(requestId=" + this.requestId + ", endOfSpeechAbsoluteTimestampInMillis=" + this.endOfSpeechAbsoluteTimestampInMillis + ", endOfSpeechRelativeTimestampInMillis=" + this.endOfSpeechRelativeTimestampInMillis + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public UtteranceInfo(@Nullable String str, @Nullable Long l, @Nullable Long l2) {
        this.requestId = str;
        this.endOfSpeechAbsoluteTimestampInMillis = l;
        this.endOfSpeechRelativeTimestampInMillis = l2;
    }

    public UtteranceInfo() {
        this(null, null, null, 7, null);
    }
}
