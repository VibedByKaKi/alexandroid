package dagger.spi.model;

import dagger.spi.shaded.androidx.room.compiler.processing.XProcessingEnv;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
final class AutoValue_DaggerProcessingEnv extends DaggerProcessingEnv {
    private final XProcessingEnv xprocessing;

    public AutoValue_DaggerProcessingEnv(XProcessingEnv xProcessingEnv) {
        if (xProcessingEnv != null) {
            this.xprocessing = xProcessingEnv;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null xprocessing");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DaggerProcessingEnv) {
            return this.xprocessing.equals(((DaggerProcessingEnv) obj).xprocessing());
        }
        return false;
    }

    public int hashCode() {
        return this.xprocessing.hashCode() ^ 1000003;
    }

    public String toString() {
        return "DaggerProcessingEnv{xprocessing=" + this.xprocessing + StringSubstitutor.DEFAULT_VAR_END;
    }

    @Override // dagger.spi.model.DaggerProcessingEnv
    public XProcessingEnv xprocessing() {
        return this.xprocessing;
    }
}
