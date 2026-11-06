package androidx.camera.camera2.internal;

import androidx.annotation.NonNull;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
final class AutoValue_CameraDeviceId extends CameraDeviceId {
    private final String brand;
    private final String cameraId;
    private final String device;
    private final String model;

    public AutoValue_CameraDeviceId(String str, String str2, String str3, String str4) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null brand");
            throw null;
        }
        this.brand = str;
        if (str2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null device");
            throw null;
        }
        this.device = str2;
        if (str3 == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null model");
            throw null;
        }
        this.model = str3;
        if (str4 != null) {
            this.cameraId = str4;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null cameraId");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CameraDeviceId) {
            CameraDeviceId cameraDeviceId = (CameraDeviceId) obj;
            if (this.brand.equals(cameraDeviceId.getBrand()) && this.device.equals(cameraDeviceId.getDevice()) && this.model.equals(cameraDeviceId.getModel()) && this.cameraId.equals(cameraDeviceId.getCameraId())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.camera2.internal.CameraDeviceId
    @NonNull
    public String getBrand() {
        return this.brand;
    }

    @Override // androidx.camera.camera2.internal.CameraDeviceId
    @NonNull
    public String getCameraId() {
        return this.cameraId;
    }

    @Override // androidx.camera.camera2.internal.CameraDeviceId
    @NonNull
    public String getDevice() {
        return this.device;
    }

    @Override // androidx.camera.camera2.internal.CameraDeviceId
    @NonNull
    public String getModel() {
        return this.model;
    }

    public int hashCode() {
        return this.cameraId.hashCode() ^ ((((((this.brand.hashCode() ^ 1000003) * 1000003) ^ this.device.hashCode()) * 1000003) ^ this.model.hashCode()) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CameraDeviceId{brand=");
        sb.append(this.brand);
        sb.append(", device=");
        sb.append(this.device);
        sb.append(", model=");
        sb.append(this.model);
        sb.append(", cameraId=");
        return a$$ExternalSyntheticOutline0.m(sb, this.cameraId, StringSubstitutor.DEFAULT_VAR_END);
    }
}
