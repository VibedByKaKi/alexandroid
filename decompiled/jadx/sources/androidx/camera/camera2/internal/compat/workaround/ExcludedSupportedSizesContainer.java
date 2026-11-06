package androidx.camera.camera2.internal.compat.workaround;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class ExcludedSupportedSizesContainer {

    @NonNull
    private final String mCameraId;

    public ExcludedSupportedSizesContainer(@NonNull String str) {
        this.mCameraId = str;
    }

    @NonNull
    public List<Size> get(int i) {
        ExcludedSupportedSizesQuirk excludedSupportedSizesQuirk = (ExcludedSupportedSizesQuirk) DeviceQuirks.get(ExcludedSupportedSizesQuirk.class);
        return excludedSupportedSizesQuirk == null ? new ArrayList() : excludedSupportedSizesQuirk.getExcludedSizes(this.mCameraId, i);
    }

    @NonNull
    public List<Size> get(@NonNull Class<?> cls) {
        ExcludedSupportedSizesQuirk excludedSupportedSizesQuirk = (ExcludedSupportedSizesQuirk) DeviceQuirks.get(ExcludedSupportedSizesQuirk.class);
        if (excludedSupportedSizesQuirk == null) {
            return new ArrayList();
        }
        return excludedSupportedSizesQuirk.getExcludedSizes(this.mCameraId, cls);
    }
}
