package com.amazon.alexa.ra.core.metrics;

import com.amazon.alexa.ra.sdk.capability.ConversationCapability;
import kotlin.Metadata;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0003H&J$\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007H&J\u001c\u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007H&¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/amazon/alexa/ra/core/metrics/PreambleUserPerceivedLatencyMetricsProcessorApi;", "", "startTurn", "", "dialogStartTimestamp", "", "invocationType", "", "isRegenerate", "", "clearTurn", "onServerPreambleRendered", "renderedTimestamp", ConversationCapability.INTENT_EXTRA_FRAGMENT_URI, "dialogRequestId", "onClientPreambleRendered", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface PreambleUserPerceivedLatencyMetricsProcessorApi {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void startTurn(@NotNull PreambleUserPerceivedLatencyMetricsProcessorApi preambleUserPerceivedLatencyMetricsProcessorApi, long j, @NotNull String str, boolean z) {
            str.getClass();
            PreambleUserPerceivedLatencyMetricsProcessorApi.super.startTurn(j, str, z);
        }
    }

    static /* synthetic */ void onClientPreambleRendered$default(PreambleUserPerceivedLatencyMetricsProcessorApi preambleUserPerceivedLatencyMetricsProcessorApi, long j, String str, int i, Object obj) {
        if (obj != null) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: onClientPreambleRendered");
            return;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        preambleUserPerceivedLatencyMetricsProcessorApi.onClientPreambleRendered(j, str);
    }

    static /* synthetic */ void onServerPreambleRendered$default(PreambleUserPerceivedLatencyMetricsProcessorApi preambleUserPerceivedLatencyMetricsProcessorApi, long j, String str, String str2, int i, Object obj) {
        if (obj != null) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: onServerPreambleRendered");
            return;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        preambleUserPerceivedLatencyMetricsProcessorApi.onServerPreambleRendered(j, str, str2);
    }

    void clearTurn();

    void onClientPreambleRendered(long renderedTimestamp, @Nullable String dialogRequestId);

    void onServerPreambleRendered(long renderedTimestamp, @NotNull String fragmentUri, @Nullable String dialogRequestId);

    void startTurn(long dialogStartTimestamp, @NotNull String invocationType);

    default void startTurn(long dialogStartTimestamp, @NotNull String invocationType, boolean isRegenerate) {
        invocationType.getClass();
        startTurn(dialogStartTimestamp, invocationType);
    }
}
