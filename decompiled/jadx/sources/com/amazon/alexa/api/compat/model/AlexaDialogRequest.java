package com.amazon.alexa.api.compat.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001a\u001bB)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaDialogRequest;", "", "invocationType", "", "launchType", "Lcom/amazon/alexa/api/compat/model/LaunchType;", "wakeWord", "Lcom/amazon/alexa/api/compat/model/AlexaWakeWord;", "<init>", "(Ljava/lang/String;Lcom/amazon/alexa/api/compat/model/LaunchType;Lcom/amazon/alexa/api/compat/model/AlexaWakeWord;)V", "getInvocationType", "()Ljava/lang/String;", "getLaunchType", "()Lcom/amazon/alexa/api/compat/model/LaunchType;", "getWakeWord", "()Lcom/amazon/alexa/api/compat/model/AlexaWakeWord;", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "Builder", "Companion", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class AlexaDialogRequest {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String invocationType;

    @NotNull
    private final LaunchType launchType;

    @Nullable
    private final AlexaWakeWord wakeWord;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0006\u0010\n\u001a\u00020\u000bR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaDialogRequest$Builder;", "", "<init>", "()V", "invocationType", "", "launchType", "Lcom/amazon/alexa/api/compat/model/LaunchType;", "wakeWord", "Lcom/amazon/alexa/api/compat/model/AlexaWakeWord;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/amazon/alexa/api/compat/model/AlexaDialogRequest;", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nAlexaDialogRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlexaDialogRequest.kt\ncom/amazon/alexa/api/compat/model/AlexaDialogRequest$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,31:1\n1#2:32\n*E\n"})
    public static final class Builder {
        public static final int $stable = 8;

        @Nullable
        private String invocationType;

        @NotNull
        private LaunchType launchType = LaunchType.UNKNOWN;

        @Nullable
        private AlexaWakeWord wakeWord;

        @NotNull
        public final AlexaDialogRequest build() {
            return new AlexaDialogRequest(this.invocationType, this.launchType, this.wakeWord);
        }

        @NotNull
        public final Builder invocationType(@Nullable String invocationType) {
            this.invocationType = invocationType;
            return this;
        }

        @NotNull
        public final Builder launchType(@NotNull LaunchType launchType) {
            launchType.getClass();
            this.launchType = launchType;
            return this;
        }

        @NotNull
        public final Builder wakeWord(@Nullable AlexaWakeWord wakeWord) {
            this.wakeWord = wakeWord;
            return this;
        }
    }

    public /* synthetic */ AlexaDialogRequest(String str, LaunchType launchType, AlexaWakeWord alexaWakeWord, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? LaunchType.UNKNOWN : launchType, (i & 4) != 0 ? null : alexaWakeWord);
    }

    @JvmStatic
    @NotNull
    public static final Builder builder() {
        return INSTANCE.builder();
    }

    public static /* synthetic */ AlexaDialogRequest copy$default(AlexaDialogRequest alexaDialogRequest, String str, LaunchType launchType, AlexaWakeWord alexaWakeWord, int i, Object obj) {
        if ((i & 1) != 0) {
            str = alexaDialogRequest.invocationType;
        }
        if ((i & 2) != 0) {
            launchType = alexaDialogRequest.launchType;
        }
        if ((i & 4) != 0) {
            alexaWakeWord = alexaDialogRequest.wakeWord;
        }
        return alexaDialogRequest.copy(str, launchType, alexaWakeWord);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getInvocationType() {
        return this.invocationType;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final LaunchType getLaunchType() {
        return this.launchType;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final AlexaWakeWord getWakeWord() {
        return this.wakeWord;
    }

    @NotNull
    public final AlexaDialogRequest copy(@Nullable String invocationType, @NotNull LaunchType launchType, @Nullable AlexaWakeWord wakeWord) {
        launchType.getClass();
        return new AlexaDialogRequest(invocationType, launchType, wakeWord);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlexaDialogRequest)) {
            return false;
        }
        AlexaDialogRequest alexaDialogRequest = (AlexaDialogRequest) other;
        return Intrinsics.areEqual(this.invocationType, alexaDialogRequest.invocationType) && this.launchType == alexaDialogRequest.launchType && Intrinsics.areEqual(this.wakeWord, alexaDialogRequest.wakeWord);
    }

    @Nullable
    public final String getInvocationType() {
        return this.invocationType;
    }

    @NotNull
    public final LaunchType getLaunchType() {
        return this.launchType;
    }

    @Nullable
    public final AlexaWakeWord getWakeWord() {
        return this.wakeWord;
    }

    public int hashCode() {
        String str = this.invocationType;
        int hashCode = (this.launchType.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        AlexaWakeWord alexaWakeWord = this.wakeWord;
        return hashCode + (alexaWakeWord != null ? alexaWakeWord.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AlexaDialogRequest(invocationType=" + this.invocationType + ", launchType=" + this.launchType + ", wakeWord=" + this.wakeWord + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaDialogRequest$Companion;", "", "<init>", "()V", "builder", "Lcom/amazon/alexa/api/compat/model/AlexaDialogRequest$Builder;", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

    public AlexaDialogRequest(@Nullable String str, @NotNull LaunchType launchType, @Nullable AlexaWakeWord alexaWakeWord) {
        launchType.getClass();
        this.invocationType = str;
        this.launchType = launchType;
        this.wakeWord = alexaWakeWord;
    }

    public AlexaDialogRequest() {
        this(null, null, null, 7, null);
    }
}
