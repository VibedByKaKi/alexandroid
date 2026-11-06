package com.amazon.alexa.pmi.implementation.taplatency;

import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import com.amazon.clouddrive.extended.model.BulkOperationType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\r\u001a\u00020\tH\u0016J\u0006\u0010\u000e\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/pmi/implementation/taplatency/ImeWatch;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "decor", "Landroid/view/View;", "imeVisible", "Lkotlin/Function1;", "", "onShown", "Lkotlin/Function0;", "", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "shown", "onGlobalLayout", BulkOperationType.remove, "AlexaMobileAndroidPerfMetricsInstrumentation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class ImeWatch implements ViewTreeObserver.OnGlobalLayoutListener {

    @NotNull
    private final View decor;

    @NotNull
    private final Function1<View, Boolean> imeVisible;

    @NotNull
    private final Function0<Unit> onShown;
    private boolean shown;

    /* JADX WARN: Multi-variable type inference failed */
    public ImeWatch(@NotNull View view, @NotNull Function1<? super View, Boolean> function1, @NotNull Function0<Unit> function0) {
        view.getClass();
        function1.getClass();
        function0.getClass();
        this.decor = view;
        this.imeVisible = function1;
        this.onShown = function0;
        this.shown = ((Boolean) function1.invoke(view)).booleanValue();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        try {
            boolean booleanValue = this.imeVisible.invoke(this.decor).booleanValue();
            if (booleanValue && !this.shown) {
                this.onShown.invoke();
            }
            this.shown = booleanValue;
        } catch (Throwable th) {
            Log.e(GlobalTapLatencyMonitorKt.TAP_LATENCY_TAG, "TTLR IME check threw; skipped", th);
        }
    }

    public final void remove() {
        this.decor.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
