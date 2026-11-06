package androidx.camera.core.impl;

import android.os.Handler;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
final class AutoValue_CameraThreadConfig extends CameraThreadConfig {
    private final Executor cameraExecutor;
    private final Handler schedulerHandler;

    public AutoValue_CameraThreadConfig(Executor executor, Handler handler) {
        if (executor == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null cameraExecutor");
            throw null;
        }
        this.cameraExecutor = executor;
        if (handler != null) {
            this.schedulerHandler = handler;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null schedulerHandler");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CameraThreadConfig) {
            CameraThreadConfig cameraThreadConfig = (CameraThreadConfig) obj;
            if (this.cameraExecutor.equals(cameraThreadConfig.getCameraExecutor()) && this.schedulerHandler.equals(cameraThreadConfig.getSchedulerHandler())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.CameraThreadConfig
    @NonNull
    public Executor getCameraExecutor() {
        return this.cameraExecutor;
    }

    @Override // androidx.camera.core.impl.CameraThreadConfig
    @NonNull
    public Handler getSchedulerHandler() {
        return this.schedulerHandler;
    }

    public int hashCode() {
        return this.schedulerHandler.hashCode() ^ ((this.cameraExecutor.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.cameraExecutor + ", schedulerHandler=" + this.schedulerHandler + StringSubstitutor.DEFAULT_VAR_END;
    }
}
