package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.SurfaceConfig;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
final class AutoValue_SurfaceConfig extends SurfaceConfig {
    private final SurfaceConfig.ConfigSize configSize;
    private final SurfaceConfig.ConfigType configType;
    private final long streamUseCase;

    public AutoValue_SurfaceConfig(SurfaceConfig.ConfigType configType, SurfaceConfig.ConfigSize configSize, long j) {
        if (configType == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null configType");
            throw null;
        }
        this.configType = configType;
        if (configSize == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null configSize");
            throw null;
        }
        this.configSize = configSize;
        this.streamUseCase = j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SurfaceConfig) {
            SurfaceConfig surfaceConfig = (SurfaceConfig) obj;
            if (this.configType.equals(surfaceConfig.getConfigType()) && this.configSize.equals(surfaceConfig.getConfigSize()) && this.streamUseCase == surfaceConfig.getStreamUseCase()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.SurfaceConfig
    @NonNull
    public SurfaceConfig.ConfigSize getConfigSize() {
        return this.configSize;
    }

    @Override // androidx.camera.core.impl.SurfaceConfig
    @NonNull
    public SurfaceConfig.ConfigType getConfigType() {
        return this.configType;
    }

    @Override // androidx.camera.core.impl.SurfaceConfig
    public long getStreamUseCase() {
        return this.streamUseCase;
    }

    public int hashCode() {
        int hashCode = (((this.configType.hashCode() ^ 1000003) * 1000003) ^ this.configSize.hashCode()) * 1000003;
        long j = this.streamUseCase;
        return ((int) (j ^ (j >>> 32))) ^ hashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SurfaceConfig{configType=");
        sb.append(this.configType);
        sb.append(", configSize=");
        sb.append(this.configSize);
        sb.append(", streamUseCase=");
        return a$$ExternalSyntheticOutline0.m(this.streamUseCase, StringSubstitutor.DEFAULT_VAR_END, sb);
    }
}
