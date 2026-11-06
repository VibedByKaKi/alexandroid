package com.amazon.alexa.ra.core.ui.screen;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\u0004R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/screen/ConversationRouteEntry;", "", "conversationSet", "Landroidx/compose/runtime/MutableState;", "", "<init>", "(Landroidx/compose/runtime/MutableState;)V", "claimNewEntry", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class ConversationRouteEntry {
    public static final int $stable = 0;

    @NotNull
    private final MutableState<Boolean> conversationSet;

    public ConversationRouteEntry(@NotNull MutableState<Boolean> mutableState) {
        mutableState.getClass();
        this.conversationSet = mutableState;
    }

    public final boolean claimNewEntry() {
        boolean z = !this.conversationSet.getValue().booleanValue();
        this.conversationSet.setValue(Boolean.TRUE);
        return z;
    }
}
