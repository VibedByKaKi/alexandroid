package androidx.camera.core;

import androidx.annotation.Nullable;
import androidx.camera.core.CameraState;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
final class AutoValue_CameraState_StateError extends CameraState.StateError {
    private final Throwable cause;
    private final int code;

    public AutoValue_CameraState_StateError(int i, @Nullable Throwable th) {
        this.code = i;
        this.cause = th;
    }

    public boolean equals(Object obj) {
        Throwable th;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CameraState.StateError) {
            CameraState.StateError stateError = (CameraState.StateError) obj;
            if (this.code == stateError.getCode() && ((th = this.cause) != null ? th.equals(stateError.getCause()) : stateError.getCause() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.CameraState.StateError
    @Nullable
    public Throwable getCause() {
        return this.cause;
    }

    @Override // androidx.camera.core.CameraState.StateError
    public int getCode() {
        return this.code;
    }

    public int hashCode() {
        int i = (this.code ^ 1000003) * 1000003;
        Throwable th = this.cause;
        return (th == null ? 0 : th.hashCode()) ^ i;
    }

    public String toString() {
        return "StateError{code=" + this.code + ", cause=" + this.cause + StringSubstitutor.DEFAULT_VAR_END;
    }
}
