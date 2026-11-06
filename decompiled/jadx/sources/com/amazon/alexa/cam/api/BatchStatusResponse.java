package com.amazon.alexa.cam.api;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J-\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/cam/api/BatchStatusResponse;", "", "errors", "", "Lcom/amazon/alexa/cam/api/StatusError;", "successfulResults", "Lcom/amazon/alexa/cam/api/StatusSuccessResult;", "(Ljava/util/List;Ljava/util/List;)V", "getErrors", "()Ljava/util/List;", "getSuccessfulResults", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaMobileAndroidSimbaClient_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class BatchStatusResponse {

    @Nullable
    private final List<StatusError> errors;

    @Nullable
    private final List<StatusSuccessResult> successfulResults;

    public /* synthetic */ BatchStatusResponse(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BatchStatusResponse copy$default(BatchStatusResponse batchStatusResponse, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = batchStatusResponse.errors;
        }
        if ((i & 2) != 0) {
            list2 = batchStatusResponse.successfulResults;
        }
        return batchStatusResponse.copy(list, list2);
    }

    @Nullable
    public final List<StatusError> component1() {
        return this.errors;
    }

    @Nullable
    public final List<StatusSuccessResult> component2() {
        return this.successfulResults;
    }

    @NotNull
    public final BatchStatusResponse copy(@Nullable List<StatusError> errors, @Nullable List<StatusSuccessResult> successfulResults) {
        return new BatchStatusResponse(errors, successfulResults);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BatchStatusResponse)) {
            return false;
        }
        BatchStatusResponse batchStatusResponse = (BatchStatusResponse) other;
        return Intrinsics.areEqual(this.errors, batchStatusResponse.errors) && Intrinsics.areEqual(this.successfulResults, batchStatusResponse.successfulResults);
    }

    @Nullable
    public final List<StatusError> getErrors() {
        return this.errors;
    }

    @Nullable
    public final List<StatusSuccessResult> getSuccessfulResults() {
        return this.successfulResults;
    }

    public int hashCode() {
        List<StatusError> list = this.errors;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<StatusSuccessResult> list2 = this.successfulResults;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BatchStatusResponse(errors=" + this.errors + ", successfulResults=" + this.successfulResults + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public BatchStatusResponse(@Nullable List<StatusError> list, @Nullable List<StatusSuccessResult> list2) {
        this.errors = list;
        this.successfulResults = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BatchStatusResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
