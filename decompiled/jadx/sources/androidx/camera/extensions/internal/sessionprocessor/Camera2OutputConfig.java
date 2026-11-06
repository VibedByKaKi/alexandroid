package androidx.camera.extensions.internal.sessionprocessor;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
interface Camera2OutputConfig {
    int getId();

    @Nullable
    String getPhysicalCameraId();

    int getSurfaceGroupId();

    @NonNull
    List<Camera2OutputConfig> getSurfaceSharingOutputConfigs();
}
