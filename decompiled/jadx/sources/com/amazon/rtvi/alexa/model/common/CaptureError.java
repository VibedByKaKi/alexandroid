package com.amazon.rtvi.alexa.model.common;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.rtvi.alexa.model.enums.CaptureState;
import com.amazon.rtvi.alexa.model.enums.ErrorReasonType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0013J:\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/amazon/rtvi/alexa/model/common/CaptureError;", "", "sourceState", "Lcom/amazon/rtvi/alexa/model/enums/CaptureState;", "type", "Lcom/amazon/rtvi/alexa/model/enums/ErrorReasonType;", "message", "", "unrecoverable", "", "<init>", "(Lcom/amazon/rtvi/alexa/model/enums/CaptureState;Lcom/amazon/rtvi/alexa/model/enums/ErrorReasonType;Ljava/lang/String;Ljava/lang/Boolean;)V", "getSourceState", "()Lcom/amazon/rtvi/alexa/model/enums/CaptureState;", "getType", "()Lcom/amazon/rtvi/alexa/model/enums/ErrorReasonType;", "getMessage", "()Ljava/lang/String;", "getUnrecoverable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "copy", "(Lcom/amazon/rtvi/alexa/model/enums/CaptureState;Lcom/amazon/rtvi/alexa/model/enums/ErrorReasonType;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/amazon/rtvi/alexa/model/common/CaptureError;", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "RTVIAlexaModel"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CaptureError {

    @Nullable
    private final String message;

    @NotNull
    private final CaptureState sourceState;

    @NotNull
    private final ErrorReasonType type;

    @Nullable
    private final Boolean unrecoverable;

    public CaptureError(@JsonProperty("sourceState") @NotNull CaptureState captureState, @JsonProperty("type") @NotNull ErrorReasonType errorReasonType, @JsonProperty("message") @Nullable String str, @JsonProperty("unrecoverable") @Nullable Boolean bool) {
        captureState.getClass();
        errorReasonType.getClass();
        this.sourceState = captureState;
        this.type = errorReasonType;
        this.message = str;
        this.unrecoverable = bool;
    }

    public static /* synthetic */ CaptureError copy$default(CaptureError captureError, CaptureState captureState, ErrorReasonType errorReasonType, String str, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            captureState = captureError.sourceState;
        }
        if ((i & 2) != 0) {
            errorReasonType = captureError.type;
        }
        if ((i & 4) != 0) {
            str = captureError.message;
        }
        if ((i & 8) != 0) {
            bool = captureError.unrecoverable;
        }
        return captureError.copy(captureState, errorReasonType, str, bool);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CaptureState getSourceState() {
        return this.sourceState;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ErrorReasonType getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Boolean getUnrecoverable() {
        return this.unrecoverable;
    }

    @NotNull
    public final CaptureError copy(@JsonProperty("sourceState") @NotNull CaptureState sourceState, @JsonProperty("type") @NotNull ErrorReasonType type, @JsonProperty("message") @Nullable String message, @JsonProperty("unrecoverable") @Nullable Boolean unrecoverable) {
        sourceState.getClass();
        type.getClass();
        return new CaptureError(sourceState, type, message, unrecoverable);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CaptureError)) {
            return false;
        }
        CaptureError captureError = (CaptureError) other;
        return this.sourceState == captureError.sourceState && this.type == captureError.type && Intrinsics.areEqual(this.message, captureError.message) && Intrinsics.areEqual(this.unrecoverable, captureError.unrecoverable);
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final CaptureState getSourceState() {
        return this.sourceState;
    }

    @NotNull
    public final ErrorReasonType getType() {
        return this.type;
    }

    @Nullable
    public final Boolean getUnrecoverable() {
        return this.unrecoverable;
    }

    public int hashCode() {
        int hashCode = (this.type.hashCode() + (this.sourceState.hashCode() * 31)) * 31;
        String str = this.message;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.unrecoverable;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CaptureError(sourceState=" + this.sourceState + ", type=" + this.type + ", message=" + this.message + ", unrecoverable=" + this.unrecoverable + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public /* synthetic */ CaptureError(CaptureState captureState, ErrorReasonType errorReasonType, String str, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(captureState, errorReasonType, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : bool);
    }
}
