package com.amazon.alexa.api.compat.model;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.AplCommandBundleKeys;
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
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J?\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaAplCommand;", "", "name", "", "payload", "requestId", AplCommandBundleKeys.SPEECH_SUPPRESSED, "", "presentationUri", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getName", "()Ljava/lang/String;", "getPayload", "getRequestId", "()Z", "getPresentationUri", "component1", "component2", "component3", "component4", "component5", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class AlexaAplCommand {
    public static final int $stable = 0;
    private final boolean isSpeechSuppressed;

    @NotNull
    private final String name;

    @NotNull
    private final String payload;

    @Nullable
    private final String presentationUri;

    @Nullable
    private final String requestId;

    public AlexaAplCommand(@NotNull String str, @NotNull String str2, @Nullable String str3, boolean z, @Nullable String str4) {
        str.getClass();
        str2.getClass();
        this.name = str;
        this.payload = str2;
        this.requestId = str3;
        this.isSpeechSuppressed = z;
        this.presentationUri = str4;
    }

    public static /* synthetic */ AlexaAplCommand copy$default(AlexaAplCommand alexaAplCommand, String str, String str2, String str3, boolean z, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = alexaAplCommand.name;
        }
        if ((i & 2) != 0) {
            str2 = alexaAplCommand.payload;
        }
        if ((i & 4) != 0) {
            str3 = alexaAplCommand.requestId;
        }
        if ((i & 8) != 0) {
            z = alexaAplCommand.isSpeechSuppressed;
        }
        if ((i & 16) != 0) {
            str4 = alexaAplCommand.presentationUri;
        }
        String str5 = str4;
        String str6 = str3;
        return alexaAplCommand.copy(str, str2, str6, z, str5);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getPayload() {
        return this.payload;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsSpeechSuppressed() {
        return this.isSpeechSuppressed;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getPresentationUri() {
        return this.presentationUri;
    }

    @NotNull
    public final AlexaAplCommand copy(@NotNull String name, @NotNull String payload, @Nullable String requestId, boolean isSpeechSuppressed, @Nullable String presentationUri) {
        name.getClass();
        payload.getClass();
        return new AlexaAplCommand(name, payload, requestId, isSpeechSuppressed, presentationUri);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlexaAplCommand)) {
            return false;
        }
        AlexaAplCommand alexaAplCommand = (AlexaAplCommand) other;
        return Intrinsics.areEqual(this.name, alexaAplCommand.name) && Intrinsics.areEqual(this.payload, alexaAplCommand.payload) && Intrinsics.areEqual(this.requestId, alexaAplCommand.requestId) && this.isSpeechSuppressed == alexaAplCommand.isSpeechSuppressed && Intrinsics.areEqual(this.presentationUri, alexaAplCommand.presentationUri);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getPayload() {
        return this.payload;
    }

    @Nullable
    public final String getPresentationUri() {
        return this.presentationUri;
    }

    @Nullable
    public final String getRequestId() {
        return this.requestId;
    }

    public int hashCode() {
        int m = ArcMode$$ExternalSyntheticOutline0.m(this.name.hashCode() * 31, 31, this.payload);
        String str = this.requestId;
        int m2 = DoubleList$$ExternalSyntheticOutline0.m(this.isSpeechSuppressed, (m + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.presentationUri;
        return m2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isSpeechSuppressed() {
        return this.isSpeechSuppressed;
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.payload;
        String str3 = this.requestId;
        boolean z = this.isSpeechSuppressed;
        String str4 = this.presentationUri;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("AlexaAplCommand(name=", str, ", payload=", str2, ", requestId=");
        Automotive$$ExternalSyntheticOutline0.m(m, str3, ", isSpeechSuppressed=", z, ", presentationUri=");
        return a$$ExternalSyntheticOutline0.m(m, str4, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public /* synthetic */ AlexaAplCommand(String str, String str2, String str3, boolean z, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : str4);
    }
}
