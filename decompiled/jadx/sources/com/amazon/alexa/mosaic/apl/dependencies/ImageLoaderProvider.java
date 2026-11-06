package com.amazon.alexa.mosaic.apl.dependencies;

import android.content.Context;
import com.amazon.apl.android.dependencies.IImageLoader;
import com.amazon.apl.android.providers.IImageLoaderProvider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class ImageLoaderProvider implements IImageLoaderProvider {
    private final IImageLoader mImageLoader;

    public ImageLoaderProvider(IImageLoader iImageLoader) {
        this.mImageLoader = iImageLoader;
    }

    @Override // com.amazon.apl.android.providers.IImageLoaderProvider
    public IImageLoader get(Context context) {
        return this.mImageLoader;
    }

    @Override // com.amazon.apl.android.IDocumentLifecycleListener
    public void onDocumentFinish() {
        this.mImageLoader.clearResources();
    }
}
