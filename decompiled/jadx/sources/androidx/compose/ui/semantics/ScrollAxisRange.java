package androidx.compose.ui.semantics;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/semantics/ScrollAxisRange;", "", "value", "Lkotlin/Function0;", "", "maxValue", "reverseScrolling", "", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Z)V", "getValue", "()Lkotlin/jvm/functions/Function0;", "getMaxValue", "getReverseScrolling", "()Z", "toString", "", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScrollAxisRange {
    public static final int $stable = 0;

    @NotNull
    private final Function0<Float> maxValue;
    private final boolean reverseScrolling;

    @NotNull
    private final Function0<Float> value;

    public ScrollAxisRange(@NotNull Function0<Float> function0, @NotNull Function0<Float> function02, boolean z) {
        this.value = function0;
        this.maxValue = function02;
        this.reverseScrolling = z;
    }

    @NotNull
    public final Function0<Float> getMaxValue() {
        return this.maxValue;
    }

    public final boolean getReverseScrolling() {
        return this.reverseScrolling;
    }

    @NotNull
    public final Function0<Float> getValue() {
        return this.value;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("ScrollAxisRange(value=");
        sb.append(this.value.invoke().floatValue());
        sb.append(", maxValue=");
        sb.append(this.maxValue.invoke().floatValue());
        sb.append(", reverseScrolling=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.reverseScrolling, ')');
    }

    public /* synthetic */ ScrollAxisRange(Function0 function0, Function0 function02, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, function02, (i & 4) != 0 ? false : z);
    }
}
