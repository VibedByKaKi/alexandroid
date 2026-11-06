package androidx.camera.extensions.internal.sessionprocessor;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes.dex */
public abstract class ImageReaderOutputConfig implements Camera2OutputConfig {
    public static ImageReaderOutputConfig create(int i, @NonNull Size size, int i2, int i3) {
        return new AutoValue_ImageReaderOutputConfig(i, -1, null, Collections.EMPTY_LIST, size, i2, i3);
    }

    public abstract int getImageFormat();

    public abstract int getMaxImages();

    @NonNull
    public abstract Size getSize();

    public static ImageReaderOutputConfig create(int i, int i2, @Nullable String str, @NonNull List<Camera2OutputConfig> list, @NonNull Size size, int i3, int i4) {
        return new AutoValue_ImageReaderOutputConfig(i, i2, str, list, size, i3, i4);
    }
}
