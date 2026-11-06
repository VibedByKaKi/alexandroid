package com.amazon.tarazed.receiver;

import android.os.Bundle;
import android.os.ResultReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB3\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/amazon/tarazed/receiver/PrimerResultReceiver;", "Landroid/os/ResultReceiver;", "onAcceptCallback", "Lkotlin/Function0;", "", "onDeclineCallback", "onDisplayCallback", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "onReceiveResult", "resultCode", "", "resultData", "Landroid/os/Bundle;", "Companion", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class PrimerResultReceiver extends ResultReceiver {
    public static final int RESULT_ACCEPT = 1;
    public static final int RESULT_DECLINE = 0;
    public static final int RESULT_PRIMER_DISPLAYED = 2;

    @NotNull
    private final Function0<Unit> onAcceptCallback;

    @NotNull
    private final Function0<Unit> onDeclineCallback;

    @Nullable
    private final Function0<Unit> onDisplayCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrimerResultReceiver(@NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @Nullable Function0<Unit> function03) {
        super(null);
        function0.getClass();
        function02.getClass();
        this.onAcceptCallback = function0;
        this.onDeclineCallback = function02;
        this.onDisplayCallback = function03;
    }

    @Override // android.os.ResultReceiver
    public void onReceiveResult(int resultCode, @Nullable Bundle resultData) {
        Function0<Unit> function0;
        super.onReceiveResult(resultCode, resultData);
        if (resultCode == 0) {
            this.onDeclineCallback.invoke();
            return;
        }
        if (resultCode == 1) {
            this.onAcceptCallback.invoke();
        } else if (resultCode == 2 && (function0 = this.onDisplayCallback) != null) {
            function0.invoke();
        }
    }

    public /* synthetic */ PrimerResultReceiver(Function0 function0, Function0 function02, Function0 function03, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, function02, (i & 4) != 0 ? null : function03);
    }
}
