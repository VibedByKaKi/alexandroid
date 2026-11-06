package com.amazon.apl.android.dependencies;

import android.widget.ImageView;
import com.amazon.apl.android.dependencies.IImageLoader;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Map;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_IImageLoader_LoadImageParams extends IImageLoader.LoadImageParams {
    private final boolean allowUpscaling;
    private final IImageLoader.LoadImageCallback2 callback;
    private final Map<String, String> headers;
    private final ImageView imageView;
    private final boolean needsScaling;
    private final String path;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends IImageLoader.LoadImageParams.Builder {
        private Boolean allowUpscaling;
        private IImageLoader.LoadImageCallback2 callback;
        private Map<String, String> headers;
        private ImageView imageView;
        private Boolean needsScaling;
        private String path;

        @Override // com.amazon.apl.android.dependencies.IImageLoader.LoadImageParams.Builder
        public IImageLoader.LoadImageParams.Builder allowUpscaling(boolean z) {
            this.allowUpscaling = Boolean.valueOf(z);
            return this;
        }

        @Override // com.amazon.apl.android.dependencies.IImageLoader.LoadImageParams.Builder
        public IImageLoader.LoadImageParams build() {
            String str = this.path == null ? " path" : "";
            if (this.imageView == null) {
                str = str.concat(" imageView");
            }
            if (this.callback == null) {
                str = str.concat(" callback");
            }
            if (this.needsScaling == null) {
                str = str.concat(" needsScaling");
            }
            if (this.headers == null) {
                str = str.concat(" headers");
            }
            if (this.allowUpscaling == null) {
                str = str.concat(" allowUpscaling");
            }
            if (str.isEmpty()) {
                return new AutoValue_IImageLoader_LoadImageParams(this.path, this.imageView, this.callback, this.needsScaling.booleanValue(), this.headers, this.allowUpscaling.booleanValue());
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties:".concat(str));
            return null;
        }

        @Override // com.amazon.apl.android.dependencies.IImageLoader.LoadImageParams.Builder
        public IImageLoader.LoadImageParams.Builder callback(IImageLoader.LoadImageCallback2 loadImageCallback2) {
            if (loadImageCallback2 != null) {
                this.callback = loadImageCallback2;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null callback");
            return null;
        }

        @Override // com.amazon.apl.android.dependencies.IImageLoader.LoadImageParams.Builder
        public IImageLoader.LoadImageParams.Builder headers(Map<String, String> map) {
            if (map != null) {
                this.headers = map;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null headers");
            return null;
        }

        @Override // com.amazon.apl.android.dependencies.IImageLoader.LoadImageParams.Builder
        public IImageLoader.LoadImageParams.Builder imageView(ImageView imageView) {
            if (imageView != null) {
                this.imageView = imageView;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null imageView");
            return null;
        }

        @Override // com.amazon.apl.android.dependencies.IImageLoader.LoadImageParams.Builder
        public IImageLoader.LoadImageParams.Builder needsScaling(boolean z) {
            this.needsScaling = Boolean.valueOf(z);
            return this;
        }

        @Override // com.amazon.apl.android.dependencies.IImageLoader.LoadImageParams.Builder
        public IImageLoader.LoadImageParams.Builder path(String str) {
            if (str != null) {
                this.path = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null path");
            return null;
        }
    }

    private AutoValue_IImageLoader_LoadImageParams(String str, ImageView imageView, IImageLoader.LoadImageCallback2 loadImageCallback2, boolean z, Map<String, String> map, boolean z2) {
        this.path = str;
        this.imageView = imageView;
        this.callback = loadImageCallback2;
        this.needsScaling = z;
        this.headers = map;
        this.allowUpscaling = z2;
    }

    @Override // com.amazon.apl.android.dependencies.IImageLoader.LoadImageParams
    public boolean allowUpscaling() {
        return this.allowUpscaling;
    }

    @Override // com.amazon.apl.android.dependencies.IImageLoader.LoadImageParams
    public IImageLoader.LoadImageCallback2 callback() {
        return this.callback;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof IImageLoader.LoadImageParams) {
            IImageLoader.LoadImageParams loadImageParams = (IImageLoader.LoadImageParams) obj;
            if (this.path.equals(loadImageParams.path()) && this.imageView.equals(loadImageParams.imageView()) && this.callback.equals(loadImageParams.callback()) && this.needsScaling == loadImageParams.needsScaling() && this.headers.equals(loadImageParams.headers()) && this.allowUpscaling == loadImageParams.allowUpscaling()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((this.path.hashCode() ^ 1000003) * 1000003) ^ this.imageView.hashCode()) * 1000003) ^ this.callback.hashCode()) * 1000003) ^ (this.needsScaling ? 1231 : 1237)) * 1000003) ^ this.headers.hashCode()) * 1000003) ^ (this.allowUpscaling ? 1231 : 1237);
    }

    @Override // com.amazon.apl.android.dependencies.IImageLoader.LoadImageParams
    public Map<String, String> headers() {
        return this.headers;
    }

    @Override // com.amazon.apl.android.dependencies.IImageLoader.LoadImageParams
    public ImageView imageView() {
        return this.imageView;
    }

    @Override // com.amazon.apl.android.dependencies.IImageLoader.LoadImageParams
    public boolean needsScaling() {
        return this.needsScaling;
    }

    @Override // com.amazon.apl.android.dependencies.IImageLoader.LoadImageParams
    public String path() {
        return this.path;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LoadImageParams{path=");
        sb.append(this.path);
        sb.append(", imageView=");
        sb.append(this.imageView);
        sb.append(", callback=");
        sb.append(this.callback);
        sb.append(", needsScaling=");
        sb.append(this.needsScaling);
        sb.append(", headers=");
        sb.append(this.headers);
        sb.append(", allowUpscaling=");
        return a$$ExternalSyntheticOutline0.m(sb, this.allowUpscaling, StringSubstitutor.DEFAULT_VAR_END);
    }
}
