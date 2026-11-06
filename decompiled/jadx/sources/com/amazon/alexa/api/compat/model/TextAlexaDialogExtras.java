package com.amazon.alexa.api.compat.model;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
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
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002)*BS\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0003JW\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010$\u001a\u00020\u00032\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006+"}, d2 = {"Lcom/amazon/alexa/api/compat/model/TextAlexaDialogExtras;", "", "suppressSpeechResponse", "", "invocationType", "", "dialogStartTimestampMillis", "", "universalPrivacyCode", "interactionLabel", "responseType", "Lcom/amazon/alexa/api/compat/model/ResponseType;", "inputType", "Lcom/amazon/alexa/api/compat/model/TextInputType;", "<init>", "(ZLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Lcom/amazon/alexa/api/compat/model/ResponseType;Lcom/amazon/alexa/api/compat/model/TextInputType;)V", "getSuppressSpeechResponse", "()Z", "getInvocationType", "()Ljava/lang/String;", "getDialogStartTimestampMillis", "()J", "getUniversalPrivacyCode", "getInteractionLabel", "getResponseType", "()Lcom/amazon/alexa/api/compat/model/ResponseType;", "getInputType", "()Lcom/amazon/alexa/api/compat/model/TextInputType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "Builder", "Companion", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class TextAlexaDialogExtras {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final long dialogStartTimestampMillis;

    @Nullable
    private final TextInputType inputType;

    @Nullable
    private final String interactionLabel;

    @NotNull
    private final String invocationType;

    @Nullable
    private final ResponseType responseType;
    private final boolean suppressSpeechResponse;

    @Nullable
    private final String universalPrivacyCode;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u0015\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/api/compat/model/TextAlexaDialogExtras$Builder;", "", "<init>", "()V", "suppressSpeechResponse", "", "invocationType", "", "dialogStartTimestampMillis", "", "universalPrivacyCode", "interactionLabel", "responseType", "Lcom/amazon/alexa/api/compat/model/ResponseType;", "inputType", "Lcom/amazon/alexa/api/compat/model/TextInputType;", "setInvocationType", "setDialogStartTimestampMillis", "setUniversalPrivacyCode", "setInteractionLabel", "setResponseType", "setInputType", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/amazon/alexa/api/compat/model/TextAlexaDialogExtras;", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nTextAlexaDialogExtras.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextAlexaDialogExtras.kt\ncom/amazon/alexa/api/compat/model/TextAlexaDialogExtras$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,60:1\n1#2:61\n*E\n"})
    public static final class Builder {
        public static final int $stable = 8;
        private long dialogStartTimestampMillis;

        @Nullable
        private TextInputType inputType;

        @Nullable
        private String interactionLabel;

        @Nullable
        private String invocationType;

        @Nullable
        private ResponseType responseType;
        private boolean suppressSpeechResponse;

        @Nullable
        private String universalPrivacyCode;

        @NotNull
        public final TextAlexaDialogExtras build() {
            String str = this.invocationType;
            if (str == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("invocationType must be set");
                return null;
            }
            if (str.length() > 0) {
                return new TextAlexaDialogExtras(this.suppressSpeechResponse, str, this.dialogStartTimestampMillis, this.universalPrivacyCode, this.interactionLabel, this.responseType, this.inputType);
            }
            Single$$ExternalSyntheticBUOutline0.m$3("invocationType cannot be empty");
            return null;
        }

        @NotNull
        public final Builder setDialogStartTimestampMillis(long dialogStartTimestampMillis) {
            this.dialogStartTimestampMillis = dialogStartTimestampMillis;
            return this;
        }

        @NotNull
        public final Builder setInputType(@Nullable TextInputType inputType) {
            this.inputType = inputType;
            return this;
        }

        @NotNull
        public final Builder setInteractionLabel(@Nullable String interactionLabel) {
            this.interactionLabel = interactionLabel;
            return this;
        }

        @NotNull
        public final Builder setInvocationType(@NotNull String invocationType) {
            invocationType.getClass();
            this.invocationType = invocationType;
            return this;
        }

        @NotNull
        public final Builder setResponseType(@Nullable ResponseType responseType) {
            this.responseType = responseType;
            return this;
        }

        @NotNull
        public final Builder setUniversalPrivacyCode(@Nullable String universalPrivacyCode) {
            this.universalPrivacyCode = universalPrivacyCode;
            return this;
        }

        @NotNull
        public final Builder suppressSpeechResponse(boolean suppressSpeechResponse) {
            this.suppressSpeechResponse = suppressSpeechResponse;
            return this;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ TextAlexaDialogExtras(boolean r2, java.lang.String r3, long r4, java.lang.String r6, java.lang.String r7, com.amazon.alexa.api.compat.model.ResponseType r8, com.amazon.alexa.api.compat.model.TextInputType r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r1 = this;
            r11 = r10 & 1
            if (r11 == 0) goto L5
            r2 = 0
        L5:
            r11 = r10 & 4
            if (r11 == 0) goto Lb
            r4 = 0
        Lb:
            r11 = r10 & 8
            r0 = 0
            if (r11 == 0) goto L11
            r6 = r0
        L11:
            r11 = r10 & 16
            if (r11 == 0) goto L16
            r7 = r0
        L16:
            r11 = r10 & 32
            if (r11 == 0) goto L1b
            r8 = r0
        L1b:
            r10 = r10 & 64
            if (r10 == 0) goto L28
            r11 = r0
            r9 = r7
            r10 = r8
            r8 = r6
        L23:
            r6 = r4
            r4 = r2
            r5 = r3
            r3 = r1
            goto L2d
        L28:
            r11 = r9
            r10 = r8
            r8 = r6
            r9 = r7
            goto L23
        L2d:
            r3.<init>(r4, r5, r6, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.api.compat.model.TextAlexaDialogExtras.<init>(boolean, java.lang.String, long, java.lang.String, java.lang.String, com.amazon.alexa.api.compat.model.ResponseType, com.amazon.alexa.api.compat.model.TextInputType, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @JvmStatic
    @NotNull
    public static final Builder builder() {
        return INSTANCE.builder();
    }

    public static /* synthetic */ TextAlexaDialogExtras copy$default(TextAlexaDialogExtras textAlexaDialogExtras, boolean z, String str, long j, String str2, String str3, ResponseType responseType, TextInputType textInputType, int i, Object obj) {
        if ((i & 1) != 0) {
            z = textAlexaDialogExtras.suppressSpeechResponse;
        }
        if ((i & 2) != 0) {
            str = textAlexaDialogExtras.invocationType;
        }
        if ((i & 4) != 0) {
            j = textAlexaDialogExtras.dialogStartTimestampMillis;
        }
        if ((i & 8) != 0) {
            str2 = textAlexaDialogExtras.universalPrivacyCode;
        }
        if ((i & 16) != 0) {
            str3 = textAlexaDialogExtras.interactionLabel;
        }
        if ((i & 32) != 0) {
            responseType = textAlexaDialogExtras.responseType;
        }
        if ((i & 64) != 0) {
            textInputType = textAlexaDialogExtras.inputType;
        }
        long j2 = j;
        return textAlexaDialogExtras.copy(z, str, j2, str2, str3, responseType, textInputType);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSuppressSpeechResponse() {
        return this.suppressSpeechResponse;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getInvocationType() {
        return this.invocationType;
    }

    /* renamed from: component3, reason: from getter */
    public final long getDialogStartTimestampMillis() {
        return this.dialogStartTimestampMillis;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getUniversalPrivacyCode() {
        return this.universalPrivacyCode;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getInteractionLabel() {
        return this.interactionLabel;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final ResponseType getResponseType() {
        return this.responseType;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final TextInputType getInputType() {
        return this.inputType;
    }

    @NotNull
    public final TextAlexaDialogExtras copy(boolean suppressSpeechResponse, @NotNull String invocationType, long dialogStartTimestampMillis, @Nullable String universalPrivacyCode, @Nullable String interactionLabel, @Nullable ResponseType responseType, @Nullable TextInputType inputType) {
        invocationType.getClass();
        return new TextAlexaDialogExtras(suppressSpeechResponse, invocationType, dialogStartTimestampMillis, universalPrivacyCode, interactionLabel, responseType, inputType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextAlexaDialogExtras)) {
            return false;
        }
        TextAlexaDialogExtras textAlexaDialogExtras = (TextAlexaDialogExtras) other;
        return this.suppressSpeechResponse == textAlexaDialogExtras.suppressSpeechResponse && Intrinsics.areEqual(this.invocationType, textAlexaDialogExtras.invocationType) && this.dialogStartTimestampMillis == textAlexaDialogExtras.dialogStartTimestampMillis && Intrinsics.areEqual(this.universalPrivacyCode, textAlexaDialogExtras.universalPrivacyCode) && Intrinsics.areEqual(this.interactionLabel, textAlexaDialogExtras.interactionLabel) && this.responseType == textAlexaDialogExtras.responseType && this.inputType == textAlexaDialogExtras.inputType;
    }

    public final long getDialogStartTimestampMillis() {
        return this.dialogStartTimestampMillis;
    }

    @Nullable
    public final TextInputType getInputType() {
        return this.inputType;
    }

    @Nullable
    public final String getInteractionLabel() {
        return this.interactionLabel;
    }

    @NotNull
    public final String getInvocationType() {
        return this.invocationType;
    }

    @Nullable
    public final ResponseType getResponseType() {
        return this.responseType;
    }

    public final boolean getSuppressSpeechResponse() {
        return this.suppressSpeechResponse;
    }

    @Nullable
    public final String getUniversalPrivacyCode() {
        return this.universalPrivacyCode;
    }

    public int hashCode() {
        int m = BitVector$$ExternalSyntheticOutline0.m(this.dialogStartTimestampMillis, ArcMode$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.suppressSpeechResponse) * 31, 31, this.invocationType), 31);
        String str = this.universalPrivacyCode;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.interactionLabel;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ResponseType responseType = this.responseType;
        int hashCode3 = (hashCode2 + (responseType == null ? 0 : responseType.hashCode())) * 31;
        TextInputType textInputType = this.inputType;
        return hashCode3 + (textInputType != null ? textInputType.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        boolean z = this.suppressSpeechResponse;
        String str = this.invocationType;
        long j = this.dialogStartTimestampMillis;
        String str2 = this.universalPrivacyCode;
        String str3 = this.interactionLabel;
        ResponseType responseType = this.responseType;
        TextInputType textInputType = this.inputType;
        StringBuilder sb = new StringBuilder("TextAlexaDialogExtras(suppressSpeechResponse=");
        sb.append(z);
        sb.append(", invocationType=");
        sb.append(str);
        sb.append(", dialogStartTimestampMillis=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(j, ", universalPrivacyCode=", str2, sb);
        sb.append(", interactionLabel=");
        sb.append(str3);
        sb.append(", responseType=");
        sb.append(responseType);
        sb.append(", inputType=");
        sb.append(textInputType);
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/api/compat/model/TextAlexaDialogExtras$Companion;", "", "<init>", "()V", "builder", "Lcom/amazon/alexa/api/compat/model/TextAlexaDialogExtras$Builder;", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

    public TextAlexaDialogExtras(boolean z, @NotNull String str, long j, @Nullable String str2, @Nullable String str3, @Nullable ResponseType responseType, @Nullable TextInputType textInputType) {
        str.getClass();
        this.suppressSpeechResponse = z;
        this.invocationType = str;
        this.dialogStartTimestampMillis = j;
        this.universalPrivacyCode = str2;
        this.interactionLabel = str3;
        this.responseType = responseType;
        this.inputType = textInputType;
    }
}
