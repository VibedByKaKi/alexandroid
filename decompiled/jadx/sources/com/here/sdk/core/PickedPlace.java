package com.here.sdk.core;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class PickedPlace {

    @NonNull
    public GeoCoordinates coordinates;

    @NonNull
    public String name;

    @NonNull
    public String placeCategoryId;

    public PickedPlace(@NonNull String str, @NonNull GeoCoordinates geoCoordinates, @NonNull String str2) {
        this.name = str;
        this.coordinates = geoCoordinates;
        this.placeCategoryId = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PickedPlace)) {
            return false;
        }
        PickedPlace pickedPlace = (PickedPlace) obj;
        return Objects.equals(this.name, pickedPlace.name) && Objects.equals(this.coordinates, pickedPlace.coordinates) && Objects.equals(this.placeCategoryId, pickedPlace.placeCategoryId);
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (JfifUtil.MARKER_EOI + (str != null ? str.hashCode() : 0)) * 31;
        GeoCoordinates geoCoordinates = this.coordinates;
        int hashCode2 = (hashCode + (geoCoordinates != null ? geoCoordinates.hashCode() : 0)) * 31;
        String str2 = this.placeCategoryId;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
