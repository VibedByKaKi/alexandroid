package com.amazon.alexa.accessory.speechapi.listeners;

import com.amazon.alexa.lifecycle.api.LifecycleEvent;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/listeners/ReadyState;", "", LifecycleEvent.IS_READY, "", "isQuickReady", "(ZZ)V", "()Z", "component1", "component2", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaAccessoryAndroid-speech-api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ReadyState {
    private final boolean isQuickReady;
    private final boolean isReady;

    public ReadyState(boolean z, boolean z2) {
        this.isReady = z;
        this.isQuickReady = z2;
    }

    public static /* synthetic */ ReadyState copy$default(ReadyState readyState, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = readyState.isReady;
        }
        if ((i & 2) != 0) {
            z2 = readyState.isQuickReady;
        }
        return readyState.copy(z, z2);
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
    public final ReadyState copy(boolean isReady, boolean isQuickReady) {
        return new ReadyState(isReady, isQuickReady);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReadyState)) {
            return false;
        }
        ReadyState readyState = (ReadyState) other;
        return this.isReady == readyState.isReady && this.isQuickReady == readyState.isQuickReady;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.isReady;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.isQuickReady;
        return i + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final boolean isQuickReady() {
        return this.isQuickReady;
    }

    public final boolean isReady() {
        return this.isReady;
    }

    @NotNull
    public String toString() {
        return "ReadyState(isReady=" + this.isReady + ", isQuickReady=" + this.isQuickReady + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
