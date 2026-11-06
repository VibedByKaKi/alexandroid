package com.amazon.alexa.accessory.speechapi.naturalturndetection;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/naturalturndetection/NaturalTurnDetectionSessionError;", "", "type", "Lcom/amazon/alexa/accessory/speechapi/naturalturndetection/NaturalTurnDetectionSessionError$Type;", "message", "", "(Lcom/amazon/alexa/accessory/speechapi/naturalturndetection/NaturalTurnDetectionSessionError$Type;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getType", "()Lcom/amazon/alexa/accessory/speechapi/naturalturndetection/NaturalTurnDetectionSessionError$Type;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "Type", "AlexaAccessoryAndroid-speech-api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class NaturalTurnDetectionSessionError {

    @Nullable
    private final String message;

    @NotNull
    private final Type type;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/naturalturndetection/NaturalTurnDetectionSessionError$Type;", "", "(Ljava/lang/String;I)V", "INSUFFICIENT_RESOURCES", "INVALID_STATE", "UNKNOWN", "AlexaAccessoryAndroid-speech-api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Type {
        INSUFFICIENT_RESOURCES,
        INVALID_STATE,
        UNKNOWN
    }

    public NaturalTurnDetectionSessionError(@NotNull Type type, @Nullable String str) {
        type.getClass();
        this.type = type;
        this.message = str;
    }

    public static /* synthetic */ NaturalTurnDetectionSessionError copy$default(NaturalTurnDetectionSessionError naturalTurnDetectionSessionError, Type type, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            type = naturalTurnDetectionSessionError.type;
        }
        if ((i & 2) != 0) {
            str = naturalTurnDetectionSessionError.message;
        }
        return naturalTurnDetectionSessionError.copy(type, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final NaturalTurnDetectionSessionError copy(@NotNull Type type, @Nullable String message) {
        type.getClass();
        return new NaturalTurnDetectionSessionError(type, message);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NaturalTurnDetectionSessionError)) {
            return false;
        }
        NaturalTurnDetectionSessionError naturalTurnDetectionSessionError = (NaturalTurnDetectionSessionError) other;
        return this.type == naturalTurnDetectionSessionError.type && Intrinsics.areEqual(this.message, naturalTurnDetectionSessionError.message);
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final Type getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.message;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "NaturalTurnDetectionSessionError(type=" + this.type + ", message=" + this.message + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public /* synthetic */ NaturalTurnDetectionSessionError(Type type, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(type, (i & 2) != 0 ? null : str);
    }
}
