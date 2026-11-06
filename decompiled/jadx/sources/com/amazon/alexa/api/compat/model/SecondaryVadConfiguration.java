package com.amazon.alexa.api.compat.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/api/compat/model/SecondaryVadConfiguration;", "", "speechThreshold", "", "verificationTimeoutMs", "", "<init>", "(FJ)V", "getSpeechThreshold", "()F", "getVerificationTimeoutMs", "()J", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class SecondaryVadConfiguration {
    public static final int $stable = 0;
    private final float speechThreshold;
    private final long verificationTimeoutMs;

    public /* synthetic */ SecondaryVadConfiguration(float f, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0L : j);
    }

    public static /* synthetic */ SecondaryVadConfiguration copy$default(SecondaryVadConfiguration secondaryVadConfiguration, float f, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            f = secondaryVadConfiguration.speechThreshold;
        }
        if ((i & 2) != 0) {
            j = secondaryVadConfiguration.verificationTimeoutMs;
        }
        return secondaryVadConfiguration.copy(f, j);
    }

    /* renamed from: component1, reason: from getter */
    public final float getSpeechThreshold() {
        return this.speechThreshold;
    }

    /* renamed from: component2, reason: from getter */
    public final long getVerificationTimeoutMs() {
        return this.verificationTimeoutMs;
    }

    @NotNull
    public final SecondaryVadConfiguration copy(float speechThreshold, long verificationTimeoutMs) {
        return new SecondaryVadConfiguration(speechThreshold, verificationTimeoutMs);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SecondaryVadConfiguration)) {
            return false;
        }
        SecondaryVadConfiguration secondaryVadConfiguration = (SecondaryVadConfiguration) other;
        return Float.compare(this.speechThreshold, secondaryVadConfiguration.speechThreshold) == 0 && this.verificationTimeoutMs == secondaryVadConfiguration.verificationTimeoutMs;
    }

    public final float getSpeechThreshold() {
        return this.speechThreshold;
    }

    public final long getVerificationTimeoutMs() {
        return this.verificationTimeoutMs;
    }

    public int hashCode() {
        return Long.hashCode(this.verificationTimeoutMs) + (Float.hashCode(this.speechThreshold) * 31);
    }

    @NotNull
    public String toString() {
        return "SecondaryVadConfiguration(speechThreshold=" + this.speechThreshold + ", verificationTimeoutMs=" + this.verificationTimeoutMs + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public SecondaryVadConfiguration(float f, long j) {
        this.speechThreshold = f;
        this.verificationTimeoutMs = j;
    }

    public SecondaryVadConfiguration() {
        this(0.0f, 0L, 3, null);
    }
}
