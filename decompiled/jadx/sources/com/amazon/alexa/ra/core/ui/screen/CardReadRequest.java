package com.amazon.alexa.ra.core.ui.screen;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\b\u0010\n¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/screen/CardReadRequest;", "", "issuer", "Landroidx/compose/runtime/MutableState;", "", "viewModelKey", "<init>", "(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V", "isIssued", "", "()Z", "markIssued", "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class CardReadRequest {
    public static final int $stable = 0;

    @NotNull
    private final MutableState<String> issuer;

    @NotNull
    private final String viewModelKey;

    public CardReadRequest(@NotNull MutableState<String> mutableState, @NotNull String str) {
        mutableState.getClass();
        str.getClass();
        this.issuer = mutableState;
        this.viewModelKey = str;
    }

    public final boolean isIssued() {
        return Intrinsics.areEqual(this.issuer.getValue(), this.viewModelKey);
    }

    public final void markIssued() {
        this.issuer.setValue(this.viewModelKey);
    }
}
