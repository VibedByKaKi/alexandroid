package com.amazon.alexa.ra.core.features.artifact;

import com.amazon.alexa.ra.core.data.model.ApiMetricsData;
import com.amazon.alexa.ra.core.data.model.UploadApiType;
import com.amazon.dee.app.ui.web.JavaScriptResponse;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&J*\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J \u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\tH\u0016¨\u0006\u0019À\u0006\u0003"}, d2 = {"Lcom/amazon/alexa/ra/core/features/artifact/UploadMetricsProcessorApi;", "", "emitFailure", "", "apiType", "Lcom/amazon/alexa/ra/core/data/model/UploadApiType;", "metricsData", "Lcom/amazon/alexa/ra/core/data/model/ApiMetricsData;", "eventSource", "", "emitLatency", "latencyMs", "", "emitMultiFileUploadLatency", "fileCount", "", "emitBatchPollMetrics", "pollCount", "emitBatchCommitSuccess", "nodeCount", "emitBatchCommitLatency", "emitRetryAllInitiated", "emitBatchPollTimeout", "emitBatchCommitFailed", JavaScriptResponse.KEY_ERROR_REASON, "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface UploadMetricsProcessorApi {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void emitBatchCommitFailed(@NotNull UploadMetricsProcessorApi uploadMetricsProcessorApi, int i, @NotNull String str) {
            str.getClass();
            UploadMetricsProcessorApi.super.emitBatchCommitFailed(i, str);
        }

        @Deprecated
        public static void emitBatchCommitLatency(@NotNull UploadMetricsProcessorApi uploadMetricsProcessorApi, long j, int i) {
            UploadMetricsProcessorApi.super.emitBatchCommitLatency(j, i);
        }

        @Deprecated
        public static void emitBatchCommitSuccess(@NotNull UploadMetricsProcessorApi uploadMetricsProcessorApi, int i) {
            UploadMetricsProcessorApi.super.emitBatchCommitSuccess(i);
        }

        @Deprecated
        public static void emitBatchPollMetrics(@NotNull UploadMetricsProcessorApi uploadMetricsProcessorApi, long j, int i, int i2) {
            UploadMetricsProcessorApi.super.emitBatchPollMetrics(j, i, i2);
        }

        @Deprecated
        public static void emitBatchPollTimeout(@NotNull UploadMetricsProcessorApi uploadMetricsProcessorApi, int i) {
            UploadMetricsProcessorApi.super.emitBatchPollTimeout(i);
        }

        @Deprecated
        public static void emitMultiFileUploadLatency(@NotNull UploadMetricsProcessorApi uploadMetricsProcessorApi, long j, int i) {
            UploadMetricsProcessorApi.super.emitMultiFileUploadLatency(j, i);
        }

        @Deprecated
        public static void emitRetryAllInitiated(@NotNull UploadMetricsProcessorApi uploadMetricsProcessorApi, int i) {
            UploadMetricsProcessorApi.super.emitRetryAllInitiated(i);
        }
    }

    default void emitBatchCommitFailed(int nodeCount, @NotNull String errorReason) {
        errorReason.getClass();
    }

    void emitFailure(@NotNull UploadApiType apiType, @NotNull ApiMetricsData metricsData, @Nullable String eventSource);

    void emitLatency(@NotNull UploadApiType apiType, @NotNull ApiMetricsData metricsData, long latencyMs, @Nullable String eventSource);

    default void emitBatchCommitSuccess(int nodeCount) {
    }

    default void emitBatchPollTimeout(int nodeCount) {
    }

    default void emitRetryAllInitiated(int fileCount) {
    }

    default void emitBatchCommitLatency(long latencyMs, int nodeCount) {
    }

    default void emitMultiFileUploadLatency(long latencyMs, int fileCount) {
    }

    default void emitBatchPollMetrics(long latencyMs, int pollCount, int fileCount) {
    }
}
