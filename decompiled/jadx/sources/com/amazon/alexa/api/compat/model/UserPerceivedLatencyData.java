package com.amazon.alexa.api.compat.model;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.UserPerceivedLatencyBundleKeys;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00132\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015¨\u0006#"}, d2 = {"Lcom/amazon/alexa/api/compat/model/UserPerceivedLatencyData;", "", "dialogRequestId", "", UserPerceivedLatencyBundleKeys.ESTIMATED_USER_PERCEIVED_LATENCY, "", UserPerceivedLatencyBundleKeys.END_OF_SPEECH_OFFSET, "userPerceivedLatency", UserPerceivedLatencyBundleKeys.ALEXA_SPEECH_STARTED, "<init>", "(Ljava/lang/String;JJJJ)V", "getDialogRequestId", "()Ljava/lang/String;", "getEstimatedUserPerceivedLatency", "()J", "getEndOfSpeechOffset", "getUserPerceivedLatency", "getAlexaSpeechStarted", "hasEndOfSpeechOffset", "", "getHasEndOfSpeechOffset", "()Z", "hasUserPerceivedLatency", "getHasUserPerceivedLatency", "component1", "component2", "component3", "component4", "component5", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class UserPerceivedLatencyData {
    public static final int $stable = 0;
    private final long alexaSpeechStarted;

    @NotNull
    private final String dialogRequestId;
    private final long endOfSpeechOffset;
    private final long estimatedUserPerceivedLatency;
    private final long userPerceivedLatency;

    public UserPerceivedLatencyData(@NotNull String str, long j, long j2, long j3, long j4) {
        str.getClass();
        this.dialogRequestId = str;
        this.estimatedUserPerceivedLatency = j;
        this.endOfSpeechOffset = j2;
        this.userPerceivedLatency = j3;
        this.alexaSpeechStarted = j4;
    }

    public static /* synthetic */ UserPerceivedLatencyData copy$default(UserPerceivedLatencyData userPerceivedLatencyData, String str, long j, long j2, long j3, long j4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userPerceivedLatencyData.dialogRequestId;
        }
        if ((i & 2) != 0) {
            j = userPerceivedLatencyData.estimatedUserPerceivedLatency;
        }
        if ((i & 4) != 0) {
            j2 = userPerceivedLatencyData.endOfSpeechOffset;
        }
        if ((i & 8) != 0) {
            j3 = userPerceivedLatencyData.userPerceivedLatency;
        }
        if ((i & 16) != 0) {
            j4 = userPerceivedLatencyData.alexaSpeechStarted;
        }
        long j5 = j4;
        long j6 = j3;
        return userPerceivedLatencyData.copy(str, j, j2, j6, j5);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getDialogRequestId() {
        return this.dialogRequestId;
    }

    /* renamed from: component2, reason: from getter */
    public final long getEstimatedUserPerceivedLatency() {
        return this.estimatedUserPerceivedLatency;
    }

    /* renamed from: component3, reason: from getter */
    public final long getEndOfSpeechOffset() {
        return this.endOfSpeechOffset;
    }

    /* renamed from: component4, reason: from getter */
    public final long getUserPerceivedLatency() {
        return this.userPerceivedLatency;
    }

    /* renamed from: component5, reason: from getter */
    public final long getAlexaSpeechStarted() {
        return this.alexaSpeechStarted;
    }

    @NotNull
    public final UserPerceivedLatencyData copy(@NotNull String dialogRequestId, long estimatedUserPerceivedLatency, long endOfSpeechOffset, long userPerceivedLatency, long alexaSpeechStarted) {
        dialogRequestId.getClass();
        return new UserPerceivedLatencyData(dialogRequestId, estimatedUserPerceivedLatency, endOfSpeechOffset, userPerceivedLatency, alexaSpeechStarted);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserPerceivedLatencyData)) {
            return false;
        }
        UserPerceivedLatencyData userPerceivedLatencyData = (UserPerceivedLatencyData) other;
        return Intrinsics.areEqual(this.dialogRequestId, userPerceivedLatencyData.dialogRequestId) && this.estimatedUserPerceivedLatency == userPerceivedLatencyData.estimatedUserPerceivedLatency && this.endOfSpeechOffset == userPerceivedLatencyData.endOfSpeechOffset && this.userPerceivedLatency == userPerceivedLatencyData.userPerceivedLatency && this.alexaSpeechStarted == userPerceivedLatencyData.alexaSpeechStarted;
    }

    public final long getAlexaSpeechStarted() {
        return this.alexaSpeechStarted;
    }

    @NotNull
    public final String getDialogRequestId() {
        return this.dialogRequestId;
    }

    public final long getEndOfSpeechOffset() {
        return this.endOfSpeechOffset;
    }

    public final long getEstimatedUserPerceivedLatency() {
        return this.estimatedUserPerceivedLatency;
    }

    public final boolean getHasEndOfSpeechOffset() {
        return this.endOfSpeechOffset >= 0;
    }

    public final boolean getHasUserPerceivedLatency() {
        return this.userPerceivedLatency >= 0;
    }

    public final long getUserPerceivedLatency() {
        return this.userPerceivedLatency;
    }

    public int hashCode() {
        return Long.hashCode(this.alexaSpeechStarted) + BitVector$$ExternalSyntheticOutline0.m(this.userPerceivedLatency, BitVector$$ExternalSyntheticOutline0.m(this.endOfSpeechOffset, BitVector$$ExternalSyntheticOutline0.m(this.estimatedUserPerceivedLatency, this.dialogRequestId.hashCode() * 31, 31), 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.dialogRequestId;
        long j = this.estimatedUserPerceivedLatency;
        long j2 = this.endOfSpeechOffset;
        long j3 = this.userPerceivedLatency;
        long j4 = this.alexaSpeechStarted;
        StringBuilder m = Automotive$$ExternalSyntheticOutline0.m("UserPerceivedLatencyData(dialogRequestId=", str, ", estimatedUserPerceivedLatency=", j);
        ArcMode$$ExternalSyntheticOutline0.m(j2, ", endOfSpeechOffset=", ", userPerceivedLatency=", m);
        m.append(j3);
        return a$$ExternalSyntheticOutline0.m(j4, ", alexaSpeechStarted=", MarkdownConstants.RIGHT_PARENTHESIS, m);
    }
}
