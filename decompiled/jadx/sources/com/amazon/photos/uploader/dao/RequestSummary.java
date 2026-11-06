package com.amazon.photos.uploader.dao;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/amazon/photos/uploader/dao/RequestSummary;", "", "count", "", "totalSize", "", "(IJ)V", "getCount", "()I", "setCount", "(I)V", "getTotalSize", "()J", "setTotalSize", "(J)V", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RequestSummary {
    private int count;
    private long totalSize;

    public RequestSummary(int i, long j) {
        this.count = i;
        this.totalSize = j;
    }

    public static /* synthetic */ RequestSummary copy$default(RequestSummary requestSummary, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = requestSummary.count;
        }
        if ((i2 & 2) != 0) {
            j = requestSummary.totalSize;
        }
        return requestSummary.copy(i, j);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* renamed from: component2, reason: from getter */
    public final long getTotalSize() {
        return this.totalSize;
    }

    @NotNull
    public final RequestSummary copy(int count, long totalSize) {
        return new RequestSummary(count, totalSize);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequestSummary)) {
            return false;
        }
        RequestSummary requestSummary = (RequestSummary) other;
        return this.count == requestSummary.count && this.totalSize == requestSummary.totalSize;
    }

    public final int getCount() {
        return this.count;
    }

    public final long getTotalSize() {
        return this.totalSize;
    }

    public int hashCode() {
        return Long.hashCode(this.totalSize) + (Integer.hashCode(this.count) * 31);
    }

    public final void setCount(int i) {
        this.count = i;
    }

    public final void setTotalSize(long j) {
        this.totalSize = j;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("RequestSummary(count=");
        sb.append(this.count);
        sb.append(", totalSize=");
        return DoubleList$$ExternalSyntheticOutline0.m(sb, this.totalSize, ')');
    }
}
