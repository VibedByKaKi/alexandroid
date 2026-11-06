package com.amazon.apl.android.dependencies.impl;

import android.widget.ImageView;
import com.amazon.apl.android.dependencies.IImageLoader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class NoOpImageLoader implements IImageLoader {
    @Override // com.amazon.apl.android.dependencies.IImageLoader
    public void loadImage(String str, ImageView imageView, IImageLoader.LoadImageCallback loadImageCallback, boolean z, IImageLoader.ImageLoaderRequestOptions imageLoaderRequestOptions) {
    }

    @Override // com.amazon.apl.android.dependencies.IImageLoader
    public void cancel() {
    }

    @Override // com.amazon.apl.android.dependencies.IImageLoader
    public void clear(ImageView imageView) {
    }

    @Override // com.amazon.apl.android.dependencies.IImageLoader
    public void downloadImage(IImageLoader.DownloadImageParams downloadImageParams) {
    }

    @Override // com.amazon.apl.android.dependencies.IImageLoader
    public void loadImage(String str, ImageView imageView, IImageLoader.LoadImageCallback loadImageCallback, boolean z) {
    }
}
