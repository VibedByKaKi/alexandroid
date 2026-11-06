package com.amazon.tarazed.session;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/amazon/tarazed/session/TarazedSessionStateChangeRequest;", "", "type", "Lcom/amazon/tarazed/session/TarazedSessionStateChangeType;", "source", "Lcom/amazon/tarazed/session/TarazedSessionStateChangeSource;", "(Lcom/amazon/tarazed/session/TarazedSessionStateChangeType;Lcom/amazon/tarazed/session/TarazedSessionStateChangeSource;)V", "getSource", "()Lcom/amazon/tarazed/session/TarazedSessionStateChangeSource;", "getType", "()Lcom/amazon/tarazed/session/TarazedSessionStateChangeType;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class TarazedSessionStateChangeRequest {

    @NotNull
    private final TarazedSessionStateChangeSource source;

    @NotNull
    private final TarazedSessionStateChangeType type;

    public TarazedSessionStateChangeRequest(@NotNull TarazedSessionStateChangeType tarazedSessionStateChangeType, @NotNull TarazedSessionStateChangeSource tarazedSessionStateChangeSource) {
        tarazedSessionStateChangeType.getClass();
        tarazedSessionStateChangeSource.getClass();
        this.type = tarazedSessionStateChangeType;
        this.source = tarazedSessionStateChangeSource;
    }

    public static /* synthetic */ TarazedSessionStateChangeRequest copy$default(TarazedSessionStateChangeRequest tarazedSessionStateChangeRequest, TarazedSessionStateChangeType tarazedSessionStateChangeType, TarazedSessionStateChangeSource tarazedSessionStateChangeSource, int i, Object obj) {
        if ((i & 1) != 0) {
            tarazedSessionStateChangeType = tarazedSessionStateChangeRequest.type;
        }
        if ((i & 2) != 0) {
            tarazedSessionStateChangeSource = tarazedSessionStateChangeRequest.source;
        }
        return tarazedSessionStateChangeRequest.copy(tarazedSessionStateChangeType, tarazedSessionStateChangeSource);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TarazedSessionStateChangeType getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TarazedSessionStateChangeSource getSource() {
        return this.source;
    }

    @NotNull
    public final TarazedSessionStateChangeRequest copy(@NotNull TarazedSessionStateChangeType type, @NotNull TarazedSessionStateChangeSource source) {
        type.getClass();
        source.getClass();
        return new TarazedSessionStateChangeRequest(type, source);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TarazedSessionStateChangeRequest)) {
            return false;
        }
        TarazedSessionStateChangeRequest tarazedSessionStateChangeRequest = (TarazedSessionStateChangeRequest) other;
        return this.type == tarazedSessionStateChangeRequest.type && this.source == tarazedSessionStateChangeRequest.source;
    }

    @NotNull
    public final TarazedSessionStateChangeSource getSource() {
        return this.source;
    }

    @NotNull
    public final TarazedSessionStateChangeType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.source.hashCode() + (this.type.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "TarazedSessionStateChangeRequest(type=" + this.type + ", source=" + this.source + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
