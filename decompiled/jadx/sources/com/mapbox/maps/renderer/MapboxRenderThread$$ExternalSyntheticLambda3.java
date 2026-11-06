package com.mapbox.maps.renderer;

import android.view.Choreographer;
import android.view.View;
import com.facebook.react.modules.core.ReactChoreographer;
import com.reactnativepagerview.PagerViewViewManagerImpl;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.android.HandlerDispatcherKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class MapboxRenderThread$$ExternalSyntheticLambda3 implements Choreographer.FrameCallback {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ MapboxRenderThread$$ExternalSyntheticLambda3(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                MapboxRenderThread.presentFrameFunc$lambda$10((MapboxRenderThread) obj, j);
                break;
            case 1:
                ((Runnable) obj).run();
                break;
            case 2:
                ReactChoreographer.frameCallback$lambda$1((ReactChoreographer) obj, j);
                break;
            case 3:
                PagerViewViewManagerImpl.debouncedRefreshViewChildrenLayout$lambda$4((View) obj, j);
                break;
            default:
                HandlerDispatcherKt.postFrameCallback$lambda$6((CancellableContinuation) obj, j);
                break;
        }
    }
}
