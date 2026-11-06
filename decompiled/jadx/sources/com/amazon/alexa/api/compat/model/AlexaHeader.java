package com.amazon.alexa.api.compat.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.AlexaEventBundleKeys;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Parcelize
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b%\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000256B\u007f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0087\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010(\u001a\u00020)J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020)HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001J\u0016\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020)R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u00067"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaHeader;", "Landroid/os/Parcelable;", "namespace", "", "name", "messageId", "correlationToken", "dialogRequestId", "payloadVersion", "presentationUri", "universalPrivacyCode", "eventCorrelationToken", AlexaEventBundleKeys.INSTANCE, "endpointId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getNamespace", "()Ljava/lang/String;", "getName", "getMessageId", "getCorrelationToken", "getDialogRequestId", "getPayloadVersion", "getPresentationUri", "getUniversalPrivacyCode", "getEventCorrelationToken", "getInstance", "getEndpointId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "describeContents", "", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Builder", "Companion", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAlexaHeader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlexaHeader.kt\ncom/amazon/alexa/api/compat/model/AlexaHeader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n1#2:101\n*E\n"})
/* loaded from: classes16.dex */
public final /* data */ class AlexaHeader implements Parcelable {
    public static final int $stable = 0;

    @Nullable
    private final String correlationToken;

    @Nullable
    private final String dialogRequestId;

    @Nullable
    private final String endpointId;

    @Nullable
    private final String eventCorrelationToken;

    @Nullable
    private final String instance;

    @NotNull
    private final String messageId;

    @NotNull
    private final String name;

    @NotNull
    private final String namespace;

    @Nullable
    private final String payloadVersion;

    @Nullable
    private final String presentationUri;

    @Nullable
    private final String universalPrivacyCode;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<AlexaHeader> CREATOR = new Creator();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0005J\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0015\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0017\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0018\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u001a\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u001b\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u001c\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\u001d\u001a\u00020\u001eR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaHeader$Builder;", "", "<init>", "()V", "namespace", "", "name", "messageId", "correlationToken", "dialogRequestId", "payloadVersion", "presentationUri", "universalPrivacyCode", "eventCorrelationToken", AlexaEventBundleKeys.INSTANCE, "endpointId", "setNamespace", "setName", "setMessageId", "setCorrelationToken", "setDialogRequestId", "setPayloadVersion", "setPresentationUri", "setUniversalPrivacyCode", "setUpc", "upc", "setEventCorrelationToken", "setInstance", "setEndpointId", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/amazon/alexa/api/compat/model/AlexaHeader;", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nAlexaHeader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlexaHeader.kt\ncom/amazon/alexa/api/compat/model/AlexaHeader$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n1#2:101\n*E\n"})
    public static final class Builder {
        public static final int $stable = 8;

        @Nullable
        private String correlationToken;

        @Nullable
        private String dialogRequestId;

        @Nullable
        private String endpointId;

        @Nullable
        private String eventCorrelationToken;

        @Nullable
        private String instance;

        @Nullable
        private String messageId;

        @Nullable
        private String name;

        @Nullable
        private String namespace;

        @Nullable
        private String payloadVersion;

        @Nullable
        private String presentationUri;

        @Nullable
        private String universalPrivacyCode;

        @NotNull
        public final AlexaHeader build() {
            String str = this.namespace;
            if (str == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("namespace must be set");
                return null;
            }
            String str2 = this.name;
            if (str2 == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("name must be set");
                return null;
            }
            String str3 = this.messageId;
            if (str3 == null) {
                str3 = TableInfo$$ExternalSyntheticOutline0.m();
            }
            return new AlexaHeader(str, str2, str3, this.correlationToken, this.dialogRequestId, this.payloadVersion, this.presentationUri, this.universalPrivacyCode, this.eventCorrelationToken, this.instance, this.endpointId);
        }

        @NotNull
        public final Builder setCorrelationToken(@Nullable String correlationToken) {
            this.correlationToken = correlationToken;
            return this;
        }

        @NotNull
        public final Builder setDialogRequestId(@Nullable String dialogRequestId) {
            this.dialogRequestId = dialogRequestId;
            return this;
        }

        @NotNull
        public final Builder setEndpointId(@Nullable String endpointId) {
            this.endpointId = endpointId;
            return this;
        }

        @NotNull
        public final Builder setEventCorrelationToken(@Nullable String eventCorrelationToken) {
            this.eventCorrelationToken = eventCorrelationToken;
            return this;
        }

        @NotNull
        public final Builder setInstance(@Nullable String instance) {
            this.instance = instance;
            return this;
        }

        @NotNull
        public final Builder setMessageId(@NotNull String messageId) {
            messageId.getClass();
            this.messageId = messageId;
            return this;
        }

        @NotNull
        public final Builder setName(@NotNull String name) {
            name.getClass();
            this.name = name;
            return this;
        }

        @NotNull
        public final Builder setNamespace(@NotNull String namespace) {
            namespace.getClass();
            this.namespace = namespace;
            return this;
        }

        @NotNull
        public final Builder setPayloadVersion(@Nullable String payloadVersion) {
            this.payloadVersion = payloadVersion;
            return this;
        }

        @NotNull
        public final Builder setPresentationUri(@Nullable String presentationUri) {
            this.presentationUri = presentationUri;
            return this;
        }

        @NotNull
        public final Builder setUniversalPrivacyCode(@Nullable String universalPrivacyCode) {
            this.universalPrivacyCode = universalPrivacyCode;
            return this;
        }

        @NotNull
        public final Builder setUpc(@Nullable String upc) {
            return setUniversalPrivacyCode(upc);
        }
    }

    public AlexaHeader(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11) {
        ParcelCompat$$ExternalSyntheticOutline0.m(str, str2, str3);
        this.namespace = str;
        this.name = str2;
        this.messageId = str3;
        this.correlationToken = str4;
        this.dialogRequestId = str5;
        this.payloadVersion = str6;
        this.presentationUri = str7;
        this.universalPrivacyCode = str8;
        this.eventCorrelationToken = str9;
        this.instance = str10;
        this.endpointId = str11;
        if (str.length() <= 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("namespace must not be empty");
            throw null;
        }
        if (str2.length() > 0) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("name must not be empty");
        throw null;
    }

    @JvmStatic
    @NotNull
    public static final Builder builder() {
        return INSTANCE.builder();
    }

    public static /* synthetic */ AlexaHeader copy$default(AlexaHeader alexaHeader, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, Object obj) {
        if ((i & 1) != 0) {
            str = alexaHeader.namespace;
        }
        if ((i & 2) != 0) {
            str2 = alexaHeader.name;
        }
        if ((i & 4) != 0) {
            str3 = alexaHeader.messageId;
        }
        if ((i & 8) != 0) {
            str4 = alexaHeader.correlationToken;
        }
        if ((i & 16) != 0) {
            str5 = alexaHeader.dialogRequestId;
        }
        if ((i & 32) != 0) {
            str6 = alexaHeader.payloadVersion;
        }
        if ((i & 64) != 0) {
            str7 = alexaHeader.presentationUri;
        }
        if ((i & 128) != 0) {
            str8 = alexaHeader.universalPrivacyCode;
        }
        if ((i & 256) != 0) {
            str9 = alexaHeader.eventCorrelationToken;
        }
        if ((i & 512) != 0) {
            str10 = alexaHeader.instance;
        }
        if ((i & 1024) != 0) {
            str11 = alexaHeader.endpointId;
        }
        String str12 = str10;
        String str13 = str11;
        String str14 = str8;
        String str15 = str9;
        String str16 = str6;
        String str17 = str7;
        String str18 = str5;
        String str19 = str3;
        return alexaHeader.copy(str, str2, str19, str4, str18, str16, str17, str14, str15, str12, str13);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getNamespace() {
        return this.namespace;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final String getInstance() {
        return this.instance;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final String getEndpointId() {
        return this.endpointId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getCorrelationToken() {
        return this.correlationToken;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getDialogRequestId() {
        return this.dialogRequestId;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getPayloadVersion() {
        return this.payloadVersion;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getPresentationUri() {
        return this.presentationUri;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getUniversalPrivacyCode() {
        return this.universalPrivacyCode;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final String getEventCorrelationToken() {
        return this.eventCorrelationToken;
    }

    @NotNull
    public final AlexaHeader copy(@NotNull String namespace, @NotNull String name, @NotNull String messageId, @Nullable String correlationToken, @Nullable String dialogRequestId, @Nullable String payloadVersion, @Nullable String presentationUri, @Nullable String universalPrivacyCode, @Nullable String eventCorrelationToken, @Nullable String instance, @Nullable String endpointId) {
        namespace.getClass();
        name.getClass();
        messageId.getClass();
        return new AlexaHeader(namespace, name, messageId, correlationToken, dialogRequestId, payloadVersion, presentationUri, universalPrivacyCode, eventCorrelationToken, instance, endpointId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlexaHeader)) {
            return false;
        }
        AlexaHeader alexaHeader = (AlexaHeader) other;
        return Intrinsics.areEqual(this.namespace, alexaHeader.namespace) && Intrinsics.areEqual(this.name, alexaHeader.name) && Intrinsics.areEqual(this.messageId, alexaHeader.messageId) && Intrinsics.areEqual(this.correlationToken, alexaHeader.correlationToken) && Intrinsics.areEqual(this.dialogRequestId, alexaHeader.dialogRequestId) && Intrinsics.areEqual(this.payloadVersion, alexaHeader.payloadVersion) && Intrinsics.areEqual(this.presentationUri, alexaHeader.presentationUri) && Intrinsics.areEqual(this.universalPrivacyCode, alexaHeader.universalPrivacyCode) && Intrinsics.areEqual(this.eventCorrelationToken, alexaHeader.eventCorrelationToken) && Intrinsics.areEqual(this.instance, alexaHeader.instance) && Intrinsics.areEqual(this.endpointId, alexaHeader.endpointId);
    }

    @Nullable
    public final String getCorrelationToken() {
        return this.correlationToken;
    }

    @Nullable
    public final String getDialogRequestId() {
        return this.dialogRequestId;
    }

    @Nullable
    public final String getEndpointId() {
        return this.endpointId;
    }

    @Nullable
    public final String getEventCorrelationToken() {
        return this.eventCorrelationToken;
    }

    @Nullable
    public final String getInstance() {
        return this.instance;
    }

    @NotNull
    public final String getMessageId() {
        return this.messageId;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getNamespace() {
        return this.namespace;
    }

    @Nullable
    public final String getPayloadVersion() {
        return this.payloadVersion;
    }

    @Nullable
    public final String getPresentationUri() {
        return this.presentationUri;
    }

    @Nullable
    public final String getUniversalPrivacyCode() {
        return this.universalPrivacyCode;
    }

    public int hashCode() {
        int m = ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m(this.namespace.hashCode() * 31, 31, this.name), 31, this.messageId);
        String str = this.correlationToken;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.dialogRequestId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.payloadVersion;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.presentationUri;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.universalPrivacyCode;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.eventCorrelationToken;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.instance;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.endpointId;
        return hashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.namespace;
        String str2 = this.name;
        String str3 = this.messageId;
        String str4 = this.correlationToken;
        String str5 = this.dialogRequestId;
        String str6 = this.payloadVersion;
        String str7 = this.presentationUri;
        String str8 = this.universalPrivacyCode;
        String str9 = this.eventCorrelationToken;
        String str10 = this.instance;
        String str11 = this.endpointId;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("AlexaHeader(namespace=", str, ", name=", str2, ", messageId=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str3, ", correlationToken=", str4, ", dialogRequestId=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str5, ", payloadVersion=", str6, ", presentationUri=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str7, ", universalPrivacyCode=", str8, ", eventCorrelationToken=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str9, ", instance=", str10, ", endpointId=");
        return a$$ExternalSyntheticOutline0.m(m, str11, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.namespace);
        dest.writeString(this.name);
        dest.writeString(this.messageId);
        dest.writeString(this.correlationToken);
        dest.writeString(this.dialogRequestId);
        dest.writeString(this.payloadVersion);
        dest.writeString(this.presentationUri);
        dest.writeString(this.universalPrivacyCode);
        dest.writeString(this.eventCorrelationToken);
        dest.writeString(this.instance);
        dest.writeString(this.endpointId);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaHeader$Companion;", "", "<init>", "()V", "builder", "Lcom/amazon/alexa/api/compat/model/AlexaHeader$Builder;", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AlexaHeader> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AlexaHeader createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new AlexaHeader(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AlexaHeader[] newArray(int i) {
            return new AlexaHeader[i];
        }
    }

    public /* synthetic */ AlexaHeader(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11);
    }
}
