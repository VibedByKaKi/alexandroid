package com.amazon.alexa.eventing;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.eventbus.stub.FakeEventBus$$ExternalSyntheticLambda0;
import com.amazon.alexa.eventing.Listen;
import com.amazon.alexa.mobilytics.event.metadata.EventMetadataType;
import com.amazon.dee.app.elements.ElementsRouteKeys;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated(message = "")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/eventing/Listen;", "", "()V", "Cancelable", "Companion", "ListenOnce", "AlexaMobileAndroidEventing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class Listen {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lcom/amazon/alexa/eventing/Listen$Cancelable;", "", "cancel", "", "AlexaMobileAndroidEventing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Cancelable {
        void cancel();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\n\u001a\u00020\u000bJ\u0014\u0010\f\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007J\u0016\u0010\u000e\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u000bH\u0002R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/eventing/Listen$ListenOnce;", ExifInterface.GPS_DIRECTION_TRUE, "", "event", "Lcom/amazon/alexa/eventing/Event;", "(Lcom/amazon/alexa/eventing/Event;)V", "handler", "Lcom/amazon/alexa/eventing/EventHandler;", EventMetadataType.SUBSCRIPTION, "Lcom/amazon/alexa/eventing/EventSubscription;", "cancel", "", "listen", "Lcom/amazon/alexa/eventing/Listen$Cancelable;", "onEvent", ElementsRouteKeys.ARGS, "Lcom/amazon/alexa/eventing/EventArgs;", "unregister", "AlexaMobileAndroidEventing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ListenOnce<T> {

        @Nullable
        private Event<T> event;

        @Nullable
        private EventHandler<T> handler;

        @Nullable
        private EventSubscription subscription;

        public ListenOnce(@Nullable Event<T> event) {
            this.event = event;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void listen$lambda$0(ListenOnce listenOnce, EventArgs eventArgs) {
            listenOnce.getClass();
            eventArgs.getClass();
            listenOnce.onEvent(eventArgs);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void listen$lambda$1(ListenOnce listenOnce) {
            listenOnce.getClass();
            listenOnce.cancel();
        }

        private final void onEvent(EventArgs<T> args) {
            EventHandler<T> eventHandler = this.handler;
            if (eventHandler == null) {
                return;
            }
            eventHandler.onEvent(args);
            unregister();
        }

        private final void unregister() {
            EventSubscription eventSubscription = this.subscription;
            if (eventSubscription == null) {
                return;
            }
            eventSubscription.unsubscribe();
            this.handler = null;
            this.event = null;
            this.subscription = null;
        }

        public final void cancel() {
            unregister();
        }

        @NotNull
        public final Cancelable listen(@NotNull EventHandler<T> handler) {
            handler.getClass();
            if (this.handler != null) {
                Single$$ExternalSyntheticBUOutline0.m("There is already a listener attached.");
                return null;
            }
            this.handler = handler;
            Event<T> event = this.event;
            this.subscription = event != null ? event.subscribe(new EventHandler() { // from class: com.amazon.alexa.eventing.Listen$ListenOnce$$ExternalSyntheticLambda0
                @Override // com.amazon.alexa.eventing.EventHandler
                public final void onEvent(EventArgs eventArgs) {
                    Listen.ListenOnce.listen$lambda$0(Listen.ListenOnce.this, eventArgs);
                }
            }) : null;
            return new FakeEventBus$$ExternalSyntheticLambda0(this, 11);
        }
    }

    private Listen() {
    }

    @JvmStatic
    @NotNull
    public static final <T> Cancelable once(@NotNull Event<T> event, @NotNull EventHandler<T> eventHandler) {
        return INSTANCE.once(event, eventHandler);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\tH\u0007¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/eventing/Listen$Companion;", "", "()V", "once", "Lcom/amazon/alexa/eventing/Listen$Cancelable;", ExifInterface.GPS_DIRECTION_TRUE, "event", "Lcom/amazon/alexa/eventing/Event;", "handler", "Lcom/amazon/alexa/eventing/EventHandler;", "AlexaMobileAndroidEventing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final <T> Cancelable once(@NotNull Event<T> event, @NotNull EventHandler<T> handler) {
            event.getClass();
            handler.getClass();
            return new ListenOnce(event).listen(handler);
        }

        private Companion() {
        }
    }
}
