package com.amazon.alexa.eventing;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated(message = "")
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0002\u001e\u001fB\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\r\u001a\u00020\u000e2\u000e\b\u0001\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0002J\u0018\u0010\u0011\u001a\u00020\u000e2\u000e\b\u0001\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0016J\u0006\u0010\u0012\u001a\u00020\u0013J\u001b\u0010\u0014\u001a\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0000¢\u0006\u0002\b\u0017J\u0014\u0010\u0018\u001a\u00020\u000e2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bJ\u0018\u0010\u001a\u001a\u00020\u001b2\u000e\b\u0001\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016J\u0014\u0010\u001d\u001a\u00020\u000e2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bR \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR \u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006 "}, d2 = {"Lcom/amazon/alexa/eventing/Event;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/amazon/alexa/eventing/EventEmitter;", "Lcom/amazon/alexa/eventing/EventSource;", "()V", "handlers", "Ljava/util/LinkedList;", "Lcom/amazon/alexa/eventing/EventHandler;", "getHandlers$AlexaMobileAndroidEventing_release", "()Ljava/util/LinkedList;", "observers", "Lcom/amazon/alexa/eventing/Event$Observer;", "getObservers$AlexaMobileAndroidEventing_release", "doFire", "", "eventArgs", "Lcom/amazon/alexa/eventing/EventArgs;", "fire", "isUnsubscribed", "", "notifyObservers", "action", "Lcom/amazon/alexa/eventing/Event$ObserverAction;", "notifyObservers$AlexaMobileAndroidEventing_release", "registerObserver", "observer", "subscribe", "Lcom/amazon/alexa/eventing/EventSubscription;", "handler", "unregisterObserver", "Observer", "ObserverAction", "AlexaMobileAndroidEventing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class Event<T> implements EventEmitter<T>, EventSource<T> {

    @NotNull
    private final LinkedList<EventHandler<T>> handlers = new LinkedList<>();

    @NotNull
    private final LinkedList<Observer<T>> observers = new LinkedList<>();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/eventing/Event$Observer;", ExifInterface.GPS_DIRECTION_TRUE, "", "()V", "onSubscribed", "", "handler", "Lcom/amazon/alexa/eventing/EventHandler;", "onUnsubscribed", "AlexaMobileAndroidEventing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static class Observer<T> {
        public void onSubscribed(@NonNull @NotNull EventHandler<T> handler) {
            handler.getClass();
        }

        public void onUnsubscribed(@NonNull @NotNull EventHandler<T> handler) {
            handler.getClass();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bà\u0080\u0001\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcom/amazon/alexa/eventing/Event$ObserverAction;", ExifInterface.GPS_DIRECTION_TRUE, "", "apply", "", "observer", "Lcom/amazon/alexa/eventing/Event$Observer;", "AlexaMobileAndroidEventing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface ObserverAction<T> {
        void apply(@NotNull Observer<T> observer);
    }

    private final void doFire(@NonNull EventArgs<T> eventArgs) {
        ArrayList arrayList;
        synchronized (this.handlers) {
            arrayList = new ArrayList(this.handlers);
            Unit unit = Unit.INSTANCE;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((EventHandler) it2.next()).onEvent(eventArgs);
            if (eventArgs.getCanceled()) {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fire$lambda$5(Event event, EventArgs eventArgs) {
        event.getClass();
        eventArgs.getClass();
        event.doFire(eventArgs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribe$lambda$1(EventHandler eventHandler, Observer observer) {
        eventHandler.getClass();
        observer.getClass();
        observer.onSubscribed(eventHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribe$lambda$4(Event event, EventHandler eventHandler) {
        event.getClass();
        eventHandler.getClass();
        synchronized (event.handlers) {
            event.handlers.remove(eventHandler);
        }
        event.notifyObservers$AlexaMobileAndroidEventing_release(new Event$$ExternalSyntheticLambda0(eventHandler, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribe$lambda$4$lambda$3(EventHandler eventHandler, Observer observer) {
        eventHandler.getClass();
        observer.getClass();
        observer.onUnsubscribed(eventHandler);
    }

    @Override // com.amazon.alexa.eventing.EventSource
    public void fire(@NonNull @NotNull EventArgs<T> eventArgs) {
        eventArgs.getClass();
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            doFire(eventArgs);
        } else {
            new Handler(Looper.getMainLooper()).post(new Event$$ExternalSyntheticLambda2(this, eventArgs, 10));
        }
    }

    @NotNull
    public final LinkedList<EventHandler<T>> getHandlers$AlexaMobileAndroidEventing_release() {
        return this.handlers;
    }

    @NotNull
    public final LinkedList<Observer<T>> getObservers$AlexaMobileAndroidEventing_release() {
        return this.observers;
    }

    public final boolean isUnsubscribed() {
        boolean isEmpty;
        synchronized (this.handlers) {
            isEmpty = this.handlers.isEmpty();
        }
        return isEmpty;
    }

    public final void notifyObservers$AlexaMobileAndroidEventing_release(@NotNull ObserverAction<T> action) {
        ArrayList arrayList;
        action.getClass();
        synchronized (this.observers) {
            arrayList = new ArrayList(this.observers);
            Unit unit = Unit.INSTANCE;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Observer<T> observer = (Observer) it2.next();
            observer.getClass();
            action.apply(observer);
        }
    }

    public final void registerObserver(@NotNull Observer<T> observer) {
        observer.getClass();
        synchronized (this.observers) {
            this.observers.add(observer);
        }
    }

    @Override // com.amazon.alexa.eventing.EventEmitter
    @NotNull
    public EventSubscription subscribe(@NonNull @NotNull EventHandler<T> handler) {
        handler.getClass();
        synchronized (this.handlers) {
            this.handlers.add(handler);
        }
        notifyObservers$AlexaMobileAndroidEventing_release(new Event$$ExternalSyntheticLambda0(handler, 1));
        return new BooleanSubscription(new Event$$ExternalSyntheticLambda2(this, handler, 0));
    }

    public final void unregisterObserver(@NotNull Observer<T> observer) {
        observer.getClass();
        synchronized (this.observers) {
            this.observers.remove(observer);
        }
    }
}
