package com.mapbox.maps;

import com.mapbox.maps.Style;
import com.mapbox.maps.plugin.MapDelegateProviderImpl;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class MapboxMap$$ExternalSyntheticLambda16 implements Style.OnStyleLoaded {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ MapboxMap$$ExternalSyntheticLambda16(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // com.mapbox.maps.Style.OnStyleLoaded
    public final void onStyleLoaded(Style style) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                MapboxMap._init_$lambda$3((MapboxMap) obj, style);
                break;
            case 1:
                MapController._init_$lambda$2$lambda$1((MapController) obj, style);
                break;
            default:
                MapDelegateProviderImpl.getStyle$lambda$0((Function1) obj, style);
                break;
        }
    }
}
