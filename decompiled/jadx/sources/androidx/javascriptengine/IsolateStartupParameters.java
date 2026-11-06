package androidx.javascriptengine;

import androidx.annotation.IntRange;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class IsolateStartupParameters {
    public static final long AUTOMATIC_MAX_HEAP_SIZE = 0;
    public static final int DEFAULT_MAX_EVALUATION_RETURN_SIZE_BYTES = 20971520;
    private long mMaxHeapSizeBytes = 0;
    private int mMaxEvaluationReturnSizeBytes = DEFAULT_MAX_EVALUATION_RETURN_SIZE_BYTES;

    @IntRange(from = 0)
    public int getMaxEvaluationReturnSizeBytes() {
        return this.mMaxEvaluationReturnSizeBytes;
    }

    @IntRange(from = 0)
    public long getMaxHeapSizeBytes() {
        return this.mMaxHeapSizeBytes;
    }

    public void setMaxEvaluationReturnSizeBytes(@IntRange(from = 0) int i) {
        if (i >= 0) {
            this.mMaxEvaluationReturnSizeBytes = i;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("maxEvaluationReturnSizeBytes must be >= 0");
        }
    }

    public void setMaxHeapSizeBytes(@IntRange(from = 0) long j) {
        if (j >= 0) {
            this.mMaxHeapSizeBytes = j;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("maxHeapSizeBytes should be >= 0");
        }
    }
}
