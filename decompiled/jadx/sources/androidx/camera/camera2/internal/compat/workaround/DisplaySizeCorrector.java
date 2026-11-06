package androidx.camera.camera2.internal.compat.workaround;

import android.util.Size;
import androidx.annotation.Nullable;
import androidx.camera.camera2.internal.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class DisplaySizeCorrector {

    @Nullable
    private final SmallDisplaySizeQuirk mSmallDisplaySizeQuirk = (SmallDisplaySizeQuirk) DeviceQuirks.get(SmallDisplaySizeQuirk.class);

    @Nullable
    public Size getDisplaySize() {
        SmallDisplaySizeQuirk smallDisplaySizeQuirk = this.mSmallDisplaySizeQuirk;
        if (smallDisplaySizeQuirk != null) {
            return smallDisplaySizeQuirk.getDisplaySize();
        }
        return null;
    }
}
