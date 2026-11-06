package com.amazon.alexa.ra.core.data.model;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.configservice.metrics.MetricsConstants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/ApiMetricsData;", "", "startTimestamp", "", MetricsConstants.Type.FILE_SIZE, "fileExtension", "", "<init>", "(JJLjava/lang/String;)V", "getStartTimestamp", "()J", "getFileSize", "getFileExtension", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class ApiMetricsData {
    public static final int $stable = 0;

    @Nullable
    private final String fileExtension;
    private final long fileSize;
    private final long startTimestamp;

    public ApiMetricsData(long j, long j2, @Nullable String str) {
        this.startTimestamp = j;
        this.fileSize = j2;
        this.fileExtension = str;
    }

    public static /* synthetic */ ApiMetricsData copy$default(ApiMetricsData apiMetricsData, long j, long j2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = apiMetricsData.startTimestamp;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = apiMetricsData.fileSize;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            str = apiMetricsData.fileExtension;
        }
        return apiMetricsData.copy(j3, j4, str);
    }

    /* renamed from: component1, reason: from getter */
    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    /* renamed from: component2, reason: from getter */
    public final long getFileSize() {
        return this.fileSize;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getFileExtension() {
        return this.fileExtension;
    }

    @NotNull
    public final ApiMetricsData copy(long startTimestamp, long fileSize, @Nullable String fileExtension) {
        return new ApiMetricsData(startTimestamp, fileSize, fileExtension);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiMetricsData)) {
            return false;
        }
        ApiMetricsData apiMetricsData = (ApiMetricsData) other;
        return this.startTimestamp == apiMetricsData.startTimestamp && this.fileSize == apiMetricsData.fileSize && Intrinsics.areEqual(this.fileExtension, apiMetricsData.fileExtension);
    }

    @Nullable
    public final String getFileExtension() {
        return this.fileExtension;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    public int hashCode() {
        int m = BitVector$$ExternalSyntheticOutline0.m(this.fileSize, Long.hashCode(this.startTimestamp) * 31, 31);
        String str = this.fileExtension;
        return m + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        long j = this.startTimestamp;
        long j2 = this.fileSize;
        String str = this.fileExtension;
        StringBuilder m = a$$ExternalSyntheticOutline0.m("ApiMetricsData(startTimestamp=", j, ", fileSize=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(j2, ", fileExtension=", str, m);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }
}
