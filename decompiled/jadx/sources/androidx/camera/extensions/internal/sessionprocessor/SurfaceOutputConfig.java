package androidx.camera.extensions.internal.sessionprocessor;

import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes.dex */
public abstract class SurfaceOutputConfig implements Camera2OutputConfig {
    public static SurfaceOutputConfig create(int i, int i2, @Nullable String str, @NonNull List<Camera2OutputConfig> list, @NonNull Surface surface) {
        return new AutoValue_SurfaceOutputConfig(i, i2, str, list, surface);
    }

    @NonNull
    public abstract Surface getSurface();

    public static SurfaceOutputConfig create(int i, @NonNull Surface surface) {
        return create(i, -1, null, Collections.EMPTY_LIST, surface);
    }
}
