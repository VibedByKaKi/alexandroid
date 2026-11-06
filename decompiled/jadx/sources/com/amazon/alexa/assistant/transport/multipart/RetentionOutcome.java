package com.amazon.alexa.assistant.transport.multipart;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/assistant/transport/multipart/RetentionOutcome;", "", "evicted", "", "", "heldOverBudget", "", "<init>", "(Ljava/util/List;Z)V", "getEvicted", "()Ljava/util/List;", "getHeldOverBudget", "()Z", "component1", "component2", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "transport_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final /* data */ class RetentionOutcome {

    @NotNull
    private final List<String> evicted;
    private final boolean heldOverBudget;

    public RetentionOutcome(@NotNull List<String> list, boolean z) {
        list.getClass();
        this.evicted = list;
        this.heldOverBudget = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RetentionOutcome copy$default(RetentionOutcome retentionOutcome, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = retentionOutcome.evicted;
        }
        if ((i & 2) != 0) {
            z = retentionOutcome.heldOverBudget;
        }
        return retentionOutcome.copy(list, z);
    }

    @NotNull
    public final List<String> component1() {
        return this.evicted;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getHeldOverBudget() {
        return this.heldOverBudget;
    }

    @NotNull
    public final RetentionOutcome copy(@NotNull List<String> evicted, boolean heldOverBudget) {
        evicted.getClass();
        return new RetentionOutcome(evicted, heldOverBudget);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RetentionOutcome)) {
            return false;
        }
        RetentionOutcome retentionOutcome = (RetentionOutcome) other;
        return Intrinsics.areEqual(this.evicted, retentionOutcome.evicted) && this.heldOverBudget == retentionOutcome.heldOverBudget;
    }

    @NotNull
    public final List<String> getEvicted() {
        return this.evicted;
    }

    public final boolean getHeldOverBudget() {
        return this.heldOverBudget;
    }

    public int hashCode() {
        return Boolean.hashCode(this.heldOverBudget) + (this.evicted.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "RetentionOutcome(evicted=" + this.evicted + ", heldOverBudget=" + this.heldOverBudget + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
