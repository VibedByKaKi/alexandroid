package com.bugsnag.android;

import com.bugsnag.android.StateEvent;
import com.bugsnag.android.internal.StateObserver;
import java.util.Iterator;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0007J\b\u0010\b\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\t\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/bugsnag/android/ContextState;", "Lcom/bugsnag/android/BaseObservable;", "()V", "automaticContext", "", "manualContext", "emitObservableEvent", "", "getContext", "setAutomaticContext", "context", "setManualContext", "Companion", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
public final class ContextState extends BaseObservable {
    private static final String MANUAL = "__BUGSNAG_MANUAL_CONTEXT__";
    private String automaticContext;
    private String manualContext;

    public final void emitObservableEvent() {
        if (getObservers$bugsnag_android_core_release().isEmpty()) {
            return;
        }
        StateEvent.UpdateContext updateContext = new StateEvent.UpdateContext(getContext());
        Iterator<T> it2 = getObservers$bugsnag_android_core_release().iterator();
        while (it2.hasNext()) {
            ((StateObserver) it2.next()).onStateChange(updateContext);
        }
    }

    @Nullable
    public final String getContext() {
        String str = this.automaticContext;
        if (str == MANUAL) {
            str = null;
        }
        return str != null ? str : this.manualContext;
    }

    public final void setAutomaticContext(@Nullable String context) {
        if (this.automaticContext != MANUAL) {
            this.automaticContext = context;
            emitObservableEvent();
        }
    }

    public final void setManualContext(@Nullable String context) {
        this.manualContext = context;
        this.automaticContext = MANUAL;
        emitObservableEvent();
    }
}
