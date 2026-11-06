package com.here.sdk.search;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import com.here.sdk.core.GeoCoordinates;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class StructuredQuery {

    @NonNull
    public GeoCoordinates areaCenter;

    @NonNull
    public String query;

    @NonNull
    public AddressElements addressElements = new AddressElements();

    @Nullable
    public ResultType resultType = null;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class AddressElements {

        @Nullable
        public String country = null;

        @Nullable
        public String city = null;

        @Nullable
        public String postalCode = null;

        @Nullable
        public String district = null;

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AddressElements)) {
                return false;
            }
            AddressElements addressElements = (AddressElements) obj;
            return Objects.equals(this.country, addressElements.country) && Objects.equals(this.city, addressElements.city) && Objects.equals(this.postalCode, addressElements.postalCode) && Objects.equals(this.district, addressElements.district);
        }

        public int hashCode() {
            String str = this.country;
            int hashCode = (JfifUtil.MARKER_EOI + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.city;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.postalCode;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.district;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ResultType {
        COUNTRY(0),
        CITY(1),
        POSTAL_CODE(2),
        DISTRICT(3),
        STREET(4);

        public final int value;

        ResultType(int i) {
            this.value = i;
        }
    }

    public StructuredQuery(@NonNull String str, @NonNull GeoCoordinates geoCoordinates) {
        this.query = str;
        this.areaCenter = geoCoordinates;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StructuredQuery)) {
            return false;
        }
        StructuredQuery structuredQuery = (StructuredQuery) obj;
        return Objects.equals(this.query, structuredQuery.query) && Objects.equals(this.areaCenter, structuredQuery.areaCenter) && Objects.equals(this.addressElements, structuredQuery.addressElements) && Objects.equals(this.resultType, structuredQuery.resultType);
    }

    public int hashCode() {
        String str = this.query;
        int hashCode = (JfifUtil.MARKER_EOI + (str != null ? str.hashCode() : 0)) * 31;
        GeoCoordinates geoCoordinates = this.areaCenter;
        int hashCode2 = (hashCode + (geoCoordinates != null ? geoCoordinates.hashCode() : 0)) * 31;
        AddressElements addressElements = this.addressElements;
        int hashCode3 = (hashCode2 + (addressElements != null ? addressElements.hashCode() : 0)) * 31;
        ResultType resultType = this.resultType;
        return hashCode3 + (resultType != null ? resultType.hashCode() : 0);
    }
}
