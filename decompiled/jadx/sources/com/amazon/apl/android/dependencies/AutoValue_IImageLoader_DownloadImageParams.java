package com.amazon.apl.android.dependencies;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.apl.android.dependencies.IImageLoader;
import java.util.Map;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_IImageLoader_DownloadImageParams extends IImageLoader.DownloadImageParams {
    private final IImageLoader.DownloadImageCallback callback;
    private final Map<String, String> headers;
    private final String path;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends IImageLoader.DownloadImageParams.Builder {
        private IImageLoader.DownloadImageCallback callback;
        private Map<String, String> headers;
        private String path;

        @Override // com.amazon.apl.android.dependencies.IImageLoader.DownloadImageParams.Builder
        public IImageLoader.DownloadImageParams build() {
            String str = this.path == null ? " path" : "";
            if (this.callback == null) {
                str = str.concat(" callback");
            }
            if (this.headers == null) {
                str = str.concat(" headers");
            }
            if (str.isEmpty()) {
                return new AutoValue_IImageLoader_DownloadImageParams(this.path, this.callback, this.headers);
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties:".concat(str));
            return null;
        }

        @Override // com.amazon.apl.android.dependencies.IImageLoader.DownloadImageParams.Builder
        public IImageLoader.DownloadImageParams.Builder callback(IImageLoader.DownloadImageCallback downloadImageCallback) {
            if (downloadImageCallback != null) {
                this.callback = downloadImageCallback;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null callback");
            return null;
        }

        @Override // com.amazon.apl.android.dependencies.IImageLoader.DownloadImageParams.Builder
        public IImageLoader.DownloadImageParams.Builder headers(Map<String, String> map) {
            if (map != null) {
                this.headers = map;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null headers");
            return null;
        }

        @Override // com.amazon.apl.android.dependencies.IImageLoader.DownloadImageParams.Builder
        public IImageLoader.DownloadImageParams.Builder path(String str) {
            if (str != null) {
                this.path = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null path");
            return null;
        }
    }

    private AutoValue_IImageLoader_DownloadImageParams(String str, IImageLoader.DownloadImageCallback downloadImageCallback, Map<String, String> map) {
        this.path = str;
        this.callback = downloadImageCallback;
        this.headers = map;
    }

    @Override // com.amazon.apl.android.dependencies.IImageLoader.DownloadImageParams
    public IImageLoader.DownloadImageCallback callback() {
        return this.callback;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof IImageLoader.DownloadImageParams) {
            IImageLoader.DownloadImageParams downloadImageParams = (IImageLoader.DownloadImageParams) obj;
            if (this.path.equals(downloadImageParams.path()) && this.callback.equals(downloadImageParams.callback()) && this.headers.equals(downloadImageParams.headers())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.headers.hashCode() ^ ((((this.path.hashCode() ^ 1000003) * 1000003) ^ this.callback.hashCode()) * 1000003);
    }

    @Override // com.amazon.apl.android.dependencies.IImageLoader.DownloadImageParams
    public Map<String, String> headers() {
        return this.headers;
    }

    @Override // com.amazon.apl.android.dependencies.IImageLoader.DownloadImageParams
    public String path() {
        return this.path;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DownloadImageParams{path=");
        sb.append(this.path);
        sb.append(", callback=");
        sb.append(this.callback);
        sb.append(", headers=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.headers, StringSubstitutor.DEFAULT_VAR_END);
    }
}
