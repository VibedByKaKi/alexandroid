package com.amazon.comms.calling.domain.usecase;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.dee.app.services.shortcut.ShortcutConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import defpackage.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/amazon/comms/calling/domain/usecase/RecordPccMetricsParams;", "", ShortcutConstants.METRIC_NAME_KEY, "", "success", "", "error", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "getMetricName", "()Ljava/lang/String;", "getSuccess", "()Z", "getError", "component1", "component2", "component3", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class RecordPccMetricsParams {

    @Nullable
    private final String error;

    @NotNull
    private final String metricName;
    private final boolean success;

    public RecordPccMetricsParams(@NotNull String str, boolean z, @Nullable String str2) {
        str.getClass();
        this.metricName = str;
        this.success = z;
        this.error = str2;
    }

    public static /* synthetic */ RecordPccMetricsParams copy$default(RecordPccMetricsParams recordPccMetricsParams, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recordPccMetricsParams.metricName;
        }
        if ((i & 2) != 0) {
            z = recordPccMetricsParams.success;
        }
        if ((i & 4) != 0) {
            str2 = recordPccMetricsParams.error;
        }
        return recordPccMetricsParams.copy(str, z, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getMetricName() {
        return this.metricName;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getError() {
        return this.error;
    }

    @NotNull
    public final RecordPccMetricsParams copy(@NotNull String metricName, boolean success, @Nullable String error) {
        metricName.getClass();
        return new RecordPccMetricsParams(metricName, success, error);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecordPccMetricsParams)) {
            return false;
        }
        RecordPccMetricsParams recordPccMetricsParams = (RecordPccMetricsParams) other;
        return Intrinsics.areEqual(this.metricName, recordPccMetricsParams.metricName) && this.success == recordPccMetricsParams.success && Intrinsics.areEqual(this.error, recordPccMetricsParams.error);
    }

    @Nullable
    public final String getError() {
        return this.error;
    }

    @NotNull
    public final String getMetricName() {
        return this.metricName;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int a2 = c.a(this.success, this.metricName.hashCode() * 31, 31);
        String str = this.error;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.metricName;
        boolean z = this.success;
        return a$$ExternalSyntheticOutline0.m(Automotive$$ExternalSyntheticOutline0.m("RecordPccMetricsParams(metricName=", str, ", success=", z, ", error="), this.error, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public /* synthetic */ RecordPccMetricsParams(String str, boolean z, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, (i & 4) != 0 ? null : str2);
    }
}
