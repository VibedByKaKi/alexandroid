package androidx.camera.camera2.internal.compat.quirk;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.Quirk;
import androidx.camera.core.impl.Quirks;
import java.util.Iterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public interface CaptureIntentPreviewQuirk extends Quirk {
    static boolean workaroundByCaptureIntentPreview(@NonNull Quirks quirks) {
        Iterator it2 = quirks.getAll(CaptureIntentPreviewQuirk.class).iterator();
        while (it2.hasNext()) {
            if (((CaptureIntentPreviewQuirk) it2.next()).workaroundByCaptureIntentPreview()) {
                return true;
            }
        }
        return false;
    }

    default boolean workaroundByCaptureIntentPreview() {
        return true;
    }
}
