package com.amazon.alexa.api.compat.model;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.LivePreviewBundleKeys;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\"#B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J=\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012¨\u0006$"}, d2 = {"Lcom/amazon/alexa/api/compat/model/LivePreview;", "", "sequence", "Lcom/amazon/alexa/api/compat/model/TranscriptSequence;", "transcriptDirection", "Lcom/amazon/alexa/api/compat/model/TranscriptDirection;", LivePreviewBundleKeys.TRANSCRIPT, "", "locale", "Ljava/util/Locale;", "id", "<init>", "(Lcom/amazon/alexa/api/compat/model/TranscriptSequence;Lcom/amazon/alexa/api/compat/model/TranscriptDirection;Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;)V", "getSequence", "()Lcom/amazon/alexa/api/compat/model/TranscriptSequence;", "getTranscriptDirection", "()Lcom/amazon/alexa/api/compat/model/TranscriptDirection;", "getTranscript", "()Ljava/lang/String;", "getLocale", "()Ljava/util/Locale;", "getId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "Builder", "Companion", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class LivePreview {

    @NotNull
    private final String id;

    @NotNull
    private final Locale locale;

    @NotNull
    private final TranscriptSequence sequence;

    @NotNull
    private final String transcript;

    @Nullable
    private final TranscriptDirection transcriptDirection;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public LivePreview(@NotNull TranscriptSequence transcriptSequence, @Nullable TranscriptDirection transcriptDirection, @NotNull String str, @NotNull Locale locale, @NotNull String str2) {
        transcriptSequence.getClass();
        str.getClass();
        locale.getClass();
        str2.getClass();
        this.sequence = transcriptSequence;
        this.transcriptDirection = transcriptDirection;
        this.transcript = str;
        this.locale = locale;
        this.id = str2;
    }

    @JvmStatic
    @NotNull
    public static final Builder builder() {
        return INSTANCE.builder();
    }

    public static /* synthetic */ LivePreview copy$default(LivePreview livePreview, TranscriptSequence transcriptSequence, TranscriptDirection transcriptDirection, String str, Locale locale, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            transcriptSequence = livePreview.sequence;
        }
        if ((i & 2) != 0) {
            transcriptDirection = livePreview.transcriptDirection;
        }
        if ((i & 4) != 0) {
            str = livePreview.transcript;
        }
        if ((i & 8) != 0) {
            locale = livePreview.locale;
        }
        if ((i & 16) != 0) {
            str2 = livePreview.id;
        }
        String str3 = str2;
        String str4 = str;
        return livePreview.copy(transcriptSequence, transcriptDirection, str4, locale, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TranscriptSequence getSequence() {
        return this.sequence;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final TranscriptDirection getTranscriptDirection() {
        return this.transcriptDirection;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getTranscript() {
        return this.transcript;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final Locale getLocale() {
        return this.locale;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final LivePreview copy(@NotNull TranscriptSequence sequence, @Nullable TranscriptDirection transcriptDirection, @NotNull String transcript, @NotNull Locale locale, @NotNull String id) {
        sequence.getClass();
        transcript.getClass();
        locale.getClass();
        id.getClass();
        return new LivePreview(sequence, transcriptDirection, transcript, locale, id);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LivePreview)) {
            return false;
        }
        LivePreview livePreview = (LivePreview) other;
        return this.sequence == livePreview.sequence && this.transcriptDirection == livePreview.transcriptDirection && Intrinsics.areEqual(this.transcript, livePreview.transcript) && Intrinsics.areEqual(this.locale, livePreview.locale) && Intrinsics.areEqual(this.id, livePreview.id);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final Locale getLocale() {
        return this.locale;
    }

    @NotNull
    public final TranscriptSequence getSequence() {
        return this.sequence;
    }

    @NotNull
    public final String getTranscript() {
        return this.transcript;
    }

    @Nullable
    public final TranscriptDirection getTranscriptDirection() {
        return this.transcriptDirection;
    }

    public int hashCode() {
        int hashCode = this.sequence.hashCode() * 31;
        TranscriptDirection transcriptDirection = this.transcriptDirection;
        return this.id.hashCode() + ((this.locale.hashCode() + ArcMode$$ExternalSyntheticOutline0.m((hashCode + (transcriptDirection == null ? 0 : transcriptDirection.hashCode())) * 31, 31, this.transcript)) * 31);
    }

    @NotNull
    public String toString() {
        TranscriptSequence transcriptSequence = this.sequence;
        TranscriptDirection transcriptDirection = this.transcriptDirection;
        String str = this.transcript;
        Locale locale = this.locale;
        String str2 = this.id;
        StringBuilder sb = new StringBuilder("LivePreview(sequence=");
        sb.append(transcriptSequence);
        sb.append(", transcriptDirection=");
        sb.append(transcriptDirection);
        sb.append(", transcript=");
        sb.append(str);
        sb.append(", locale=");
        sb.append(locale);
        sb.append(", id=");
        return a$$ExternalSyntheticOutline0.m(sb, str2, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/api/compat/model/LivePreview$Companion;", "", "<init>", "()V", "builder", "Lcom/amazon/alexa/api/compat/model/LivePreview$Builder;", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Builder builder() {
            return new Builder();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u0010\u0010\u0006\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\tJ\u0006\u0010\r\u001a\u00020\u000eR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/api/compat/model/LivePreview$Builder;", "", "<init>", "()V", "sequence", "Lcom/amazon/alexa/api/compat/model/TranscriptSequence;", "transcriptDirection", "Lcom/amazon/alexa/api/compat/model/TranscriptDirection;", LivePreviewBundleKeys.TRANSCRIPT, "", "locale", "Ljava/util/Locale;", "id", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/amazon/alexa/api/compat/model/LivePreview;", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nLivePreview.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LivePreview.kt\ncom/amazon/alexa/api/compat/model/LivePreview$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,49:1\n1#2:50\n*E\n"})
    public static final class Builder {
        public static final int $stable = 8;

        @Nullable
        private String id;

        @Nullable
        private Locale locale;

        @Nullable
        private TranscriptSequence sequence;

        @Nullable
        private String transcript;

        @Nullable
        private TranscriptDirection transcriptDirection = TranscriptDirection.LEFT_TO_RIGHT;

        @NotNull
        public final LivePreview build() {
            TranscriptSequence transcriptSequence = this.sequence;
            if (transcriptSequence == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("sequence must be set");
                return null;
            }
            String str = this.transcript;
            if (str == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("transcript must be set");
                return null;
            }
            Locale locale = this.locale;
            if (locale == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("locale must be set");
                return null;
            }
            String str2 = this.id;
            if (str2 != null) {
                return new LivePreview(transcriptSequence, this.transcriptDirection, str, locale, str2);
            }
            Single$$ExternalSyntheticBUOutline0.m$3("id must be set");
            return null;
        }

        @NotNull
        public final Builder id(@NotNull String id) {
            id.getClass();
            this.id = id;
            return this;
        }

        @NotNull
        public final Builder locale(@NotNull String locale) {
            locale.getClass();
            this.locale = Locale.forLanguageTag(locale);
            return this;
        }

        @NotNull
        public final Builder sequence(@NotNull TranscriptSequence sequence) {
            sequence.getClass();
            this.sequence = sequence;
            return this;
        }

        @NotNull
        public final Builder transcript(@NotNull String transcript) {
            transcript.getClass();
            this.transcript = transcript;
            return this;
        }

        @NotNull
        public final Builder transcriptDirection(@Nullable TranscriptDirection transcriptDirection) {
            this.transcriptDirection = transcriptDirection;
            return this;
        }

        @NotNull
        public final Builder locale(@NotNull Locale locale) {
            locale.getClass();
            this.locale = locale;
            return this;
        }
    }

    public /* synthetic */ LivePreview(TranscriptSequence transcriptSequence, TranscriptDirection transcriptDirection, String str, Locale locale, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(transcriptSequence, (i & 2) != 0 ? TranscriptDirection.LEFT_TO_RIGHT : transcriptDirection, str, locale, str2);
    }
}
