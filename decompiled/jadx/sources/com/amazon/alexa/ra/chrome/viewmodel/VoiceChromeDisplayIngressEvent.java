package com.amazon.alexa.ra.chrome.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.chrome.model.ChromeDisplayIngressSource;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/ra/chrome/viewmodel/VoiceChromeDisplayIngressEvent;", "", "displayIngressSource", "Lcom/amazon/alexa/ra/chrome/model/ChromeDisplayIngressSource;", "ingressTimestampMillis", "", "<init>", "(Lcom/amazon/alexa/ra/chrome/model/ChromeDisplayIngressSource;J)V", "getDisplayIngressSource", "()Lcom/amazon/alexa/ra/chrome/model/ChromeDisplayIngressSource;", "getIngressTimestampMillis", "()J", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class VoiceChromeDisplayIngressEvent {
    public static final int $stable = 0;

    @NotNull
    private final ChromeDisplayIngressSource displayIngressSource;
    private final long ingressTimestampMillis;

    public VoiceChromeDisplayIngressEvent(@NotNull ChromeDisplayIngressSource chromeDisplayIngressSource, long j) {
        chromeDisplayIngressSource.getClass();
        this.displayIngressSource = chromeDisplayIngressSource;
        this.ingressTimestampMillis = j;
    }

    public static /* synthetic */ VoiceChromeDisplayIngressEvent copy$default(VoiceChromeDisplayIngressEvent voiceChromeDisplayIngressEvent, ChromeDisplayIngressSource chromeDisplayIngressSource, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            chromeDisplayIngressSource = voiceChromeDisplayIngressEvent.displayIngressSource;
        }
        if ((i & 2) != 0) {
            j = voiceChromeDisplayIngressEvent.ingressTimestampMillis;
        }
        return voiceChromeDisplayIngressEvent.copy(chromeDisplayIngressSource, j);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ChromeDisplayIngressSource getDisplayIngressSource() {
        return this.displayIngressSource;
    }

    /* renamed from: component2, reason: from getter */
    public final long getIngressTimestampMillis() {
        return this.ingressTimestampMillis;
    }

    @NotNull
    public final VoiceChromeDisplayIngressEvent copy(@NotNull ChromeDisplayIngressSource displayIngressSource, long ingressTimestampMillis) {
        displayIngressSource.getClass();
        return new VoiceChromeDisplayIngressEvent(displayIngressSource, ingressTimestampMillis);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoiceChromeDisplayIngressEvent)) {
            return false;
        }
        VoiceChromeDisplayIngressEvent voiceChromeDisplayIngressEvent = (VoiceChromeDisplayIngressEvent) other;
        return this.displayIngressSource == voiceChromeDisplayIngressEvent.displayIngressSource && this.ingressTimestampMillis == voiceChromeDisplayIngressEvent.ingressTimestampMillis;
    }

    @NotNull
    public final ChromeDisplayIngressSource getDisplayIngressSource() {
        return this.displayIngressSource;
    }

    public final long getIngressTimestampMillis() {
        return this.ingressTimestampMillis;
    }

    public int hashCode() {
        return Long.hashCode(this.ingressTimestampMillis) + (this.displayIngressSource.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "VoiceChromeDisplayIngressEvent(displayIngressSource=" + this.displayIngressSource + ", ingressTimestampMillis=" + this.ingressTimestampMillis + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
