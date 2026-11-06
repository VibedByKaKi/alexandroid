package androidx.camera.core.impl.utils;

import android.util.Size;
import androidx.annotation.NonNull;
import java.util.Comparator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final class CompareSizesByArea implements Comparator<Size> {
    private boolean mReverse;

    public CompareSizesByArea(boolean z) {
        this.mReverse = z;
    }

    @Override // java.util.Comparator
    public int compare(@NonNull Size size, @NonNull Size size2) {
        int signum = Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
        return this.mReverse ? signum * (-1) : signum;
    }

    public CompareSizesByArea() {
        this(false);
    }
}
