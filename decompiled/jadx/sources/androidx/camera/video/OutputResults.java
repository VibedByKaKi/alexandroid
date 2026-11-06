package androidx.camera.video;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.core.util.Preconditions;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes.dex */
public abstract class OutputResults {
    @NonNull
    public static OutputResults of(@NonNull Uri uri) {
        Preconditions.checkNotNull(uri, "OutputUri cannot be null.");
        return new AutoValue_OutputResults(uri);
    }

    @NonNull
    public abstract Uri getOutputUri();
}
