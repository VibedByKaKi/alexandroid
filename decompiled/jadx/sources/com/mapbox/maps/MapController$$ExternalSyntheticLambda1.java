package com.mapbox.maps;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class MapController$$ExternalSyntheticLambda1 implements CameraChangedCoalescedCallback, StyleDataLoadedCallback {
    public final /* synthetic */ MapController f$0;

    public /* synthetic */ MapController$$ExternalSyntheticLambda1(MapController mapController) {
        this.f$0 = mapController;
    }

    @Override // com.mapbox.maps.CameraChangedCoalescedCallback
    public void run(CameraChangedCoalesced cameraChangedCoalesced) {
        MapController._init_$lambda$0(this.f$0, cameraChangedCoalesced);
    }

    @Override // com.mapbox.maps.StyleDataLoadedCallback
    public void run(StyleDataLoaded styleDataLoaded) {
        MapController._init_$lambda$2(this.f$0, styleDataLoaded);
    }
}
