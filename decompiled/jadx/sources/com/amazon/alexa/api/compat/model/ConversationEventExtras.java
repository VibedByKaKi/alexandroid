package com.amazon.alexa.api.compat.model;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.ConversationEventExtrasBundleKeys;
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
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002'(BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003JU\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010\"\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006)"}, d2 = {"Lcom/amazon/alexa/api/compat/model/ConversationEventExtras;", "", "invocationType", "", "presentationUri", ConversationEventExtrasBundleKeys.START_TIMESTAMP_IN_MILLIS, "", "suppressSpeechResponse", "", "universalPrivacyCode", "interactionLabel", "responseType", "Lcom/amazon/alexa/api/compat/model/ResponseType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;Ljava/lang/String;Lcom/amazon/alexa/api/compat/model/ResponseType;)V", "getInvocationType", "()Ljava/lang/String;", "getPresentationUri", "getStartTimestampInMillis", "()J", "getSuppressSpeechResponse", "()Z", "getUniversalPrivacyCode", "getInteractionLabel", "getResponseType", "()Lcom/amazon/alexa/api/compat/model/ResponseType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "Builder", "Companion", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ConversationEventExtras {
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
    private final ResponseType responseType;
    private final long startTimestampInMillis;
    private final boolean suppressSpeechResponse;

    @Nullable
    private final String universalPrivacyCode;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0005J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0005J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\nJ\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0005J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0005J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000eJ\u0006\u0010\u001b\u001a\u00020\u001cR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/amazon/alexa/api/compat/model/ConversationEventExtras$Builder;", "", "<init>", "()V", "invocationType", "", "presentationUri", ConversationEventExtrasBundleKeys.START_TIMESTAMP_IN_MILLIS, "", "suppressSpeechResponse", "", "universalPrivacyCode", "interactionLabel", "responseType", "Lcom/amazon/alexa/api/compat/model/ResponseType;", "setInvocationType", "type", "setPresentationUri", "uri", "setStartTimestampInMillis", "ts", "suppress", "setUniversalPrivacyCode", "code", "setInteractionLabel", "label", "setResponseType", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/amazon/alexa/api/compat/model/ConversationEventExtras;", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nConversationEventExtras.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationEventExtras.kt\ncom/amazon/alexa/api/compat/model/ConversationEventExtras$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
    public static final class Builder {
        public static final int $stable = 8;

        @Nullable
        private String interactionLabel;

        @Nullable
        private String invocationType;

        @Nullable
        private String presentationUri;

        @Nullable
        private ResponseType responseType;
        private long startTimestampInMillis;
        private boolean suppressSpeechResponse;

        @Nullable
        private String universalPrivacyCode;

        @NotNull
        public final ConversationEventExtras build() {
            String str = this.invocationType;
            if (str == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("invocationType must be set");
                return null;
            }
            String str2 = this.presentationUri;
            if (str2 != null) {
                return new ConversationEventExtras(str, str2, this.startTimestampInMillis, this.suppressSpeechResponse, this.universalPrivacyCode, this.interactionLabel, this.responseType);
            }
            Single$$ExternalSyntheticBUOutline0.m$3("presentationUri must be set");
            return null;
        }

        @NotNull
        public final Builder setInteractionLabel(@NotNull String label) {
            label.getClass();
            this.interactionLabel = label;
            return this;
        }

        @NotNull
        public final Builder setInvocationType(@NotNull String type) {
            type.getClass();
            this.invocationType = type;
            return this;
        }

        @NotNull
        public final Builder setPresentationUri(@NotNull String uri) {
            uri.getClass();
            this.presentationUri = uri;
            return this;
        }

        @NotNull
        public final Builder setResponseType(@NotNull ResponseType type) {
            type.getClass();
            this.responseType = type;
            return this;
        }

        @NotNull
        public final Builder setStartTimestampInMillis(long ts) {
            this.startTimestampInMillis = ts;
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

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ConversationEventExtras(java.lang.String r10, java.lang.String r11, long r12, boolean r14, java.lang.String r15, java.lang.String r16, com.amazon.alexa.api.compat.model.ResponseType r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r9 = this;
            r0 = r18 & 8
            if (r0 == 0) goto L5
            r14 = 0
        L5:
            r5 = r14
            r14 = r18 & 16
            r0 = 0
            if (r14 == 0) goto Ld
            r6 = r0
            goto Le
        Ld:
            r6 = r15
        Le:
            r14 = r18 & 32
            if (r14 == 0) goto L14
            r7 = r0
            goto L16
        L14:
            r7 = r16
        L16:
            r14 = r18 & 64
            if (r14 == 0) goto L20
            r8 = r0
            r1 = r10
            r2 = r11
            r3 = r12
            r0 = r9
            goto L26
        L20:
            r8 = r17
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
        L26:
            r0.<init>(r1, r2, r3, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.api.compat.model.ConversationEventExtras.<init>(java.lang.String, java.lang.String, long, boolean, java.lang.String, java.lang.String, com.amazon.alexa.api.compat.model.ResponseType, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @JvmStatic
    @NotNull
    public static final Builder builder() {
        return INSTANCE.builder();
    }

    public static /* synthetic */ ConversationEventExtras copy$default(ConversationEventExtras conversationEventExtras, String str, String str2, long j, boolean z, String str3, String str4, ResponseType responseType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = conversationEventExtras.invocationType;
        }
        if ((i & 2) != 0) {
            str2 = conversationEventExtras.presentationUri;
        }
        if ((i & 4) != 0) {
            j = conversationEventExtras.startTimestampInMillis;
        }
        if ((i & 8) != 0) {
            z = conversationEventExtras.suppressSpeechResponse;
        }
        if ((i & 16) != 0) {
            str3 = conversationEventExtras.universalPrivacyCode;
        }
        if ((i & 32) != 0) {
            str4 = conversationEventExtras.interactionLabel;
        }
        if ((i & 64) != 0) {
            responseType = conversationEventExtras.responseType;
        }
        long j2 = j;
        return conversationEventExtras.copy(str, str2, j2, z, str3, str4, responseType);
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

    /* renamed from: component3, reason: from getter */
    public final long getStartTimestampInMillis() {
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
    public final ResponseType getResponseType() {
        return this.responseType;
    }

    @NotNull
    public final ConversationEventExtras copy(@NotNull String invocationType, @NotNull String presentationUri, long startTimestampInMillis, boolean suppressSpeechResponse, @Nullable String universalPrivacyCode, @Nullable String interactionLabel, @Nullable ResponseType responseType) {
        invocationType.getClass();
        presentationUri.getClass();
        return new ConversationEventExtras(invocationType, presentationUri, startTimestampInMillis, suppressSpeechResponse, universalPrivacyCode, interactionLabel, responseType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConversationEventExtras)) {
            return false;
        }
        ConversationEventExtras conversationEventExtras = (ConversationEventExtras) other;
        return Intrinsics.areEqual(this.invocationType, conversationEventExtras.invocationType) && Intrinsics.areEqual(this.presentationUri, conversationEventExtras.presentationUri) && this.startTimestampInMillis == conversationEventExtras.startTimestampInMillis && this.suppressSpeechResponse == conversationEventExtras.suppressSpeechResponse && Intrinsics.areEqual(this.universalPrivacyCode, conversationEventExtras.universalPrivacyCode) && Intrinsics.areEqual(this.interactionLabel, conversationEventExtras.interactionLabel) && this.responseType == conversationEventExtras.responseType;
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
    public final ResponseType getResponseType() {
        return this.responseType;
    }

    public final long getStartTimestampInMillis() {
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
        int m = DoubleList$$ExternalSyntheticOutline0.m(this.suppressSpeechResponse, BitVector$$ExternalSyntheticOutline0.m(this.startTimestampInMillis, ArcMode$$ExternalSyntheticOutline0.m(this.invocationType.hashCode() * 31, 31, this.presentationUri), 31), 31);
        String str = this.universalPrivacyCode;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.interactionLabel;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ResponseType responseType = this.responseType;
        return hashCode2 + (responseType != null ? responseType.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.invocationType;
        String str2 = this.presentationUri;
        long j = this.startTimestampInMillis;
        boolean z = this.suppressSpeechResponse;
        String str3 = this.universalPrivacyCode;
        String str4 = this.interactionLabel;
        ResponseType responseType = this.responseType;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("ConversationEventExtras(invocationType=", str, ", presentationUri=", str2, ", startTimestampInMillis=");
        m.append(j);
        m.append(", suppressSpeechResponse=");
        m.append(z);
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, ", universalPrivacyCode=", str3, ", interactionLabel=", str4);
        m.append(", responseType=");
        m.append(responseType);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/api/compat/model/ConversationEventExtras$Companion;", "", "<init>", "()V", "builder", "Lcom/amazon/alexa/api/compat/model/ConversationEventExtras$Builder;", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

    public ConversationEventExtras(@NotNull String str, @NotNull String str2, long j, boolean z, @Nullable String str3, @Nullable String str4, @Nullable ResponseType responseType) {
        str.getClass();
        str2.getClass();
        this.invocationType = str;
        this.presentationUri = str2;
        this.startTimestampInMillis = j;
        this.suppressSpeechResponse = z;
        this.universalPrivacyCode = str3;
        this.interactionLabel = str4;
        this.responseType = responseType;
    }
}
