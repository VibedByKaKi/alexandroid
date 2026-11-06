package com.amazon.photos.discovery.internal.model;

import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Ignore;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.amazon.alexa.handsfree.protocols.sierracontentprovider.SierraContentProviderContract;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.alexa.sharing.api.models.Message;
import com.amazon.photos.discovery.model.ItemType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Entity(foreignKeys = {@ForeignKey(childColumns = {"parent_id"}, entity = MutableLocalFolder.class, onDelete = 5, parentColumns = {"id"})}, indices = {@Index(unique = true, value = {"id"}), @Index(unique = true, value = {"file_path"}), @Index({"parent_id"})}, tableName = "local_item")
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\bJ\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB'\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\nB\u0091\u0001\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u0018J\b\u0010>\u001a\u00020\u0000H\u0016J\t\u0010?\u001a\u00020\u0007HÆ\u0003J\t\u0010@\u001a\u00020\u0007HÆ\u0003J\t\u0010A\u001a\u00020\u0007HÆ\u0003J\t\u0010B\u001a\u00020\u0007HÆ\u0003J\t\u0010C\u001a\u00020\u0007HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010F\u001a\u00020\u0007HÆ\u0003J\t\u0010G\u001a\u00020\u0007HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0005HÆ\u0003J\u0010\u0010J\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010K\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010L\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010M\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\"J\t\u0010N\u001a\u00020\u0007HÆ\u0003Jº\u0001\u0010O\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00072\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010PJ\u0013\u0010Q\u001a\u00020R2\b\u0010S\u001a\u0004\u0018\u00010TH\u0096\u0002J\b\u0010U\u001a\u00020VH\u0016J\t\u0010W\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0011\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u0013\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\u001e\u0010\u0012\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\"\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010\u0015\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001a\"\u0004\b'\u0010\u001cR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b*\u0010\"\"\u0004\b+\u0010$R\u001e\u0010\u000b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001a\"\u0004\b-\u0010\u001cR\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R \u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010)\"\u0004\b1\u00102R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001aR\"\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b4\u0010\"\"\u0004\b5\u0010$R\u001e\u0010\u0014\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u001a\"\u0004\b7\u0010\u001cR\u001e\u0010\t\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u001a\"\u0004\b9\u0010\u001cR \u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010)\"\u0004\b;\u00102R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b<\u0010\"\"\u0004\b=\u0010$¨\u0006X"}, d2 = {"Lcom/amazon/photos/discovery/internal/model/MutableLocalItem;", "", "type", "Lcom/amazon/photos/discovery/model/ItemType;", "filePath", "", Message.SERIALIZED_NAME_PARENT_ID, "", "(Lcom/amazon/photos/discovery/model/ItemType;Ljava/lang/String;J)V", "unifiedId", "(Lcom/amazon/photos/discovery/model/ItemType;Ljava/lang/String;JJ)V", "id", "itemType", "duration", "width", "height", "size", "dateAdded", "dateTaken", "dateModified", "startProcessing", "endProcessing", SierraContentProviderContract.MD5_VALUE, "visualDigest", "(JJLcom/amazon/photos/discovery/model/ItemType;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;JJJJJLjava/lang/String;Ljava/lang/String;J)V", "getDateAdded", "()J", "setDateAdded", "(J)V", "getDateModified", "setDateModified", "getDateTaken", "setDateTaken", "getDuration", "()Ljava/lang/Long;", "setDuration", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getEndProcessing", "setEndProcessing", "getFilePath", "()Ljava/lang/String;", "getHeight", "setHeight", "getId", "setId", "getItemType", "()Lcom/amazon/photos/discovery/model/ItemType;", "getMd5", "setMd5", "(Ljava/lang/String;)V", "getParentId", "getSize", "setSize", "getStartProcessing", "setStartProcessing", "getUnifiedId", "setUnifiedId", "getVisualDigest", "setVisualDigest", "getWidth", "setWidth", "clone", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JJLcom/amazon/photos/discovery/model/ItemType;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;JJJJJLjava/lang/String;Ljava/lang/String;J)Lcom/amazon/photos/discovery/internal/model/MutableLocalItem;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "AndroidPhotosDiscovery_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MutableLocalItem implements Cloneable {

    @ColumnInfo(name = "date_added")
    private long dateAdded;

    @ColumnInfo(name = "date_modified")
    private long dateModified;

    @ColumnInfo(name = "date_taken")
    private long dateTaken;

    @ColumnInfo(name = "duration")
    @Nullable
    private Long duration;

    @ColumnInfo(name = "end_processing")
    private long endProcessing;

    @ColumnInfo(name = "file_path")
    @NotNull
    private final String filePath;

    @ColumnInfo(name = "height")
    @Nullable
    private Long height;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private long id;

    @ColumnInfo(name = "type")
    @NotNull
    private final ItemType itemType;

    @ColumnInfo(name = SierraContentProviderContract.MD5_VALUE)
    @Nullable
    private String md5;

    @ColumnInfo(name = "parent_id")
    private final long parentId;

    @ColumnInfo(name = "size")
    @Nullable
    private Long size;

    @ColumnInfo(name = "start_processing")
    private long startProcessing;

    @ColumnInfo(name = "unified_id")
    private long unifiedId;

    @ColumnInfo(name = "visual_digest")
    @Nullable
    private String visualDigest;

    @ColumnInfo(name = "width")
    @Nullable
    private Long width;

    public MutableLocalItem(long j, long j2, @NotNull ItemType itemType, @NotNull String str, @Nullable Long l, @Nullable Long l2, @Nullable Long l3, @Nullable Long l4, long j3, long j4, long j5, long j6, long j7, @Nullable String str2, @Nullable String str3, long j8) {
        itemType.getClass();
        str.getClass();
        this.id = j;
        this.unifiedId = j2;
        this.itemType = itemType;
        this.filePath = str;
        this.duration = l;
        this.width = l2;
        this.height = l3;
        this.size = l4;
        this.dateAdded = j3;
        this.dateTaken = j4;
        this.dateModified = j5;
        this.startProcessing = j6;
        this.endProcessing = j7;
        this.md5 = str2;
        this.visualDigest = str3;
        this.parentId = j8;
    }

    public static /* synthetic */ MutableLocalItem copy$default(MutableLocalItem mutableLocalItem, long j, long j2, ItemType itemType, String str, Long l, Long l2, Long l3, Long l4, long j3, long j4, long j5, long j6, long j7, String str2, String str3, long j8, int i, Object obj) {
        long j9;
        String str4;
        long j10 = (i & 1) != 0 ? mutableLocalItem.id : j;
        long j11 = (i & 2) != 0 ? mutableLocalItem.unifiedId : j2;
        ItemType itemType2 = (i & 4) != 0 ? mutableLocalItem.itemType : itemType;
        String str5 = (i & 8) != 0 ? mutableLocalItem.filePath : str;
        Long l5 = (i & 16) != 0 ? mutableLocalItem.duration : l;
        Long l6 = (i & 32) != 0 ? mutableLocalItem.width : l2;
        Long l7 = (i & 64) != 0 ? mutableLocalItem.height : l3;
        Long l8 = (i & 128) != 0 ? mutableLocalItem.size : l4;
        long j12 = (i & 256) != 0 ? mutableLocalItem.dateAdded : j3;
        long j13 = (i & 512) != 0 ? mutableLocalItem.dateTaken : j4;
        long j14 = j10;
        long j15 = (i & 1024) != 0 ? mutableLocalItem.dateModified : j5;
        long j16 = (i & 2048) != 0 ? mutableLocalItem.startProcessing : j6;
        long j17 = (i & 4096) != 0 ? mutableLocalItem.endProcessing : j7;
        String str6 = (i & 8192) != 0 ? mutableLocalItem.md5 : str2;
        String str7 = (i & 16384) != 0 ? mutableLocalItem.visualDigest : str3;
        if ((i & 32768) != 0) {
            str4 = str6;
            j9 = mutableLocalItem.parentId;
        } else {
            j9 = j8;
            str4 = str6;
        }
        return mutableLocalItem.copy(j14, j11, itemType2, str5, l5, l6, l7, l8, j12, j13, j15, j16, j17, str4, str7, j9);
    }

    @NotNull
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public MutableLocalItem m22791clone() {
        return copy$default(this, 0L, 0L, null, null, null, null, null, null, 0L, 0L, 0L, 0L, 0L, null, null, 0L, 65535, null);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final long getDateTaken() {
        return this.dateTaken;
    }

    /* renamed from: component11, reason: from getter */
    public final long getDateModified() {
        return this.dateModified;
    }

    /* renamed from: component12, reason: from getter */
    public final long getStartProcessing() {
        return this.startProcessing;
    }

    /* renamed from: component13, reason: from getter */
    public final long getEndProcessing() {
        return this.endProcessing;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final String getMd5() {
        return this.md5;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final String getVisualDigest() {
        return this.visualDigest;
    }

    /* renamed from: component16, reason: from getter */
    public final long getParentId() {
        return this.parentId;
    }

    /* renamed from: component2, reason: from getter */
    public final long getUnifiedId() {
        return this.unifiedId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ItemType getItemType() {
        return this.itemType;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getFilePath() {
        return this.filePath;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Long getDuration() {
        return this.duration;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Long getWidth() {
        return this.width;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Long getHeight() {
        return this.height;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Long getSize() {
        return this.size;
    }

    /* renamed from: component9, reason: from getter */
    public final long getDateAdded() {
        return this.dateAdded;
    }

    @NotNull
    public final MutableLocalItem copy(long id, long unifiedId, @NotNull ItemType itemType, @NotNull String filePath, @Nullable Long duration, @Nullable Long width, @Nullable Long height, @Nullable Long size, long dateAdded, long dateTaken, long dateModified, long startProcessing, long endProcessing, @Nullable String md5, @Nullable String visualDigest, long parentId) {
        itemType.getClass();
        filePath.getClass();
        return new MutableLocalItem(id, unifiedId, itemType, filePath, duration, width, height, size, dateAdded, dateTaken, dateModified, startProcessing, endProcessing, md5, visualDigest, parentId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(MutableLocalItem.class, other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        MutableLocalItem mutableLocalItem = (MutableLocalItem) other;
        return this.id == mutableLocalItem.id && this.unifiedId == mutableLocalItem.unifiedId && this.itemType == mutableLocalItem.itemType && Intrinsics.areEqual(this.filePath, mutableLocalItem.filePath) && Intrinsics.areEqual(this.duration, mutableLocalItem.duration) && Intrinsics.areEqual(this.width, mutableLocalItem.width) && Intrinsics.areEqual(this.height, mutableLocalItem.height) && Intrinsics.areEqual(this.size, mutableLocalItem.size) && this.dateAdded == mutableLocalItem.dateAdded && this.dateTaken == mutableLocalItem.dateTaken && this.dateModified == mutableLocalItem.dateModified && this.startProcessing == mutableLocalItem.startProcessing && this.endProcessing == mutableLocalItem.endProcessing && Intrinsics.areEqual(this.md5, mutableLocalItem.md5) && Intrinsics.areEqual(this.visualDigest, mutableLocalItem.visualDigest) && this.parentId == mutableLocalItem.parentId;
    }

    public final long getDateAdded() {
        return this.dateAdded;
    }

    public final long getDateModified() {
        return this.dateModified;
    }

    public final long getDateTaken() {
        return this.dateTaken;
    }

    @Nullable
    public final Long getDuration() {
        return this.duration;
    }

    public final long getEndProcessing() {
        return this.endProcessing;
    }

    @NotNull
    public final String getFilePath() {
        return this.filePath;
    }

    @Nullable
    public final Long getHeight() {
        return this.height;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final ItemType getItemType() {
        return this.itemType;
    }

    @Nullable
    public final String getMd5() {
        return this.md5;
    }

    public final long getParentId() {
        return this.parentId;
    }

    @Nullable
    public final Long getSize() {
        return this.size;
    }

    public final long getStartProcessing() {
        return this.startProcessing;
    }

    public final long getUnifiedId() {
        return this.unifiedId;
    }

    @Nullable
    public final String getVisualDigest() {
        return this.visualDigest;
    }

    @Nullable
    public final Long getWidth() {
        return this.width;
    }

    public int hashCode() {
        return this.filePath.hashCode();
    }

    public final void setDateAdded(long j) {
        this.dateAdded = j;
    }

    public final void setDateModified(long j) {
        this.dateModified = j;
    }

    public final void setDateTaken(long j) {
        this.dateTaken = j;
    }

    public final void setDuration(@Nullable Long l) {
        this.duration = l;
    }

    public final void setEndProcessing(long j) {
        this.endProcessing = j;
    }

    public final void setHeight(@Nullable Long l) {
        this.height = l;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setMd5(@Nullable String str) {
        this.md5 = str;
    }

    public final void setSize(@Nullable Long l) {
        this.size = l;
    }

    public final void setStartProcessing(long j) {
        this.startProcessing = j;
    }

    public final void setUnifiedId(long j) {
        this.unifiedId = j;
    }

    public final void setVisualDigest(@Nullable String str) {
        this.visualDigest = str;
    }

    public final void setWidth(@Nullable Long l) {
        this.width = l;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("MutableLocalItem(id=");
        sb.append(this.id);
        sb.append(", unifiedId=");
        sb.append(this.unifiedId);
        sb.append(", itemType=");
        sb.append(this.itemType);
        sb.append(", filePath=");
        sb.append(this.filePath);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(", dateAdded=");
        sb.append(this.dateAdded);
        sb.append(", dateTaken=");
        sb.append(this.dateTaken);
        sb.append(", dateModified=");
        sb.append(this.dateModified);
        sb.append(", startProcessing=");
        sb.append(this.startProcessing);
        sb.append(", endProcessing=");
        sb.append(this.endProcessing);
        sb.append(", md5=");
        sb.append(this.md5);
        sb.append(", visualDigest=");
        sb.append(this.visualDigest);
        sb.append(", parentId=");
        return DoubleList$$ExternalSyntheticOutline0.m(sb, this.parentId, ')');
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Ignore
    public MutableLocalItem(@NotNull ItemType itemType, @NotNull String str, long j) {
        this(0L, 0L, itemType, str, null, null, null, 0L, 0L, 0L, 0L, SystemClock.elapsedRealtime(), 0L, null, null, j);
        itemType.getClass();
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @VisibleForTesting
    @Ignore
    public MutableLocalItem(@NotNull ItemType itemType, @NotNull String str, long j, long j2) {
        this(0L, j, itemType, str, 0L, null, null, 0L, 0L, 0L, 0L, 0L, 0L, null, null, j2);
        itemType.getClass();
        str.getClass();
    }
}
