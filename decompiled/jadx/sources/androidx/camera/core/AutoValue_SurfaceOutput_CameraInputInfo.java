package androidx.camera.core;

import android.graphics.Rect;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.impl.CameraInternal;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
final class AutoValue_SurfaceOutput_CameraInputInfo extends SurfaceOutput.CameraInputInfo {
    private final CameraInternal cameraInternal;
    private final Rect inputCropRect;
    private final Size inputSize;
    private final boolean mirroring;
    private final int rotationDegrees;

    public AutoValue_SurfaceOutput_CameraInputInfo(Size size, Rect rect, @Nullable CameraInternal cameraInternal, int i, boolean z) {
        if (size == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null inputSize");
            throw null;
        }
        this.inputSize = size;
        if (rect == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null inputCropRect");
            throw null;
        }
        this.inputCropRect = rect;
        this.cameraInternal = cameraInternal;
        this.rotationDegrees = i;
        this.mirroring = z;
    }

    public boolean equals(Object obj) {
        CameraInternal cameraInternal;
        if (obj == this) {
            return true;
        }
        if (obj instanceof SurfaceOutput.CameraInputInfo) {
            SurfaceOutput.CameraInputInfo cameraInputInfo = (SurfaceOutput.CameraInputInfo) obj;
            if (this.inputSize.equals(cameraInputInfo.getInputSize()) && this.inputCropRect.equals(cameraInputInfo.getInputCropRect()) && ((cameraInternal = this.cameraInternal) != null ? cameraInternal.equals(cameraInputInfo.getCameraInternal()) : cameraInputInfo.getCameraInternal() == null) && this.rotationDegrees == cameraInputInfo.getRotationDegrees() && this.mirroring == cameraInputInfo.getMirroring()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.SurfaceOutput.CameraInputInfo
    @Nullable
    public CameraInternal getCameraInternal() {
        return this.cameraInternal;
    }

    @Override // androidx.camera.core.SurfaceOutput.CameraInputInfo
    @NonNull
    public Rect getInputCropRect() {
        return this.inputCropRect;
    }

    @Override // androidx.camera.core.SurfaceOutput.CameraInputInfo
    @NonNull
    public Size getInputSize() {
        return this.inputSize;
    }

    @Override // androidx.camera.core.SurfaceOutput.CameraInputInfo
    public boolean getMirroring() {
        return this.mirroring;
    }

    @Override // androidx.camera.core.SurfaceOutput.CameraInputInfo
    public int getRotationDegrees() {
        return this.rotationDegrees;
    }

    public int hashCode() {
        int hashCode = (((this.inputSize.hashCode() ^ 1000003) * 1000003) ^ this.inputCropRect.hashCode()) * 1000003;
        CameraInternal cameraInternal = this.cameraInternal;
        return (this.mirroring ? 1231 : 1237) ^ ((((hashCode ^ (cameraInternal == null ? 0 : cameraInternal.hashCode())) * 1000003) ^ this.rotationDegrees) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CameraInputInfo{inputSize=");
        sb.append(this.inputSize);
        sb.append(", inputCropRect=");
        sb.append(this.inputCropRect);
        sb.append(", cameraInternal=");
        sb.append(this.cameraInternal);
        sb.append(", rotationDegrees=");
        sb.append(this.rotationDegrees);
        sb.append(", mirroring=");
        return a$$ExternalSyntheticOutline0.m(sb, this.mirroring, StringSubstitutor.DEFAULT_VAR_END);
    }
}
