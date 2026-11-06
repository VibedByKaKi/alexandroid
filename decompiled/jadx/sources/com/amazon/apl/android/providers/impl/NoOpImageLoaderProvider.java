package com.amazon.apl.android.providers.impl;

import android.content.Context;
import androidx.annotation.Nullable;
import com.amazon.apl.android.dependencies.IImageLoader;
import com.amazon.apl.android.dependencies.impl.NoOpImageLoader;
import com.amazon.apl.android.providers.IImageLoaderProvider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class NoOpImageLoaderProvider implements IImageLoaderProvider {
    private static NoOpImageLoaderProvider INSTANCE;

    private NoOpImageLoaderProvider() {
    }

    public static NoOpImageLoaderProvider getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new NoOpImageLoaderProvider();
        }
        return INSTANCE;
    }

    @Override // com.amazon.apl.android.providers.IImageLoaderProvider
    @Nullable
    public IImageLoader get(Context context) {
        return new NoOpImageLoader();
    }

    @Override // com.amazon.apl.android.IDocumentLifecycleListener
    public void onDocumentFinish() {
    }
}
