package com.amazon.alexa.accessory.speechapi.speech;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.WakeWordBundleKeys;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/speech/AccessoryWakeWord;", "", "wakeWord", "", WakeWordBundleKeys.START_INDEX_IN_SAMPLES, "", WakeWordBundleKeys.END_INDEX_IN_SAMPLES, "(Ljava/lang/String;II)V", "getEndIndexInSamples", "()I", "getStartIndexInSamples", "getWakeWord", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "AlexaAccessoryAndroid-speech-api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class AccessoryWakeWord {
    private final int endIndexInSamples;
    private final int startIndexInSamples;

    @NotNull
    private final String wakeWord;

    public AccessoryWakeWord(@NotNull String str, int i, int i2) {
        str.getClass();
        this.wakeWord = str;
        this.startIndexInSamples = i;
        this.endIndexInSamples = i2;
    }

    public static /* synthetic */ AccessoryWakeWord copy$default(AccessoryWakeWord accessoryWakeWord, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = accessoryWakeWord.wakeWord;
        }
        if ((i3 & 2) != 0) {
            i = accessoryWakeWord.startIndexInSamples;
        }
        if ((i3 & 4) != 0) {
            i2 = accessoryWakeWord.endIndexInSamples;
        }
        return accessoryWakeWord.copy(str, i, i2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getWakeWord() {
        return this.wakeWord;
    }

    /* renamed from: component2, reason: from getter */
    public final int getStartIndexInSamples() {
        return this.startIndexInSamples;
    }

    /* renamed from: component3, reason: from getter */
    public final int getEndIndexInSamples() {
        return this.endIndexInSamples;
    }

    @NotNull
    public final AccessoryWakeWord copy(@NotNull String wakeWord, int startIndexInSamples, int endIndexInSamples) {
        wakeWord.getClass();
        return new AccessoryWakeWord(wakeWord, startIndexInSamples, endIndexInSamples);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccessoryWakeWord)) {
            return false;
        }
        AccessoryWakeWord accessoryWakeWord = (AccessoryWakeWord) other;
        return Intrinsics.areEqual(this.wakeWord, accessoryWakeWord.wakeWord) && this.startIndexInSamples == accessoryWakeWord.startIndexInSamples && this.endIndexInSamples == accessoryWakeWord.endIndexInSamples;
    }

    public final int getEndIndexInSamples() {
        return this.endIndexInSamples;
    }

    public final int getStartIndexInSamples() {
        return this.startIndexInSamples;
    }

    @NotNull
    public final String getWakeWord() {
        return this.wakeWord;
    }

    public int hashCode() {
        return Integer.hashCode(this.endIndexInSamples) + ArcMode$$ExternalSyntheticOutline0.m(this.startIndexInSamples, this.wakeWord.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.wakeWord;
        int i = this.startIndexInSamples;
        return a$$ExternalSyntheticOutline0.m(DoubleList$$ExternalSyntheticOutline0.m(i, "AccessoryWakeWord(wakeWord=", str, ", startIndexInSamples=", ", endIndexInSamples="), this.endIndexInSamples, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
