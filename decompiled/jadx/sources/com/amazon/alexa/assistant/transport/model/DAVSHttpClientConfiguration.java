package com.amazon.alexa.assistant.transport.model;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/transport/model/DAVSHttpClientConfiguration;", "Lcom/amazon/alexa/assistant/transport/model/HttpClientConfiguration;", "writeTimeoutMs", "", "<init>", "(J)V", "getWriteTimeoutMs", "()J", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "transport_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class DAVSHttpClientConfiguration extends HttpClientConfiguration {
    private final long writeTimeoutMs;

    public /* synthetic */ DAVSHttpClientConfiguration(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 2000L : j);
    }

    public static /* synthetic */ DAVSHttpClientConfiguration copy$default(DAVSHttpClientConfiguration dAVSHttpClientConfiguration, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = dAVSHttpClientConfiguration.writeTimeoutMs;
        }
        return dAVSHttpClientConfiguration.copy(j);
    }

    /* renamed from: component1, reason: from getter */
    public final long getWriteTimeoutMs() {
        return this.writeTimeoutMs;
    }

    @NotNull
    public final DAVSHttpClientConfiguration copy(long writeTimeoutMs) {
        return new DAVSHttpClientConfiguration(writeTimeoutMs);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DAVSHttpClientConfiguration) && this.writeTimeoutMs == ((DAVSHttpClientConfiguration) other).writeTimeoutMs;
    }

    @Override // com.amazon.alexa.assistant.transport.model.HttpClientConfiguration
    public long getWriteTimeoutMs() {
        return this.writeTimeoutMs;
    }

    public int hashCode() {
        return Long.hashCode(this.writeTimeoutMs);
    }

    @NotNull
    public String toString() {
        return AppLaunchChecker$$ExternalSyntheticOutline0.m("DAVSHttpClientConfiguration(writeTimeoutMs=", this.writeTimeoutMs, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public DAVSHttpClientConfiguration() {
        this(0L, 1, null);
    }

    public DAVSHttpClientConfiguration(long j) {
        super(null);
        this.writeTimeoutMs = j;
    }
}
