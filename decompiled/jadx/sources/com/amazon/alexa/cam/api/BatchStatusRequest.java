package com.amazon.alexa.cam.api;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/cam/api/BatchStatusRequest;", "", "items", "", "Lcom/amazon/alexa/cam/api/StatusRequestItem;", "requestId", "", "(Ljava/util/List;Ljava/lang/String;)V", "getItems", "()Ljava/util/List;", "getRequestId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidSimbaClient_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class BatchStatusRequest {

    @NotNull
    private final List<StatusRequestItem> items;

    @NotNull
    private final String requestId;

    public BatchStatusRequest(@NotNull List<StatusRequestItem> list, @NotNull String str) {
        list.getClass();
        str.getClass();
        this.items = list;
        this.requestId = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BatchStatusRequest copy$default(BatchStatusRequest batchStatusRequest, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = batchStatusRequest.items;
        }
        if ((i & 2) != 0) {
            str = batchStatusRequest.requestId;
        }
        return batchStatusRequest.copy(list, str);
    }

    @NotNull
    public final List<StatusRequestItem> component1() {
        return this.items;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    @NotNull
    public final BatchStatusRequest copy(@NotNull List<StatusRequestItem> items, @NotNull String requestId) {
        items.getClass();
        requestId.getClass();
        return new BatchStatusRequest(items, requestId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BatchStatusRequest)) {
            return false;
        }
        BatchStatusRequest batchStatusRequest = (BatchStatusRequest) other;
        return Intrinsics.areEqual(this.items, batchStatusRequest.items) && Intrinsics.areEqual(this.requestId, batchStatusRequest.requestId);
    }

    @NotNull
    public final List<StatusRequestItem> getItems() {
        return this.items;
    }

    @NotNull
    public final String getRequestId() {
        return this.requestId;
    }

    public int hashCode() {
        return this.requestId.hashCode() + (this.items.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "BatchStatusRequest(items=" + this.items + ", requestId=" + this.requestId + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
