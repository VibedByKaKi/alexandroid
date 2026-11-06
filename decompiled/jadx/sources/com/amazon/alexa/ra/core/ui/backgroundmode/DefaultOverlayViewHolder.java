package com.amazon.alexa.ra.core.ui.backgroundmode;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/backgroundmode/DefaultOverlayViewHolder;", "Lcom/amazon/alexa/ra/core/ui/backgroundmode/OverlayViewHolder;", "<init>", "()V", "overlayView", "Landroid/view/View;", "getOverlayView", "setOverlayView", "", "view", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class DefaultOverlayViewHolder implements OverlayViewHolder {
    public static final int $stable = 8;

    @Nullable
    private View overlayView;

    @Override // com.amazon.alexa.ra.core.ui.backgroundmode.OverlayViewHolder
    @Nullable
    public View getOverlayView() {
        return this.overlayView;
    }

    @Override // com.amazon.alexa.ra.core.ui.backgroundmode.OverlayViewHolder
    public void setOverlayView(@Nullable View view) {
        this.overlayView = view;
    }
}
