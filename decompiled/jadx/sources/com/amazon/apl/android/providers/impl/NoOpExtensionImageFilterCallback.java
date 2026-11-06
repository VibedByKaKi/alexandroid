package com.amazon.apl.android.providers.impl;

import android.graphics.Bitmap;
import com.amazon.apl.android.dependencies.ExtensionFilterParameters;
import com.amazon.apl.android.dependencies.IExtensionImageFilterCallback;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class NoOpExtensionImageFilterCallback implements IExtensionImageFilterCallback {
    @Override // com.amazon.apl.android.dependencies.IExtensionImageFilterCallback
    public Bitmap processImage(Bitmap bitmap, Bitmap bitmap2, ExtensionFilterParameters extensionFilterParameters) {
        return bitmap;
    }
}
