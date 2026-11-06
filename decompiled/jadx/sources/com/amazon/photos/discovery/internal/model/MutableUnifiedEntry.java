package com.amazon.photos.discovery.internal.model;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.photos.discovery.internal.worker.DedupeWorkerKt;
import com.amazon.photos.discovery.model.ItemType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Entity(indices = {@Index(unique = true, value = {"id"})}, tableName = "unified_item")
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0007\b\u0017¢\u0006\u0002\u0010\u0002B9\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\b\u0010\"\u001a\u00020\u0000H\u0016J\t\u0010#\u001a\u00020\u0004HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010%\u001a\u00020\u0004HÆ\u0003J\t\u0010&\u001a\u00020\u0004HÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003J\t\u0010(\u001a\u00020\fHÆ\u0003JG\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010*\u001a\u00020\f2\b\u0010+\u001a\u0004\u0018\u00010,H\u0096\u0002J\b\u0010-\u001a\u00020\nH\u0016J\u0010\u0010.\u001a\u00020\n2\u0006\u0010/\u001a\u00020\u0004H\u0002J\t\u00100\u001a\u000201HÖ\u0001R\u001e\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u00062"}, d2 = {"Lcom/amazon/photos/discovery/internal/model/MutableUnifiedEntry;", "", "()V", "id", "", "itemType", "Lcom/amazon/photos/discovery/model/ItemType;", "dateTaken", "dateUploaded", "dedupeStage", "", "synched", "", "(JLcom/amazon/photos/discovery/model/ItemType;JJIZ)V", "getDateTaken", "()J", "setDateTaken", "(J)V", "getDateUploaded", "setDateUploaded", "getDedupeStage", "()I", "setDedupeStage", "(I)V", "getId", "setId", "getItemType", "()Lcom/amazon/photos/discovery/model/ItemType;", "setItemType", "(Lcom/amazon/photos/discovery/model/ItemType;)V", "getSynched", "()Z", "setSynched", "(Z)V", "clone", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "longHash", "value", "toString", "", "AndroidPhotosDiscovery_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MutableUnifiedEntry implements Cloneable {

    @ColumnInfo(name = "date_taken")
    private long dateTaken;

    @ColumnInfo(name = "date_uploaded")
    private long dateUploaded;

    @ColumnInfo(name = DedupeWorkerKt.PARAM_DEDUPE_STAGE_ID)
    private int dedupeStage;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private long id;

    @ColumnInfo(name = "type")
    @Nullable
    private ItemType itemType;

    @ColumnInfo(name = "synched")
    private boolean synched;

    public /* synthetic */ MutableUnifiedEntry(long j, ItemType itemType, long j2, long j3, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, itemType, j2, j3, (i2 & 16) != 0 ? 0 : i, z);
    }

    public static /* synthetic */ MutableUnifiedEntry copy$default(MutableUnifiedEntry mutableUnifiedEntry, long j, ItemType itemType, long j2, long j3, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = mutableUnifiedEntry.id;
        }
        long j4 = j;
        if ((i2 & 2) != 0) {
            itemType = mutableUnifiedEntry.itemType;
        }
        ItemType itemType2 = itemType;
        if ((i2 & 4) != 0) {
            j2 = mutableUnifiedEntry.dateTaken;
        }
        return mutableUnifiedEntry.copy(j4, itemType2, j2, (i2 & 8) != 0 ? mutableUnifiedEntry.dateUploaded : j3, (i2 & 16) != 0 ? mutableUnifiedEntry.dedupeStage : i, (i2 & 32) != 0 ? mutableUnifiedEntry.synched : z);
    }

    private final int longHash(long value) {
        return (int) (value ^ (value >>> 32));
    }

    @NotNull
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public MutableUnifiedEntry m22792clone() {
        return copy$default(this, 0L, null, 0L, 0L, 0, false, 63, null);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @Nullable
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

    /* renamed from: component6, reason: from getter */
    public final boolean getSynched() {
        return this.synched;
    }

    @NotNull
    public final MutableUnifiedEntry copy(long id, @Nullable ItemType itemType, long dateTaken, long dateUploaded, int dedupeStage, boolean synched) {
        return new MutableUnifiedEntry(id, itemType, dateTaken, dateUploaded, dedupeStage, synched);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(MutableUnifiedEntry.class, other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        MutableUnifiedEntry mutableUnifiedEntry = (MutableUnifiedEntry) other;
        return this.id == mutableUnifiedEntry.id && this.itemType == mutableUnifiedEntry.itemType && this.dateTaken == mutableUnifiedEntry.dateTaken && this.dateUploaded == mutableUnifiedEntry.dateUploaded && this.dedupeStage == mutableUnifiedEntry.dedupeStage && this.synched == mutableUnifiedEntry.synched;
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

    @Nullable
    public final ItemType getItemType() {
        return this.itemType;
    }

    public final boolean getSynched() {
        return this.synched;
    }

    public int hashCode() {
        long j = this.id;
        return j > 0 ? longHash(j) : longHash(j + this.dateTaken + this.dateUploaded);
    }

    public final void setDateTaken(long j) {
        this.dateTaken = j;
    }

    public final void setDateUploaded(long j) {
        this.dateUploaded = j;
    }

    public final void setDedupeStage(int i) {
        this.dedupeStage = i;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setItemType(@Nullable ItemType itemType) {
        this.itemType = itemType;
    }

    public final void setSynched(boolean z) {
        this.synched = z;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("MutableUnifiedEntry(id=");
        sb.append(this.id);
        sb.append(", itemType=");
        sb.append(this.itemType);
        sb.append(", dateTaken=");
        sb.append(this.dateTaken);
        sb.append(", dateUploaded=");
        sb.append(this.dateUploaded);
        sb.append(", dedupeStage=");
        sb.append(this.dedupeStage);
        sb.append(", synched=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.synched, ')');
    }

    public MutableUnifiedEntry(long j, @Nullable ItemType itemType, long j2, long j3, int i, boolean z) {
        this.id = j;
        this.itemType = itemType;
        this.dateTaken = j2;
        this.dateUploaded = j3;
        this.dedupeStage = i;
        this.synched = z;
    }

    @Ignore
    public MutableUnifiedEntry() {
        this(0L, null, 0L, 0L, 0, false);
    }
}
