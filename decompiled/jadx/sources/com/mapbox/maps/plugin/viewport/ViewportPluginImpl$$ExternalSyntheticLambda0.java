package com.mapbox.maps.plugin.viewport;

import com.mapbox.common.Cancelable;
import com.mapbox.maps.plugin.viewport.state.OverviewViewportStateImpl;
import com.mapbox.maps.plugin.viewport.state.ViewportState;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class ViewportPluginImpl$$ExternalSyntheticLambda0 implements Cancelable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ ViewportPluginImpl$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // com.mapbox.common.Cancelable
    public final void cancel() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ViewportPluginImpl.transitionTo$lambda$2$lambda$1((ViewportState) obj);
                break;
            default:
                OverviewViewportStateImpl.evaluateViewportData$lambda$1((Ref.BooleanRef) obj);
                break;
        }
    }
}
