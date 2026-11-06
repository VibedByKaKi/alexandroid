package com.amazon.alexa.ra.core.ui.custom;

import androidx.compose.ui.Modifier;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/custom/TurnSkeletonLine;", "", TypedValues.CycleType.S_WAVE_PHASE, "Lcom/amazon/alexa/ra/core/ui/custom/TurnSkeletonRow;", "width", "Landroidx/compose/ui/Modifier;", "<init>", "(Lcom/amazon/alexa/ra/core/ui/custom/TurnSkeletonRow;Landroidx/compose/ui/Modifier;)V", "getPhase", "()Lcom/amazon/alexa/ra/core/ui/custom/TurnSkeletonRow;", "getWidth", "()Landroidx/compose/ui/Modifier;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
final class TurnSkeletonLine {

    @NotNull
    private final TurnSkeletonRow phase;

    @NotNull
    private final Modifier width;

    public TurnSkeletonLine(@NotNull TurnSkeletonRow turnSkeletonRow, @NotNull Modifier modifier) {
        turnSkeletonRow.getClass();
        modifier.getClass();
        this.phase = turnSkeletonRow;
        this.width = modifier;
    }

    @NotNull
    public final TurnSkeletonRow getPhase() {
        return this.phase;
    }

    @NotNull
    public final Modifier getWidth() {
        return this.width;
    }
}
