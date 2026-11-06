package androidx.camera.core.processing.concurrent;

import androidx.annotation.NonNull;
import androidx.camera.core.processing.util.OutConfig;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes.dex */
public abstract class DualOutConfig {
    @NonNull
    public static DualOutConfig of(@NonNull OutConfig outConfig, @NonNull OutConfig outConfig2) {
        return new AutoValue_DualOutConfig(outConfig, outConfig2);
    }

    @NonNull
    public abstract OutConfig getPrimaryOutConfig();

    @NonNull
    public abstract OutConfig getSecondaryOutConfig();
}
