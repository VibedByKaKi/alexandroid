package androidx.camera.view;

import android.graphics.SurfaceTexture;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.view.PreviewView;
import androidx.camera.view.TextureViewImplementation;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class PreviewView$1$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ PreviewView$1$$ExternalSyntheticLambda0(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((PreviewView.AnonymousClass1) this.f$0).lambda$onSurfaceRequested$0((SurfaceRequest) this.f$1);
                break;
            case 1:
                ((TextureViewImplementation) this.f$0).lambda$onSurfaceRequested$0((SurfaceRequest) this.f$1);
                break;
            case 2:
                TextureViewImplementation.AnonymousClass1.lambda$onSurfaceTextureUpdated$0((PreviewView.OnFrameUpdateListener) this.f$0, (SurfaceTexture) this.f$1);
                break;
            default:
                ((CameraController) this.f$0).lambda$setCameraSelector$3((CameraSelector) this.f$1);
                break;
        }
    }
}
