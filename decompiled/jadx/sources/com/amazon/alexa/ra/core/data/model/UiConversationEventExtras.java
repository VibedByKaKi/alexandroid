package com.amazon.alexa.ra.core.data.model;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.ConversationEventExtrasBundleKeys;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002)*BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0013J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003J\\\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006+"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/UiConversationEventExtras;", "", "invocationType", "", "presentationUri", ConversationEventExtrasBundleKeys.START_TIMESTAMP_IN_MILLIS, "", "suppressSpeechResponse", "", "universalPrivacyCode", "interactionLabel", "responseType", "Lcom/amazon/alexa/ra/core/data/model/CoreResponseType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;ZLjava/lang/String;Ljava/lang/String;Lcom/amazon/alexa/ra/core/data/model/CoreResponseType;)V", "getInvocationType", "()Ljava/lang/String;", "getPresentationUri", "getStartTimestampInMillis", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSuppressSpeechResponse", "()Z", "getUniversalPrivacyCode", "getInteractionLabel", "getResponseType", "()Lcom/amazon/alexa/ra/core/data/model/CoreResponseType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;ZLjava/lang/String;Ljava/lang/String;Lcom/amazon/alexa/ra/core/data/model/CoreResponseType;)Lcom/amazon/alexa/ra/core/data/model/UiConversationEventExtras;", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "Builder", "Companion", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class UiConversationEventExtras {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String interactionLabel;

    @NotNull
    private final String invocationType;

    @NotNull
    private final String presentationUri;

    @Nullable
    private final CoreResponseType responseType;

    @Nullable
    private final Long startTimestampInMillis;
    private final boolean suppressSpeechResponse;

    @Nullable
    private final String universalPrivacyCode;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u000bJ\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0005J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0005J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u001a\u001a\u00020\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/UiConversationEventExtras$Builder;", "", "<init>", "()V", "invocationType", "", "presentationUri", ConversationEventExtrasBundleKeys.START_TIMESTAMP_IN_MILLIS, "", "Ljava/lang/Long;", "suppressSpeechResponse", "", "universalPrivacyCode", "interactionLabel", "responseType", "Lcom/amazon/alexa/ra/core/data/model/CoreResponseType;", "setInvocationType", "setPresentationUri", "setStartTimestampInMillis", "timestamp", "suppress", "setUniversalPrivacyCode", "code", "setInteractionLabel", "label", "setResponseType", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/amazon/alexa/ra/core/data/model/UiConversationEventExtras;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;

        @Nullable
        private String interactionLabel;

        @Nullable
        private CoreResponseType responseType;

        @Nullable
        private Long startTimestampInMillis;

        @Nullable
        private String universalPrivacyCode;

        @NotNull
        private String invocationType = "";

        @NotNull
        private String presentationUri = "";
        private boolean suppressSpeechResponse = true;

        @NotNull
        public final UiConversationEventExtras build() {
            return new UiConversationEventExtras(this.invocationType, this.presentationUri, this.startTimestampInMillis, this.suppressSpeechResponse, this.universalPrivacyCode, this.interactionLabel, this.responseType);
        }

        @NotNull
        public final Builder setInteractionLabel(@NotNull String label) {
            label.getClass();
            this.interactionLabel = label;
            return this;
        }

        @NotNull
        public final Builder setInvocationType(@NotNull String invocationType) {
            invocationType.getClass();
            this.invocationType = invocationType;
            return this;
        }

        @NotNull
        public final Builder setPresentationUri(@NotNull String presentationUri) {
            presentationUri.getClass();
            this.presentationUri = presentationUri;
            return this;
        }

        @NotNull
        public final Builder setResponseType(@NotNull CoreResponseType responseType) {
            responseType.getClass();
            this.responseType = responseType;
            return this;
        }

        @NotNull
        public final Builder setStartTimestampInMillis(long timestamp) {
            this.startTimestampInMillis = Long.valueOf(timestamp);
            return this;
        }

        @NotNull
        public final Builder setUniversalPrivacyCode(@NotNull String code) {
            code.getClass();
            this.universalPrivacyCode = code;
            return this;
        }

        @NotNull
        public final Builder suppressSpeechResponse(boolean suppress) {
            this.suppressSpeechResponse = suppress;
            return this;
        }
    }

    public /* synthetic */ UiConversationEventExtras(String str, String str2, Long l, boolean z, String str3, String str4, CoreResponseType coreResponseType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? true : z, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : coreResponseType);
    }

    public static /* synthetic */ UiConversationEventExtras copy$default(UiConversationEventExtras uiConversationEventExtras, String str, String str2, Long l, boolean z, String str3, String str4, CoreResponseType coreResponseType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uiConversationEventExtras.invocationType;
        }
        if ((i & 2) != 0) {
            str2 = uiConversationEventExtras.presentationUri;
        }
        if ((i & 4) != 0) {
            l = uiConversationEventExtras.startTimestampInMillis;
        }
        if ((i & 8) != 0) {
            z = uiConversationEventExtras.suppressSpeechResponse;
        }
        if ((i & 16) != 0) {
            str3 = uiConversationEventExtras.universalPrivacyCode;
        }
        if ((i & 32) != 0) {
            str4 = uiConversationEventExtras.interactionLabel;
        }
        if ((i & 64) != 0) {
            coreResponseType = uiConversationEventExtras.responseType;
        }
        String str5 = str4;
        CoreResponseType coreResponseType2 = coreResponseType;
        String str6 = str3;
        Long l2 = l;
        return uiConversationEventExtras.copy(str, str2, l2, z, str6, str5, coreResponseType2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getInvocationType() {
        return this.invocationType;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getPresentationUri() {
        return this.presentationUri;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Long getStartTimestampInMillis() {
        return this.startTimestampInMillis;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getSuppressSpeechResponse() {
        return this.suppressSpeechResponse;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getUniversalPrivacyCode() {
        return this.universalPrivacyCode;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getInteractionLabel() {
        return this.interactionLabel;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final CoreResponseType getResponseType() {
        return this.responseType;
    }

    @NotNull
    public final UiConversationEventExtras copy(@NotNull String invocationType, @NotNull String presentationUri, @Nullable Long startTimestampInMillis, boolean suppressSpeechResponse, @Nullable String universalPrivacyCode, @Nullable String interactionLabel, @Nullable CoreResponseType responseType) {
        invocationType.getClass();
        presentationUri.getClass();
        return new UiConversationEventExtras(invocationType, presentationUri, startTimestampInMillis, suppressSpeechResponse, universalPrivacyCode, interactionLabel, responseType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UiConversationEventExtras)) {
            return false;
        }
        UiConversationEventExtras uiConversationEventExtras = (UiConversationEventExtras) other;
        return Intrinsics.areEqual(this.invocationType, uiConversationEventExtras.invocationType) && Intrinsics.areEqual(this.presentationUri, uiConversationEventExtras.presentationUri) && Intrinsics.areEqual(this.startTimestampInMillis, uiConversationEventExtras.startTimestampInMillis) && this.suppressSpeechResponse == uiConversationEventExtras.suppressSpeechResponse && Intrinsics.areEqual(this.universalPrivacyCode, uiConversationEventExtras.universalPrivacyCode) && Intrinsics.areEqual(this.interactionLabel, uiConversationEventExtras.interactionLabel) && this.responseType == uiConversationEventExtras.responseType;
    }

    @Nullable
    public final String getInteractionLabel() {
        return this.interactionLabel;
    }

    @NotNull
    public final String getInvocationType() {
        return this.invocationType;
    }

    @NotNull
    public final String getPresentationUri() {
        return this.presentationUri;
    }

    @Nullable
    public final CoreResponseType getResponseType() {
        return this.responseType;
    }

    @Nullable
    public final Long getStartTimestampInMillis() {
        return this.startTimestampInMillis;
    }

    public final boolean getSuppressSpeechResponse() {
        return this.suppressSpeechResponse;
    }

    @Nullable
    public final String getUniversalPrivacyCode() {
        return this.universalPrivacyCode;
    }

    public int hashCode() {
        int m = ArcMode$$ExternalSyntheticOutline0.m(this.invocationType.hashCode() * 31, 31, this.presentationUri);
        Long l = this.startTimestampInMillis;
        int m2 = DoubleList$$ExternalSyntheticOutline0.m(this.suppressSpeechResponse, (m + (l == null ? 0 : l.hashCode())) * 31, 31);
        String str = this.universalPrivacyCode;
        int hashCode = (m2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.interactionLabel;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        CoreResponseType coreResponseType = this.responseType;
        return hashCode2 + (coreResponseType != null ? coreResponseType.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.invocationType;
        String str2 = this.presentationUri;
        Long l = this.startTimestampInMillis;
        boolean z = this.suppressSpeechResponse;
        String str3 = this.universalPrivacyCode;
        String str4 = this.interactionLabel;
        CoreResponseType coreResponseType = this.responseType;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("UiConversationEventExtras(invocationType=", str, ", presentationUri=", str2, ", startTimestampInMillis=");
        m.append(l);
        m.append(", suppressSpeechResponse=");
        m.append(z);
        m.append(", universalPrivacyCode=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str3, ", interactionLabel=", str4, ", responseType=");
        m.append(coreResponseType);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/UiConversationEventExtras$Companion;", "", "<init>", "()V", "builder", "Lcom/amazon/alexa/ra/core/data/model/UiConversationEventExtras$Builder;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Builder builder() {
            return new Builder();
        }

        private Companion() {
        }
    }

    public UiConversationEventExtras(@NotNull String str, @NotNull String str2, @Nullable Long l, boolean z, @Nullable String str3, @Nullable String str4, @Nullable CoreResponseType coreResponseType) {
        str.getClass();
        str2.getClass();
        this.invocationType = str;
        this.presentationUri = str2;
        this.startTimestampInMillis = l;
        this.suppressSpeechResponse = z;
        this.universalPrivacyCode = str3;
        this.interactionLabel = str4;
        this.responseType = coreResponseType;
    }
}
