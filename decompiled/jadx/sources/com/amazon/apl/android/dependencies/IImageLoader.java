package com.amazon.apl.android.dependencies;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.amazon.apl.android.dependencies.AutoValue_IImageLoader_DownloadImageParams;
import com.amazon.apl.android.dependencies.AutoValue_IImageLoader_LoadImageParams;
import com.amazon.apl.android.providers.ITelemetryProvider;
import com.google.auto.value.AutoValue;
import java.io.File;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface IImageLoader {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface DownloadImageCallback {
        void onError(Exception exc, int i, String str);

        void onSuccess(File file, String str);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class DownloadImageParams {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @AutoValue.Builder
        public static abstract class Builder {
            public abstract DownloadImageParams build();

            public abstract Builder callback(DownloadImageCallback downloadImageCallback);

            public abstract Builder headers(Map<String, String> map);

            public abstract Builder path(String str);
        }

        public static Builder builder() {
            return new AutoValue_IImageLoader_DownloadImageParams.Builder();
        }

        public abstract DownloadImageCallback callback();

        public abstract Map<String, String> headers();

        public abstract String path();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ImageLoaderRequestOptions {
        private Drawable mErrorDrawable;
        private Drawable mPlaceholderDrawable;

        public Drawable getErrorDrawable() {
            return this.mErrorDrawable;
        }

        public Drawable getPlaceholderDrawable() {
            return this.mPlaceholderDrawable;
        }

        public void setErrorDrawable(Drawable drawable) {
            this.mErrorDrawable = drawable;
        }

        public void setPlaceholderDrawable(Drawable drawable) {
            this.mPlaceholderDrawable = drawable;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Deprecated
    public interface LoadImageCallback {
        void onError(Exception exc);

        void onSuccess(Bitmap bitmap);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class LoadImageParams {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @AutoValue.Builder
        public static abstract class Builder {
            public abstract Builder allowUpscaling(boolean z);

            public abstract LoadImageParams build();

            public abstract Builder callback(LoadImageCallback2 loadImageCallback2);

            public abstract Builder headers(Map<String, String> map);

            public abstract Builder imageView(ImageView imageView);

            public abstract Builder needsScaling(boolean z);

            public abstract Builder path(String str);
        }

        public static Builder builder() {
            return new AutoValue_IImageLoader_LoadImageParams.Builder();
        }

        public abstract boolean allowUpscaling();

        public abstract LoadImageCallback2 callback();

        public abstract Map<String, String> headers();

        public abstract ImageView imageView();

        public abstract boolean needsScaling();

        public abstract String path();
    }

    void clear(ImageView imageView);

    default void clearResources() {
        cancel();
    }

    void downloadImage(DownloadImageParams downloadImageParams);

    default void loadImage(LoadImageParams loadImageParams) {
        loadImage(loadImageParams.path(), loadImageParams.imageView(), loadImageParams.callback(), loadImageParams.needsScaling());
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface LoadImageCallback2 {
        default void onError(Exception exc, int i, String str) {
            onError(exc, str);
        }

        void onError(Exception exc, String str);

        void onSuccess(Bitmap bitmap, String str);

        default void onCancel() {
        }
    }

    default void cancel() {
    }

    @Deprecated
    default void loadImage(String str, ImageView imageView, LoadImageCallback loadImageCallback, boolean z, ImageLoaderRequestOptions imageLoaderRequestOptions) {
    }

    @Deprecated
    default void loadImage(String str, ImageView imageView, LoadImageCallback loadImageCallback, boolean z) {
    }

    default IImageLoader withTelemetry(ITelemetryProvider iTelemetryProvider) {
        return this;
    }

    @Deprecated
    default void loadImage(final String str, ImageView imageView, final LoadImageCallback2 loadImageCallback2, boolean z) {
        loadImage(str, imageView, new LoadImageCallback() { // from class: com.amazon.apl.android.dependencies.IImageLoader.1
            @Override // com.amazon.apl.android.dependencies.IImageLoader.LoadImageCallback
            public void onError(Exception exc) {
                loadImageCallback2.onError(exc, str);
            }

            @Override // com.amazon.apl.android.dependencies.IImageLoader.LoadImageCallback
            public void onSuccess(Bitmap bitmap) {
                loadImageCallback2.onSuccess(bitmap, str);
            }
        }, z);
    }
}
