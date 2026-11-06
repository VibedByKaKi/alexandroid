package com.amazon.alexa.hho.navigation.transit.event;

import com.amazon.alexa.eventbus.api.EventBus;
import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.api.MultiFilterSubscriber;
import com.amazon.alexa.eventbus.message.EventTypeMessageFilter;
import com.amazon.alexa.hho.navigation.dependency.TransitScope;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@TransitScope
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0002\u0013\u0014B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\r\u001a\u00020\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0010\u001a\u00020\u000eJ\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/hho/navigation/transit/event/TransitNavigationEventSubscriber;", "", "eventBus", "Lcom/amazon/alexa/eventbus/api/EventBus;", "<init>", "(Lcom/amazon/alexa/eventbus/api/EventBus;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/amazon/alexa/hho/navigation/transit/event/TransitNavigationEventSubscriber$Listener;", "subscriber", "Lcom/amazon/alexa/eventbus/api/MultiFilterSubscriber;", "requestSessionDataFilterUuid", "Lcom/amazon/alexa/eventbus/api/MultiFilterSubscriber$FilterUuid;", "endNavigationFilterUuid", "setListener", "", "start", "stop", "subscribeToRequestSessionData", "subscribeToEndNavigation", "Companion", "Listener", "AlexaMobileAndroidHHO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransitNavigationEventSubscriber.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransitNavigationEventSubscriber.kt\ncom/amazon/alexa/hho/navigation/transit/event/TransitNavigationEventSubscriber\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n1#2:96\n*E\n"})
/* loaded from: classes13.dex */
public final class TransitNavigationEventSubscriber {

    @NotNull
    public static final String EVENT_END_NAVIGATION = "transit-navigation::endNavigation";

    @NotNull
    public static final String EVENT_REQUEST_SESSION_DATA = "transit-navigation::requestSessionData";

    @NotNull
    private static final String TAG = "NavCA_NavEventSub";

    @Nullable
    private MultiFilterSubscriber.FilterUuid endNavigationFilterUuid;

    @NotNull
    private final EventBus eventBus;

    @Nullable
    private volatile Listener listener;

    @Nullable
    private MultiFilterSubscriber.FilterUuid requestSessionDataFilterUuid;

    @Nullable
    private MultiFilterSubscriber subscriber;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/amazon/alexa/hho/navigation/transit/event/TransitNavigationEventSubscriber$Listener;", "", "onSessionDataRequested", "", "onEndNavigationRequested", "AlexaMobileAndroidHHO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Listener {
        void onEndNavigationRequested();

        void onSessionDataRequested();
    }

    @Inject
    public TransitNavigationEventSubscriber(@NotNull EventBus eventBus) {
        eventBus.getClass();
        this.eventBus = eventBus;
    }

    private final void subscribeToEndNavigation(MultiFilterSubscriber subscriber) {
        this.endNavigationFilterUuid = subscriber.subscribeFilter(new EventTypeMessageFilter(EVENT_END_NAVIGATION), new TransitNavigationEventSubscriber$$ExternalSyntheticLambda0(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribeToEndNavigation$lambda$3(TransitNavigationEventSubscriber transitNavigationEventSubscriber, Message message) {
        message.getClass();
        Listener listener = transitNavigationEventSubscriber.listener;
        if (listener != null) {
            listener.onEndNavigationRequested();
        }
    }

    private final void subscribeToRequestSessionData(MultiFilterSubscriber subscriber) {
        this.requestSessionDataFilterUuid = subscriber.subscribeFilter(new EventTypeMessageFilter(EVENT_REQUEST_SESSION_DATA), new TransitNavigationEventSubscriber$$ExternalSyntheticLambda0(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribeToRequestSessionData$lambda$2(TransitNavigationEventSubscriber transitNavigationEventSubscriber, Message message) {
        message.getClass();
        Listener listener = transitNavigationEventSubscriber.listener;
        if (listener != null) {
            listener.onSessionDataRequested();
        }
    }

    public final void setListener(@Nullable Listener listener) {
        this.listener = listener;
    }

    public final synchronized void start() {
        if (this.subscriber != null) {
            return;
        }
        MultiFilterSubscriber newSubscriber = this.eventBus.getNewSubscriber();
        newSubscriber.getClass();
        subscribeToRequestSessionData(newSubscriber);
        subscribeToEndNavigation(newSubscriber);
        this.subscriber = newSubscriber;
    }

    public final synchronized void stop() {
        try {
            MultiFilterSubscriber multiFilterSubscriber = this.subscriber;
            if (multiFilterSubscriber == null) {
                return;
            }
            MultiFilterSubscriber.FilterUuid filterUuid = this.requestSessionDataFilterUuid;
            if (filterUuid != null) {
                multiFilterSubscriber.unsubscribeFilter(filterUuid);
            }
            MultiFilterSubscriber.FilterUuid filterUuid2 = this.endNavigationFilterUuid;
            if (filterUuid2 != null) {
                multiFilterSubscriber.unsubscribeFilter(filterUuid2);
            }
            this.requestSessionDataFilterUuid = null;
            this.endNavigationFilterUuid = null;
            this.subscriber = null;
            this.listener = null;
        } catch (Throwable th) {
            throw th;
        }
    }
}
