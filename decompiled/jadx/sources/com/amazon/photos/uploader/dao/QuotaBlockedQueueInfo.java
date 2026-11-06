package com.amazon.photos.uploader.dao;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/photos/uploader/dao/QuotaBlockedQueueInfo;", "", "queue", "", "uploadCategory", "(Ljava/lang/String;Ljava/lang/String;)V", "getQueue", "()Ljava/lang/String;", "getUploadCategory", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class QuotaBlockedQueueInfo {

    @NotNull
    private final String queue;

    @NotNull
    private final String uploadCategory;

    public QuotaBlockedQueueInfo(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.queue = str;
        this.uploadCategory = str2;
    }

    public static /* synthetic */ QuotaBlockedQueueInfo copy$default(QuotaBlockedQueueInfo quotaBlockedQueueInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = quotaBlockedQueueInfo.queue;
        }
        if ((i & 2) != 0) {
            str2 = quotaBlockedQueueInfo.uploadCategory;
        }
        return quotaBlockedQueueInfo.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getQueue() {
        return this.queue;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getUploadCategory() {
        return this.uploadCategory;
    }

    @NotNull
    public final QuotaBlockedQueueInfo copy(@NotNull String queue, @NotNull String uploadCategory) {
        queue.getClass();
        uploadCategory.getClass();
        return new QuotaBlockedQueueInfo(queue, uploadCategory);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuotaBlockedQueueInfo)) {
            return false;
        }
        QuotaBlockedQueueInfo quotaBlockedQueueInfo = (QuotaBlockedQueueInfo) other;
        return Intrinsics.areEqual(this.queue, quotaBlockedQueueInfo.queue) && Intrinsics.areEqual(this.uploadCategory, quotaBlockedQueueInfo.uploadCategory);
    }

    @NotNull
    public final String getQueue() {
        return this.queue;
    }

    @NotNull
    public final String getUploadCategory() {
        return this.uploadCategory;
    }

    public int hashCode() {
        return this.uploadCategory.hashCode() + (this.queue.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("QuotaBlockedQueueInfo(queue=");
        sb.append(this.queue);
        sb.append(", uploadCategory=");
        return ArcMode$$ExternalSyntheticOutline0.m(')', this.uploadCategory, sb);
    }
}
