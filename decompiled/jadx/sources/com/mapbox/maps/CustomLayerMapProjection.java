package com.mapbox.maps;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public interface CustomLayerMapProjection {
    @Nullable
    List<Double> convertMercatorModelMatrix(@NonNull List<Double> list, boolean z);

    @NonNull
    List<Double> getModelMatrix();

    @NonNull
    List<Double> getTransitionMatrix();

    float getTransitionPhase();
}
