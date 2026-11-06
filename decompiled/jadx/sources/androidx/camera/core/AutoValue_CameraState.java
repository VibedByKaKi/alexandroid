package androidx.camera.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.CameraState;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
final class AutoValue_CameraState extends CameraState {
    private final CameraState.StateError error;
    private final CameraState.Type type;

    public AutoValue_CameraState(CameraState.Type type, @Nullable CameraState.StateError stateError) {
        if (type == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null type");
            throw null;
        }
        this.type = type;
        this.error = stateError;
    }

    public boolean equals(Object obj) {
        CameraState.StateError stateError;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CameraState) {
            CameraState cameraState = (CameraState) obj;
            if (this.type.equals(cameraState.getType()) && ((stateError = this.error) != null ? stateError.equals(cameraState.getError()) : cameraState.getError() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.CameraState
    @Nullable
    public CameraState.StateError getError() {
        return this.error;
    }

    @Override // androidx.camera.core.CameraState
    @NonNull
    public CameraState.Type getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = (this.type.hashCode() ^ 1000003) * 1000003;
        CameraState.StateError stateError = this.error;
        return (stateError == null ? 0 : stateError.hashCode()) ^ hashCode;
    }

    public String toString() {
        return "CameraState{type=" + this.type + ", error=" + this.error + StringSubstitutor.DEFAULT_VAR_END;
    }
}
