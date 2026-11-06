package com.mapbox.maps;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class Snapshotter$$ExternalSyntheticLambda4 implements StyleDataLoadedCallback, StyleLoadedCallback, StyleImageMissingCallback {
    public final /* synthetic */ WeakReference f$0;

    public /* synthetic */ Snapshotter$$ExternalSyntheticLambda4(WeakReference weakReference) {
        this.f$0 = weakReference;
    }

    @Override // com.mapbox.maps.StyleDataLoadedCallback
    public void run(StyleDataLoaded styleDataLoaded) {
        Snapshotter._init_$lambda$5(this.f$0, styleDataLoaded);
    }

    @Override // com.mapbox.maps.StyleImageMissingCallback
    public void run(StyleImageMissing styleImageMissing) {
        Snapshotter._init_$lambda$11(this.f$0, styleImageMissing);
    }

    @Override // com.mapbox.maps.StyleLoadedCallback
    public void run(StyleLoaded styleLoaded) {
        Snapshotter._init_$lambda$9(this.f$0, styleLoaded);
    }
}
