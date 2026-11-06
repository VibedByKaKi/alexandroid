package com.amazon.photos.uploader.cds.multipart;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.dee.app.ui.web.AlexaDeviceBackgroundImageBridge;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Entity(tableName = "multipart_upload_request_metadata")
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000bJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J^\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006&"}, d2 = {"Lcom/amazon/photos/uploader/cds/multipart/MultipartUploadRequestMetadata;", "", "uploadRequestId", "", AlexaDeviceBackgroundImageBridge.KEY_NODE_ID, "", "uploadId", "partSize", "totalNumberOfParts", "multipartUploadStartTime", "multipartUploadExpirationTime", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "getMultipartUploadExpirationTime", "()Ljava/lang/String;", "getMultipartUploadStartTime", "getNodeId", "getPartSize", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTotalNumberOfParts", "getUploadId", "getUploadRequestId", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)Lcom/amazon/photos/uploader/cds/multipart/MultipartUploadRequestMetadata;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MultipartUploadRequestMetadata {

    @ColumnInfo(name = "multipart_expiration_time")
    @Nullable
    private final String multipartUploadExpirationTime;

    @ColumnInfo(name = "multipart_start_time")
    @Nullable
    private final String multipartUploadStartTime;

    @ColumnInfo(name = "node_id")
    @NotNull
    private final String nodeId;

    @ColumnInfo(name = "part_size")
    @Nullable
    private final Long partSize;

    @ColumnInfo(name = "total_parts")
    @Nullable
    private final Long totalNumberOfParts;

    @ColumnInfo(name = "upload_id")
    @Nullable
    private final String uploadId;

    @PrimaryKey
    @ColumnInfo(name = "upload_request_id")
    private final long uploadRequestId;

    public /* synthetic */ MultipartUploadRequestMetadata(long j, String str, String str2, Long l, Long l2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : l2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4);
    }

    public static /* synthetic */ MultipartUploadRequestMetadata copy$default(MultipartUploadRequestMetadata multipartUploadRequestMetadata, long j, String str, String str2, Long l, Long l2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            j = multipartUploadRequestMetadata.uploadRequestId;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = multipartUploadRequestMetadata.nodeId;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = multipartUploadRequestMetadata.uploadId;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            l = multipartUploadRequestMetadata.partSize;
        }
        Long l3 = l;
        if ((i & 16) != 0) {
            l2 = multipartUploadRequestMetadata.totalNumberOfParts;
        }
        return multipartUploadRequestMetadata.copy(j2, str5, str6, l3, l2, (i & 32) != 0 ? multipartUploadRequestMetadata.multipartUploadStartTime : str3, (i & 64) != 0 ? multipartUploadRequestMetadata.multipartUploadExpirationTime : str4);
    }

    /* renamed from: component1, reason: from getter */
    public final long getUploadRequestId() {
        return this.uploadRequestId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getNodeId() {
        return this.nodeId;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getUploadId() {
        return this.uploadId;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Long getPartSize() {
        return this.partSize;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Long getTotalNumberOfParts() {
        return this.totalNumberOfParts;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getMultipartUploadStartTime() {
        return this.multipartUploadStartTime;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getMultipartUploadExpirationTime() {
        return this.multipartUploadExpirationTime;
    }

    @NotNull
    public final MultipartUploadRequestMetadata copy(long uploadRequestId, @NotNull String nodeId, @Nullable String uploadId, @Nullable Long partSize, @Nullable Long totalNumberOfParts, @Nullable String multipartUploadStartTime, @Nullable String multipartUploadExpirationTime) {
        nodeId.getClass();
        return new MultipartUploadRequestMetadata(uploadRequestId, nodeId, uploadId, partSize, totalNumberOfParts, multipartUploadStartTime, multipartUploadExpirationTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultipartUploadRequestMetadata)) {
            return false;
        }
        MultipartUploadRequestMetadata multipartUploadRequestMetadata = (MultipartUploadRequestMetadata) other;
        return this.uploadRequestId == multipartUploadRequestMetadata.uploadRequestId && Intrinsics.areEqual(this.nodeId, multipartUploadRequestMetadata.nodeId) && Intrinsics.areEqual(this.uploadId, multipartUploadRequestMetadata.uploadId) && Intrinsics.areEqual(this.partSize, multipartUploadRequestMetadata.partSize) && Intrinsics.areEqual(this.totalNumberOfParts, multipartUploadRequestMetadata.totalNumberOfParts) && Intrinsics.areEqual(this.multipartUploadStartTime, multipartUploadRequestMetadata.multipartUploadStartTime) && Intrinsics.areEqual(this.multipartUploadExpirationTime, multipartUploadRequestMetadata.multipartUploadExpirationTime);
    }

    @Nullable
    public final String getMultipartUploadExpirationTime() {
        return this.multipartUploadExpirationTime;
    }

    @Nullable
    public final String getMultipartUploadStartTime() {
        return this.multipartUploadStartTime;
    }

    @NotNull
    public final String getNodeId() {
        return this.nodeId;
    }

    @Nullable
    public final Long getPartSize() {
        return this.partSize;
    }

    @Nullable
    public final Long getTotalNumberOfParts() {
        return this.totalNumberOfParts;
    }

    @Nullable
    public final String getUploadId() {
        return this.uploadId;
    }

    public final long getUploadRequestId() {
        return this.uploadRequestId;
    }

    public int hashCode() {
        int m = ArcMode$$ExternalSyntheticOutline0.m(Long.hashCode(this.uploadRequestId) * 31, 31, this.nodeId);
        String str = this.uploadId;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.partSize;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.totalNumberOfParts;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.multipartUploadStartTime;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.multipartUploadExpirationTime;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("MultipartUploadRequestMetadata(uploadRequestId=");
        sb.append(this.uploadRequestId);
        sb.append(", nodeId=");
        sb.append(this.nodeId);
        sb.append(", uploadId=");
        sb.append(this.uploadId);
        sb.append(", partSize=");
        sb.append(this.partSize);
        sb.append(", totalNumberOfParts=");
        sb.append(this.totalNumberOfParts);
        sb.append(", multipartUploadStartTime=");
        sb.append(this.multipartUploadStartTime);
        sb.append(", multipartUploadExpirationTime=");
        return ArcMode$$ExternalSyntheticOutline0.m(')', this.multipartUploadExpirationTime, sb);
    }

    public MultipartUploadRequestMetadata(long j, @NotNull String str, @Nullable String str2, @Nullable Long l, @Nullable Long l2, @Nullable String str3, @Nullable String str4) {
        str.getClass();
        this.uploadRequestId = j;
        this.nodeId = str;
        this.uploadId = str2;
        this.partSize = l;
        this.totalNumberOfParts = l2;
        this.multipartUploadStartTime = str3;
        this.multipartUploadExpirationTime = str4;
    }
}
