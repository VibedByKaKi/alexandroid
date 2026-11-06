package androidx.camera.core.impl;

import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes.dex */
public abstract class OutputSurface {
    @NonNull
    public static OutputSurface create(@NonNull Surface surface, @NonNull Size size, int i) {
        return new AutoValue_OutputSurface(surface, size, i);
    }

    public abstract int getImageFormat();

    @NonNull
    public abstract Size getSize();

    @NonNull
    public abstract Surface getSurface();
}
