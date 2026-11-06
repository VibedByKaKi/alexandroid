package androidx.camera.video;

import android.net.Uri;
import androidx.annotation.NonNull;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
final class AutoValue_OutputResults extends OutputResults {
    private final Uri outputUri;

    public AutoValue_OutputResults(Uri uri) {
        if (uri != null) {
            this.outputUri = uri;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null outputUri");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OutputResults) {
            return this.outputUri.equals(((OutputResults) obj).getOutputUri());
        }
        return false;
    }

    @Override // androidx.camera.video.OutputResults
    @NonNull
    public Uri getOutputUri() {
        return this.outputUri;
    }

    public int hashCode() {
        return this.outputUri.hashCode() ^ 1000003;
    }

    public String toString() {
        return "OutputResults{outputUri=" + this.outputUri + StringSubstitutor.DEFAULT_VAR_END;
    }
}
