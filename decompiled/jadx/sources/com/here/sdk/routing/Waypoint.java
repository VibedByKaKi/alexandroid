package com.here.sdk.routing;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import com.here.sdk.core.GeoCoordinates;
import com.here.time.Duration;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class Waypoint {

    @Nullable
    public ChargingStop chargingStop;

    @NonNull
    public GeoCoordinates coordinates;

    @Nullable
    public GeoCoordinates displayLocation;

    @NonNull
    public Duration duration;

    @Nullable
    public Double headingInDegrees;

    @Deprecated
    public boolean isChargingStation;

    @Nullable
    public MatchSideOfStreet matchSideOfStreet;

    @Nullable
    public Integer minCourseDistanceInMeters;

    @Nullable
    public String nameHint;

    @Nullable
    public Integer onRoadThresholdInMeters;

    @Nullable
    public SegmentReference segmentHint;

    @Nullable
    public GeoCoordinates sideOfStreetHint;
    public int transitRadiusInMeters;

    @NonNull
    public WaypointType type;

    public Waypoint(@NonNull GeoCoordinates geoCoordinates) {
        this.coordinates = geoCoordinates;
        this.type = WaypointType.STOPOVER;
        this.transitRadiusInMeters = 0;
        this.headingInDegrees = null;
        this.sideOfStreetHint = null;
        this.displayLocation = null;
        this.minCourseDistanceInMeters = null;
        this.nameHint = null;
        this.matchSideOfStreet = null;
        this.duration = Duration.ofSeconds(0L);
        this.isChargingStation = false;
        this.segmentHint = null;
        this.onRoadThresholdInMeters = null;
        this.chargingStop = null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Waypoint)) {
            return false;
        }
        Waypoint waypoint = (Waypoint) obj;
        return Objects.equals(this.coordinates, waypoint.coordinates) && Objects.equals(this.type, waypoint.type) && this.transitRadiusInMeters == waypoint.transitRadiusInMeters && Objects.equals(this.headingInDegrees, waypoint.headingInDegrees) && Objects.equals(this.sideOfStreetHint, waypoint.sideOfStreetHint) && Objects.equals(this.displayLocation, waypoint.displayLocation) && Objects.equals(this.minCourseDistanceInMeters, waypoint.minCourseDistanceInMeters) && Objects.equals(this.nameHint, waypoint.nameHint) && Objects.equals(this.matchSideOfStreet, waypoint.matchSideOfStreet) && Objects.equals(this.duration, waypoint.duration) && this.isChargingStation == waypoint.isChargingStation && Objects.equals(this.segmentHint, waypoint.segmentHint) && Objects.equals(this.onRoadThresholdInMeters, waypoint.onRoadThresholdInMeters) && Objects.equals(this.chargingStop, waypoint.chargingStop);
    }

    public int hashCode() {
        GeoCoordinates geoCoordinates = this.coordinates;
        int hashCode = (JfifUtil.MARKER_EOI + (geoCoordinates != null ? geoCoordinates.hashCode() : 0)) * 31;
        WaypointType waypointType = this.type;
        int hashCode2 = (((hashCode + (waypointType != null ? waypointType.hashCode() : 0)) * 31) + this.transitRadiusInMeters) * 31;
        Double d = this.headingInDegrees;
        int hashCode3 = (hashCode2 + (d != null ? d.hashCode() : 0)) * 31;
        GeoCoordinates geoCoordinates2 = this.sideOfStreetHint;
        int hashCode4 = (hashCode3 + (geoCoordinates2 != null ? geoCoordinates2.hashCode() : 0)) * 31;
        GeoCoordinates geoCoordinates3 = this.displayLocation;
        int hashCode5 = (hashCode4 + (geoCoordinates3 != null ? geoCoordinates3.hashCode() : 0)) * 31;
        Integer num = this.minCourseDistanceInMeters;
        int hashCode6 = (hashCode5 + (num != null ? num.hashCode() : 0)) * 31;
        String str = this.nameHint;
        int hashCode7 = (hashCode6 + (str != null ? str.hashCode() : 0)) * 31;
        MatchSideOfStreet matchSideOfStreet = this.matchSideOfStreet;
        int hashCode8 = (hashCode7 + (matchSideOfStreet != null ? matchSideOfStreet.hashCode() : 0)) * 31;
        Duration duration = this.duration;
        int hashCode9 = (((hashCode8 + (duration != null ? duration.hashCode() : 0)) * 31) + (this.isChargingStation ? 79 : 97)) * 31;
        SegmentReference segmentReference = this.segmentHint;
        int hashCode10 = (hashCode9 + (segmentReference != null ? segmentReference.hashCode() : 0)) * 31;
        Integer num2 = this.onRoadThresholdInMeters;
        int hashCode11 = (hashCode10 + (num2 != null ? num2.hashCode() : 0)) * 31;
        ChargingStop chargingStop = this.chargingStop;
        return hashCode11 + (chargingStop != null ? chargingStop.hashCode() : 0);
    }

    public Waypoint(@NonNull GeoCoordinates geoCoordinates, @NonNull WaypointType waypointType, int i, @Nullable Double d, @Nullable GeoCoordinates geoCoordinates2, @Nullable Integer num, @NonNull Duration duration) {
        this.coordinates = geoCoordinates;
        this.type = waypointType;
        this.transitRadiusInMeters = i;
        this.headingInDegrees = d;
        this.sideOfStreetHint = geoCoordinates2;
        this.minCourseDistanceInMeters = num;
        this.duration = duration;
        this.displayLocation = null;
        this.nameHint = null;
        this.matchSideOfStreet = null;
        this.isChargingStation = false;
        this.segmentHint = null;
        this.onRoadThresholdInMeters = null;
        this.chargingStop = null;
    }

    public Waypoint(@NonNull GeoCoordinates geoCoordinates, @NonNull WaypointType waypointType, int i, @Nullable Double d, @Nullable GeoCoordinates geoCoordinates2, @Nullable Integer num, @Nullable String str, @NonNull Duration duration) {
        this.coordinates = geoCoordinates;
        this.type = waypointType;
        this.transitRadiusInMeters = i;
        this.headingInDegrees = d;
        this.sideOfStreetHint = geoCoordinates2;
        this.minCourseDistanceInMeters = num;
        this.nameHint = str;
        this.duration = duration;
        this.displayLocation = null;
        this.matchSideOfStreet = null;
        this.isChargingStation = false;
        this.segmentHint = null;
        this.onRoadThresholdInMeters = null;
        this.chargingStop = null;
    }
}
