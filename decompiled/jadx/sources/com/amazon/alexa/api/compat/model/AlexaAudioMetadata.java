package com.amazon.alexa.api.compat.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.AudioMetadataBundleKeys;
import com.amazon.alexa.audiocapturer.RecordingRunnable;
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
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaAudioMetadata;", "", AudioMetadataBundleKeys.ALEXA_PROFILE, "Lcom/amazon/alexa/api/compat/model/AlexaProfile;", AudioMetadataBundleKeys.ALEXA_WAKE_WORD, "Lcom/amazon/alexa/api/compat/model/AlexaWakeWord;", AudioMetadataBundleKeys.AUDIO_FORMAT, "", "<init>", "(Lcom/amazon/alexa/api/compat/model/AlexaProfile;Lcom/amazon/alexa/api/compat/model/AlexaWakeWord;Ljava/lang/String;)V", "getAlexaProfile", "()Lcom/amazon/alexa/api/compat/model/AlexaProfile;", "getAlexaWakeWord", "()Lcom/amazon/alexa/api/compat/model/AlexaWakeWord;", "getAudioFormat", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class AlexaAudioMetadata {
    public static final int $stable = 0;

    @NotNull
    private final AlexaProfile alexaProfile;

    @Nullable
    private final AlexaWakeWord alexaWakeWord;

    @NotNull
    private final String audioFormat;

    public /* synthetic */ AlexaAudioMetadata(AlexaProfile alexaProfile, AlexaWakeWord alexaWakeWord, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AlexaProfile.NEAR_FIELD : alexaProfile, (i & 2) != 0 ? null : alexaWakeWord, (i & 4) != 0 ? RecordingRunnable.USER_SPEECH_AUDIO_FORMAT : str);
    }

    public static /* synthetic */ AlexaAudioMetadata copy$default(AlexaAudioMetadata alexaAudioMetadata, AlexaProfile alexaProfile, AlexaWakeWord alexaWakeWord, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            alexaProfile = alexaAudioMetadata.alexaProfile;
        }
        if ((i & 2) != 0) {
            alexaWakeWord = alexaAudioMetadata.alexaWakeWord;
        }
        if ((i & 4) != 0) {
            str = alexaAudioMetadata.audioFormat;
        }
        return alexaAudioMetadata.copy(alexaProfile, alexaWakeWord, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final AlexaProfile getAlexaProfile() {
        return this.alexaProfile;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final AlexaWakeWord getAlexaWakeWord() {
        return this.alexaWakeWord;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getAudioFormat() {
        return this.audioFormat;
    }

    @NotNull
    public final AlexaAudioMetadata copy(@NotNull AlexaProfile alexaProfile, @Nullable AlexaWakeWord alexaWakeWord, @NotNull String audioFormat) {
        alexaProfile.getClass();
        audioFormat.getClass();
        return new AlexaAudioMetadata(alexaProfile, alexaWakeWord, audioFormat);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlexaAudioMetadata)) {
            return false;
        }
        AlexaAudioMetadata alexaAudioMetadata = (AlexaAudioMetadata) other;
        return this.alexaProfile == alexaAudioMetadata.alexaProfile && Intrinsics.areEqual(this.alexaWakeWord, alexaAudioMetadata.alexaWakeWord) && Intrinsics.areEqual(this.audioFormat, alexaAudioMetadata.audioFormat);
    }

    @NotNull
    public final AlexaProfile getAlexaProfile() {
        return this.alexaProfile;
    }

    @Nullable
    public final AlexaWakeWord getAlexaWakeWord() {
        return this.alexaWakeWord;
    }

    @NotNull
    public final String getAudioFormat() {
        return this.audioFormat;
    }

    public int hashCode() {
        int hashCode = this.alexaProfile.hashCode() * 31;
        AlexaWakeWord alexaWakeWord = this.alexaWakeWord;
        return this.audioFormat.hashCode() + ((hashCode + (alexaWakeWord == null ? 0 : alexaWakeWord.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        AlexaProfile alexaProfile = this.alexaProfile;
        AlexaWakeWord alexaWakeWord = this.alexaWakeWord;
        String str = this.audioFormat;
        StringBuilder sb = new StringBuilder("AlexaAudioMetadata(alexaProfile=");
        sb.append(alexaProfile);
        sb.append(", alexaWakeWord=");
        sb.append(alexaWakeWord);
        sb.append(", audioFormat=");
        return a$$ExternalSyntheticOutline0.m(sb, str, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public AlexaAudioMetadata(@NotNull AlexaProfile alexaProfile, @Nullable AlexaWakeWord alexaWakeWord, @NotNull String str) {
        alexaProfile.getClass();
        str.getClass();
        this.alexaProfile = alexaProfile;
        this.alexaWakeWord = alexaWakeWord;
        this.audioFormat = str;
    }

    public AlexaAudioMetadata() {
        this(null, null, null, 7, null);
    }
}
