package com.amazon.alexa.apl.aploptions;

import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.VisibleForTesting;
import com.amazon.apl.android.dependencies.IImageLoader;
import com.amazon.apl.android.providers.ITelemetryProvider;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.signature.ObjectKey;
import com.dee.app.metrics.MetricsConstants;
import io.branch.rnbranch.RNBranchModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007H\u0016J\b\u0010\u000f\u001a\u00020\rH\u0016J0\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0007J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u001e\u0010\u001c\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b0\u0006H\u0007J\u0010\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/amazon/alexa/apl/aploptions/APLGlideImageLoader;", "Lcom/amazon/apl/android/dependencies/IImageLoader;", "aplGlideRequestManagerWrapper", "Lcom/amazon/alexa/apl/aploptions/APLGlideRequestManagerWrapper;", "(Lcom/amazon/alexa/apl/aploptions/APLGlideRequestManagerWrapper;)V", "mTargets", "", "Landroid/widget/ImageView;", "", "Lcom/bumptech/glide/request/target/Target;", "mTelemetryProvider", "Lcom/amazon/apl/android/providers/ITelemetryProvider;", MetricsConstants.Method.CACHE_CLEAR, "", "imageView", "clearResources", "createTarget", "Lcom/amazon/alexa/apl/aploptions/BitmapTarget;", "callback", "Lcom/amazon/apl/android/dependencies/IImageLoader$LoadImageCallback2;", "url", "", "width", "", "height", "downloadImage", RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_PARAMS, "Lcom/amazon/apl/android/dependencies/IImageLoader$DownloadImageParams;", "getTargets", "loadImage", "load", "Lcom/amazon/apl/android/dependencies/IImageLoader$LoadImageParams;", "loadImageInternal", "withTelemetry", "telemetryProvider", "Companion", "AVSMobileFramework-android-apl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class APLGlideImageLoader implements IImageLoader {

    @NotNull
    private final APLGlideRequestManagerWrapper aplGlideRequestManagerWrapper;

    @NotNull
    private final Map<ImageView, List<Target<?>>> mTargets;

    @Nullable
    private ITelemetryProvider mTelemetryProvider;
    private static final String TAG = "APLGlideImageLoader";

    @NotNull
    private static final NoUpscalingDownsampleStrategy DOWNSAMPLE_STRATEGY = new NoUpscalingDownsampleStrategy();

    @Inject
    public APLGlideImageLoader(@NotNull APLGlideRequestManagerWrapper aPLGlideRequestManagerWrapper) {
        aPLGlideRequestManagerWrapper.getClass();
        this.aplGlideRequestManagerWrapper = aPLGlideRequestManagerWrapper;
        this.mTargets = new LinkedHashMap();
    }

    private final void loadImageInternal(IImageLoader.LoadImageParams load) {
        ImageView imageView = load.imageView();
        boolean needsScaling = load.needsScaling();
        IImageLoader.LoadImageCallback2 callback = load.callback();
        String path = load.path();
        boolean allowUpscaling = load.allowUpscaling();
        Map<String, String> headers = load.headers();
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        if (this.aplGlideRequestManagerWrapper.isPaused()) {
            this.aplGlideRequestManagerWrapper.resumeRequests();
        }
        int i = needsScaling ? layoutParams.width : Integer.MIN_VALUE;
        int i2 = needsScaling ? layoutParams.height : Integer.MIN_VALUE;
        callback.getClass();
        path.getClass();
        BitmapTarget createTarget = createTarget(imageView, callback, path, i, i2);
        RequestOptions format = new RequestOptions().format(DecodeFormat.PREFER_ARGB_8888);
        format.getClass();
        RequestOptions disallowHardwareConfig = format.disallowHardwareConfig();
        disallowHardwareConfig.getClass();
        RequestOptions requestOptions = disallowHardwareConfig;
        if (!allowUpscaling) {
            RequestOptions downsample = requestOptions.downsample(DOWNSAMPLE_STRATEGY);
            downsample.getClass();
            requestOptions = downsample;
        }
        if (headers.size() > 0) {
            RequestOptions signature = requestOptions.signature(new ObjectKey(headers));
            signature.getClass();
            requestOptions = signature;
        }
        this.aplGlideRequestManagerWrapper.loadRequestBuilder(requestOptions, path, headers, createTarget);
    }

    @Override // com.amazon.apl.android.dependencies.IImageLoader
    public synchronized void clear(@NotNull ImageView imageView) {
        try {
            imageView.getClass();
            List<Target<?>> list = this.mTargets.get(imageView);
            if (list != null) {
                Iterator<Target<?>> it2 = list.iterator();
                while (it2.hasNext()) {
                    this.aplGlideRequestManagerWrapper.clear(it2.next());
                }
            }
            this.mTargets.remove(imageView);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.amazon.apl.android.dependencies.IImageLoader
    public synchronized void clearResources() {
        try {
            for (Map.Entry<ImageView, List<Target<?>>> entry : this.mTargets.entrySet()) {
                entry.getKey();
                Iterator<Target<?>> it2 = entry.getValue().iterator();
                while (it2.hasNext()) {
                    this.aplGlideRequestManagerWrapper.clear(it2.next());
                }
            }
            this.mTargets.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @VisibleForTesting
    @NotNull
    public final synchronized BitmapTarget createTarget(@NotNull ImageView imageView, @NotNull IImageLoader.LoadImageCallback2 callback, @NotNull String url, int width, int height) {
        BitmapTarget bitmapTarget;
        try {
            imageView.getClass();
            callback.getClass();
            url.getClass();
            bitmapTarget = new BitmapTarget(this.mTelemetryProvider, callback, url, width, height);
            List<Target<?>> list = this.mTargets.get(imageView);
            if (list == null) {
                list = new ArrayList<>();
                this.mTargets.put(imageView, list);
            }
            list.add(bitmapTarget);
        } catch (Throwable th) {
            throw th;
        }
        return bitmapTarget;
    }

    @Override // com.amazon.apl.android.dependencies.IImageLoader
    public void downloadImage(@NotNull IImageLoader.DownloadImageParams params) {
        params.getClass();
    }

    @VisibleForTesting
    @NotNull
    public final Map<ImageView, List<Target<?>>> getTargets() {
        return this.mTargets;
    }

    @Override // com.amazon.apl.android.dependencies.IImageLoader
    public void loadImage(@NotNull IImageLoader.LoadImageParams load) {
        load.getClass();
        loadImageInternal(load);
    }

    @Override // com.amazon.apl.android.dependencies.IImageLoader
    @NotNull
    public APLGlideImageLoader withTelemetry(@NotNull ITelemetryProvider telemetryProvider) {
        telemetryProvider.getClass();
        if (!Intrinsics.areEqual(this.mTelemetryProvider, telemetryProvider)) {
            this.mTelemetryProvider = telemetryProvider;
        }
        return this;
    }
}
