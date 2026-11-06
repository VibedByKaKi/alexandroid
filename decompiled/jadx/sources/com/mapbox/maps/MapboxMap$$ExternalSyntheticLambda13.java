package com.mapbox.maps;

import com.mapbox.bindgen.Expected;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class MapboxMap$$ExternalSyntheticLambda13 implements Expected.Transformer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MapboxMap f$0;
    public final /* synthetic */ List f$1;
    public final /* synthetic */ CameraOptions f$2;
    public final /* synthetic */ EdgeInsets f$3;
    public final /* synthetic */ Double f$4;
    public final /* synthetic */ ScreenCoordinate f$5;

    public /* synthetic */ MapboxMap$$ExternalSyntheticLambda13(MapboxMap mapboxMap, List list, CameraOptions cameraOptions, EdgeInsets edgeInsets, Double d, ScreenCoordinate screenCoordinate, int i) {
        this.$r8$classId = i;
        this.f$0 = mapboxMap;
        this.f$1 = list;
        this.f$2 = cameraOptions;
        this.f$3 = edgeInsets;
        this.f$4 = d;
        this.f$5 = screenCoordinate;
    }

    @Override // com.mapbox.bindgen.Expected.Transformer
    public final Object invoke(Object obj) {
        CameraOptions cameraForCoordinates$lambda$17;
        CameraOptions invoke$lambda$1;
        switch (this.$r8$classId) {
            case 0:
                cameraForCoordinates$lambda$17 = MapboxMap.cameraForCoordinates$lambda$17(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (String) obj);
                return cameraForCoordinates$lambda$17;
            default:
                invoke$lambda$1 = MapboxMap$cameraForCoordinates$3.invoke$lambda$1(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (String) obj);
                return invoke$lambda$1;
        }
    }
}
