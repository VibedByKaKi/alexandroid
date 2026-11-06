package androidx.camera.core.internal.compat.quirk;

import android.util.Range;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.Quirk;
import androidx.camera.core.impl.StreamSpec;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public interface AeFpsRangeQuirk extends Quirk {
    @NonNull
    default Range<Integer> getTargetAeFpsRange() {
        return StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
    }
}
