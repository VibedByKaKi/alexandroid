package com.amazon.photos.discovery.internal.model;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.photos.discovery.model.ItemType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/amazon/photos/discovery/internal/model/ItemTypeCount;", "", "itemType", "Lcom/amazon/photos/discovery/model/ItemType;", "count", "", "(Lcom/amazon/photos/discovery/model/ItemType;I)V", "getCount", "()I", "getItemType", "()Lcom/amazon/photos/discovery/model/ItemType;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "", "AndroidPhotosDiscovery_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ItemTypeCount {
    private final int count;

    @NotNull
    private final ItemType itemType;

    public ItemTypeCount(@NotNull ItemType itemType, int i) {
        itemType.getClass();
        this.itemType = itemType;
        this.count = i;
    }

    public static /* synthetic */ ItemTypeCount copy$default(ItemTypeCount itemTypeCount, ItemType itemType, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            itemType = itemTypeCount.itemType;
        }
        if ((i2 & 2) != 0) {
            i = itemTypeCount.count;
        }
        return itemTypeCount.copy(itemType, i);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ItemType getItemType() {
        return this.itemType;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    @NotNull
    public final ItemTypeCount copy(@NotNull ItemType itemType, int count) {
        itemType.getClass();
        return new ItemTypeCount(itemType, count);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemTypeCount)) {
            return false;
        }
        ItemTypeCount itemTypeCount = (ItemTypeCount) other;
        return this.itemType == itemTypeCount.itemType && this.count == itemTypeCount.count;
    }

    public final int getCount() {
        return this.count;
    }

    @NotNull
    public final ItemType getItemType() {
        return this.itemType;
    }

    public int hashCode() {
        return Integer.hashCode(this.count) + (this.itemType.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("ItemTypeCount(itemType=");
        sb.append(this.itemType);
        sb.append(", count=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.count, ')');
    }
}
