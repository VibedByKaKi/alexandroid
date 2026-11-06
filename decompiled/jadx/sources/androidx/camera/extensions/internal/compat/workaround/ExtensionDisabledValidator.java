package androidx.camera.extensions.internal.compat.workaround;

import androidx.annotation.NonNull;
import androidx.camera.extensions.internal.compat.quirk.DeviceQuirks;
import androidx.camera.extensions.internal.compat.quirk.ExtensionDisabledQuirk;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class ExtensionDisabledValidator {
    private final ExtensionDisabledQuirk mQuirk = (ExtensionDisabledQuirk) DeviceQuirks.get(ExtensionDisabledQuirk.class);

    public boolean shouldDisableExtension(@NonNull String str) {
        ExtensionDisabledQuirk extensionDisabledQuirk = this.mQuirk;
        return extensionDisabledQuirk != null && extensionDisabledQuirk.shouldDisableExtension(str);
    }
}
