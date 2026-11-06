package com.mapbox.geojson;

import androidx.annotation.Keep;
import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Keep
/* loaded from: classes8.dex */
public interface GeoJson extends Serializable {
    BoundingBox bbox();

    String toJson();

    String type();
}
