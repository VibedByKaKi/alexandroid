package androidx.camera.video;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.camera.video.Quality;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
final class AutoValue_Quality_ConstantQuality extends Quality.ConstantQuality {
    private final String name;
    private final List<Size> typicalSizes;
    private final int value;

    public AutoValue_Quality_ConstantQuality(int i, String str, List<Size> list) {
        this.value = i;
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null name");
            throw null;
        }
        this.name = str;
        if (list != null) {
            this.typicalSizes = list;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null typicalSizes");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Quality.ConstantQuality) {
            Quality.ConstantQuality constantQuality = (Quality.ConstantQuality) obj;
            if (this.value == constantQuality.getValue() && this.name.equals(constantQuality.getName()) && this.typicalSizes.equals(constantQuality.getTypicalSizes())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.video.Quality.ConstantQuality
    @NonNull
    public String getName() {
        return this.name;
    }

    @Override // androidx.camera.video.Quality.ConstantQuality
    @NonNull
    public List<Size> getTypicalSizes() {
        return this.typicalSizes;
    }

    @Override // androidx.camera.video.Quality.ConstantQuality
    public int getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.typicalSizes.hashCode() ^ ((((this.value ^ 1000003) * 1000003) ^ this.name.hashCode()) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ConstantQuality{value=");
        sb.append(this.value);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", typicalSizes=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(StringSubstitutor.DEFAULT_VAR_END, this.typicalSizes, sb);
    }
}
