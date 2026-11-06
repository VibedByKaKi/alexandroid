package com.amazon.photos.discovery.model;

import androidx.annotation.VisibleForTesting;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import androidx.room.ColumnInfo;
import androidx.room.DatabaseView;
import androidx.room.Ignore;
import com.amazon.alexa.handsfree.protocols.sierracontentprovider.SierraContentProviderContract;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.alexa.sharing.api.models.Message;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DatabaseView("SELECT * FROM local_item")
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b6\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0002\u0010\u0013B\u0091\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0002\u0010\u0016J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0006HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001cJ\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003Jº\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0012\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010=J\u0013\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010A\u001a\u00020BHÖ\u0001J\t\u0010C\u001a\u00020\bHÖ\u0001R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u001a\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b!\u0010\u001cR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u0016\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0018R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010 R\u001a\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b+\u0010\u001c¨\u0006D"}, d2 = {"Lcom/amazon/photos/discovery/model/LocalItem;", "", "id", "", "unifiedId", "type", "Lcom/amazon/photos/discovery/model/ItemType;", "filePath", "", "duration", "width", "height", "size", "dateAdded", "dateTaken", "dateModified", SierraContentProviderContract.MD5_VALUE, "visualDigest", Message.SERIALIZED_NAME_PARENT_ID, "(JJLcom/amazon/photos/discovery/model/ItemType;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;JJJJLjava/lang/String;Ljava/lang/String;J)V", "startProcessing", "endProcessing", "(JJLcom/amazon/photos/discovery/model/ItemType;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;JJJJJJLjava/lang/String;Ljava/lang/String;J)V", "getDateAdded", "()J", "getDateModified", "getDateTaken", "getDuration", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getEndProcessing", "getFilePath", "()Ljava/lang/String;", "getHeight", "getId", "getMd5", "getParentId", "getSize", "getStartProcessing", "getType", "()Lcom/amazon/photos/discovery/model/ItemType;", "getUnifiedId", "getVisualDigest", "getWidth", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JJLcom/amazon/photos/discovery/model/ItemType;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;JJJJJJLjava/lang/String;Ljava/lang/String;J)Lcom/amazon/photos/discovery/model/LocalItem;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AndroidPhotosDiscovery_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class LocalItem {

    @ColumnInfo(name = "date_added")
    private final long dateAdded;

    @ColumnInfo(name = "date_modified")
    private final long dateModified;

    @ColumnInfo(name = "date_taken")
    private final long dateTaken;

    @ColumnInfo(name = "duration")
    @Nullable
    private final Long duration;

    @ColumnInfo(name = "end_processing")
    private final long endProcessing;

    @ColumnInfo(name = "file_path")
    @Nullable
    private final String filePath;

    @ColumnInfo(name = "height")
    @Nullable
    private final Long height;

    @ColumnInfo(name = "id")
    private final long id;

    @ColumnInfo(name = SierraContentProviderContract.MD5_VALUE)
    @Nullable
    private final String md5;

    @ColumnInfo(name = "parent_id")
    private final long parentId;

    @ColumnInfo(name = "size")
    private final long size;

    @ColumnInfo(name = "start_processing")
    private final long startProcessing;

    @ColumnInfo(name = "type")
    @NotNull
    private final ItemType type;

    @ColumnInfo(name = "unified_id")
    private final long unifiedId;

    @ColumnInfo(name = "visual_digest")
    @Nullable
    private final String visualDigest;

    @ColumnInfo(name = "width")
    @Nullable
    private final Long width;

    public LocalItem(long j, long j2, @NotNull ItemType itemType, @Nullable String str, @Nullable Long l, @Nullable Long l2, @Nullable Long l3, long j3, long j4, long j5, long j6, long j7, long j8, @Nullable String str2, @Nullable String str3, long j9) {
        itemType.getClass();
        this.id = j;
        this.unifiedId = j2;
        this.type = itemType;
        this.filePath = str;
        this.duration = l;
        this.width = l2;
        this.height = l3;
        this.size = j3;
        this.dateAdded = j4;
        this.dateTaken = j5;
        this.dateModified = j6;
        this.startProcessing = j7;
        this.endProcessing = j8;
        this.md5 = str2;
        this.visualDigest = str3;
        this.parentId = j9;
    }

    public static /* synthetic */ LocalItem copy$default(LocalItem localItem, long j, long j2, ItemType itemType, String str, Long l, Long l2, Long l3, long j3, long j4, long j5, long j6, long j7, long j8, String str2, String str3, long j9, int i, Object obj) {
        long j10;
        long j11;
        long j12;
        String str4;
        long j13 = (i & 1) != 0 ? localItem.id : j;
        long j14 = (i & 2) != 0 ? localItem.unifiedId : j2;
        ItemType itemType2 = (i & 4) != 0 ? localItem.type : itemType;
        String str5 = (i & 8) != 0 ? localItem.filePath : str;
        Long l4 = (i & 16) != 0 ? localItem.duration : l;
        Long l5 = (i & 32) != 0 ? localItem.width : l2;
        Long l6 = (i & 64) != 0 ? localItem.height : l3;
        long j15 = (i & 128) != 0 ? localItem.size : j3;
        long j16 = (i & 256) != 0 ? localItem.dateAdded : j4;
        if ((i & 512) != 0) {
            j10 = j13;
            j11 = localItem.dateTaken;
        } else {
            j10 = j13;
            j11 = j5;
        }
        long j17 = j11;
        long j18 = (i & 1024) != 0 ? localItem.dateModified : j6;
        long j19 = (i & 2048) != 0 ? localItem.startProcessing : j7;
        long j20 = (i & 4096) != 0 ? localItem.endProcessing : j8;
        String str6 = (i & 8192) != 0 ? localItem.md5 : str2;
        String str7 = (i & 16384) != 0 ? localItem.visualDigest : str3;
        if ((i & 32768) != 0) {
            str4 = str6;
            j12 = localItem.parentId;
        } else {
            j12 = j9;
            str4 = str6;
        }
        return localItem.copy(j10, j14, itemType2, str5, l4, l5, l6, j15, j16, j17, j18, j19, j20, str4, str7, j12);
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
    public final ItemType getType() {
        return this.type;
    }

    @Nullable
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

    /* renamed from: component8, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    /* renamed from: component9, reason: from getter */
    public final long getDateAdded() {
        return this.dateAdded;
    }

    @NotNull
    public final LocalItem copy(long id, long unifiedId, @NotNull ItemType type, @Nullable String filePath, @Nullable Long duration, @Nullable Long width, @Nullable Long height, long size, long dateAdded, long dateTaken, long dateModified, long startProcessing, long endProcessing, @Nullable String md5, @Nullable String visualDigest, long parentId) {
        type.getClass();
        return new LocalItem(id, unifiedId, type, filePath, duration, width, height, size, dateAdded, dateTaken, dateModified, startProcessing, endProcessing, md5, visualDigest, parentId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalItem)) {
            return false;
        }
        LocalItem localItem = (LocalItem) other;
        return this.id == localItem.id && this.unifiedId == localItem.unifiedId && this.type == localItem.type && Intrinsics.areEqual(this.filePath, localItem.filePath) && Intrinsics.areEqual(this.duration, localItem.duration) && Intrinsics.areEqual(this.width, localItem.width) && Intrinsics.areEqual(this.height, localItem.height) && this.size == localItem.size && this.dateAdded == localItem.dateAdded && this.dateTaken == localItem.dateTaken && this.dateModified == localItem.dateModified && this.startProcessing == localItem.startProcessing && this.endProcessing == localItem.endProcessing && Intrinsics.areEqual(this.md5, localItem.md5) && Intrinsics.areEqual(this.visualDigest, localItem.visualDigest) && this.parentId == localItem.parentId;
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

    @Nullable
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

    @Nullable
    public final String getMd5() {
        return this.md5;
    }

    public final long getParentId() {
        return this.parentId;
    }

    public final long getSize() {
        return this.size;
    }

    public final long getStartProcessing() {
        return this.startProcessing;
    }

    @NotNull
    public final ItemType getType() {
        return this.type;
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
        int hashCode = (this.type.hashCode() + BitVector$$ExternalSyntheticOutline0.m(this.unifiedId, Long.hashCode(this.id) * 31, 31)) * 31;
        String str = this.filePath;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.duration;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.width;
        int hashCode4 = (hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.height;
        int m = BitVector$$ExternalSyntheticOutline0.m(this.endProcessing, BitVector$$ExternalSyntheticOutline0.m(this.startProcessing, BitVector$$ExternalSyntheticOutline0.m(this.dateModified, BitVector$$ExternalSyntheticOutline0.m(this.dateTaken, BitVector$$ExternalSyntheticOutline0.m(this.dateAdded, BitVector$$ExternalSyntheticOutline0.m(this.size, (hashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31, 31), 31), 31), 31), 31), 31);
        String str2 = this.md5;
        int hashCode5 = (m + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.visualDigest;
        return Long.hashCode(this.parentId) + ((hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("LocalItem(id=");
        sb.append(this.id);
        sb.append(", unifiedId=");
        sb.append(this.unifiedId);
        sb.append(", type=");
        sb.append(this.type);
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
    @VisibleForTesting
    @Ignore
    public LocalItem(long j, long j2, @NotNull ItemType itemType, @Nullable String str, @Nullable Long l, @Nullable Long l2, @Nullable Long l3, long j3, long j4, long j5, long j6, @Nullable String str2, @Nullable String str3, long j7) {
        this(j, j2, itemType, str, l, l2, l3, j3, j4, j5, j6, 0L, 0L, str2, str3, j7);
        itemType.getClass();
    }
}
