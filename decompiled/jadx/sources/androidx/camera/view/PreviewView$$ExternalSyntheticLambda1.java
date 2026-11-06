package androidx.camera.view;

import androidx.camera.view.RotationProvider;
import androidx.camera.view.impl.ZoomGestureDetector;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class PreviewView$$ExternalSyntheticLambda1 implements CallbackToFutureAdapter.Resolver, RotationProvider.Listener, ZoomGestureDetector.OnZoomGestureListener {
    public final /* synthetic */ Object f$0;

    public /* synthetic */ PreviewView$$ExternalSyntheticLambda1(Object obj) {
        this.f$0 = obj;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        Object lambda$waitForNextFrame$3;
        lambda$waitForNextFrame$3 = ((TextureViewImplementation) this.f$0).lambda$waitForNextFrame$3(completer);
        return lambda$waitForNextFrame$3;
    }

    @Override // androidx.camera.view.RotationProvider.Listener
    public void onRotationChanged(int i) {
        ((CameraController) this.f$0).lambda$new$1(i);
    }

    @Override // androidx.camera.view.impl.ZoomGestureDetector.OnZoomGestureListener
    public boolean onZoomEvent(ZoomGestureDetector.ZoomEvent zoomEvent) {
        boolean lambda$new$1;
        lambda$new$1 = ((PreviewView) this.f$0).lambda$new$1(zoomEvent);
        return lambda$new$1;
    }
}
