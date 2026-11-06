package it.innove;

import android.bluetooth.BluetoothGatt;
import android.view.Surface;
import com.amazon.dee.app.elements.bridges.ScreenSnapshotModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.modules.toast.ToastModule;
import com.mapbox.maps.renderer.MapboxRenderThread;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final /* synthetic */ class Peripheral$$ExternalSyntheticLambda11 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ int f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ Peripheral$$ExternalSyntheticLambda11(MapboxRenderThread mapboxRenderThread, int i, int i2, Surface surface) {
        this.$r8$classId = 3;
        this.f$0 = mapboxRenderThread;
        this.f$2 = i;
        this.f$3 = i2;
        this.f$1 = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((Peripheral) this.f$0).lambda$onConnectionStateChange$3((BluetoothGatt) this.f$1, this.f$2, this.f$3);
                break;
            case 1:
                ScreenSnapshotModule.hideWindowUntilShown$lambda$15((Promise) this.f$0, (ScreenSnapshotModule) this.f$1, this.f$2, this.f$3);
                break;
            case 2:
                ToastModule.showWithGravity$lambda$1((ToastModule) this.f$0, (String) this.f$1, this.f$2, this.f$3);
                break;
            default:
                MapboxRenderThread.onSurfaceCreated$lambda$23$lambda$22$lambda$21((MapboxRenderThread) this.f$0, this.f$2, this.f$3, (Surface) this.f$1);
                break;
        }
    }

    public /* synthetic */ Peripheral$$ExternalSyntheticLambda11(int i, Object obj, Object obj2, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = i;
        this.f$3 = i2;
    }
}
