package com.amazon.alexa.ra.core.ui.custom;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/custom/KeyboardDismissOnLeave;", "", "<init>", "()V", "shouldDismissOnEvent", "", "event", "Landroidx/lifecycle/Lifecycle$Event;", "activityState", "Landroidx/lifecycle/Lifecycle$State;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class KeyboardDismissOnLeave {
    public static final int $stable = 0;

    @NotNull
    public static final KeyboardDismissOnLeave INSTANCE = new KeyboardDismissOnLeave();

    private KeyboardDismissOnLeave() {
    }

    public final boolean shouldDismissOnEvent(@NotNull Lifecycle.Event event, @Nullable Lifecycle.State activityState) {
        event.getClass();
        return event == Lifecycle.Event.ON_PAUSE && activityState != null && activityState.isAtLeast(Lifecycle.State.RESUMED);
    }
}
