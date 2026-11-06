package com.amazon.alexa.ra.core.data.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/FileUploadState;", "", "file", "Lcom/amazon/alexa/ra/core/data/model/LocalMediaInfo;", "uploadStatus", "Lcom/amazon/alexa/ra/core/data/model/UploadStatus;", "errorInfo", "Lcom/amazon/alexa/ra/core/data/model/UploadErrorInfo;", "<init>", "(Lcom/amazon/alexa/ra/core/data/model/LocalMediaInfo;Lcom/amazon/alexa/ra/core/data/model/UploadStatus;Lcom/amazon/alexa/ra/core/data/model/UploadErrorInfo;)V", "getFile", "()Lcom/amazon/alexa/ra/core/data/model/LocalMediaInfo;", "getUploadStatus", "()Lcom/amazon/alexa/ra/core/data/model/UploadStatus;", "getErrorInfo", "()Lcom/amazon/alexa/ra/core/data/model/UploadErrorInfo;", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "ui-ingress_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class FileUploadState {
    public static final int $stable = 8;

    @NotNull
    private final UploadErrorInfo errorInfo;

    @NotNull
    private final LocalMediaInfo file;

    @NotNull
    private final UploadStatus uploadStatus;

    public /* synthetic */ FileUploadState(LocalMediaInfo localMediaInfo, UploadStatus uploadStatus, UploadErrorInfo uploadErrorInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(localMediaInfo, (i & 2) != 0 ? UploadStatus.IDLE : uploadStatus, (i & 4) != 0 ? UploadErrorInfo.INSTANCE.getEMPTY_UPLOAD_ERROR_INFO() : uploadErrorInfo);
    }

    public static /* synthetic */ FileUploadState copy$default(FileUploadState fileUploadState, LocalMediaInfo localMediaInfo, UploadStatus uploadStatus, UploadErrorInfo uploadErrorInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            localMediaInfo = fileUploadState.file;
        }
        if ((i & 2) != 0) {
            uploadStatus = fileUploadState.uploadStatus;
        }
        if ((i & 4) != 0) {
            uploadErrorInfo = fileUploadState.errorInfo;
        }
        return fileUploadState.copy(localMediaInfo, uploadStatus, uploadErrorInfo);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final LocalMediaInfo getFile() {
        return this.file;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final UploadStatus getUploadStatus() {
        return this.uploadStatus;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final UploadErrorInfo getErrorInfo() {
        return this.errorInfo;
    }

    @NotNull
    public final FileUploadState copy(@NotNull LocalMediaInfo file, @NotNull UploadStatus uploadStatus, @NotNull UploadErrorInfo errorInfo) {
        file.getClass();
        uploadStatus.getClass();
        errorInfo.getClass();
        return new FileUploadState(file, uploadStatus, errorInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileUploadState)) {
            return false;
        }
        FileUploadState fileUploadState = (FileUploadState) other;
        return Intrinsics.areEqual(this.file, fileUploadState.file) && this.uploadStatus == fileUploadState.uploadStatus && Intrinsics.areEqual(this.errorInfo, fileUploadState.errorInfo);
    }

    @NotNull
    public final UploadErrorInfo getErrorInfo() {
        return this.errorInfo;
    }

    @NotNull
    public final LocalMediaInfo getFile() {
        return this.file;
    }

    @NotNull
    public final UploadStatus getUploadStatus() {
        return this.uploadStatus;
    }

    public int hashCode() {
        return this.errorInfo.hashCode() + ((this.uploadStatus.hashCode() + (this.file.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "FileUploadState(file=" + this.file + ", uploadStatus=" + this.uploadStatus + ", errorInfo=" + this.errorInfo + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public FileUploadState(@NotNull LocalMediaInfo localMediaInfo, @NotNull UploadStatus uploadStatus, @NotNull UploadErrorInfo uploadErrorInfo) {
        localMediaInfo.getClass();
        uploadStatus.getClass();
        uploadErrorInfo.getClass();
        this.file = localMediaInfo;
        this.uploadStatus = uploadStatus;
        this.errorInfo = uploadErrorInfo;
    }
}
