package com.amazon.alexa.accessory.speechapi.naturalturndetection;

import com.amazon.alexa.mobile.assistant.client.auth.AuthorizationDelegateAdapter;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001aB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\bHÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0019\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/naturalturndetection/NaturalTurnDetectionSessionDeniedReason;", "", "reason", "Lcom/amazon/alexa/accessory/speechapi/naturalturndetection/NaturalTurnDetectionSessionDeniedReason$Reason;", "message", "", AuthorizationDelegateAdapter.FAILURE_EXCEPTION, "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Lcom/amazon/alexa/accessory/speechapi/naturalturndetection/NaturalTurnDetectionSessionDeniedReason$Reason;Ljava/lang/String;Ljava/lang/Exception;)V", "getException", "()Ljava/lang/Exception;", "getMessage", "()Ljava/lang/String;", "getReason", "()Lcom/amazon/alexa/accessory/speechapi/naturalturndetection/NaturalTurnDetectionSessionDeniedReason$Reason;", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "Reason", "AlexaAccessoryAndroid-speech-api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class NaturalTurnDetectionSessionDeniedReason {

    @Nullable
    private final Exception exception;

    @Nullable
    private final String message;

    @NotNull
    private final Reason reason;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/naturalturndetection/NaturalTurnDetectionSessionDeniedReason$Reason;", "", "(Ljava/lang/String;I)V", "AUDIO_FOCUS_UNAVAILABLE", "PROVIDER_NOT_REGISTERED", "ANOTHER_SESSION_ACTIVE", "UNKNOWN", "AlexaAccessoryAndroid-speech-api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Reason {
        AUDIO_FOCUS_UNAVAILABLE,
        PROVIDER_NOT_REGISTERED,
        ANOTHER_SESSION_ACTIVE,
        UNKNOWN
    }

    public /* synthetic */ NaturalTurnDetectionSessionDeniedReason(Reason reason, String str, Exception exc, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(reason, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : exc);
    }

    public static /* synthetic */ NaturalTurnDetectionSessionDeniedReason copy$default(NaturalTurnDetectionSessionDeniedReason naturalTurnDetectionSessionDeniedReason, Reason reason, String str, Exception exc, int i, Object obj) {
        if ((i & 1) != 0) {
            reason = naturalTurnDetectionSessionDeniedReason.reason;
        }
        if ((i & 2) != 0) {
            str = naturalTurnDetectionSessionDeniedReason.message;
        }
        if ((i & 4) != 0) {
            exc = naturalTurnDetectionSessionDeniedReason.exception;
        }
        return naturalTurnDetectionSessionDeniedReason.copy(reason, str, exc);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Reason getReason() {
        return this.reason;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Exception getException() {
        return this.exception;
    }

    @NotNull
    public final NaturalTurnDetectionSessionDeniedReason copy(@NotNull Reason reason, @Nullable String message, @Nullable Exception exception) {
        reason.getClass();
        return new NaturalTurnDetectionSessionDeniedReason(reason, message, exception);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NaturalTurnDetectionSessionDeniedReason)) {
            return false;
        }
        NaturalTurnDetectionSessionDeniedReason naturalTurnDetectionSessionDeniedReason = (NaturalTurnDetectionSessionDeniedReason) other;
        return this.reason == naturalTurnDetectionSessionDeniedReason.reason && Intrinsics.areEqual(this.message, naturalTurnDetectionSessionDeniedReason.message) && Intrinsics.areEqual(this.exception, naturalTurnDetectionSessionDeniedReason.exception);
    }

    @Nullable
    public final Exception getException() {
        return this.exception;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final Reason getReason() {
        return this.reason;
    }

    public int hashCode() {
        int hashCode = this.reason.hashCode() * 31;
        String str = this.message;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Exception exc = this.exception;
        return hashCode2 + (exc != null ? exc.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "NaturalTurnDetectionSessionDeniedReason(reason=" + this.reason + ", message=" + this.message + ", exception=" + this.exception + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public NaturalTurnDetectionSessionDeniedReason(@NotNull Reason reason, @Nullable String str, @Nullable Exception exc) {
        reason.getClass();
        this.reason = reason;
        this.message = str;
        this.exception = exc;
    }
}
