package com.amazon.alexa.ra.core.ui.fragments.contact;

import androidx.compose.foundation.gestures.Orientation;
import com.amazon.alexa.ra.core.data.fragments.Display;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"contactCardOrientation", "Landroidx/compose/foundation/gestures/Orientation;", "display", "Lcom/amazon/alexa/ra/core/data/fragments/Display;", "ui-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class ContactFragmentProviderKt {
    @NotNull
    public static final Orientation contactCardOrientation(@NotNull Display display) {
        display.getClass();
        return display == Display.ITEM ? Orientation.Vertical : Orientation.Horizontal;
    }
}
