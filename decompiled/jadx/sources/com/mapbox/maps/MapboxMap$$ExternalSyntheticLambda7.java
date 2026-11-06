package com.mapbox.maps;

import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.interactions.FeatureStateCallback;
import com.mapbox.maps.interactions.TypedFeaturesetDescriptor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class MapboxMap$$ExternalSyntheticLambda7 implements Expected.Action, QueryFeatureStateCallback {
    public final /* synthetic */ FeatureStateCallback f$0;
    public final /* synthetic */ TypedFeaturesetDescriptor f$1;

    public /* synthetic */ MapboxMap$$ExternalSyntheticLambda7(FeatureStateCallback featureStateCallback, TypedFeaturesetDescriptor typedFeaturesetDescriptor) {
        this.f$0 = featureStateCallback;
        this.f$1 = typedFeaturesetDescriptor;
    }

    @Override // com.mapbox.bindgen.Expected.Action
    public void run(Object obj) {
        MapboxMap.getFeatureState$lambda$36$lambda$35(this.f$0, this.f$1, (Value) obj);
    }

    @Override // com.mapbox.maps.QueryFeatureStateCallback
    public void run(Expected expected) {
        MapboxMap.getFeatureState$lambda$36(this.f$0, this.f$1, expected);
    }
}
