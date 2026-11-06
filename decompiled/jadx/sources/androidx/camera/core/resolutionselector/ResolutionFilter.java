package androidx.camera.core.resolutionselector;

import android.util.Size;
import androidx.annotation.NonNull;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public interface ResolutionFilter {
    @NonNull
    List<Size> filter(@NonNull List<Size> list, int i);
}
