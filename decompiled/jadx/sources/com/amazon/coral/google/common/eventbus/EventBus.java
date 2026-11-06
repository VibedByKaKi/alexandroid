package com.amazon.coral.google.common.eventbus;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.amazon.coral.google.common.base.MoreObjects;
import com.amazon.coral.google.common.base.Preconditions;
import com.amazon.coral.google.common.util.concurrent.MoreExecutors;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ElementTypesAreNonnullByDefault
/* loaded from: classes19.dex */
public class EventBus {
    private static final Logger logger = Logger.getLogger(EventBus.class.getName());
    private final Dispatcher dispatcher;
    private final SubscriberExceptionHandler exceptionHandler;
    private final Executor executor;
    private final String identifier;
    private final SubscriberRegistry subscribers;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class LoggingHandler implements SubscriberExceptionHandler {
        static final LoggingHandler INSTANCE = new LoggingHandler();

        private static Logger logger(SubscriberExceptionContext subscriberExceptionContext) {
            String name = EventBus.class.getName();
            String identifier = subscriberExceptionContext.getEventBus().identifier();
            StringBuilder sb = new StringBuilder(CredentialConfig$$ExternalSyntheticOutline0.m(name.length() + 1, identifier));
            sb.append(name);
            sb.append(".");
            sb.append(identifier);
            return Logger.getLogger(sb.toString());
        }

        private static String message(SubscriberExceptionContext subscriberExceptionContext) {
            Method subscriberMethod = subscriberExceptionContext.getSubscriberMethod();
            String name = subscriberMethod.getName();
            String name2 = subscriberMethod.getParameterTypes()[0].getName();
            String valueOf = String.valueOf(subscriberExceptionContext.getSubscriber());
            String valueOf2 = String.valueOf(subscriberExceptionContext.getEvent());
            StringBuilder sb = new StringBuilder(valueOf2.length() + valueOf.length() + name2.length() + CredentialConfig$$ExternalSyntheticOutline0.m(80, name));
            sb.append("Exception thrown by subscriber method ");
            sb.append(name);
            sb.append('(');
            sb.append(name2);
            return DoubleList$$ExternalSyntheticOutline0.m(sb, ") on subscriber ", valueOf, " when dispatching event: ", valueOf2);
        }

        @Override // com.amazon.coral.google.common.eventbus.SubscriberExceptionHandler
        public void handleException(Throwable th, SubscriberExceptionContext subscriberExceptionContext) {
            Logger logger = logger(subscriberExceptionContext);
            Level level = Level.SEVERE;
            if (logger.isLoggable(level)) {
                logger.log(level, message(subscriberExceptionContext), th);
            }
        }
    }

    public EventBus(String str, Executor executor, Dispatcher dispatcher, SubscriberExceptionHandler subscriberExceptionHandler) {
        this.subscribers = new SubscriberRegistry(this);
        this.identifier = (String) Preconditions.checkNotNull(str);
        this.executor = (Executor) Preconditions.checkNotNull(executor);
        this.dispatcher = (Dispatcher) Preconditions.checkNotNull(dispatcher);
        this.exceptionHandler = (SubscriberExceptionHandler) Preconditions.checkNotNull(subscriberExceptionHandler);
    }

    public final Executor executor() {
        return this.executor;
    }

    public void handleSubscriberException(Throwable th, SubscriberExceptionContext subscriberExceptionContext) {
        Preconditions.checkNotNull(th);
        Preconditions.checkNotNull(subscriberExceptionContext);
        try {
            this.exceptionHandler.handleException(th, subscriberExceptionContext);
        } catch (Throwable th2) {
            logger.log(Level.SEVERE, String.format(Locale.ROOT, "Exception %s thrown while handling exception: %s", th2, th), th2);
        }
    }

    public final String identifier() {
        return this.identifier;
    }

    public void post(Object obj) {
        Iterator<Subscriber> subscribers = this.subscribers.getSubscribers(obj);
        if (subscribers.hasNext()) {
            this.dispatcher.dispatch(obj, subscribers);
        } else {
            if (obj instanceof DeadEvent) {
                return;
            }
            post(new DeadEvent(this, obj));
        }
    }

    public void register(Object obj) {
        this.subscribers.register(obj);
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).addValue(this.identifier).toString();
    }

    public void unregister(Object obj) {
        this.subscribers.unregister(obj);
    }

    public EventBus(String str) {
        this(str, MoreExecutors.directExecutor(), Dispatcher.perThreadDispatchQueue(), LoggingHandler.INSTANCE);
    }

    public EventBus(SubscriberExceptionHandler subscriberExceptionHandler) {
        this("default", MoreExecutors.directExecutor(), Dispatcher.perThreadDispatchQueue(), subscriberExceptionHandler);
    }

    public EventBus() {
        this("default");
    }
}
