package org.greenrobot.eventbus.util;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import org.greenrobot.eventbus.EventBus;
import org.openjdk.tools.javac.util.Log$$ExternalSyntheticLambda0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class AsyncExecutor {
    private final EventBus eventBus;
    private final Constructor<?> failureEventConstructor;
    private final Object scope;
    private final Executor threadPool;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface RunnableEx {
        void run() throws Exception;
    }

    private AsyncExecutor(Executor executor, EventBus eventBus, Class<?> cls, Object obj) {
        this.threadPool = executor;
        this.eventBus = eventBus;
        this.scope = obj;
        try {
            this.failureEventConstructor = cls.getConstructor(Throwable.class);
        } catch (NoSuchMethodException e) {
            OnnxMap$$ExternalSyntheticBUOutline0.m("Failure event class must have a constructor with one parameter of type Throwable", e);
            throw null;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AsyncExecutor create() {
        return new Builder().build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$execute$0(RunnableEx runnableEx) {
        try {
            runnableEx.run();
        } catch (Exception e) {
            try {
                Object newInstance = this.failureEventConstructor.newInstance(e);
                if (newInstance instanceof HasExecutionScope) {
                    ((HasExecutionScope) newInstance).setExecutionScope(this.scope);
                }
                this.eventBus.post(newInstance);
            } catch (Exception e2) {
                this.eventBus.getLogger().log(Level.SEVERE, "Original exception:", e);
                OnnxMap$$ExternalSyntheticBUOutline0.m("Could not create failure event", e2);
            }
        }
    }

    public void execute(RunnableEx runnableEx) {
        this.threadPool.execute(new Log$$ExternalSyntheticLambda0(this, runnableEx, 13));
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private EventBus eventBus;
        private Class<?> failureEventType;
        private Executor threadPool;

        public AsyncExecutor build() {
            return buildForScope(null);
        }

        public AsyncExecutor buildForScope(Object obj) {
            if (this.eventBus == null) {
                this.eventBus = EventBus.getDefault();
            }
            if (this.threadPool == null) {
                this.threadPool = Executors.newCachedThreadPool();
            }
            if (this.failureEventType == null) {
                this.failureEventType = ThrowableFailureEvent.class;
            }
            return new AsyncExecutor(this.threadPool, this.eventBus, this.failureEventType, obj);
        }

        public Builder eventBus(EventBus eventBus) {
            this.eventBus = eventBus;
            return this;
        }

        public Builder failureEventType(Class<?> cls) {
            this.failureEventType = cls;
            return this;
        }

        public Builder threadPool(Executor executor) {
            this.threadPool = executor;
            return this;
        }

        private Builder() {
        }
    }
}
