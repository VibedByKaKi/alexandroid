package androidx.camera.core.processing.util;

import androidx.annotation.NonNull;
import androidx.camera.core.processing.util.GraphicDeviceInfo;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
final class AutoValue_GraphicDeviceInfo extends GraphicDeviceInfo {
    private final String eglExtensions;
    private final String eglVersion;
    private final String glExtensions;
    private final String glVersion;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends GraphicDeviceInfo.Builder {
        private String eglExtensions;
        private String eglVersion;
        private String glExtensions;
        private String glVersion;

        @Override // androidx.camera.core.processing.util.GraphicDeviceInfo.Builder
        public GraphicDeviceInfo build() {
            String str = this.glVersion == null ? " glVersion" : "";
            if (this.eglVersion == null) {
                str = str.concat(" eglVersion");
            }
            if (this.glExtensions == null) {
                str = str.concat(" glExtensions");
            }
            if (this.eglExtensions == null) {
                str = str.concat(" eglExtensions");
            }
            if (str.isEmpty()) {
                return new AutoValue_GraphicDeviceInfo(this.glVersion, this.eglVersion, this.glExtensions, this.eglExtensions);
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties:".concat(str));
            return null;
        }

        @Override // androidx.camera.core.processing.util.GraphicDeviceInfo.Builder
        public GraphicDeviceInfo.Builder setEglExtensions(String str) {
            if (str != null) {
                this.eglExtensions = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null eglExtensions");
            return null;
        }

        @Override // androidx.camera.core.processing.util.GraphicDeviceInfo.Builder
        public GraphicDeviceInfo.Builder setEglVersion(String str) {
            if (str != null) {
                this.eglVersion = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null eglVersion");
            return null;
        }

        @Override // androidx.camera.core.processing.util.GraphicDeviceInfo.Builder
        public GraphicDeviceInfo.Builder setGlExtensions(String str) {
            if (str != null) {
                this.glExtensions = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null glExtensions");
            return null;
        }

        @Override // androidx.camera.core.processing.util.GraphicDeviceInfo.Builder
        public GraphicDeviceInfo.Builder setGlVersion(String str) {
            if (str != null) {
                this.glVersion = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null glVersion");
            return null;
        }
    }

    private AutoValue_GraphicDeviceInfo(String str, String str2, String str3, String str4) {
        this.glVersion = str;
        this.eglVersion = str2;
        this.glExtensions = str3;
        this.eglExtensions = str4;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GraphicDeviceInfo) {
            GraphicDeviceInfo graphicDeviceInfo = (GraphicDeviceInfo) obj;
            if (this.glVersion.equals(graphicDeviceInfo.getGlVersion()) && this.eglVersion.equals(graphicDeviceInfo.getEglVersion()) && this.glExtensions.equals(graphicDeviceInfo.getGlExtensions()) && this.eglExtensions.equals(graphicDeviceInfo.getEglExtensions())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.processing.util.GraphicDeviceInfo
    @NonNull
    public String getEglExtensions() {
        return this.eglExtensions;
    }

    @Override // androidx.camera.core.processing.util.GraphicDeviceInfo
    @NonNull
    public String getEglVersion() {
        return this.eglVersion;
    }

    @Override // androidx.camera.core.processing.util.GraphicDeviceInfo
    @NonNull
    public String getGlExtensions() {
        return this.glExtensions;
    }

    @Override // androidx.camera.core.processing.util.GraphicDeviceInfo
    @NonNull
    public String getGlVersion() {
        return this.glVersion;
    }

    public int hashCode() {
        return this.eglExtensions.hashCode() ^ ((((((this.glVersion.hashCode() ^ 1000003) * 1000003) ^ this.eglVersion.hashCode()) * 1000003) ^ this.glExtensions.hashCode()) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GraphicDeviceInfo{glVersion=");
        sb.append(this.glVersion);
        sb.append(", eglVersion=");
        sb.append(this.eglVersion);
        sb.append(", glExtensions=");
        sb.append(this.glExtensions);
        sb.append(", eglExtensions=");
        return a$$ExternalSyntheticOutline0.m(sb, this.eglExtensions, StringSubstitutor.DEFAULT_VAR_END);
    }
}
