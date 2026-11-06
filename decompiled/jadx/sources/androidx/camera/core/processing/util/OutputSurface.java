package androidx.camera.core.processing.util;

import android.opengl.EGLSurface;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public abstract class OutputSurface {
    @NonNull
    public static OutputSurface of(@NonNull EGLSurface eGLSurface, int i, int i2) {
        return new AutoValue_OutputSurface(eGLSurface, i, i2);
    }

    @NonNull
    public abstract EGLSurface getEglSurface();

    public abstract int getHeight();

    public abstract int getWidth();
}
