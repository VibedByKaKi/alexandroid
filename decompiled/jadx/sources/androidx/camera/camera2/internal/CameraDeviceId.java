package androidx.camera.camera2.internal;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes.dex */
abstract class CameraDeviceId {
    @NonNull
    public static CameraDeviceId create(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4) {
        return new AutoValue_CameraDeviceId(str.toLowerCase(), str2.toLowerCase(), str3.toLowerCase(), str4.toLowerCase());
    }

    @NonNull
    public abstract String getBrand();

    @NonNull
    public abstract String getCameraId();

    @NonNull
    public abstract String getDevice();

    @NonNull
    public abstract String getModel();
}
