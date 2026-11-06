package androidx.camera.extensions.internal;

import android.hardware.camera2.CameraCharacteristics;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.CameraInfoInternal;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class ExtensionsUtils {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @RequiresApi(28)
    public static class Api28Impl {
        private Api28Impl() {
        }

        public static Set<String> getPhysicalCameraIds(@NonNull CameraCharacteristics cameraCharacteristics) {
            try {
                return cameraCharacteristics.getPhysicalCameraIds();
            } catch (Exception unused) {
                return Collections.EMPTY_SET;
            }
        }
    }

    private ExtensionsUtils() {
    }

    @NonNull
    public static Map<String, CameraCharacteristics> getCameraCharacteristicsMap(@NonNull CameraInfoInternal cameraInfoInternal) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String cameraId = cameraInfoInternal.getCameraId();
        CameraCharacteristics cameraCharacteristics = (CameraCharacteristics) cameraInfoInternal.getCameraCharacteristics();
        linkedHashMap.put(cameraId, cameraCharacteristics);
        Set<String> physicalCameraIds = Api28Impl.getPhysicalCameraIds(cameraCharacteristics);
        if (physicalCameraIds != null) {
            for (String str : physicalCameraIds) {
                if (!Objects.equals(str, cameraId)) {
                    linkedHashMap.put(str, (CameraCharacteristics) cameraInfoInternal.getPhysicalCameraCharacteristics(str));
                }
            }
        }
        return linkedHashMap;
    }
}
