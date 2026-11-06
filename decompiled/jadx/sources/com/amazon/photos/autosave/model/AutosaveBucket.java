package com.amazon.photos.autosave.model;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Entity(indices = {@Index(unique = true, value = {"bucket_path"})}, tableName = "autosave_bucket")
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/amazon/photos/autosave/model/AutosaveBucket;", "", "id", "", "bucketPath", "", "folderId", "(JLjava/lang/String;J)V", "getBucketPath", "()Ljava/lang/String;", "getFolderId", "()J", "getId", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AndroidPhotosAutosave_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AutosaveBucket {

    @ColumnInfo(name = "bucket_path")
    @NotNull
    private final String bucketPath;

    @ColumnInfo(name = "folder_id")
    private final long folderId;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private final long id;

    public /* synthetic */ AutosaveBucket(long j, String str, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, str, j2);
    }

    public static /* synthetic */ AutosaveBucket copy$default(AutosaveBucket autosaveBucket, long j, String str, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = autosaveBucket.id;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            str = autosaveBucket.bucketPath;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            j2 = autosaveBucket.folderId;
        }
        return autosaveBucket.copy(j3, str2, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getBucketPath() {
        return this.bucketPath;
    }

    /* renamed from: component3, reason: from getter */
    public final long getFolderId() {
        return this.folderId;
    }

    @NotNull
    public final AutosaveBucket copy(long id, @NotNull String bucketPath, long folderId) {
        bucketPath.getClass();
        return new AutosaveBucket(id, bucketPath, folderId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutosaveBucket)) {
            return false;
        }
        AutosaveBucket autosaveBucket = (AutosaveBucket) other;
        return this.id == autosaveBucket.id && Intrinsics.areEqual(this.bucketPath, autosaveBucket.bucketPath) && this.folderId == autosaveBucket.folderId;
    }

    @NotNull
    public final String getBucketPath() {
        return this.bucketPath;
    }

    public final long getFolderId() {
        return this.folderId;
    }

    public final long getId() {
        return this.id;
    }

    public int hashCode() {
        return Long.hashCode(this.folderId) + ArcMode$$ExternalSyntheticOutline0.m(Long.hashCode(this.id) * 31, 31, this.bucketPath);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("AutosaveBucket(id=");
        sb.append(this.id);
        sb.append(", bucketPath=");
        sb.append(this.bucketPath);
        sb.append(", folderId=");
        return DoubleList$$ExternalSyntheticOutline0.m(sb, this.folderId, ')');
    }

    public AutosaveBucket(long j, @NotNull String str, long j2) {
        str.getClass();
        this.id = j;
        this.bucketPath = str;
        this.folderId = j2;
    }
}
