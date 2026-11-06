package com.amazon.dee.app.services.shortcut.model;

import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import io.ktor.client.utils.CacheControl;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0010\u001a\u00020\u0011J\u0011\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0013\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u000bH\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/amazon/dee/app/services/shortcut/model/ActionCounter;", "", "<init>", "()V", "action", "Lcom/amazon/dee/app/services/shortcut/model/ShortcutAction;", "getAction", "()Lcom/amazon/dee/app/services/shortcut/model/ShortcutAction;", "setAction", "(Lcom/amazon/dee/app/services/shortcut/model/ShortcutAction;)V", "count", "", "getCount", "()I", "setCount", "(I)V", "increment", "", "compareTo", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "equals", "", "", "hashCode", CacheControl.PUBLIC}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ActionCounter implements Comparable<ActionCounter> {

    @Nullable
    private ShortcutAction action;
    private int count;

    @Override // java.lang.Comparable
    public int compareTo(@NotNull ActionCounter other) {
        other.getClass();
        return this.count - other.count;
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof ActionCounter)) {
            return false;
        }
        ActionCounter actionCounter = (ActionCounter) other;
        return Intrinsics.areEqual(this.action, actionCounter.action) && this.count == actionCounter.count;
    }

    @Nullable
    public final ShortcutAction getAction() {
        return this.action;
    }

    public final int getCount() {
        return this.count;
    }

    public int hashCode() {
        return Objects.hash(this.action, Integer.valueOf(this.count));
    }

    public final void increment() {
        this.count++;
    }

    public final void setAction(@Nullable ShortcutAction shortcutAction) {
        this.action = shortcutAction;
    }

    public final void setCount(int i) {
        this.count = i;
    }
}
