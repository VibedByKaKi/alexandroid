package com.amazon.apl.android.providers;

import android.content.Context;
import com.amazon.apl.android.IDocumentLifecycleListener;
import com.amazon.apl.android.dependencies.IImageLoader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface IImageLoaderProvider extends IDocumentLifecycleListener {
    IImageLoader get(Context context);
}
