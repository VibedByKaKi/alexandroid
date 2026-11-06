package androidx.camera.camera2.internal.compat;

import androidx.camera.camera2.internal.compat.CameraManagerCompat;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class CameraManagerCompat$AvailabilityCallbackExecutorWrapper$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CameraManagerCompat.AvailabilityCallbackExecutorWrapper f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ CameraManagerCompat$AvailabilityCallbackExecutorWrapper$$ExternalSyntheticLambda0(CameraManagerCompat.AvailabilityCallbackExecutorWrapper availabilityCallbackExecutorWrapper, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = availabilityCallbackExecutorWrapper;
        this.f$1 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onCameraAvailable$1(this.f$1);
                break;
            default:
                this.f$0.lambda$onCameraUnavailable$2(this.f$1);
                break;
        }
    }
}
