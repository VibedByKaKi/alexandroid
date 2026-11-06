package com.amazon.photos.uploader;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/amazon/photos/uploader/UploadProgress;", "", "progress", "", "maxProgress", "(JJ)V", "getMaxProgress", "()J", "getProgress", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UploadProgress {
    private final long maxProgress;
    private final long progress;

    public UploadProgress(long j, long j2) {
        this.progress = j;
        this.maxProgress = j2;
    }

    public static /* synthetic */ UploadProgress copy$default(UploadProgress uploadProgress, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = uploadProgress.progress;
        }
        if ((i & 2) != 0) {
            j2 = uploadProgress.maxProgress;
        }
        return uploadProgress.copy(j, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getProgress() {
        return this.progress;
    }

    /* renamed from: component2, reason: from getter */
    public final long getMaxProgress() {
        return this.maxProgress;
    }

    @NotNull
    public final UploadProgress copy(long progress, long maxProgress) {
        return new UploadProgress(progress, maxProgress);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadProgress)) {
            return false;
        }
        UploadProgress uploadProgress = (UploadProgress) other;
        return this.progress == uploadProgress.progress && this.maxProgress == uploadProgress.maxProgress;
    }

    public final long getMaxProgress() {
        return this.maxProgress;
    }

    public final long getProgress() {
        return this.progress;
    }

    public int hashCode() {
        return Long.hashCode(this.maxProgress) + (Long.hashCode(this.progress) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("UploadProgress(progress=");
        sb.append(this.progress);
        sb.append(", maxProgress=");
        return DoubleList$$ExternalSyntheticOutline0.m(sb, this.maxProgress, ')');
    }
}
