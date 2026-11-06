package androidx.camera.core;

import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class MirrorMode {
    public static final int MIRROR_MODE_OFF = 0;
    public static final int MIRROR_MODE_ON = 1;
    public static final int MIRROR_MODE_ON_FRONT_ONLY = 2;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final int MIRROR_MODE_UNSPECIFIED = -1;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface Mirror {
    }

    private MirrorMode() {
    }
}
