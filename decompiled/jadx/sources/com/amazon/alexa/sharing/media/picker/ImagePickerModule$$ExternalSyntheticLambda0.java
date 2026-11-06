package com.amazon.alexa.sharing.media.picker;

import android.app.Activity;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class ImagePickerModule$$ExternalSyntheticLambda0 implements Callable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ImagePickerModule f$0;
    public final /* synthetic */ Activity f$1;

    public /* synthetic */ ImagePickerModule$$ExternalSyntheticLambda0(ImagePickerModule imagePickerModule, Activity activity, int i) {
        this.$r8$classId = i;
        this.f$0 = imagePickerModule;
        this.f$1 = activity;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Void lambda$openPicker$2;
        Void lambda$openCamera$1;
        switch (this.$r8$classId) {
            case 0:
                lambda$openPicker$2 = this.f$0.lambda$openPicker$2(this.f$1);
                return lambda$openPicker$2;
            default:
                lambda$openCamera$1 = this.f$0.lambda$openCamera$1(this.f$1);
                return lambda$openCamera$1;
        }
    }
}
