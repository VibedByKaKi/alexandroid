package com.mapbox.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes8.dex */
public class DownloadStatus implements Serializable {
    private long downloadId;

    @NonNull
    private DownloadOptions downloadOptions;

    @Nullable
    private TransferError error;

    @Nullable
    private Expected<HttpRequestError, HttpResponseData> httpResult;
    private long receivedBytes;

    @NonNull
    private TransferState state;

    @Nullable
    private Long totalBytes;
    private long transferredBytes;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public DownloadStatus(@Nullable TransferError transferError, @Nullable Long l, @NonNull DownloadOptions downloadOptions, @Nullable Expected<HttpRequestError, HttpResponseData> expected) {
        this.error = transferError;
        this.totalBytes = l;
        this.downloadOptions = downloadOptions;
        this.httpResult = expected;
        this.downloadId = 0L;
        this.state = TransferState.PENDING;
        this.receivedBytes = 0L;
        this.transferredBytes = 0L;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DownloadStatus downloadStatus = (DownloadStatus) obj;
        return this.downloadId == downloadStatus.downloadId && Objects.equals(this.state, downloadStatus.state) && Objects.equals(this.error, downloadStatus.error) && Objects.equals(this.totalBytes, downloadStatus.totalBytes) && this.receivedBytes == downloadStatus.receivedBytes && this.transferredBytes == downloadStatus.transferredBytes && Objects.equals(this.downloadOptions, downloadStatus.downloadOptions) && Objects.equals(this.httpResult, downloadStatus.httpResult);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public long getDownloadId() {
        return this.downloadId;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DownloadOptions getDownloadOptions() {
        return this.downloadOptions;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public TransferError getError() {
        return this.error;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public Expected<HttpRequestError, HttpResponseData> getHttpResult() {
        return this.httpResult;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public long getReceivedBytes() {
        return this.receivedBytes;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public TransferState getState() {
        return this.state;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public Long getTotalBytes() {
        return this.totalBytes;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public long getTransferredBytes() {
        return this.transferredBytes;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.downloadId), this.state, this.error, this.totalBytes, Long.valueOf(this.receivedBytes), Long.valueOf(this.transferredBytes), this.downloadOptions, this.httpResult);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setDownloadId(long j) {
        this.downloadId = j;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setDownloadOptions(@NonNull DownloadOptions downloadOptions) {
        this.downloadOptions = downloadOptions;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setError(@Nullable TransferError transferError) {
        this.error = transferError;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setHttpResult(@Nullable Expected<HttpRequestError, HttpResponseData> expected) {
        this.httpResult = expected;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setReceivedBytes(long j) {
        this.receivedBytes = j;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setState(@NonNull TransferState transferState) {
        this.state = transferState;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setTotalBytes(@Nullable Long l) {
        this.totalBytes = l;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setTransferredBytes(long j) {
        this.transferredBytes = j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[downloadId: ");
        RegionDefaults$$ExternalSyntheticOutline0.m(this.downloadId, ", state: ", sb);
        sb.append(RecordUtils.fieldToString(this.state));
        sb.append(", error: ");
        sb.append(RecordUtils.fieldToString(this.error));
        sb.append(", totalBytes: ");
        sb.append(RecordUtils.fieldToString(this.totalBytes));
        sb.append(", receivedBytes: ");
        RegionDefaults$$ExternalSyntheticOutline0.m(this.receivedBytes, ", transferredBytes: ", sb);
        RegionDefaults$$ExternalSyntheticOutline0.m(this.transferredBytes, ", downloadOptions: ", sb);
        sb.append(RecordUtils.fieldToString(this.downloadOptions));
        sb.append(", httpResult: ");
        sb.append(RecordUtils.fieldToString(this.httpResult));
        sb.append(MarkdownConstants.RIGHT_BRACKET);
        return sb.toString();
    }

    public DownloadStatus(long j, @NonNull TransferState transferState, @Nullable TransferError transferError, @Nullable Long l, long j2, long j3, @NonNull DownloadOptions downloadOptions, @Nullable Expected<HttpRequestError, HttpResponseData> expected) {
        this.downloadId = j;
        this.state = transferState;
        this.error = transferError;
        this.totalBytes = l;
        this.receivedBytes = j2;
        this.transferredBytes = j3;
        this.downloadOptions = downloadOptions;
        this.httpResult = expected;
    }
}
