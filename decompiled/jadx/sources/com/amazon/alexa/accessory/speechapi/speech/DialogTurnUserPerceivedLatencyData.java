package com.amazon.alexa.accessory.speechapi.speech;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
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
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/speech/DialogTurnUserPerceivedLatencyData;", "", "dialogRequestId", "", "estimatedUpl", "", UserPerceivedLatencyBundleKeys.END_OF_SPEECH_OFFSET, "actualUpl", UserPerceivedLatencyBundleKeys.ALEXA_SPEECH_STARTED, "(Ljava/lang/String;JJJJ)V", "getActualUpl", "()J", "getAlexaSpeechStarted", "getDialogRequestId", "()Ljava/lang/String;", "getEndOfSpeechOffset", "getEstimatedUpl", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaAccessoryAndroid-speech-api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class DialogTurnUserPerceivedLatencyData {
    private final long actualUpl;
    private final long alexaSpeechStarted;

    @NotNull
    private final String dialogRequestId;
    private final long endOfSpeechOffset;
    private final long estimatedUpl;

    public DialogTurnUserPerceivedLatencyData(@NotNull String str, long j, long j2, long j3, long j4) {
        str.getClass();
        this.dialogRequestId = str;
        this.estimatedUpl = j;
        this.endOfSpeechOffset = j2;
        this.actualUpl = j3;
        this.alexaSpeechStarted = j4;
    }

    public static /* synthetic */ DialogTurnUserPerceivedLatencyData copy$default(DialogTurnUserPerceivedLatencyData dialogTurnUserPerceivedLatencyData, String str, long j, long j2, long j3, long j4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dialogTurnUserPerceivedLatencyData.dialogRequestId;
        }
        if ((i & 2) != 0) {
            j = dialogTurnUserPerceivedLatencyData.estimatedUpl;
        }
        if ((i & 4) != 0) {
            j2 = dialogTurnUserPerceivedLatencyData.endOfSpeechOffset;
        }
        if ((i & 8) != 0) {
            j3 = dialogTurnUserPerceivedLatencyData.actualUpl;
        }
        if ((i & 16) != 0) {
            j4 = dialogTurnUserPerceivedLatencyData.alexaSpeechStarted;
        }
        long j5 = j4;
        long j6 = j3;
        return dialogTurnUserPerceivedLatencyData.copy(str, j, j2, j6, j5);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getDialogRequestId() {
        return this.dialogRequestId;
    }

    /* renamed from: component2, reason: from getter */
    public final long getEstimatedUpl() {
        return this.estimatedUpl;
    }

    /* renamed from: component3, reason: from getter */
    public final long getEndOfSpeechOffset() {
        return this.endOfSpeechOffset;
    }

    /* renamed from: component4, reason: from getter */
    public final long getActualUpl() {
        return this.actualUpl;
    }

    /* renamed from: component5, reason: from getter */
    public final long getAlexaSpeechStarted() {
        return this.alexaSpeechStarted;
    }

    @NotNull
    public final DialogTurnUserPerceivedLatencyData copy(@NotNull String dialogRequestId, long estimatedUpl, long endOfSpeechOffset, long actualUpl, long alexaSpeechStarted) {
        dialogRequestId.getClass();
        return new DialogTurnUserPerceivedLatencyData(dialogRequestId, estimatedUpl, endOfSpeechOffset, actualUpl, alexaSpeechStarted);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DialogTurnUserPerceivedLatencyData)) {
            return false;
        }
        DialogTurnUserPerceivedLatencyData dialogTurnUserPerceivedLatencyData = (DialogTurnUserPerceivedLatencyData) other;
        return Intrinsics.areEqual(this.dialogRequestId, dialogTurnUserPerceivedLatencyData.dialogRequestId) && this.estimatedUpl == dialogTurnUserPerceivedLatencyData.estimatedUpl && this.endOfSpeechOffset == dialogTurnUserPerceivedLatencyData.endOfSpeechOffset && this.actualUpl == dialogTurnUserPerceivedLatencyData.actualUpl && this.alexaSpeechStarted == dialogTurnUserPerceivedLatencyData.alexaSpeechStarted;
    }

    public final long getActualUpl() {
        return this.actualUpl;
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

    public final long getEstimatedUpl() {
        return this.estimatedUpl;
    }

    public int hashCode() {
        return Long.hashCode(this.alexaSpeechStarted) + BitVector$$ExternalSyntheticOutline0.m(this.actualUpl, BitVector$$ExternalSyntheticOutline0.m(this.endOfSpeechOffset, BitVector$$ExternalSyntheticOutline0.m(this.estimatedUpl, this.dialogRequestId.hashCode() * 31, 31), 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.dialogRequestId;
        long j = this.estimatedUpl;
        long j2 = this.endOfSpeechOffset;
        long j3 = this.actualUpl;
        long j4 = this.alexaSpeechStarted;
        StringBuilder m = Automotive$$ExternalSyntheticOutline0.m("DialogTurnUserPerceivedLatencyData(dialogRequestId=", str, ", estimatedUpl=", j);
        ArcMode$$ExternalSyntheticOutline0.m(j2, ", endOfSpeechOffset=", ", actualUpl=", m);
        m.append(j3);
        return a$$ExternalSyntheticOutline0.m(j4, ", alexaSpeechStarted=", MarkdownConstants.RIGHT_PARENTHESIS, m);
    }
}
