package com.amazon.alexa.ra.core.data.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/UploadStatusMessage;", "", "id", "", "uploadStatus", "Lcom/amazon/alexa/ra/core/data/model/UploadStatus;", "<init>", "(Ljava/lang/String;Lcom/amazon/alexa/ra/core/data/model/UploadStatus;)V", "getId", "()Ljava/lang/String;", "getUploadStatus", "()Lcom/amazon/alexa/ra/core/data/model/UploadStatus;", "setUploadStatus", "(Lcom/amazon/alexa/ra/core/data/model/UploadStatus;)V", "isUploadFinalized", "", "isUploading", "component1", "component2", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "ui-ingress_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class UploadStatusMessage {
    public static final int $stable = 8;

    @NotNull
    private final String id;

    @NotNull
    private UploadStatus uploadStatus;

    public UploadStatusMessage(@NotNull String str, @NotNull UploadStatus uploadStatus) {
        str.getClass();
        uploadStatus.getClass();
        this.id = str;
        this.uploadStatus = uploadStatus;
    }

    public static /* synthetic */ UploadStatusMessage copy$default(UploadStatusMessage uploadStatusMessage, String str, UploadStatus uploadStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uploadStatusMessage.id;
        }
        if ((i & 2) != 0) {
            uploadStatus = uploadStatusMessage.uploadStatus;
        }
        return uploadStatusMessage.copy(str, uploadStatus);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final UploadStatus getUploadStatus() {
        return this.uploadStatus;
    }

    @NotNull
    public final UploadStatusMessage copy(@NotNull String id, @NotNull UploadStatus uploadStatus) {
        id.getClass();
        uploadStatus.getClass();
        return new UploadStatusMessage(id, uploadStatus);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadStatusMessage)) {
            return false;
        }
        UploadStatusMessage uploadStatusMessage = (UploadStatusMessage) other;
        return Intrinsics.areEqual(this.id, uploadStatusMessage.id) && this.uploadStatus == uploadStatusMessage.uploadStatus;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final UploadStatus getUploadStatus() {
        return this.uploadStatus;
    }

    public int hashCode() {
        return this.uploadStatus.hashCode() + (this.id.hashCode() * 31);
    }

    public final boolean isUploadFinalized() {
        UploadStatus uploadStatus = this.uploadStatus;
        return (uploadStatus == UploadStatus.UPLOADING || uploadStatus == UploadStatus.IDLE) ? false : true;
    }

    public final boolean isUploading() {
        return this.uploadStatus == UploadStatus.UPLOADING;
    }

    public final void setUploadStatus(@NotNull UploadStatus uploadStatus) {
        uploadStatus.getClass();
        this.uploadStatus = uploadStatus;
    }

    @NotNull
    public String toString() {
        return "UploadStatusMessage(id=" + this.id + ", uploadStatus=" + this.uploadStatus + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
