package com.amazon.alexa.assistant.foundation.model;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.metis.api.ChatData$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\t\u0010+\u001a\u00020\u000bHÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010-\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010.\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010/\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u00100\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u00101\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0092\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u00103J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020:HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0015\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010 \u001a\u0004\b!\u0010\u001fR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\"\u0010\u001fR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010 \u001a\u0004\b#\u0010\u001fR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010 \u001a\u0004\b$\u0010\u001fR\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010 \u001a\u0004\b%\u0010\u001f¨\u0006;"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/model/GeolocationData;", "", "status", "Lcom/amazon/alexa/assistant/foundation/model/GeolocationServicesStatus;", "access", "Lcom/amazon/alexa/assistant/foundation/model/GeolocationServicesAccess;", "latitude", "", "longitude", "horizontalAccuracyInMeters", "timestampMs", "", "altitudeInMeters", "verticalAccuracyInMeters", "headingInDegrees", "headingAccuracyInDegrees", "speedInMetersPerSecond", "speedAccuracyInMetersPerSecond", "<init>", "(Lcom/amazon/alexa/assistant/foundation/model/GeolocationServicesStatus;Lcom/amazon/alexa/assistant/foundation/model/GeolocationServicesAccess;DDDJLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "getStatus", "()Lcom/amazon/alexa/assistant/foundation/model/GeolocationServicesStatus;", "getAccess", "()Lcom/amazon/alexa/assistant/foundation/model/GeolocationServicesAccess;", "getLatitude", "()D", "getLongitude", "getHorizontalAccuracyInMeters", "getTimestampMs", "()J", "getAltitudeInMeters", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getVerticalAccuracyInMeters", "getHeadingInDegrees", "getHeadingAccuracyInDegrees", "getSpeedInMetersPerSecond", "getSpeedAccuracyInMetersPerSecond", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Lcom/amazon/alexa/assistant/foundation/model/GeolocationServicesStatus;Lcom/amazon/alexa/assistant/foundation/model/GeolocationServicesAccess;DDDJLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/amazon/alexa/assistant/foundation/model/GeolocationData;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class GeolocationData {

    @NotNull
    private final GeolocationServicesAccess access;

    @Nullable
    private final Double altitudeInMeters;

    @Nullable
    private final Double headingAccuracyInDegrees;

    @Nullable
    private final Double headingInDegrees;
    private final double horizontalAccuracyInMeters;
    private final double latitude;
    private final double longitude;

    @Nullable
    private final Double speedAccuracyInMetersPerSecond;

    @Nullable
    private final Double speedInMetersPerSecond;

    @NotNull
    private final GeolocationServicesStatus status;
    private final long timestampMs;

    @Nullable
    private final Double verticalAccuracyInMeters;

    public /* synthetic */ GeolocationData(GeolocationServicesStatus geolocationServicesStatus, GeolocationServicesAccess geolocationServicesAccess, double d, double d2, double d3, long j, Double d4, Double d5, Double d6, Double d7, Double d8, Double d9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(geolocationServicesStatus, geolocationServicesAccess, d, d2, d3, j, (i & 64) != 0 ? null : d4, (i & 128) != 0 ? null : d5, (i & 256) != 0 ? null : d6, (i & 512) != 0 ? null : d7, (i & 1024) != 0 ? null : d8, (i & 2048) != 0 ? null : d9);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final GeolocationServicesStatus getStatus() {
        return this.status;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Double getHeadingAccuracyInDegrees() {
        return this.headingAccuracyInDegrees;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Double getSpeedInMetersPerSecond() {
        return this.speedInMetersPerSecond;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Double getSpeedAccuracyInMetersPerSecond() {
        return this.speedAccuracyInMetersPerSecond;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final GeolocationServicesAccess getAccess() {
        return this.access;
    }

    /* renamed from: component3, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* renamed from: component4, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    /* renamed from: component5, reason: from getter */
    public final double getHorizontalAccuracyInMeters() {
        return this.horizontalAccuracyInMeters;
    }

    /* renamed from: component6, reason: from getter */
    public final long getTimestampMs() {
        return this.timestampMs;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Double getAltitudeInMeters() {
        return this.altitudeInMeters;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Double getVerticalAccuracyInMeters() {
        return this.verticalAccuracyInMeters;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Double getHeadingInDegrees() {
        return this.headingInDegrees;
    }

    @NotNull
    public final GeolocationData copy(@NotNull GeolocationServicesStatus status, @NotNull GeolocationServicesAccess access, double latitude, double longitude, double horizontalAccuracyInMeters, long timestampMs, @Nullable Double altitudeInMeters, @Nullable Double verticalAccuracyInMeters, @Nullable Double headingInDegrees, @Nullable Double headingAccuracyInDegrees, @Nullable Double speedInMetersPerSecond, @Nullable Double speedAccuracyInMetersPerSecond) {
        status.getClass();
        access.getClass();
        return new GeolocationData(status, access, latitude, longitude, horizontalAccuracyInMeters, timestampMs, altitudeInMeters, verticalAccuracyInMeters, headingInDegrees, headingAccuracyInDegrees, speedInMetersPerSecond, speedAccuracyInMetersPerSecond);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GeolocationData)) {
            return false;
        }
        GeolocationData geolocationData = (GeolocationData) other;
        return this.status == geolocationData.status && this.access == geolocationData.access && Double.compare(this.latitude, geolocationData.latitude) == 0 && Double.compare(this.longitude, geolocationData.longitude) == 0 && Double.compare(this.horizontalAccuracyInMeters, geolocationData.horizontalAccuracyInMeters) == 0 && this.timestampMs == geolocationData.timestampMs && Intrinsics.areEqual((Object) this.altitudeInMeters, (Object) geolocationData.altitudeInMeters) && Intrinsics.areEqual((Object) this.verticalAccuracyInMeters, (Object) geolocationData.verticalAccuracyInMeters) && Intrinsics.areEqual((Object) this.headingInDegrees, (Object) geolocationData.headingInDegrees) && Intrinsics.areEqual((Object) this.headingAccuracyInDegrees, (Object) geolocationData.headingAccuracyInDegrees) && Intrinsics.areEqual((Object) this.speedInMetersPerSecond, (Object) geolocationData.speedInMetersPerSecond) && Intrinsics.areEqual((Object) this.speedAccuracyInMetersPerSecond, (Object) geolocationData.speedAccuracyInMetersPerSecond);
    }

    @NotNull
    public final GeolocationServicesAccess getAccess() {
        return this.access;
    }

    @Nullable
    public final Double getAltitudeInMeters() {
        return this.altitudeInMeters;
    }

    @Nullable
    public final Double getHeadingAccuracyInDegrees() {
        return this.headingAccuracyInDegrees;
    }

    @Nullable
    public final Double getHeadingInDegrees() {
        return this.headingInDegrees;
    }

    public final double getHorizontalAccuracyInMeters() {
        return this.horizontalAccuracyInMeters;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    @Nullable
    public final Double getSpeedAccuracyInMetersPerSecond() {
        return this.speedAccuracyInMetersPerSecond;
    }

    @Nullable
    public final Double getSpeedInMetersPerSecond() {
        return this.speedInMetersPerSecond;
    }

    @NotNull
    public final GeolocationServicesStatus getStatus() {
        return this.status;
    }

    public final long getTimestampMs() {
        return this.timestampMs;
    }

    @Nullable
    public final Double getVerticalAccuracyInMeters() {
        return this.verticalAccuracyInMeters;
    }

    public int hashCode() {
        int m = BitVector$$ExternalSyntheticOutline0.m(this.timestampMs, AppLaunchChecker$$ExternalSyntheticOutline0.m(this.horizontalAccuracyInMeters, AppLaunchChecker$$ExternalSyntheticOutline0.m(this.longitude, AppLaunchChecker$$ExternalSyntheticOutline0.m(this.latitude, (this.access.hashCode() + (this.status.hashCode() * 31)) * 31, 31), 31), 31), 31);
        Double d = this.altitudeInMeters;
        int hashCode = (m + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.verticalAccuracyInMeters;
        int hashCode2 = (hashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.headingInDegrees;
        int hashCode3 = (hashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.headingAccuracyInDegrees;
        int hashCode4 = (hashCode3 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.speedInMetersPerSecond;
        int hashCode5 = (hashCode4 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Double d6 = this.speedAccuracyInMetersPerSecond;
        return hashCode5 + (d6 != null ? d6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        GeolocationServicesStatus geolocationServicesStatus = this.status;
        GeolocationServicesAccess geolocationServicesAccess = this.access;
        double d = this.latitude;
        double d2 = this.longitude;
        double d3 = this.horizontalAccuracyInMeters;
        long j = this.timestampMs;
        Double d4 = this.altitudeInMeters;
        Double d5 = this.verticalAccuracyInMeters;
        Double d6 = this.headingInDegrees;
        Double d7 = this.headingAccuracyInDegrees;
        Double d8 = this.speedInMetersPerSecond;
        Double d9 = this.speedAccuracyInMetersPerSecond;
        StringBuilder sb = new StringBuilder("GeolocationData(status=");
        sb.append(geolocationServicesStatus);
        sb.append(", access=");
        sb.append(geolocationServicesAccess);
        sb.append(", latitude=");
        sb.append(d);
        ChatData$$ExternalSyntheticOutline0.m(sb, ", longitude=", d2, ", horizontalAccuracyInMeters=");
        sb.append(d3);
        ArcMode$$ExternalSyntheticOutline0.m(j, ", timestampMs=", ", altitudeInMeters=", sb);
        sb.append(d4);
        sb.append(", verticalAccuracyInMeters=");
        sb.append(d5);
        sb.append(", headingInDegrees=");
        sb.append(d6);
        sb.append(", headingAccuracyInDegrees=");
        sb.append(d7);
        sb.append(", speedInMetersPerSecond=");
        sb.append(d8);
        sb.append(", speedAccuracyInMetersPerSecond=");
        sb.append(d9);
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }

    public GeolocationData(@NotNull GeolocationServicesStatus geolocationServicesStatus, @NotNull GeolocationServicesAccess geolocationServicesAccess, double d, double d2, double d3, long j, @Nullable Double d4, @Nullable Double d5, @Nullable Double d6, @Nullable Double d7, @Nullable Double d8, @Nullable Double d9) {
        geolocationServicesStatus.getClass();
        geolocationServicesAccess.getClass();
        this.status = geolocationServicesStatus;
        this.access = geolocationServicesAccess;
        this.latitude = d;
        this.longitude = d2;
        this.horizontalAccuracyInMeters = d3;
        this.timestampMs = j;
        this.altitudeInMeters = d4;
        this.verticalAccuracyInMeters = d5;
        this.headingInDegrees = d6;
        this.headingAccuracyInDegrees = d7;
        this.speedInMetersPerSecond = d8;
        this.speedAccuracyInMetersPerSecond = d9;
    }
}
