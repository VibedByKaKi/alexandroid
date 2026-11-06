package com.bugsnag.android;

import com.bugsnag.android.internal.StateObserver;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005J\u001c\u0010\f\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0080\b¢\u0006\u0002\b\u0010J\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000fR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/bugsnag/android/BaseObservable;", "", "()V", "observers", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/bugsnag/android/internal/StateObserver;", "getObservers$bugsnag_android_core_release", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "addObserver", "", "observer", "removeObserver", "updateState", "provider", "Lkotlin/Function0;", "Lcom/bugsnag/android/StateEvent;", "updateState$bugsnag_android_core_release", "event", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
public class BaseObservable {

    @NotNull
    private final CopyOnWriteArrayList<StateObserver> observers = new CopyOnWriteArrayList<>();

    public final void addObserver(@NotNull StateObserver observer) {
        observer.getClass();
        this.observers.addIfAbsent(observer);
    }

    @NotNull
    public final CopyOnWriteArrayList<StateObserver> getObservers$bugsnag_android_core_release() {
        return this.observers;
    }

    public final void removeObserver(@NotNull StateObserver observer) {
        observer.getClass();
        this.observers.remove(observer);
    }

    public final void updateState(@NotNull StateEvent event) {
        event.getClass();
        if (getObservers$bugsnag_android_core_release().isEmpty()) {
            return;
        }
        Iterator<T> it2 = getObservers$bugsnag_android_core_release().iterator();
        while (it2.hasNext()) {
            ((StateObserver) it2.next()).onStateChange(event);
        }
    }

    public final void updateState$bugsnag_android_core_release(@NotNull Function0<? extends StateEvent> provider) {
        provider.getClass();
        if (getObservers$bugsnag_android_core_release().isEmpty()) {
            return;
        }
        StateEvent invoke = provider.invoke();
        Iterator<T> it2 = getObservers$bugsnag_android_core_release().iterator();
        while (it2.hasNext()) {
            ((StateObserver) it2.next()).onStateChange(invoke);
        }
    }
}
