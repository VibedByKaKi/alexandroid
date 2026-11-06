package androidx.camera.core.impl;

import androidx.camera.camera2.internal.concurrent.Camera2CameraCoordinator;
import androidx.camera.core.CameraFilter;
import com.mrousavy.camera.core.extensions.CameraSelector_byIdKt;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class CameraInfoInternal$$ExternalSyntheticLambda0 implements CameraFilter {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ CameraInfoInternal$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // androidx.camera.core.CameraFilter
    public final List filter(List list) {
        List lambda$getCameraSelector$0;
        List lambda$createCameraSelectorById$0;
        List byId$lambda$1;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                lambda$getCameraSelector$0 = ((CameraInfoInternal) obj).lambda$getCameraSelector$0(list);
                return lambda$getCameraSelector$0;
            case 1:
                lambda$createCameraSelectorById$0 = Camera2CameraCoordinator.lambda$createCameraSelectorById$0((String) obj, list);
                return lambda$createCameraSelectorById$0;
            default:
                byId$lambda$1 = CameraSelector_byIdKt.byId$lambda$1((String) obj, list);
                return byId$lambda$1;
        }
    }
}
