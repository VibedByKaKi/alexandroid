package androidx.camera.core.impl;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.DynamicRange;
import androidx.core.util.Preconditions;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public interface CameraInfoInternal extends CameraInfo {
    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default List lambda$getCameraSelector$0(List list) {
        String cameraId = getCameraId();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            CameraInfo cameraInfo = (CameraInfo) it2.next();
            Preconditions.checkArgument(cameraInfo instanceof CameraInfoInternal);
            if (((CameraInfoInternal) cameraInfo).getCameraId().equals(cameraId)) {
                return Collections.singletonList(cameraInfo);
            }
        }
        Single$$ExternalSyntheticBUOutline0.m$2(a$$ExternalSyntheticOutline0.m("Unable to find camera with id ", cameraId, " from list of available cameras."));
        return null;
    }

    void addSessionCaptureCallback(@NonNull Executor executor, @NonNull CameraCaptureCallback cameraCaptureCallback);

    @NonNull
    Object getCameraCharacteristics();

    @NonNull
    String getCameraId();

    @NonNull
    Quirks getCameraQuirks();

    @Override // androidx.camera.core.CameraInfo
    @NonNull
    default CameraSelector getCameraSelector() {
        return new CameraSelector.Builder().addCameraFilter(new CameraInfoInternal$$ExternalSyntheticLambda0(this, 0)).addCameraFilter(new LensFacingCameraFilter(getLensFacing())).build();
    }

    @NonNull
    EncoderProfilesProvider getEncoderProfilesProvider();

    @Nullable
    Object getPhysicalCameraCharacteristics(@NonNull String str);

    @NonNull
    Set<DynamicRange> getSupportedDynamicRanges();

    @NonNull
    List<Size> getSupportedHighResolutions(int i);

    @NonNull
    Set<Integer> getSupportedOutputFormats();

    @NonNull
    List<Size> getSupportedResolutions(int i);

    @NonNull
    Timebase getTimebase();

    default boolean isCaptureProcessProgressSupported() {
        return false;
    }

    default boolean isPostviewSupported() {
        return false;
    }

    boolean isPreviewStabilizationSupported();

    boolean isVideoStabilizationSupported();

    void removeSessionCaptureCallback(@NonNull CameraCaptureCallback cameraCaptureCallback);

    @NonNull
    default CameraInfoInternal getImplementation() {
        return this;
    }
}
