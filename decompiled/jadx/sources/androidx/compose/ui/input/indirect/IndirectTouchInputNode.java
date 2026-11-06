package androidx.compose.ui.input.indirect;

import androidx.compose.ui.ExperimentalIndirectTouchTypeApi;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ExperimentalIndirectTouchTypeApi
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0005H\u0016J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0005H\u0016R(\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\r¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/input/indirect/IndirectTouchInputNode;", "Landroidx/compose/ui/input/indirect/IndirectTouchInputModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "onEvent", "Lkotlin/Function1;", "Landroidx/compose/ui/input/indirect/IndirectTouchEvent;", "", "onPreEvent", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getOnEvent", "()Lkotlin/jvm/functions/Function1;", "setOnEvent", "(Lkotlin/jvm/functions/Function1;)V", "getOnPreEvent", "setOnPreEvent", "onIndirectTouchEvent", "event", "onPreIndirectTouchEvent", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class IndirectTouchInputNode extends Modifier.Node implements IndirectTouchInputModifierNode {

    @Nullable
    private Function1<? super IndirectTouchEvent, Boolean> onEvent;

    @Nullable
    private Function1<? super IndirectTouchEvent, Boolean> onPreEvent;

    public IndirectTouchInputNode(@Nullable Function1<? super IndirectTouchEvent, Boolean> function1, @Nullable Function1<? super IndirectTouchEvent, Boolean> function12) {
        this.onEvent = function1;
        this.onPreEvent = function12;
    }

    @Nullable
    public final Function1<IndirectTouchEvent, Boolean> getOnEvent() {
        return this.onEvent;
    }

    @Nullable
    public final Function1<IndirectTouchEvent, Boolean> getOnPreEvent() {
        return this.onPreEvent;
    }

    @Override // androidx.compose.ui.input.indirect.IndirectTouchInputModifierNode
    public boolean onIndirectTouchEvent(@NotNull IndirectTouchEvent event) {
        Function1<? super IndirectTouchEvent, Boolean> function1 = this.onEvent;
        return function1 != null && function1.invoke(event).booleanValue();
    }

    @Override // androidx.compose.ui.input.indirect.IndirectTouchInputModifierNode
    public boolean onPreIndirectTouchEvent(@NotNull IndirectTouchEvent event) {
        Function1<? super IndirectTouchEvent, Boolean> function1 = this.onPreEvent;
        return function1 != null && function1.invoke(event).booleanValue();
    }

    public final void setOnEvent(@Nullable Function1<? super IndirectTouchEvent, Boolean> function1) {
        this.onEvent = function1;
    }

    public final void setOnPreEvent(@Nullable Function1<? super IndirectTouchEvent, Boolean> function1) {
        this.onPreEvent = function1;
    }
}
