package com.amazon.alexa.api.compat.model;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.WakeWordBundleKeys;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaWakeWord;", "", "name", "", WakeWordBundleKeys.START_INDEX_IN_SAMPLES, "", WakeWordBundleKeys.END_INDEX_IN_SAMPLES, WakeWordBundleKeys.WAKE_WORD_DETECTED_ELAPSED_REAL_TIME_MILLIS, "<init>", "(Ljava/lang/String;JJJ)V", "getName", "()Ljava/lang/String;", "getStartIndexInSamples", "()J", "getEndIndexInSamples", "getWakeWordDetectedElapsedRealTimeMillis", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class AlexaWakeWord {
    public static final int $stable = 0;
    private final long endIndexInSamples;

    @NotNull
    private final String name;
    private final long startIndexInSamples;
    private final long wakeWordDetectedElapsedRealTimeMillis;

    public /* synthetic */ AlexaWakeWord(String str, long j, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, j2, (i & 8) != 0 ? 0L : j3);
    }

    public static /* synthetic */ AlexaWakeWord copy$default(AlexaWakeWord alexaWakeWord, String str, long j, long j2, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = alexaWakeWord.name;
        }
        if ((i & 2) != 0) {
            j = alexaWakeWord.startIndexInSamples;
        }
        if ((i & 4) != 0) {
            j2 = alexaWakeWord.endIndexInSamples;
        }
        if ((i & 8) != 0) {
            j3 = alexaWakeWord.wakeWordDetectedElapsedRealTimeMillis;
        }
        long j4 = j3;
        return alexaWakeWord.copy(str, j, j2, j4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final long getStartIndexInSamples() {
        return this.startIndexInSamples;
    }

    /* renamed from: component3, reason: from getter */
    public final long getEndIndexInSamples() {
        return this.endIndexInSamples;
    }

    /* renamed from: component4, reason: from getter */
    public final long getWakeWordDetectedElapsedRealTimeMillis() {
        return this.wakeWordDetectedElapsedRealTimeMillis;
    }

    @NotNull
    public final AlexaWakeWord copy(@NotNull String name, long startIndexInSamples, long endIndexInSamples, long wakeWordDetectedElapsedRealTimeMillis) {
        name.getClass();
        return new AlexaWakeWord(name, startIndexInSamples, endIndexInSamples, wakeWordDetectedElapsedRealTimeMillis);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlexaWakeWord)) {
            return false;
        }
        AlexaWakeWord alexaWakeWord = (AlexaWakeWord) other;
        return Intrinsics.areEqual(this.name, alexaWakeWord.name) && this.startIndexInSamples == alexaWakeWord.startIndexInSamples && this.endIndexInSamples == alexaWakeWord.endIndexInSamples && this.wakeWordDetectedElapsedRealTimeMillis == alexaWakeWord.wakeWordDetectedElapsedRealTimeMillis;
    }

    public final long getEndIndexInSamples() {
        return this.endIndexInSamples;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final long getStartIndexInSamples() {
        return this.startIndexInSamples;
    }

    public final long getWakeWordDetectedElapsedRealTimeMillis() {
        return this.wakeWordDetectedElapsedRealTimeMillis;
    }

    public int hashCode() {
        return Long.hashCode(this.wakeWordDetectedElapsedRealTimeMillis) + BitVector$$ExternalSyntheticOutline0.m(this.endIndexInSamples, BitVector$$ExternalSyntheticOutline0.m(this.startIndexInSamples, this.name.hashCode() * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.name;
        long j = this.startIndexInSamples;
        long j2 = this.endIndexInSamples;
        long j3 = this.wakeWordDetectedElapsedRealTimeMillis;
        StringBuilder m = Automotive$$ExternalSyntheticOutline0.m("AlexaWakeWord(name=", str, ", startIndexInSamples=", j);
        ArcMode$$ExternalSyntheticOutline0.m(j2, ", endIndexInSamples=", ", wakeWordDetectedElapsedRealTimeMillis=", m);
        return a$$ExternalSyntheticOutline0.m(j3, MarkdownConstants.RIGHT_PARENTHESIS, m);
    }

    public AlexaWakeWord(@NotNull String str, long j, long j2, long j3) {
        str.getClass();
        this.name = str;
        this.startIndexInSamples = j;
        this.endIndexInSamples = j2;
        this.wakeWordDetectedElapsedRealTimeMillis = j3;
    }
}
