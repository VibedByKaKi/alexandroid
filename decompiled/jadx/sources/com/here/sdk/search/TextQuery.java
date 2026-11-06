package com.here.sdk.search;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import com.here.sdk.core.CountryCode;
import com.here.sdk.core.GeoBox;
import com.here.sdk.core.GeoCircle;
import com.here.sdk.core.GeoCoordinates;
import com.here.sdk.core.GeoCorridor;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class TextQuery {

    @NonNull
    public Area area;

    @NonNull
    public PlaceFilter placeFilter;

    @NonNull
    public String query;

    public TextQuery(@NonNull String str, @NonNull Area area) {
        TextQuery make = make(str, area);
        this.query = make.query;
        this.area = make.area;
        this.placeFilter = make.placeFilter;
    }

    private static native TextQuery make(@NonNull String str, @NonNull Area area);

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TextQuery)) {
            return false;
        }
        TextQuery textQuery = (TextQuery) obj;
        return Objects.equals(this.query, textQuery.query) && Objects.equals(this.area, textQuery.area) && Objects.equals(this.placeFilter, textQuery.placeFilter);
    }

    public int hashCode() {
        String str = this.query;
        int hashCode = (JfifUtil.MARKER_EOI + (str != null ? str.hashCode() : 0)) * 31;
        Area area = this.area;
        int hashCode2 = (hashCode + (area != null ? area.hashCode() : 0)) * 31;
        PlaceFilter placeFilter = this.placeFilter;
        return hashCode2 + (placeFilter != null ? placeFilter.hashCode() : 0);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Area {

        @Nullable
        public final GeoCoordinates areaCenter;

        @Nullable
        public final GeoBox boxArea;

        @Nullable
        public final GeoCircle circleArea;

        @Nullable
        public final GeoCorridor corridorArea;

        @NonNull
        public final List<CountryCode> countries;

        public Area(@NonNull GeoCoordinates geoCoordinates) {
            Area make = make(geoCoordinates);
            this.areaCenter = make.areaCenter;
            this.boxArea = make.boxArea;
            this.circleArea = make.circleArea;
            this.corridorArea = make.corridorArea;
            this.countries = make.countries;
        }

        private static native Area make(@NonNull GeoBox geoBox);

        private static native Area make(@NonNull GeoCircle geoCircle);

        private static native Area make(@NonNull GeoCoordinates geoCoordinates);

        private static native Area make(@NonNull GeoCorridor geoCorridor, @NonNull GeoCoordinates geoCoordinates);

        private static native Area make(@NonNull List<CountryCode> list, @NonNull GeoCoordinates geoCoordinates);

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Area)) {
                return false;
            }
            Area area = (Area) obj;
            return Objects.equals(this.areaCenter, area.areaCenter) && Objects.equals(this.boxArea, area.boxArea) && Objects.equals(this.circleArea, area.circleArea) && Objects.equals(this.corridorArea, area.corridorArea) && Objects.equals(this.countries, area.countries);
        }

        public int hashCode() {
            GeoCoordinates geoCoordinates = this.areaCenter;
            int hashCode = (JfifUtil.MARKER_EOI + (geoCoordinates != null ? geoCoordinates.hashCode() : 0)) * 31;
            GeoBox geoBox = this.boxArea;
            int hashCode2 = (hashCode + (geoBox != null ? geoBox.hashCode() : 0)) * 31;
            GeoCircle geoCircle = this.circleArea;
            int hashCode3 = (hashCode2 + (geoCircle != null ? geoCircle.hashCode() : 0)) * 31;
            GeoCorridor geoCorridor = this.corridorArea;
            int hashCode4 = (hashCode3 + (geoCorridor != null ? geoCorridor.hashCode() : 0)) * 31;
            List<CountryCode> list = this.countries;
            return hashCode4 + (list != null ? list.hashCode() : 0);
        }

        public Area(@NonNull GeoBox geoBox) {
            Area make = make(geoBox);
            this.areaCenter = make.areaCenter;
            this.boxArea = make.boxArea;
            this.circleArea = make.circleArea;
            this.corridorArea = make.corridorArea;
            this.countries = make.countries;
        }

        public Area(@NonNull GeoCircle geoCircle) {
            Area make = make(geoCircle);
            this.areaCenter = make.areaCenter;
            this.boxArea = make.boxArea;
            this.circleArea = make.circleArea;
            this.corridorArea = make.corridorArea;
            this.countries = make.countries;
        }

        public Area(@NonNull GeoCorridor geoCorridor, @NonNull GeoCoordinates geoCoordinates) {
            Area make = make(geoCorridor, geoCoordinates);
            this.areaCenter = make.areaCenter;
            this.boxArea = make.boxArea;
            this.circleArea = make.circleArea;
            this.corridorArea = make.corridorArea;
            this.countries = make.countries;
        }

        public Area(@NonNull List<CountryCode> list, @NonNull GeoCoordinates geoCoordinates) {
            Area make = make(list, geoCoordinates);
            this.areaCenter = make.areaCenter;
            this.boxArea = make.boxArea;
            this.circleArea = make.circleArea;
            this.corridorArea = make.corridorArea;
            this.countries = make.countries;
        }
    }
}
