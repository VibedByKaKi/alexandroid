package com.facebook.react.uimanager.events;

import com.facebook.common.logging.FLog;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Deprecated;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u0005H\u0017¨\u0006\u0011"}, d2 = {"Lcom/facebook/react/uimanager/events/BlackHoleEventDispatcher;", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "<init>", "()V", "dispatchEvent", "", "event", "Lcom/facebook/react/uimanager/events/Event;", "dispatchAllEvents", "addListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/facebook/react/uimanager/events/EventDispatcherListener;", "removeListener", "addBatchEventDispatchedListener", "Lcom/facebook/react/uimanager/events/BatchEventDispatchedListener;", "removeBatchEventDispatchedListener", "onCatalystInstanceDestroyed", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BlackHoleEventDispatcher implements EventDispatcher {

    @NotNull
    public static final BlackHoleEventDispatcher INSTANCE = new BlackHoleEventDispatcher();

    private BlackHoleEventDispatcher() {
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void addBatchEventDispatchedListener(@NotNull BatchEventDispatchedListener listener) {
        listener.getClass();
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void addListener(@NotNull EventDispatcherListener listener) {
        listener.getClass();
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void dispatchEvent(@NotNull Event<?> event) {
        event.getClass();
        FLog.d("BlackHoleEventDispatcher", "Trying to emit event to JS, but the React instance isn't ready. Event: " + event.getName());
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void removeBatchEventDispatchedListener(@NotNull BatchEventDispatchedListener listener) {
        listener.getClass();
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void removeListener(@NotNull EventDispatcherListener listener) {
        listener.getClass();
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void dispatchAllEvents() {
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    @Deprecated(message = "Private API, should only be used when the concrete implementation is known.")
    public void onCatalystInstanceDestroyed() {
    }
}
