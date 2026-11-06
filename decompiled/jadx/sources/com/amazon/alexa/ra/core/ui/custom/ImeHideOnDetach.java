package com.amazon.alexa.ra.core.ui.custom;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/custom/ImeHideOnDetach;", "", "<init>", "()V", "shouldHide", "", "imeVisible", "otherEditorFocused", "changingConfigurations", "ui-ingress_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class ImeHideOnDetach {
    public static final int $stable = 0;

    @NotNull
    public static final ImeHideOnDetach INSTANCE = new ImeHideOnDetach();

    private ImeHideOnDetach() {
    }

    public final boolean shouldHide(boolean imeVisible, boolean otherEditorFocused, boolean changingConfigurations) {
        return (!imeVisible || otherEditorFocused || changingConfigurations) ? false : true;
    }
}
