package com.amazon.alexa.apl.aploptions;

import android.content.Context;
import com.amazon.apl.android.dependencies.IImageLoader;
import com.amazon.apl.android.providers.IImageLoaderProvider;
import com.dee.app.metrics.MetricsConstants;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/apl/aploptions/APLGlideImageLoaderProvider;", "Lcom/amazon/apl/android/providers/IImageLoaderProvider;", "mAPLGlideImageLoader", "Lcom/amazon/alexa/apl/aploptions/APLGlideImageLoader;", "(Lcom/amazon/alexa/apl/aploptions/APLGlideImageLoader;)V", MetricsConstants.Method.CACHE_GET, "Lcom/amazon/apl/android/dependencies/IImageLoader;", "context", "Landroid/content/Context;", "onDocumentFinish", "", "AVSMobileFramework-android-apl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class APLGlideImageLoaderProvider implements IImageLoaderProvider {

    @NotNull
    private final APLGlideImageLoader mAPLGlideImageLoader;

    @Inject
    public APLGlideImageLoaderProvider(@NotNull APLGlideImageLoader aPLGlideImageLoader) {
        aPLGlideImageLoader.getClass();
        this.mAPLGlideImageLoader = aPLGlideImageLoader;
    }

    @Override // com.amazon.apl.android.providers.IImageLoaderProvider
    @NotNull
    public synchronized IImageLoader get(@NotNull Context context) {
        context.getClass();
        return this.mAPLGlideImageLoader;
    }

    @Override // com.amazon.apl.android.IDocumentLifecycleListener
    public void onDocumentFinish() {
        this.mAPLGlideImageLoader.clearResources();
    }
}
