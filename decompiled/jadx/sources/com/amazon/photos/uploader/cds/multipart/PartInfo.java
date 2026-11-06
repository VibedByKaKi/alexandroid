package com.amazon.photos.uploader.cds.multipart;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.Index;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.dee.app.ui.web.AlexaDeviceBackgroundImageBridge;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Entity(indices = {@Index(name = "idx_upload_request_id", value = {"upload_request_id"})}, primaryKeys = {"part_id", "upload_request_id"}, tableName = "part_info")
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b.\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B{\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u0011J\t\u0010.\u001a\u00020\u0004HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u00101\u001a\u00020\u0004HÆ\u0003J\t\u00102\u001a\u00020\u0007HÆ\u0003J\t\u00103\u001a\u00020\u0004HÆ\u0003J\t\u00104\u001a\u00020\u0004HÆ\u0003J\t\u00105\u001a\u00020\u0004HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u00107\u001a\u00020\u0004HÆ\u0003J\t\u00108\u001a\u00020\u0004HÆ\u0003J}\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020>HÖ\u0001J\t\u0010?\u001a\u00020\fHÖ\u0001R \u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R \u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R\u001e\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\u001e\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\u0019R\u001e\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0017\"\u0004\b#\u0010\u0019R\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0017\"\u0004\b%\u0010\u0019R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R \u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0013\"\u0004\b+\u0010\u0015R\u001e\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0017\"\u0004\b-\u0010\u0019¨\u0006@"}, d2 = {"Lcom/amazon/photos/uploader/cds/multipart/PartInfo;", "", "()V", "partId", "", "uploadRequestId", "partUploadState", "Lcom/amazon/photos/uploader/cds/multipart/PartUploadState;", "partEnqueueTimestamp", "partUploadStartTimestamp", "partUploadCompleteTimestamp", "partMd5", "", "partSize", "partOffset", "serviceUploadId", AlexaDeviceBackgroundImageBridge.KEY_NODE_ID, "(JJLcom/amazon/photos/uploader/cds/multipart/PartUploadState;JJJLjava/lang/String;JJLjava/lang/String;Ljava/lang/String;)V", "getNodeId", "()Ljava/lang/String;", "setNodeId", "(Ljava/lang/String;)V", "getPartEnqueueTimestamp", "()J", "setPartEnqueueTimestamp", "(J)V", "getPartId", "setPartId", "getPartMd5", "setPartMd5", "getPartOffset", "setPartOffset", "getPartSize", "setPartSize", "getPartUploadCompleteTimestamp", "setPartUploadCompleteTimestamp", "getPartUploadStartTimestamp", "setPartUploadStartTimestamp", "getPartUploadState", "()Lcom/amazon/photos/uploader/cds/multipart/PartUploadState;", "setPartUploadState", "(Lcom/amazon/photos/uploader/cds/multipart/PartUploadState;)V", "getServiceUploadId", "setServiceUploadId", "getUploadRequestId", "setUploadRequestId", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PartInfo {

    @ColumnInfo(name = "node_id")
    @Nullable
    private String nodeId;

    @ColumnInfo(name = "part_enqueue_timestamp")
    private long partEnqueueTimestamp;

    @ColumnInfo(name = "part_id")
    private long partId;

    @ColumnInfo(name = "part_md5")
    @Nullable
    private String partMd5;

    @ColumnInfo(name = "part_offset")
    private long partOffset;

    @ColumnInfo(name = "part_size")
    private long partSize;

    @ColumnInfo(name = "part_upload_complete_timestamp")
    private long partUploadCompleteTimestamp;

    @ColumnInfo(name = "part_upload_start_timestamp")
    private long partUploadStartTimestamp;

    @ColumnInfo(name = "part_upload_state")
    @NotNull
    private PartUploadState partUploadState;

    @ColumnInfo(name = "service_upload_id")
    @Nullable
    private String serviceUploadId;

    @ColumnInfo(name = "upload_request_id")
    private long uploadRequestId;

    public /* synthetic */ PartInfo(long j, long j2, PartUploadState partUploadState, long j3, long j4, long j5, String str, long j6, long j7, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? PartUploadState.ENQUEUED : partUploadState, (i & 8) != 0 ? System.currentTimeMillis() : j3, (i & 16) != 0 ? 0L : j4, (i & 32) != 0 ? 0L : j5, (i & 64) != 0 ? null : str, (i & 128) != 0 ? 0L : j6, (i & 256) != 0 ? 0L : j7, (i & 512) != 0 ? null : str2, (i & 1024) != 0 ? null : str3);
    }

    /* renamed from: component1, reason: from getter */
    public final long getPartId() {
        return this.partId;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final String getServiceUploadId() {
        return this.serviceUploadId;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final String getNodeId() {
        return this.nodeId;
    }

    /* renamed from: component2, reason: from getter */
    public final long getUploadRequestId() {
        return this.uploadRequestId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final PartUploadState getPartUploadState() {
        return this.partUploadState;
    }

    /* renamed from: component4, reason: from getter */
    public final long getPartEnqueueTimestamp() {
        return this.partEnqueueTimestamp;
    }

    /* renamed from: component5, reason: from getter */
    public final long getPartUploadStartTimestamp() {
        return this.partUploadStartTimestamp;
    }

    /* renamed from: component6, reason: from getter */
    public final long getPartUploadCompleteTimestamp() {
        return this.partUploadCompleteTimestamp;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getPartMd5() {
        return this.partMd5;
    }

    /* renamed from: component8, reason: from getter */
    public final long getPartSize() {
        return this.partSize;
    }

    /* renamed from: component9, reason: from getter */
    public final long getPartOffset() {
        return this.partOffset;
    }

    @NotNull
    public final PartInfo copy(long partId, long uploadRequestId, @NotNull PartUploadState partUploadState, long partEnqueueTimestamp, long partUploadStartTimestamp, long partUploadCompleteTimestamp, @Nullable String partMd5, long partSize, long partOffset, @Nullable String serviceUploadId, @Nullable String nodeId) {
        partUploadState.getClass();
        return new PartInfo(partId, uploadRequestId, partUploadState, partEnqueueTimestamp, partUploadStartTimestamp, partUploadCompleteTimestamp, partMd5, partSize, partOffset, serviceUploadId, nodeId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PartInfo)) {
            return false;
        }
        PartInfo partInfo = (PartInfo) other;
        return this.partId == partInfo.partId && this.uploadRequestId == partInfo.uploadRequestId && this.partUploadState == partInfo.partUploadState && this.partEnqueueTimestamp == partInfo.partEnqueueTimestamp && this.partUploadStartTimestamp == partInfo.partUploadStartTimestamp && this.partUploadCompleteTimestamp == partInfo.partUploadCompleteTimestamp && Intrinsics.areEqual(this.partMd5, partInfo.partMd5) && this.partSize == partInfo.partSize && this.partOffset == partInfo.partOffset && Intrinsics.areEqual(this.serviceUploadId, partInfo.serviceUploadId) && Intrinsics.areEqual(this.nodeId, partInfo.nodeId);
    }

    @Nullable
    public final String getNodeId() {
        return this.nodeId;
    }

    public final long getPartEnqueueTimestamp() {
        return this.partEnqueueTimestamp;
    }

    public final long getPartId() {
        return this.partId;
    }

    @Nullable
    public final String getPartMd5() {
        return this.partMd5;
    }

    public final long getPartOffset() {
        return this.partOffset;
    }

    public final long getPartSize() {
        return this.partSize;
    }

    public final long getPartUploadCompleteTimestamp() {
        return this.partUploadCompleteTimestamp;
    }

    public final long getPartUploadStartTimestamp() {
        return this.partUploadStartTimestamp;
    }

    @NotNull
    public final PartUploadState getPartUploadState() {
        return this.partUploadState;
    }

    @Nullable
    public final String getServiceUploadId() {
        return this.serviceUploadId;
    }

    public final long getUploadRequestId() {
        return this.uploadRequestId;
    }

    public int hashCode() {
        int m = BitVector$$ExternalSyntheticOutline0.m(this.partUploadCompleteTimestamp, BitVector$$ExternalSyntheticOutline0.m(this.partUploadStartTimestamp, BitVector$$ExternalSyntheticOutline0.m(this.partEnqueueTimestamp, (this.partUploadState.hashCode() + BitVector$$ExternalSyntheticOutline0.m(this.uploadRequestId, Long.hashCode(this.partId) * 31, 31)) * 31, 31), 31), 31);
        String str = this.partMd5;
        int m2 = BitVector$$ExternalSyntheticOutline0.m(this.partOffset, BitVector$$ExternalSyntheticOutline0.m(this.partSize, (m + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        String str2 = this.serviceUploadId;
        int hashCode = (m2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nodeId;
        return hashCode + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setNodeId(@Nullable String str) {
        this.nodeId = str;
    }

    public final void setPartEnqueueTimestamp(long j) {
        this.partEnqueueTimestamp = j;
    }

    public final void setPartId(long j) {
        this.partId = j;
    }

    public final void setPartMd5(@Nullable String str) {
        this.partMd5 = str;
    }

    public final void setPartOffset(long j) {
        this.partOffset = j;
    }

    public final void setPartSize(long j) {
        this.partSize = j;
    }

    public final void setPartUploadCompleteTimestamp(long j) {
        this.partUploadCompleteTimestamp = j;
    }

    public final void setPartUploadStartTimestamp(long j) {
        this.partUploadStartTimestamp = j;
    }

    public final void setPartUploadState(@NotNull PartUploadState partUploadState) {
        partUploadState.getClass();
        this.partUploadState = partUploadState;
    }

    public final void setServiceUploadId(@Nullable String str) {
        this.serviceUploadId = str;
    }

    public final void setUploadRequestId(long j) {
        this.uploadRequestId = j;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("PartInfo(partId=");
        sb.append(this.partId);
        sb.append(", uploadRequestId=");
        sb.append(this.uploadRequestId);
        sb.append(", partUploadState=");
        sb.append(this.partUploadState);
        sb.append(", partEnqueueTimestamp=");
        sb.append(this.partEnqueueTimestamp);
        sb.append(", partUploadStartTimestamp=");
        sb.append(this.partUploadStartTimestamp);
        sb.append(", partUploadCompleteTimestamp=");
        sb.append(this.partUploadCompleteTimestamp);
        sb.append(", partMd5=");
        sb.append(this.partMd5);
        sb.append(", partSize=");
        sb.append(this.partSize);
        sb.append(", partOffset=");
        sb.append(this.partOffset);
        sb.append(", serviceUploadId=");
        sb.append(this.serviceUploadId);
        sb.append(", nodeId=");
        return ArcMode$$ExternalSyntheticOutline0.m(')', this.nodeId, sb);
    }

    @Ignore
    public PartInfo(long j, long j2, @NotNull PartUploadState partUploadState, long j3, long j4, long j5, @Nullable String str, long j6, long j7, @Nullable String str2, @Nullable String str3) {
        partUploadState.getClass();
        this.partId = j;
        this.uploadRequestId = j2;
        this.partUploadState = partUploadState;
        this.partEnqueueTimestamp = j3;
        this.partUploadStartTimestamp = j4;
        this.partUploadCompleteTimestamp = j5;
        this.partMd5 = str;
        this.partSize = j6;
        this.partOffset = j7;
        this.serviceUploadId = str2;
        this.nodeId = str3;
    }

    public PartInfo() {
        this(0L, 0L, null, 0L, 0L, 0L, null, 0L, 0L, null, null, 2046, null);
    }
}
