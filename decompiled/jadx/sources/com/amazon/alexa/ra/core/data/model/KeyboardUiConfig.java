package com.amazon.alexa.ra.core.data.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/KeyboardUiConfig;", "", "micEnabled", "", "<init>", "(Z)V", "getMicEnabled", "()Z", "component1", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "ui-ingress_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class KeyboardUiConfig {
    public static final int $stable = 0;
    private final boolean micEnabled;

    public /* synthetic */ KeyboardUiConfig(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public static /* synthetic */ KeyboardUiConfig copy$default(KeyboardUiConfig keyboardUiConfig, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = keyboardUiConfig.micEnabled;
        }
        return keyboardUiConfig.copy(z);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getMicEnabled() {
        return this.micEnabled;
    }

    @NotNull
    public final KeyboardUiConfig copy(boolean micEnabled) {
        return new KeyboardUiConfig(micEnabled);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof KeyboardUiConfig) && this.micEnabled == ((KeyboardUiConfig) other).micEnabled;
    }

    public final boolean getMicEnabled() {
        return this.micEnabled;
    }

    public int hashCode() {
        return Boolean.hashCode(this.micEnabled);
    }

    @NotNull
    public String toString() {
        return Automotive$$ExternalSyntheticOutline0.m("KeyboardUiConfig(micEnabled=", MarkdownConstants.RIGHT_PARENTHESIS, this.micEnabled);
    }

    public KeyboardUiConfig(boolean z) {
        this.micEnabled = z;
    }

    public KeyboardUiConfig() {
        this(false, 1, null);
    }
}
