package androidx.camera.core.streamsharing;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.CameraCaptureMetaData;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.TagBundle;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class VirtualCameraCaptureResult implements CameraCaptureResult {
    private static final long INVALID_TIMESTAMP = -1;

    @Nullable
    private final CameraCaptureResult mBaseCameraCaptureResult;

    @NonNull
    private final TagBundle mTagBundle;
    private final long mTimestamp;

    private VirtualCameraCaptureResult(@Nullable CameraCaptureResult cameraCaptureResult, @NonNull TagBundle tagBundle, long j) {
        this.mBaseCameraCaptureResult = cameraCaptureResult;
        this.mTagBundle = tagBundle;
        this.mTimestamp = j;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @NonNull
    public CameraCaptureMetaData.AeMode getAeMode() {
        CameraCaptureResult cameraCaptureResult = this.mBaseCameraCaptureResult;
        return cameraCaptureResult != null ? cameraCaptureResult.getAeMode() : CameraCaptureMetaData.AeMode.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @NonNull
    public CameraCaptureMetaData.AeState getAeState() {
        CameraCaptureResult cameraCaptureResult = this.mBaseCameraCaptureResult;
        return cameraCaptureResult != null ? cameraCaptureResult.getAeState() : CameraCaptureMetaData.AeState.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @NonNull
    public CameraCaptureMetaData.AfMode getAfMode() {
        CameraCaptureResult cameraCaptureResult = this.mBaseCameraCaptureResult;
        return cameraCaptureResult != null ? cameraCaptureResult.getAfMode() : CameraCaptureMetaData.AfMode.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @NonNull
    public CameraCaptureMetaData.AfState getAfState() {
        CameraCaptureResult cameraCaptureResult = this.mBaseCameraCaptureResult;
        return cameraCaptureResult != null ? cameraCaptureResult.getAfState() : CameraCaptureMetaData.AfState.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @NonNull
    public CameraCaptureMetaData.AwbMode getAwbMode() {
        CameraCaptureResult cameraCaptureResult = this.mBaseCameraCaptureResult;
        return cameraCaptureResult != null ? cameraCaptureResult.getAwbMode() : CameraCaptureMetaData.AwbMode.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @NonNull
    public CameraCaptureMetaData.AwbState getAwbState() {
        CameraCaptureResult cameraCaptureResult = this.mBaseCameraCaptureResult;
        return cameraCaptureResult != null ? cameraCaptureResult.getAwbState() : CameraCaptureMetaData.AwbState.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @NonNull
    public CameraCaptureMetaData.FlashState getFlashState() {
        CameraCaptureResult cameraCaptureResult = this.mBaseCameraCaptureResult;
        return cameraCaptureResult != null ? cameraCaptureResult.getFlashState() : CameraCaptureMetaData.FlashState.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @NonNull
    public TagBundle getTagBundle() {
        return this.mTagBundle;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public long getTimestamp() {
        CameraCaptureResult cameraCaptureResult = this.mBaseCameraCaptureResult;
        if (cameraCaptureResult != null) {
            return cameraCaptureResult.getTimestamp();
        }
        long j = this.mTimestamp;
        if (j != -1) {
            return j;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("No timestamp is available.");
        return 0L;
    }

    public VirtualCameraCaptureResult(@NonNull TagBundle tagBundle, long j) {
        this(null, tagBundle, j);
    }

    public VirtualCameraCaptureResult(@NonNull TagBundle tagBundle, @Nullable CameraCaptureResult cameraCaptureResult) {
        this(cameraCaptureResult, tagBundle, -1L);
    }
}
