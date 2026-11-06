package androidx.camera.core.internal.compat.quirk;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.Quirk;
import androidx.camera.core.impl.Quirks;
import java.util.Iterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public interface SurfaceProcessingQuirk extends Quirk {
    static boolean workaroundBySurfaceProcessing(@NonNull Quirks quirks) {
        Iterator it2 = quirks.getAll(SurfaceProcessingQuirk.class).iterator();
        while (it2.hasNext()) {
            if (((SurfaceProcessingQuirk) it2.next()).workaroundBySurfaceProcessing()) {
                return true;
            }
        }
        return false;
    }

    default boolean workaroundBySurfaceProcessing() {
        return true;
    }
}
