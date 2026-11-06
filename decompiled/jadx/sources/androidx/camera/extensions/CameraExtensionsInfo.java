package androidx.camera.extensions;

import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public interface CameraExtensionsInfo {
    @Nullable
    default LiveData<Integer> getCurrentExtensionMode() {
        return null;
    }

    @Nullable
    default LiveData<Integer> getExtensionStrength() {
        return null;
    }

    default boolean isCurrentExtensionModeAvailable() {
        return false;
    }

    default boolean isExtensionStrengthAvailable() {
        return false;
    }
}
