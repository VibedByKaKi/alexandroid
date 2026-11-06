package androidx.camera.extensions;

import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final class ExtensionMode {
    public static final int AUTO = 5;
    public static final int BOKEH = 1;
    public static final int FACE_RETOUCH = 4;
    public static final int HDR = 2;
    public static final int NIGHT = 3;
    public static final int NONE = 0;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface Mode {
    }

    private ExtensionMode() {
    }
}
