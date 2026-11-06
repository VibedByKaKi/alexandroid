package androidx.camera.core.internal.utils;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.utils.CompareSizesByArea;
import com.amazon.alexa.assistant.capability.legacyflags.LegacyFlags;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.joda.time.DateTimeConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final class SizeUtil {
    public static final Size RESOLUTION_ZERO = new Size(0, 0);
    public static final Size RESOLUTION_QVGA = new Size(320, 240);
    public static final Size RESOLUTION_VGA = new Size(640, 480);
    public static final Size RESOLUTION_480P = new Size(720, 480);
    public static final Size RESOLUTION_720P = new Size(1280, 720);
    public static final Size RESOLUTION_1080P = new Size(1920, LegacyFlags.DEFAULT_SCREEN_WIDTH);
    public static final Size RESOLUTION_1440P = new Size(1920, DateTimeConstants.MINUTES_PER_DAY);

    private SizeUtil() {
    }

    @Nullable
    public static <T> T findNearestHigherFor(@NonNull Size size, @NonNull TreeMap<Size, T> treeMap) {
        Map.Entry<Size, T> ceilingEntry = treeMap.ceilingEntry(size);
        if (ceilingEntry != null) {
            return ceilingEntry.getValue();
        }
        Map.Entry<Size, T> floorEntry = treeMap.floorEntry(size);
        if (floorEntry != null) {
            return floorEntry.getValue();
        }
        return null;
    }

    public static int getArea(@NonNull Size size) {
        return getArea(size.getWidth(), size.getHeight());
    }

    @Nullable
    public static Size getMaxSize(@NonNull List<Size> list) {
        if (list.isEmpty()) {
            return null;
        }
        return (Size) Collections.max(list, new CompareSizesByArea());
    }

    public static boolean isLongerInAnyEdge(@NonNull Size size, @NonNull Size size2) {
        return size.getWidth() > size2.getWidth() || size.getHeight() > size2.getHeight();
    }

    public static boolean isSmallerByArea(@NonNull Size size, @NonNull Size size2) {
        return getArea(size) < getArea(size2);
    }

    public static int getArea(int i, int i2) {
        return i * i2;
    }
}
