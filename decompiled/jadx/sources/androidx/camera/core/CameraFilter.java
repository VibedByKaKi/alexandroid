package androidx.camera.core;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.Identifier;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public interface CameraFilter {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final Identifier DEFAULT_ID = Identifier.create(new Object());

    @NonNull
    List<CameraInfo> filter(@NonNull List<CameraInfo> list);

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    default Identifier getIdentifier() {
        return DEFAULT_ID;
    }
}
