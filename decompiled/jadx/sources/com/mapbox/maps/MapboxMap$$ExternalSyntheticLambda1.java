package com.mapbox.maps;

import com.mapbox.common.Cancelable;
import com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl;
import com.mapbox.maps.plugin.animation.CameraAnimationsUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class MapboxMap$$ExternalSyntheticLambda1 implements Cancelable {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ MapboxMap$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override // com.mapbox.common.Cancelable
    public final void cancel() {
        switch (this.$r8$classId) {
            case 0:
                MapboxMap.setFeatureState$lambda$27();
                break;
            case 1:
                MapboxMap.getFeatureState$lambda$33();
                break;
            case 2:
                MapboxMap.removeFeatureState$lambda$39();
                break;
            case 3:
                NativeMapImpl.whenMapSizeReady$lambda$3();
                break;
            case 4:
                CameraAnimationsPluginImpl.startHighLevelAnimation$lambda$30();
                break;
            case 5:
                CameraAnimationsPluginImpl.easeTo$lambda$26();
                break;
            case 6:
                CameraAnimationsPluginImpl.flyTo$lambda$27();
                break;
            default:
                CameraAnimationsUtils.emptyCancelable$lambda$0();
                break;
        }
    }
}
