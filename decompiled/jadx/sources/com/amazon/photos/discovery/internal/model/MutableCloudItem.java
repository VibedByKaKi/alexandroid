package com.amazon.photos.discovery.internal.model;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.amazon.alexa.handsfree.protocols.sierracontentprovider.SierraContentProviderContract;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.dee.app.ui.web.AlexaDeviceBackgroundImageBridge;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Entity(indices = {@Index(unique = true, value = {"id"}), @Index(unique = true, value = {"node_id"})}, tableName = "cloud_item")
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b!\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007BA\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rJ\b\u0010\u001e\u001a\u00020\u0000H\u0016J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003JS\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0096\u0002J\b\u0010+\u001a\u00020,H\u0016J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001e\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R \u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0011R \u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0004¨\u0006."}, d2 = {"Lcom/amazon/photos/discovery/internal/model/MutableCloudItem;", "", AlexaDeviceBackgroundImageBridge.KEY_NODE_ID, "", "(Ljava/lang/String;)V", "unifiedId", "", "(Ljava/lang/String;J)V", "id", "dateUploaded", "dateTaken", SierraContentProviderContract.MD5_VALUE, "visualDigest", "(JJLjava/lang/String;JJLjava/lang/String;Ljava/lang/String;)V", "getDateTaken", "()J", "setDateTaken", "(J)V", "getDateUploaded", "setDateUploaded", "getId", "setId", "getMd5", "()Ljava/lang/String;", "setMd5", "getNodeId", "getUnifiedId", "setUnifiedId", "getVisualDigest", "setVisualDigest", "clone", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "AndroidPhotosDiscovery_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MutableCloudItem implements Cloneable {

    @ColumnInfo(name = "date_taken")
    private long dateTaken;

    @ColumnInfo(name = "date_uploaded")
    private long dateUploaded;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private long id;

    @ColumnInfo(name = SierraContentProviderContract.MD5_VALUE)
    @Nullable
    private String md5;

    @ColumnInfo(name = "node_id")
    @NotNull
    private final String nodeId;

    @ColumnInfo(name = "unified_id")
    private long unifiedId;

    @ColumnInfo(name = "visual_digest")
    @Nullable
    private String visualDigest;

    public MutableCloudItem(long j, long j2, @NotNull String str, long j3, long j4, @Nullable String str2, @Nullable String str3) {
        str.getClass();
        this.id = j;
        this.unifiedId = j2;
        this.nodeId = str;
        this.dateUploaded = j3;
        this.dateTaken = j4;
        this.md5 = str2;
        this.visualDigest = str3;
    }

    public static /* synthetic */ MutableCloudItem copy$default(MutableCloudItem mutableCloudItem, long j, long j2, String str, long j3, long j4, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = mutableCloudItem.id;
        }
        return mutableCloudItem.copy(j, (i & 2) != 0 ? mutableCloudItem.unifiedId : j2, (i & 4) != 0 ? mutableCloudItem.nodeId : str, (i & 8) != 0 ? mutableCloudItem.dateUploaded : j3, (i & 16) != 0 ? mutableCloudItem.dateTaken : j4, (i & 32) != 0 ? mutableCloudItem.md5 : str2, (i & 64) != 0 ? mutableCloudItem.visualDigest : str3);
    }

    @NotNull
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public MutableCloudItem m22790clone() {
        return copy$default(this, 0L, 0L, null, 0L, 0L, null, null, 127, null);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final long getUnifiedId() {
        return this.unifiedId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getNodeId() {
        return this.nodeId;
    }

    /* renamed from: component4, reason: from getter */
    public final long getDateUploaded() {
        return this.dateUploaded;
    }

    /* renamed from: component5, reason: from getter */
    public final long getDateTaken() {
        return this.dateTaken;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getMd5() {
        return this.md5;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getVisualDigest() {
        return this.visualDigest;
    }

    @NotNull
    public final MutableCloudItem copy(long id, long unifiedId, @NotNull String nodeId, long dateUploaded, long dateTaken, @Nullable String md5, @Nullable String visualDigest) {
        nodeId.getClass();
        return new MutableCloudItem(id, unifiedId, nodeId, dateUploaded, dateTaken, md5, visualDigest);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(MutableCloudItem.class, other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        MutableCloudItem mutableCloudItem = (MutableCloudItem) other;
        return this.id == mutableCloudItem.id && this.unifiedId == mutableCloudItem.unifiedId && Intrinsics.areEqual(this.nodeId, mutableCloudItem.nodeId) && this.dateUploaded == mutableCloudItem.dateUploaded && this.dateTaken == mutableCloudItem.dateTaken && Intrinsics.areEqual(this.md5, mutableCloudItem.md5) && Intrinsics.areEqual(this.visualDigest, mutableCloudItem.visualDigest);
    }

    public final long getDateTaken() {
        return this.dateTaken;
    }

    public final long getDateUploaded() {
        return this.dateUploaded;
    }

    public final long getId() {
        return this.id;
    }

    @Nullable
    public final String getMd5() {
        return this.md5;
    }

    @NotNull
    public final String getNodeId() {
        return this.nodeId;
    }

    public final long getUnifiedId() {
        return this.unifiedId;
    }

    @Nullable
    public final String getVisualDigest() {
        return this.visualDigest;
    }

    public int hashCode() {
        return this.nodeId.hashCode();
    }

    public final void setDateTaken(long j) {
        this.dateTaken = j;
    }

    public final void setDateUploaded(long j) {
        this.dateUploaded = j;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setMd5(@Nullable String str) {
        this.md5 = str;
    }

    public final void setUnifiedId(long j) {
        this.unifiedId = j;
    }

    public final void setVisualDigest(@Nullable String str) {
        this.visualDigest = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("MutableCloudItem(id=");
        sb.append(this.id);
        sb.append(", unifiedId=");
        sb.append(this.unifiedId);
        sb.append(", nodeId=");
        sb.append(this.nodeId);
        sb.append(", dateUploaded=");
        sb.append(this.dateUploaded);
        sb.append(", dateTaken=");
        sb.append(this.dateTaken);
        sb.append(", md5=");
        sb.append(this.md5);
        sb.append(", visualDigest=");
        return ArcMode$$ExternalSyntheticOutline0.m(')', this.visualDigest, sb);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Ignore
    public MutableCloudItem(@NotNull String str) {
        this(0L, 0L, str, 0L, 0L, null, null);
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Ignore
    public MutableCloudItem(@NotNull String str, long j) {
        this(0L, j, str, 0L, 0L, null, null);
        str.getClass();
    }
}
