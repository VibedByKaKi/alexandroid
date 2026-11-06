package androidx.camera.core;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.camera.core.impl.CaptureBundle;
import androidx.camera.core.impl.CaptureStage;
import java.util.Arrays;
import java.util.List;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class CaptureBundles {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class CaptureBundleImpl implements CaptureBundle {
        final List<CaptureStage> mCaptureStageList;

        public CaptureBundleImpl(List<CaptureStage> list) {
            if (list == null || list.isEmpty()) {
                Single$$ExternalSyntheticBUOutline0.m$3("Cannot set an empty CaptureStage list.");
                throw null;
            }
            this.mCaptureStageList = ErrorUtils$$ExternalSyntheticOutline0.m(list);
        }

        @Override // androidx.camera.core.impl.CaptureBundle
        public List<CaptureStage> getCaptureStages() {
            return this.mCaptureStageList;
        }
    }

    private CaptureBundles() {
    }

    @NonNull
    public static CaptureBundle createCaptureBundle(@NonNull CaptureStage... captureStageArr) {
        return new CaptureBundleImpl(Arrays.asList(captureStageArr));
    }

    @NonNull
    public static CaptureBundle singleDefaultCaptureBundle() {
        return createCaptureBundle(new CaptureStage.DefaultCaptureStage());
    }

    @NonNull
    public static CaptureBundle createCaptureBundle(@NonNull List<CaptureStage> list) {
        return new CaptureBundleImpl(list);
    }
}
