package com.amazon.alexa.ra.core.data.model;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.comms.calling.data.util.UtilsImpl$$ExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\t¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/APLFragmentInteractionState;", "", "<init>", "()V", "_isAPLFragmentClicked", "Landroidx/compose/runtime/MutableState;", "", "isAPLFragmentClicked", "Lkotlin/Function0;", "()Lkotlin/jvm/functions/Function0;", "setIsAplFragmentClicked", "", "isFragmentClicked", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class APLFragmentInteractionState {
    public static final int $stable = 0;

    @NotNull
    private final MutableState<Boolean> _isAPLFragmentClicked = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    @NotNull
    private final Function0<MutableState<Boolean>> isAPLFragmentClicked = new UtilsImpl$$ExternalSyntheticLambda0(this, 4);

    @NotNull
    public final Function0<MutableState<Boolean>> isAPLFragmentClicked() {
        return this.isAPLFragmentClicked;
    }

    public final void setIsAplFragmentClicked(boolean isFragmentClicked) {
        this._isAPLFragmentClicked.setValue(Boolean.valueOf(isFragmentClicked));
    }
}
