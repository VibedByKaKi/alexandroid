package com.mapbox.maps.extension.observable.model;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated(level = DeprecationLevel.WARNING, message = "This data class is deprecated, and will be removed in next major release.", replaceWith = @ReplaceWith(expression = "ResourceRequestError", imports = {}))
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/mapbox/maps/extension/observable/model/Error;", "", "reason", "Lcom/mapbox/maps/extension/observable/model/ResponseErrorReason;", "message", "", "(Lcom/mapbox/maps/extension/observable/model/ResponseErrorReason;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getReason", "()Lcom/mapbox/maps/extension/observable/model/ResponseErrorReason;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class Error {

    @SerializedName("message")
    @NotNull
    private final String message;

    @SerializedName("reason")
    @NotNull
    private final ResponseErrorReason reason;

    public Error(@NotNull ResponseErrorReason responseErrorReason, @NotNull String str) {
        responseErrorReason.getClass();
        str.getClass();
        this.reason = responseErrorReason;
        this.message = str;
    }

    public static /* synthetic */ Error copy$default(Error error, ResponseErrorReason responseErrorReason, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            responseErrorReason = error.reason;
        }
        if ((i & 2) != 0) {
            str = error.message;
        }
        return error.copy(responseErrorReason, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ResponseErrorReason getReason() {
        return this.reason;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final Error copy(@NotNull ResponseErrorReason reason, @NotNull String message) {
        reason.getClass();
        message.getClass();
        return new Error(reason, message);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Error)) {
            return false;
        }
        Error error = (Error) other;
        return this.reason == error.reason && Intrinsics.areEqual(this.message, error.message);
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final ResponseErrorReason getReason() {
        return this.reason;
    }

    public int hashCode() {
        return this.message.hashCode() + (this.reason.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Error(reason=");
        sb.append(this.reason);
        sb.append(", message=");
        return ArcMode$$ExternalSyntheticOutline0.m(')', this.message, sb);
    }
}
