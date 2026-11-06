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
public class UploadStatus implements Serializable {

    @Nullable
    private TransferError error;

    @Nullable
    private Expected<HttpRequestError, HttpResponseData> httpResult;
    private long sentBytes;

    @NonNull
    private TransferState state;

    @Nullable
    private Long totalBytes;
    private long totalSentBytes;
    private long uploadId;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public UploadStatus(@Nullable TransferError transferError, @Nullable Long l, @Nullable Expected<HttpRequestError, HttpResponseData> expected) {
        this.error = transferError;
        this.totalBytes = l;
        this.httpResult = expected;
        this.uploadId = 0L;
        this.state = TransferState.PENDING;
        this.sentBytes = 0L;
        this.totalSentBytes = 0L;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UploadStatus uploadStatus = (UploadStatus) obj;
        return this.uploadId == uploadStatus.uploadId && Objects.equals(this.state, uploadStatus.state) && Objects.equals(this.error, uploadStatus.error) && Objects.equals(this.totalBytes, uploadStatus.totalBytes) && this.sentBytes == uploadStatus.sentBytes && this.totalSentBytes == uploadStatus.totalSentBytes && Objects.equals(this.httpResult, uploadStatus.httpResult);
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
    public long getSentBytes() {
        return this.sentBytes;
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
    public long getTotalSentBytes() {
        return this.totalSentBytes;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public long getUploadId() {
        return this.uploadId;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.uploadId), this.state, this.error, this.totalBytes, Long.valueOf(this.sentBytes), Long.valueOf(this.totalSentBytes), this.httpResult);
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
    public void setSentBytes(long j) {
        this.sentBytes = j;
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
    public void setTotalSentBytes(long j) {
        this.totalSentBytes = j;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setUploadId(long j) {
        this.uploadId = j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[uploadId: ");
        RegionDefaults$$ExternalSyntheticOutline0.m(this.uploadId, ", state: ", sb);
        sb.append(RecordUtils.fieldToString(this.state));
        sb.append(", error: ");
        sb.append(RecordUtils.fieldToString(this.error));
        sb.append(", totalBytes: ");
        sb.append(RecordUtils.fieldToString(this.totalBytes));
        sb.append(", sentBytes: ");
        RegionDefaults$$ExternalSyntheticOutline0.m(this.sentBytes, ", totalSentBytes: ", sb);
        RegionDefaults$$ExternalSyntheticOutline0.m(this.totalSentBytes, ", httpResult: ", sb);
        sb.append(RecordUtils.fieldToString(this.httpResult));
        sb.append(MarkdownConstants.RIGHT_BRACKET);
        return sb.toString();
    }

    public UploadStatus(long j, @NonNull TransferState transferState, @Nullable TransferError transferError, @Nullable Long l, long j2, long j3, @Nullable Expected<HttpRequestError, HttpResponseData> expected) {
        this.uploadId = j;
        this.state = transferState;
        this.error = transferError;
        this.totalBytes = l;
        this.sentBytes = j2;
        this.totalSentBytes = j3;
        this.httpResult = expected;
    }
}
