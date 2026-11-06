package com.amazon.photos.discovery.model;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import androidx.room.ColumnInfo;
import androidx.room.DatabaseView;
import androidx.room.Relation;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.photos.discovery.internal.model.MutableCloudItem;
import com.amazon.photos.discovery.internal.model.MutableLocalItem;
import com.amazon.photos.discovery.internal.worker.DedupeWorkerKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DatabaseView("SELECT u.id, u.date_taken, u.date_uploaded, u.type, u.dedupe_stage FROM unified_item u LEFT JOIN (SELECT * FROM local_item) l ON l.unified_id = u.id LEFT JOIN (SELECT * FROM cloud_item) c ON c.unified_id = u.id ORDER BY u.id DESC")
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b¢\u0006\u0002\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bHÆ\u0003J[\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\tHÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011¨\u0006)"}, d2 = {"Lcom/amazon/photos/discovery/model/UnifiedItem;", "", "id", "", "itemType", "Lcom/amazon/photos/discovery/model/ItemType;", "dateTaken", "dateUploaded", "dedupeStage", "", "localItems", "", "Lcom/amazon/photos/discovery/model/LocalItem;", "cloudItems", "Lcom/amazon/photos/discovery/model/CloudItem;", "(JLcom/amazon/photos/discovery/model/ItemType;JJILjava/util/List;Ljava/util/List;)V", "getCloudItems", "()Ljava/util/List;", "getDateTaken", "()J", "getDateUploaded", "getDedupeStage", "()I", "getId", "getItemType", "()Lcom/amazon/photos/discovery/model/ItemType;", "getLocalItems", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "", "AndroidPhotosDiscovery_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UnifiedItem {

    @Relation(entity = MutableCloudItem.class, entityColumn = "unified_id", parentColumn = "id")
    @NotNull
    private final List<CloudItem> cloudItems;

    @ColumnInfo(name = "date_taken")
    private final long dateTaken;

    @ColumnInfo(name = "date_uploaded")
    private final long dateUploaded;

    @ColumnInfo(name = DedupeWorkerKt.PARAM_DEDUPE_STAGE_ID)
    private final int dedupeStage;

    @ColumnInfo(name = "id")
    private final long id;

    @ColumnInfo(name = "type")
    @NotNull
    private final ItemType itemType;

    @Relation(entity = MutableLocalItem.class, entityColumn = "unified_id", parentColumn = "id")
    @NotNull
    private final List<LocalItem> localItems;

    public UnifiedItem(long j, @NotNull ItemType itemType, long j2, long j3, int i, @NotNull List<LocalItem> list, @NotNull List<CloudItem> list2) {
        itemType.getClass();
        list.getClass();
        list2.getClass();
        this.id = j;
        this.itemType = itemType;
        this.dateTaken = j2;
        this.dateUploaded = j3;
        this.dedupeStage = i;
        this.localItems = list;
        this.cloudItems = list2;
    }

    public static /* synthetic */ UnifiedItem copy$default(UnifiedItem unifiedItem, long j, ItemType itemType, long j2, long j3, int i, List list, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = unifiedItem.id;
        }
        long j4 = j;
        if ((i2 & 2) != 0) {
            itemType = unifiedItem.itemType;
        }
        return unifiedItem.copy(j4, itemType, (i2 & 4) != 0 ? unifiedItem.dateTaken : j2, (i2 & 8) != 0 ? unifiedItem.dateUploaded : j3, (i2 & 16) != 0 ? unifiedItem.dedupeStage : i, (i2 & 32) != 0 ? unifiedItem.localItems : list, (i2 & 64) != 0 ? unifiedItem.cloudItems : list2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ItemType getItemType() {
        return this.itemType;
    }

    /* renamed from: component3, reason: from getter */
    public final long getDateTaken() {
        return this.dateTaken;
    }

    /* renamed from: component4, reason: from getter */
    public final long getDateUploaded() {
        return this.dateUploaded;
    }

    /* renamed from: component5, reason: from getter */
    public final int getDedupeStage() {
        return this.dedupeStage;
    }

    @NotNull
    public final List<LocalItem> component6() {
        return this.localItems;
    }

    @NotNull
    public final List<CloudItem> component7() {
        return this.cloudItems;
    }

    @NotNull
    public final UnifiedItem copy(long id, @NotNull ItemType itemType, long dateTaken, long dateUploaded, int dedupeStage, @NotNull List<LocalItem> localItems, @NotNull List<CloudItem> cloudItems) {
        itemType.getClass();
        localItems.getClass();
        cloudItems.getClass();
        return new UnifiedItem(id, itemType, dateTaken, dateUploaded, dedupeStage, localItems, cloudItems);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnifiedItem)) {
            return false;
        }
        UnifiedItem unifiedItem = (UnifiedItem) other;
        return this.id == unifiedItem.id && this.itemType == unifiedItem.itemType && this.dateTaken == unifiedItem.dateTaken && this.dateUploaded == unifiedItem.dateUploaded && this.dedupeStage == unifiedItem.dedupeStage && Intrinsics.areEqual(this.localItems, unifiedItem.localItems) && Intrinsics.areEqual(this.cloudItems, unifiedItem.cloudItems);
    }

    @NotNull
    public final List<CloudItem> getCloudItems() {
        return this.cloudItems;
    }

    public final long getDateTaken() {
        return this.dateTaken;
    }

    public final long getDateUploaded() {
        return this.dateUploaded;
    }

    public final int getDedupeStage() {
        return this.dedupeStage;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final ItemType getItemType() {
        return this.itemType;
    }

    @NotNull
    public final List<LocalItem> getLocalItems() {
        return this.localItems;
    }

    public int hashCode() {
        return this.cloudItems.hashCode() + ArcMode$$ExternalSyntheticOutline0.m(this.localItems, ArcMode$$ExternalSyntheticOutline0.m(this.dedupeStage, BitVector$$ExternalSyntheticOutline0.m(this.dateUploaded, BitVector$$ExternalSyntheticOutline0.m(this.dateTaken, (this.itemType.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("UnifiedItem(id=");
        sb.append(this.id);
        sb.append(", itemType=");
        sb.append(this.itemType);
        sb.append(", dateTaken=");
        sb.append(this.dateTaken);
        sb.append(", dateUploaded=");
        sb.append(this.dateUploaded);
        sb.append(", dedupeStage=");
        sb.append(this.dedupeStage);
        sb.append(", localItems=");
        sb.append(this.localItems);
        sb.append(", cloudItems=");
        return AppLaunchChecker$$ExternalSyntheticOutline0.m(sb, (List) this.cloudItems, ')');
    }
}
