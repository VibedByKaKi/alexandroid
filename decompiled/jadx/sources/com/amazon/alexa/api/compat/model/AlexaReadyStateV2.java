package com.amazon.alexa.api.compat.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.lifecycle.api.LifecycleEvent;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaReadyStateV2;", "", "isConnected", "", LifecycleEvent.IS_READY, "<init>", "(ZZ)V", "()Z", "component1", "component2", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class AlexaReadyStateV2 {
    public static final int $stable = 0;
    private final boolean isConnected;
    private final boolean isReady;

    public AlexaReadyStateV2(boolean z, boolean z2) {
        this.isConnected = z;
        this.isReady = z2;
    }

    public static /* synthetic */ AlexaReadyStateV2 copy$default(AlexaReadyStateV2 alexaReadyStateV2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = alexaReadyStateV2.isConnected;
        }
        if ((i & 2) != 0) {
            z2 = alexaReadyStateV2.isReady;
        }
        return alexaReadyStateV2.copy(z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsConnected() {
        return this.isConnected;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsReady() {
        return this.isReady;
    }

    @NotNull
    public final AlexaReadyStateV2 copy(boolean isConnected, boolean isReady) {
        return new AlexaReadyStateV2(isConnected, isReady);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlexaReadyStateV2)) {
            return false;
        }
        AlexaReadyStateV2 alexaReadyStateV2 = (AlexaReadyStateV2) other;
        return this.isConnected == alexaReadyStateV2.isConnected && this.isReady == alexaReadyStateV2.isReady;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isReady) + (Boolean.hashCode(this.isConnected) * 31);
    }

    public final boolean isConnected() {
        return this.isConnected;
    }

    public final boolean isReady() {
        return this.isReady;
    }

    @NotNull
    public String toString() {
        return "AlexaReadyStateV2(isConnected=" + this.isConnected + ", isReady=" + this.isReady + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
