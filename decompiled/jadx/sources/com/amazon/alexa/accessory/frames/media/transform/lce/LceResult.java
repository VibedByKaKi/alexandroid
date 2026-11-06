package com.amazon.alexa.accessory.frames.media.transform.lce;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.accessory.frames.metrics.media.LceRetoucherError;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class LceResult {

    @Nullable
    private final byte[] enhancedImageData;

    @Nullable
    private final LceRetoucherError error;

    @Nullable
    private final String errorMessage;
    private final boolean fastGuidedFilterUsed;
    private final boolean photoIntegrityReject;
    private final Status status;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Status {
        SUCCESS,
        FAILURE,
        SKIPPED
    }

    private LceResult(Status status, @Nullable byte[] bArr, @Nullable LceRetoucherError lceRetoucherError, @Nullable String str, boolean z, boolean z2) {
        this.status = status;
        this.enhancedImageData = bArr;
        this.error = lceRetoucherError;
        this.errorMessage = str;
        this.fastGuidedFilterUsed = z;
        this.photoIntegrityReject = z2;
    }

    @NonNull
    public static LceResult failure(@NonNull LceRetoucherError lceRetoucherError, @NonNull String str) {
        return new LceResult(Status.FAILURE, null, lceRetoucherError, str, false);
    }

    @NonNull
    public static LceResult photoIntegrityReject(@NonNull String str) {
        return new LceResult(Status.FAILURE, null, LceRetoucherError.OUTPUT_SANITY_CHECK_FAILED, str, false, true);
    }

    @NonNull
    public static LceResult skipped(@NonNull String str) {
        return new LceResult(Status.SKIPPED, null, null, str, false);
    }

    @NonNull
    public static LceResult success(@NonNull byte[] bArr, boolean z) {
        return new LceResult(Status.SUCCESS, bArr, null, null, z);
    }

    @Nullable
    public byte[] getEnhancedImageData() {
        return this.enhancedImageData;
    }

    @Nullable
    public LceRetoucherError getError() {
        return this.error;
    }

    @Nullable
    public String getErrorMessage() {
        return this.errorMessage;
    }

    @NonNull
    public Status getStatus() {
        return this.status;
    }

    public boolean isFastGuidedFilterUsed() {
        return this.fastGuidedFilterUsed;
    }

    public boolean isPhotoIntegrityReject() {
        return this.photoIntegrityReject;
    }

    public boolean isSuccess() {
        return this.status == Status.SUCCESS;
    }

    @NonNull
    public static LceResult success(@NonNull byte[] bArr) {
        return success(bArr, false);
    }

    private LceResult(Status status, @Nullable byte[] bArr, @Nullable LceRetoucherError lceRetoucherError, @Nullable String str, boolean z) {
        this(status, bArr, lceRetoucherError, str, z, false);
    }
}
