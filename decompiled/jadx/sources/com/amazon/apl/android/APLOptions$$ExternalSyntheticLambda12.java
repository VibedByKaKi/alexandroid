package com.amazon.apl.android;

import android.graphics.Bitmap;
import com.amazon.apl.android.dependencies.ExtensionFilterParameters;
import com.amazon.apl.android.dependencies.IExtensionImageFilterCallback;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class APLOptions$$ExternalSyntheticLambda12 implements IExtensionImageFilterCallback {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ APLOptions$$ExternalSyntheticLambda12(int i) {
        this.$r8$classId = i;
    }

    @Override // com.amazon.apl.android.dependencies.IExtensionImageFilterCallback
    public final Bitmap processImage(Bitmap bitmap, Bitmap bitmap2, ExtensionFilterParameters extensionFilterParameters) {
        Bitmap lambda$builder$7;
        Bitmap lambda$builder$1;
        switch (this.$r8$classId) {
            case 0:
                lambda$builder$7 = APLOptions.lambda$builder$7(bitmap, bitmap2, extensionFilterParameters);
                return lambda$builder$7;
            default:
                lambda$builder$1 = RenderingContext.lambda$builder$1(bitmap, bitmap2, extensionFilterParameters);
                return lambda$builder$1;
        }
    }
}
