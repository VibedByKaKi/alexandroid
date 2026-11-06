package com.amazon.alexa.accessory.camera;

import android.util.Pair;
import com.amazon.alexa.accessory.protocol.Camera;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class AccessoryCameraProvider$$ExternalSyntheticLambda3 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AccessoryCameraProvider f$0;

    public /* synthetic */ AccessoryCameraProvider$$ExternalSyntheticLambda3(AccessoryCameraProvider accessoryCameraProvider, int i) {
        this.$r8$classId = i;
        this.f$0 = accessoryCameraProvider;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        AccessoryCameraProvider accessoryCameraProvider = this.f$0;
        switch (i) {
            case 0:
                accessoryCameraProvider.handleNotifyCameraAction((Camera.NotifyCameraAction) obj);
                break;
            case 1:
                accessoryCameraProvider.logError((Throwable) obj);
                break;
            case 2:
                accessoryCameraProvider.lambda$handleCapturePhoto$0((Pair) obj);
                break;
            default:
                accessoryCameraProvider.lambda$handleCapturePhoto$1((Throwable) obj);
                break;
        }
    }
}
