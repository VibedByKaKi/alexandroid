package com.amazon.photos.discovery.dedupe;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/amazon/photos/discovery/dedupe/DeduplicatorResult;", "", "itemsModified", "", "stageName", "", "(ILjava/lang/String;)V", "getItemsModified", "()I", "getStageName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "AndroidPhotosDiscovery_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DeduplicatorResult {
    private final int itemsModified;

    @NotNull
    private final String stageName;

    public DeduplicatorResult(int i, @NotNull String str) {
        str.getClass();
        this.itemsModified = i;
        this.stageName = str;
    }

    public static /* synthetic */ DeduplicatorResult copy$default(DeduplicatorResult deduplicatorResult, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = deduplicatorResult.itemsModified;
        }
        if ((i2 & 2) != 0) {
            str = deduplicatorResult.stageName;
        }
        return deduplicatorResult.copy(i, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getItemsModified() {
        return this.itemsModified;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getStageName() {
        return this.stageName;
    }

    @NotNull
    public final DeduplicatorResult copy(int itemsModified, @NotNull String stageName) {
        stageName.getClass();
        return new DeduplicatorResult(itemsModified, stageName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeduplicatorResult)) {
            return false;
        }
        DeduplicatorResult deduplicatorResult = (DeduplicatorResult) other;
        return this.itemsModified == deduplicatorResult.itemsModified && Intrinsics.areEqual(this.stageName, deduplicatorResult.stageName);
    }

    public final int getItemsModified() {
        return this.itemsModified;
    }

    @NotNull
    public final String getStageName() {
        return this.stageName;
    }

    public int hashCode() {
        return this.stageName.hashCode() + (Integer.hashCode(this.itemsModified) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("DeduplicatorResult(itemsModified=");
        sb.append(this.itemsModified);
        sb.append(", stageName=");
        return ArcMode$$ExternalSyntheticOutline0.m(')', this.stageName, sb);
    }
}
