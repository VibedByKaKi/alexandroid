package com.mapbox.maps.loader;

import androidx.annotation.NonNull;
import androidx.startup.Initializer;
import com.mapbox.common.BaseMapboxInitializer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class MapboxMapsInitializer extends BaseMapboxInitializer<MapboxMaps> {
    @Override // com.mapbox.common.BaseMapboxInitializer
    @NonNull
    public Class<? extends Initializer<MapboxMaps>> getInitializerClass() {
        return MapboxMapsInitializerImpl.class;
    }
}
