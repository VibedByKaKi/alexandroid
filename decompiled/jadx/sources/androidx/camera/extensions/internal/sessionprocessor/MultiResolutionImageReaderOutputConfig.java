package androidx.camera.extensions.internal.sessionprocessor;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes.dex */
public abstract class MultiResolutionImageReaderOutputConfig implements Camera2OutputConfig {
    public static MultiResolutionImageReaderOutputConfig create(int i, int i2, @Nullable String str, @NonNull List<Camera2OutputConfig> list, int i3, int i4) {
        return new AutoValue_MultiResolutionImageReaderOutputConfig(i, i2, str, list, i3, i4);
    }

    public abstract int getImageFormat();

    public abstract int getMaxImages();
}
