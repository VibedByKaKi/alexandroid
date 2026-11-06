package androidx.camera.core.processing.concurrent;

import androidx.annotation.NonNull;
import androidx.camera.core.processing.util.OutConfig;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
final class AutoValue_DualOutConfig extends DualOutConfig {
    private final OutConfig primaryOutConfig;
    private final OutConfig secondaryOutConfig;

    public AutoValue_DualOutConfig(OutConfig outConfig, OutConfig outConfig2) {
        if (outConfig == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null primaryOutConfig");
            throw null;
        }
        this.primaryOutConfig = outConfig;
        if (outConfig2 != null) {
            this.secondaryOutConfig = outConfig2;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null secondaryOutConfig");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DualOutConfig) {
            DualOutConfig dualOutConfig = (DualOutConfig) obj;
            if (this.primaryOutConfig.equals(dualOutConfig.getPrimaryOutConfig()) && this.secondaryOutConfig.equals(dualOutConfig.getSecondaryOutConfig())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.processing.concurrent.DualOutConfig
    @NonNull
    public OutConfig getPrimaryOutConfig() {
        return this.primaryOutConfig;
    }

    @Override // androidx.camera.core.processing.concurrent.DualOutConfig
    @NonNull
    public OutConfig getSecondaryOutConfig() {
        return this.secondaryOutConfig;
    }

    public int hashCode() {
        return this.secondaryOutConfig.hashCode() ^ ((this.primaryOutConfig.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "DualOutConfig{primaryOutConfig=" + this.primaryOutConfig + ", secondaryOutConfig=" + this.secondaryOutConfig + StringSubstitutor.DEFAULT_VAR_END;
    }
}
