package com.amazon.alexa.ra.core.ui.screen;

import com.amazon.alexa.ra.core.data.model.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/screen/ShownScreen;", "", "show", "Lkotlin/Function0;", "", Constants.HINT_TEXT_OPERATION_HIDE, "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getShow", "()Lkotlin/jvm/functions/Function0;", "getHide", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
final class ShownScreen {

    @NotNull
    private final Function0<Unit> hide;

    @NotNull
    private final Function0<Unit> show;

    public ShownScreen(@NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
        function0.getClass();
        function02.getClass();
        this.show = function0;
        this.hide = function02;
    }

    @NotNull
    public final Function0<Unit> getHide() {
        return this.hide;
    }

    @NotNull
    public final Function0<Unit> getShow() {
        return this.show;
    }
}
