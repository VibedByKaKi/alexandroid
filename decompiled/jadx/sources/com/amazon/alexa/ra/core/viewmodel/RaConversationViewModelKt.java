package com.amazon.alexa.ra.core.viewmodel;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¨\u0006\u0005"}, d2 = {"overlayServiceActionFor", "Lcom/amazon/alexa/ra/core/viewmodel/OverlayServiceAction;", "canEnter", "", "liveSessionActive", "ui-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class RaConversationViewModelKt {
    @NotNull
    public static final OverlayServiceAction overlayServiceActionFor(boolean z, boolean z2) {
        return (z && z2) ? OverlayServiceAction.START : z2 ? OverlayServiceAction.KEEP : !z ? OverlayServiceAction.STOP : OverlayServiceAction.LEAVE_ALONE;
    }
}
