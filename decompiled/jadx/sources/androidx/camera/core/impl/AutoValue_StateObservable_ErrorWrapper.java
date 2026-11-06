package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.StateObservable;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
final class AutoValue_StateObservable_ErrorWrapper extends StateObservable.ErrorWrapper {
    private final Throwable error;

    public AutoValue_StateObservable_ErrorWrapper(Throwable th) {
        if (th != null) {
            this.error = th;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null error");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StateObservable.ErrorWrapper) {
            return this.error.equals(((StateObservable.ErrorWrapper) obj).getError());
        }
        return false;
    }

    @Override // androidx.camera.core.impl.StateObservable.ErrorWrapper
    @NonNull
    public Throwable getError() {
        return this.error;
    }

    public int hashCode() {
        return this.error.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ErrorWrapper{error=" + this.error + StringSubstitutor.DEFAULT_VAR_END;
    }
}
