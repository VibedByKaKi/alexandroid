package androidx.camera.extensions.internal.sessionprocessor;

import androidx.annotation.NonNull;
import androidx.camera.extensions.impl.advanced.Camera2OutputConfigImpl;
import androidx.camera.extensions.impl.advanced.ImageReaderOutputConfigImpl;
import androidx.camera.extensions.impl.advanced.MultiResolutionImageReaderOutputConfigImpl;
import androidx.camera.extensions.impl.advanced.SurfaceOutputConfigImpl;
import java.util.ArrayList;
import java.util.Iterator;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
class Camera2OutputConfigConverter {
    private Camera2OutputConfigConverter() {
    }

    @NonNull
    public static Camera2OutputConfig fromImpl(@NonNull Camera2OutputConfigImpl camera2OutputConfigImpl) {
        ArrayList arrayList = new ArrayList();
        if (camera2OutputConfigImpl.getSurfaceSharingOutputConfigs() != null) {
            Iterator it2 = camera2OutputConfigImpl.getSurfaceSharingOutputConfigs().iterator();
            while (it2.hasNext()) {
                arrayList.add(fromImpl((Camera2OutputConfigImpl) it2.next()));
            }
        }
        try {
            try {
                try {
                    SurfaceOutputConfigImpl surfaceOutputConfigImpl = (SurfaceOutputConfigImpl) camera2OutputConfigImpl;
                    return SurfaceOutputConfig.create(surfaceOutputConfigImpl.getId(), surfaceOutputConfigImpl.getSurfaceGroupId(), surfaceOutputConfigImpl.getPhysicalCameraId(), arrayList, surfaceOutputConfigImpl.getSurface());
                } catch (ClassCastException unused) {
                    Buffer$$ExternalSyntheticBUOutline0.m$3(camera2OutputConfigImpl.getClass(), "Not supported Camera2OutputConfigImpl: ");
                    return null;
                }
            } catch (ClassCastException unused2) {
                MultiResolutionImageReaderOutputConfigImpl multiResolutionImageReaderOutputConfigImpl = (MultiResolutionImageReaderOutputConfigImpl) camera2OutputConfigImpl;
                return MultiResolutionImageReaderOutputConfig.create(multiResolutionImageReaderOutputConfigImpl.getId(), multiResolutionImageReaderOutputConfigImpl.getSurfaceGroupId(), multiResolutionImageReaderOutputConfigImpl.getPhysicalCameraId(), arrayList, multiResolutionImageReaderOutputConfigImpl.getImageFormat(), multiResolutionImageReaderOutputConfigImpl.getMaxImages());
            }
        } catch (ClassCastException unused3) {
            ImageReaderOutputConfigImpl imageReaderOutputConfigImpl = (ImageReaderOutputConfigImpl) camera2OutputConfigImpl;
            return ImageReaderOutputConfig.create(imageReaderOutputConfigImpl.getId(), imageReaderOutputConfigImpl.getSurfaceGroupId(), imageReaderOutputConfigImpl.getPhysicalCameraId(), arrayList, imageReaderOutputConfigImpl.getSize(), imageReaderOutputConfigImpl.getImageFormat(), imageReaderOutputConfigImpl.getMaxImages());
        }
    }
}
