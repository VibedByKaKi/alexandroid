package com.amazon.alexa.api.compat.model.assistant.subcomponent;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/api/compat/model/assistant/subcomponent/ApiCallTimeout;", "", ApiCallbacksBundleKeys.TIMEOUT_VALUE, "", ApiCallbacksBundleKeys.TIMEOUT_UNIT, "Ljava/util/concurrent/TimeUnit;", "<init>", "(JLjava/util/concurrent/TimeUnit;)V", "getTimeoutValue", "()J", "getTimeoutUnit", "()Ljava/util/concurrent/TimeUnit;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ApiCallTimeout {
    public static final int $stable = 0;

    @NotNull
    private final TimeUnit timeoutUnit;
    private final long timeoutValue;

    public ApiCallTimeout(long j, @NotNull TimeUnit timeUnit) {
        timeUnit.getClass();
        this.timeoutValue = j;
        this.timeoutUnit = timeUnit;
    }

    public static /* synthetic */ ApiCallTimeout copy$default(ApiCallTimeout apiCallTimeout, long j, TimeUnit timeUnit, int i, Object obj) {
        if ((i & 1) != 0) {
            j = apiCallTimeout.timeoutValue;
        }
        if ((i & 2) != 0) {
            timeUnit = apiCallTimeout.timeoutUnit;
        }
        return apiCallTimeout.copy(j, timeUnit);
    }

    /* renamed from: component1, reason: from getter */
    public final long getTimeoutValue() {
        return this.timeoutValue;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TimeUnit getTimeoutUnit() {
        return this.timeoutUnit;
    }

    @NotNull
    public final ApiCallTimeout copy(long timeoutValue, @NotNull TimeUnit timeoutUnit) {
        timeoutUnit.getClass();
        return new ApiCallTimeout(timeoutValue, timeoutUnit);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiCallTimeout)) {
            return false;
        }
        ApiCallTimeout apiCallTimeout = (ApiCallTimeout) other;
        return this.timeoutValue == apiCallTimeout.timeoutValue && this.timeoutUnit == apiCallTimeout.timeoutUnit;
    }

    @NotNull
    public final TimeUnit getTimeoutUnit() {
        return this.timeoutUnit;
    }

    public final long getTimeoutValue() {
        return this.timeoutValue;
    }

    public int hashCode() {
        return this.timeoutUnit.hashCode() + (Long.hashCode(this.timeoutValue) * 31);
    }

    @NotNull
    public String toString() {
        return "ApiCallTimeout(timeoutValue=" + this.timeoutValue + ", timeoutUnit=" + this.timeoutUnit + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
