package com.mapbox.maps;

import com.mapbox.common.Cancelable;
import com.mapbox.maps.plugin.viewport.state.FollowPuckViewportStateImpl;
import com.mapbox.maps.plugin.viewport.state.OverviewViewportStateImpl;
import com.mapbox.maps.plugin.viewport.state.ViewportStateDataObserver;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class MapboxMap$$ExternalSyntheticLambda19 implements Cancelable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ MapboxMap$$ExternalSyntheticLambda19(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // com.mapbox.common.Cancelable
    public final void cancel() {
        switch (this.$r8$classId) {
            case 0:
                MapboxMap.addInteraction$lambda$24((MapboxMap) this.f$0, (Cancelable) this.f$1);
                break;
            case 1:
                NativeMapImpl.whenMapSizeReady$lambda$4((NativeMapImpl) this.f$0, (Function0) this.f$1);
                break;
            case 2:
                FollowPuckViewportStateImpl.observeDataSource$lambda$5((FollowPuckViewportStateImpl) this.f$0, (ViewportStateDataObserver) this.f$1);
                break;
            default:
                OverviewViewportStateImpl.observeDataSource$lambda$3((OverviewViewportStateImpl) this.f$0, (ViewportStateDataObserver) this.f$1);
                break;
        }
    }
}
