package com.amazon.alexa.ra.core.ui.custom;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import com.amazon.alexa.ra.core.data.model.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000f\u001a\u00020\u0005H\u0016JP\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/custom/TrackingTextToolbar;", "Landroidx/compose/ui/platform/TextToolbar;", "delegate", "onMenuShown", "Lkotlin/Function0;", "", "onCopyClicked", "<init>", "(Landroidx/compose/ui/platform/TextToolbar;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "appearanceCounted", "", "status", "Landroidx/compose/ui/platform/TextToolbarStatus;", "getStatus", "()Landroidx/compose/ui/platform/TextToolbarStatus;", Constants.HINT_TEXT_OPERATION_HIDE, "showMenu", "rect", "Landroidx/compose/ui/geometry/Rect;", "onCopyRequested", "onPasteRequested", "onCutRequested", "onSelectAllRequested", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class TrackingTextToolbar implements TextToolbar {
    public static final int $stable = 8;
    private boolean appearanceCounted;

    @NotNull
    private final TextToolbar delegate;

    @NotNull
    private final Function0<Unit> onCopyClicked;

    @NotNull
    private final Function0<Unit> onMenuShown;

    public TrackingTextToolbar(@NotNull TextToolbar textToolbar, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
        textToolbar.getClass();
        function0.getClass();
        function02.getClass();
        this.delegate = textToolbar;
        this.onMenuShown = function0;
        this.onCopyClicked = function02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showMenu$lambda$1$lambda$0(TrackingTextToolbar trackingTextToolbar, Function0 function0) {
        trackingTextToolbar.onCopyClicked.invoke();
        function0.invoke();
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.ui.platform.TextToolbar
    @NotNull
    public TextToolbarStatus getStatus() {
        return this.delegate.getStatus();
    }

    @Override // androidx.compose.ui.platform.TextToolbar
    public void hide() {
        this.appearanceCounted = false;
        this.delegate.hide();
    }

    @Override // androidx.compose.ui.platform.TextToolbar
    public void showMenu(@NotNull Rect rect, @Nullable Function0<Unit> onCopyRequested, @Nullable Function0<Unit> onPasteRequested, @Nullable Function0<Unit> onCutRequested, @Nullable Function0<Unit> onSelectAllRequested) {
        rect.getClass();
        if (!this.appearanceCounted) {
            this.appearanceCounted = true;
            this.onMenuShown.invoke();
        }
        this.delegate.showMenu(rect, onCopyRequested != null ? new LiveModeViewKt$$ExternalSyntheticLambda14(this, onCopyRequested, 13) : null, onPasteRequested, onCutRequested, onSelectAllRequested);
    }
}
