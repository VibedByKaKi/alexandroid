package com.mapbox.common.geofencing;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.io.Serializable;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0014B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\u0005H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/mapbox/common/geofencing/GeofencingError;", "Ljava/io/Serializable;", "type", "Lcom/mapbox/common/geofencing/GeofencingErrorType;", "message", "", "(Lcom/mapbox/common/geofencing/GeofencingErrorType;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getType", "()Lcom/mapbox/common/geofencing/GeofencingErrorType;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toBuilder", "Lcom/mapbox/common/geofencing/GeofencingError$Builder;", "toString", "Builder", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class GeofencingError implements Serializable {

    @NotNull
    private final String message;

    @NotNull
    private final GeofencingErrorType type;

    private GeofencingError(GeofencingErrorType geofencingErrorType, String str) {
        this.type = geofencingErrorType;
        this.message = str;
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof GeofencingError)) {
            return false;
        }
        GeofencingError geofencingError = (GeofencingError) other;
        return this.type == geofencingError.type && Intrinsics.areEqual(this.message, geofencingError.message);
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final GeofencingErrorType getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(this.type, this.message);
    }

    @NotNull
    public final Builder toBuilder() {
        return new Builder(this.type, this.message).setType(this.type).setMessage(this.message);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("GeofencingError(type=");
        sb.append(this.type);
        sb.append(", message=");
        return ArcMode$$ExternalSyntheticOutline0.m(')', this.message, sb);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003R$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/mapbox/common/geofencing/GeofencingError$Builder;", "", "type", "Lcom/mapbox/common/geofencing/GeofencingErrorType;", "message", "", "(Lcom/mapbox/common/geofencing/GeofencingErrorType;Ljava/lang/String;)V", "<set-?>", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getType", "()Lcom/mapbox/common/geofencing/GeofencingErrorType;", "setType", "(Lcom/mapbox/common/geofencing/GeofencingErrorType;)V", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/mapbox/common/geofencing/GeofencingError;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder {

        @NotNull
        private String message;

        @NotNull
        private GeofencingErrorType type;

        public Builder(@NotNull GeofencingErrorType geofencingErrorType, @NotNull String str) {
            geofencingErrorType.getClass();
            str.getClass();
            this.type = geofencingErrorType;
            this.message = str;
        }

        @NotNull
        public final GeofencingError build() {
            GeofencingErrorType geofencingErrorType = this.type;
            if (geofencingErrorType == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("Could not build an instance of GeofencingError through GeofencingError.Builder because type was null.");
                return null;
            }
            if (this.message == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("Could not build an instance of GeofencingError through GeofencingError.Builder because message was null.");
                return null;
            }
            geofencingErrorType.getClass();
            String str = this.message;
            str.getClass();
            return new GeofencingError(geofencingErrorType, str, null);
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final GeofencingErrorType getType() {
            return this.type;
        }

        /* renamed from: setMessage, reason: collision with other method in class */
        public final /* synthetic */ void m24695setMessage(String str) {
            str.getClass();
            this.message = str;
        }

        /* renamed from: setType, reason: collision with other method in class */
        public final /* synthetic */ void m24696setType(GeofencingErrorType geofencingErrorType) {
            geofencingErrorType.getClass();
            this.type = geofencingErrorType;
        }

        @NotNull
        public final Builder setMessage(@NotNull String message) {
            message.getClass();
            this.message = message;
            return this;
        }

        @NotNull
        public final Builder setType(@NotNull GeofencingErrorType type) {
            type.getClass();
            this.type = type;
            return this;
        }
    }

    public /* synthetic */ GeofencingError(GeofencingErrorType geofencingErrorType, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(geofencingErrorType, str);
    }
}
