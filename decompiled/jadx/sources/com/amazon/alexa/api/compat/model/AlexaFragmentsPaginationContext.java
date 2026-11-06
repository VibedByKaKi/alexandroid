package com.amazon.alexa.api.compat.model;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.AlexaFragmentsPaginationContextBundleKeys;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0003\u0018\u0019\u001aB)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaFragmentsPaginationContext;", "", "before", "", "after", AlexaFragmentsPaginationContextBundleKeys.RETRIEVAL_MODE, "Lcom/amazon/alexa/api/compat/model/AlexaFragmentsPaginationContext$RetrievalMode;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/amazon/alexa/api/compat/model/AlexaFragmentsPaginationContext$RetrievalMode;)V", "getBefore", "()Ljava/lang/String;", "getAfter", "getRetrievalMode", "()Lcom/amazon/alexa/api/compat/model/AlexaFragmentsPaginationContext$RetrievalMode;", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "RetrievalMode", "Builder", "Companion", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class AlexaFragmentsPaginationContext {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String after;

    @Nullable
    private final String before;

    @NotNull
    private final RetrievalMode retrievalMode;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\bJ\u0006\u0010\r\u001a\u00020\u000eR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaFragmentsPaginationContext$Builder;", "", "<init>", "()V", "before", "", "after", AlexaFragmentsPaginationContextBundleKeys.RETRIEVAL_MODE, "Lcom/amazon/alexa/api/compat/model/AlexaFragmentsPaginationContext$RetrievalMode;", "setBefore", "setAfter", "setRetrievalMode", "mode", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/amazon/alexa/api/compat/model/AlexaFragmentsPaginationContext;", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nAlexaFragmentsPaginationContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlexaFragmentsPaginationContext.kt\ncom/amazon/alexa/api/compat/model/AlexaFragmentsPaginationContext$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n1#2:47\n*E\n"})
    public static final class Builder {
        public static final int $stable = 8;

        @Nullable
        private String after;

        @Nullable
        private String before;

        @NotNull
        private RetrievalMode retrievalMode = RetrievalMode.ANCHORED;

        @NotNull
        public final AlexaFragmentsPaginationContext build() {
            return new AlexaFragmentsPaginationContext(this.before, this.after, this.retrievalMode);
        }

        @NotNull
        public final Builder setAfter(@Nullable String after) {
            this.after = after;
            return this;
        }

        @NotNull
        public final Builder setBefore(@Nullable String before) {
            this.before = before;
            return this;
        }

        @NotNull
        public final Builder setRetrievalMode(@NotNull RetrievalMode mode) {
            mode.getClass();
            this.retrievalMode = mode;
            return this;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaFragmentsPaginationContext$RetrievalMode;", "", "<init>", "(Ljava/lang/String;I)V", "ANCHORED", "SURROUNDING", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RetrievalMode {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ RetrievalMode[] $VALUES;
        public static final RetrievalMode ANCHORED = new RetrievalMode("ANCHORED", 0);
        public static final RetrievalMode SURROUNDING = new RetrievalMode("SURROUNDING", 1);

        private static final /* synthetic */ RetrievalMode[] $values() {
            return new RetrievalMode[]{ANCHORED, SURROUNDING};
        }

        static {
            RetrievalMode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private RetrievalMode(String str, int i) {
        }

        @NotNull
        public static EnumEntries<RetrievalMode> getEntries() {
            return $ENTRIES;
        }

        public static RetrievalMode valueOf(String str) {
            return (RetrievalMode) Enum.valueOf(RetrievalMode.class, str);
        }

        public static RetrievalMode[] values() {
            return (RetrievalMode[]) $VALUES.clone();
        }
    }

    public /* synthetic */ AlexaFragmentsPaginationContext(String str, String str2, RetrievalMode retrievalMode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? RetrievalMode.ANCHORED : retrievalMode);
    }

    @JvmStatic
    @NotNull
    public static final Builder builder() {
        return INSTANCE.builder();
    }

    public static /* synthetic */ AlexaFragmentsPaginationContext copy$default(AlexaFragmentsPaginationContext alexaFragmentsPaginationContext, String str, String str2, RetrievalMode retrievalMode, int i, Object obj) {
        if ((i & 1) != 0) {
            str = alexaFragmentsPaginationContext.before;
        }
        if ((i & 2) != 0) {
            str2 = alexaFragmentsPaginationContext.after;
        }
        if ((i & 4) != 0) {
            retrievalMode = alexaFragmentsPaginationContext.retrievalMode;
        }
        return alexaFragmentsPaginationContext.copy(str, str2, retrievalMode);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getBefore() {
        return this.before;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getAfter() {
        return this.after;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final RetrievalMode getRetrievalMode() {
        return this.retrievalMode;
    }

    @NotNull
    public final AlexaFragmentsPaginationContext copy(@Nullable String before, @Nullable String after, @NotNull RetrievalMode retrievalMode) {
        retrievalMode.getClass();
        return new AlexaFragmentsPaginationContext(before, after, retrievalMode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlexaFragmentsPaginationContext)) {
            return false;
        }
        AlexaFragmentsPaginationContext alexaFragmentsPaginationContext = (AlexaFragmentsPaginationContext) other;
        return Intrinsics.areEqual(this.before, alexaFragmentsPaginationContext.before) && Intrinsics.areEqual(this.after, alexaFragmentsPaginationContext.after) && this.retrievalMode == alexaFragmentsPaginationContext.retrievalMode;
    }

    @Nullable
    public final String getAfter() {
        return this.after;
    }

    @Nullable
    public final String getBefore() {
        return this.before;
    }

    @NotNull
    public final RetrievalMode getRetrievalMode() {
        return this.retrievalMode;
    }

    public int hashCode() {
        String str = this.before;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.after;
        return this.retrievalMode.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.before;
        String str2 = this.after;
        RetrievalMode retrievalMode = this.retrievalMode;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("AlexaFragmentsPaginationContext(before=", str, ", after=", str2, ", retrievalMode=");
        m.append(retrievalMode);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaFragmentsPaginationContext$Companion;", "", "<init>", "()V", "builder", "Lcom/amazon/alexa/api/compat/model/AlexaFragmentsPaginationContext$Builder;", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

    public AlexaFragmentsPaginationContext(@Nullable String str, @Nullable String str2, @NotNull RetrievalMode retrievalMode) {
        retrievalMode.getClass();
        this.before = str;
        this.after = str2;
        this.retrievalMode = retrievalMode;
    }

    public AlexaFragmentsPaginationContext() {
        this(null, null, null, 7, null);
    }
}
