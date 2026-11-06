package com.amazon.alexa.api.compat;

import com.amazon.alexa.lifecycle.api.LifecycleEvent;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/api/compat/AlexaReadyState;", "", LifecycleEvent.IS_READY, "", "isQuickReady", "<init>", "(ZZ)V", "()Z", "component1", "component2", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "Companion", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class AlexaReadyState {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final boolean isQuickReady;
    private final boolean isReady;

    public AlexaReadyState(boolean z, boolean z2) {
        this.isReady = z;
        this.isQuickReady = z2;
    }

    public static /* synthetic */ AlexaReadyState copy$default(AlexaReadyState alexaReadyState, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = alexaReadyState.isReady;
        }
        if ((i & 2) != 0) {
            z2 = alexaReadyState.isQuickReady;
        }
        return alexaReadyState.copy(z, z2);
    }

    @JvmStatic
    @NotNull
    public static final AlexaReadyState create(boolean z, boolean z2) {
        return INSTANCE.create(z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsReady() {
        return this.isReady;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsQuickReady() {
        return this.isQuickReady;
    }

    @NotNull
    public final AlexaReadyState copy(boolean isReady, boolean isQuickReady) {
        return new AlexaReadyState(isReady, isQuickReady);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlexaReadyState)) {
            return false;
        }
        AlexaReadyState alexaReadyState = (AlexaReadyState) other;
        return this.isReady == alexaReadyState.isReady && this.isQuickReady == alexaReadyState.isQuickReady;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isQuickReady) + (Boolean.hashCode(this.isReady) * 31);
    }

    public final boolean isQuickReady() {
        return this.isQuickReady;
    }

    public final boolean isReady() {
        return this.isReady;
    }

    @NotNull
    public String toString() {
        return "AlexaReadyState(isReady=" + this.isReady + ", isQuickReady=" + this.isQuickReady + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000b¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/api/compat/AlexaReadyState$Companion;", "", "<init>", "()V", "create", "Lcom/amazon/alexa/api/compat/AlexaReadyState;", "isConnected", "", LifecycleEvent.IS_READY, "convertToCompat", "noncompatReadyState", "Lcom/amazon/alexa/api/AlexaReadyState;", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final AlexaReadyState convertToCompat(@Nullable com.amazon.alexa.api.AlexaReadyState noncompatReadyState) {
            if (noncompatReadyState != null) {
                return new AlexaReadyState(noncompatReadyState.isConnected(), noncompatReadyState.isReady());
            }
            return null;
        }

        @JvmStatic
        @NotNull
        public final AlexaReadyState create(boolean isConnected, boolean isReady) {
            return new AlexaReadyState(isConnected, isReady);
        }

        private Companion() {
        }
    }
}
