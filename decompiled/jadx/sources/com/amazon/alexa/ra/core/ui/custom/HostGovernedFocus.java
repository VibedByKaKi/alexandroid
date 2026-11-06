package com.amazon.alexa.ra.core.ui.custom;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005J\u001e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005J\u001e\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/custom/HostGovernedFocus;", "", "<init>", "()V", "isFocusable", "", "hostGovernedFocus", "editingAllowed", "shouldReleaseFocus", "hasFocus", "shouldHideIme", "wasEditingAllowed", "ui-ingress_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class HostGovernedFocus {
    public static final int $stable = 0;

    @NotNull
    public static final HostGovernedFocus INSTANCE = new HostGovernedFocus();

    private HostGovernedFocus() {
    }

    public final boolean isFocusable(boolean hostGovernedFocus, boolean editingAllowed) {
        return !hostGovernedFocus || editingAllowed;
    }

    public final boolean shouldHideIme(boolean hostGovernedFocus, boolean wasEditingAllowed, boolean editingAllowed) {
        return hostGovernedFocus && wasEditingAllowed && !editingAllowed;
    }

    public final boolean shouldReleaseFocus(boolean hostGovernedFocus, boolean editingAllowed, boolean hasFocus) {
        return hostGovernedFocus && !editingAllowed && hasFocus;
    }
}
