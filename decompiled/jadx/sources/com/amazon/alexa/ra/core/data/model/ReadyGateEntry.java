package com.amazon.alexa.ra.core.data.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/ReadyGateEntry;", "", "lastPendingRevision", "", "ready", "", "<init>", "(IZ)V", "getLastPendingRevision", "()I", "getReady", "()Z", "component1", "component2", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class ReadyGateEntry {
    public static final int $stable = 0;
    private final int lastPendingRevision;
    private final boolean ready;

    public ReadyGateEntry(int i, boolean z) {
        this.lastPendingRevision = i;
        this.ready = z;
    }

    public static /* synthetic */ ReadyGateEntry copy$default(ReadyGateEntry readyGateEntry, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = readyGateEntry.lastPendingRevision;
        }
        if ((i2 & 2) != 0) {
            z = readyGateEntry.ready;
        }
        return readyGateEntry.copy(i, z);
    }

    /* renamed from: component1, reason: from getter */
    public final int getLastPendingRevision() {
        return this.lastPendingRevision;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getReady() {
        return this.ready;
    }

    @NotNull
    public final ReadyGateEntry copy(int lastPendingRevision, boolean ready) {
        return new ReadyGateEntry(lastPendingRevision, ready);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReadyGateEntry)) {
            return false;
        }
        ReadyGateEntry readyGateEntry = (ReadyGateEntry) other;
        return this.lastPendingRevision == readyGateEntry.lastPendingRevision && this.ready == readyGateEntry.ready;
    }

    public final int getLastPendingRevision() {
        return this.lastPendingRevision;
    }

    public final boolean getReady() {
        return this.ready;
    }

    public int hashCode() {
        return Boolean.hashCode(this.ready) + (Integer.hashCode(this.lastPendingRevision) * 31);
    }

    @NotNull
    public String toString() {
        return "ReadyGateEntry(lastPendingRevision=" + this.lastPendingRevision + ", ready=" + this.ready + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
