package com.mapbox.maps;

import com.mapbox.bindgen.Expected;
import com.mapbox.maps.interactions.QueryRenderedFeaturesetFeaturesCallback;
import com.mapbox.maps.interactions.TypedFeaturesetDescriptor;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class MapboxMap$$ExternalSyntheticLambda12 implements QueryRenderedFeaturesCallback, Expected.Action {
    public final /* synthetic */ QueryRenderedFeaturesetFeaturesCallback f$0;
    public final /* synthetic */ TypedFeaturesetDescriptor f$1;

    public /* synthetic */ MapboxMap$$ExternalSyntheticLambda12(TypedFeaturesetDescriptor typedFeaturesetDescriptor, QueryRenderedFeaturesetFeaturesCallback queryRenderedFeaturesetFeaturesCallback) {
        this.f$0 = queryRenderedFeaturesetFeaturesCallback;
        this.f$1 = typedFeaturesetDescriptor;
    }

    @Override // com.mapbox.bindgen.Expected.Action
    public void run(Object obj) {
        MapboxMap.queryRenderedFeatures$lambda$46$lambda$45(this.f$0, this.f$1, (List) obj);
    }

    @Override // com.mapbox.maps.QueryRenderedFeaturesCallback
    public void run(Expected expected) {
        MapboxMap.queryRenderedFeatures$lambda$46(this.f$0, this.f$1, expected);
    }
}
