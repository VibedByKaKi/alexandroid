package com.mapbox.maps.plugin.locationcomponent;

import com.mapbox.bindgen.Expected;
import com.mapbox.common.location.GetLocationCallback;
import com.mapbox.common.location.Location;
import com.mapbox.maps.QueryRenderedFeaturesCallback;
import com.mapbox.maps.plugin.locationcomponent.DefaultLocationProvider;
import kotlinx.coroutines.channels.ProducerScope;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class DefaultLocationProvider$1$$ExternalSyntheticLambda0 implements GetLocationCallback, QueryRenderedFeaturesCallback {
    public final /* synthetic */ Object f$0;

    public /* synthetic */ DefaultLocationProvider$1$$ExternalSyntheticLambda0(Object obj) {
        this.f$0 = obj;
    }

    @Override // com.mapbox.maps.QueryRenderedFeaturesCallback
    public void run(Expected expected) {
        LocationComponentPluginImpl.isLocatedAt$lambda$6((PuckLocatedAtPointListener) this.f$0, expected);
    }

    @Override // com.mapbox.common.location.GetLocationCallback
    public void run(Location location) {
        DefaultLocationProvider.AnonymousClass1.invokeSuspend$lambda$1((ProducerScope) this.f$0, location);
    }
}
